package com.example.diariotreino.controller;

import com.example.diariotreino.model.FichaTreino;
import com.example.diariotreino.model.Usuario;
import com.example.diariotreino.repository.FichaTreinoRepository;
import com.example.diariotreino.repository.UsuarioRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private FichaTreinoRepository fichaRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private com.example.diariotreino.repository.ExercicioRepository exercicioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    // ==========================================
    // DASHBOARD PRINCIPAL DO PERSONAL (HOME)
    // ==========================================
    @GetMapping("/dashboard")
    public String dashboardAdmin(HttpSession session, Model model) {
        Usuario logado = (Usuario) session.getAttribute("usuarioLogado");
        if (logado == null || !"ADMIN".equals(logado.getPerfil())) return "redirect:/";

        long totalAlunos = usuarioRepository.findAll().stream().filter(u -> "USER".equals(u.getPerfil()) && u.getAtivo()).count();
        long totalPersonais = usuarioRepository.findAll().stream().filter(u -> "ADMIN".equals(u.getPerfil())).count();
        long totalFichas = fichaRepository.count();
        long totalExercicios = exercicioRepository.count();

        model.addAttribute("totalAlunos", totalAlunos);
        model.addAttribute("totalPersonais", totalPersonais);
        model.addAttribute("totalFichas", totalFichas);
        model.addAttribute("totalExercicios", totalExercicios);

        return "admin-dashboard";
    }

    // ==========================================
    // GESTÃO DE FICHAS (POR ALUNO)
    // ==========================================
    @GetMapping("/painel")
    public String painelGerencial(@RequestParam(required = false) String busca, HttpSession session, Model model) {
        Usuario logado = (Usuario) session.getAttribute("usuarioLogado");
        if (logado == null || !"ADMIN".equals(logado.getPerfil())) return "redirect:/";

        List<Usuario> alunos;

        if (busca != null && !busca.trim().isEmpty()) {
            alunos = usuarioRepository.findAll().stream()
                    .filter(u -> "USER".equals(u.getPerfil()) && u.getNome().toLowerCase().contains(busca.toLowerCase()))
                    .collect(Collectors.toList());
        } else {
            alunos = usuarioRepository.findAll().stream().filter(u -> "USER".equals(u.getPerfil())).toList();
        }

        model.addAttribute("alunos", alunos);
        model.addAttribute("busca", busca);
        return "admin-painel";
    }

    @GetMapping("/fichas-aluno/{id}")
    public String verFichasDoAluno(@PathVariable Long id, HttpSession session, Model model) {
        Usuario logado = (Usuario) session.getAttribute("usuarioLogado");
        if (logado == null || !"ADMIN".equals(logado.getPerfil())) return "redirect:/";

        Optional<Usuario> aluno = usuarioRepository.findById(id);
        if (aluno.isPresent()) {
            model.addAttribute("aluno", aluno.get());
            model.addAttribute("fichas", fichaRepository.findByUsuarioId(id));
            return "admin-fichas-aluno";
        }
        return "redirect:/admin/painel";
    }

    @GetMapping("/nova-ficha")
    public String abrirTelaNovaFicha(HttpSession session, Model model) {
        Usuario logado = (Usuario) session.getAttribute("usuarioLogado");
        if (logado == null || !"ADMIN".equals(logado.getPerfil())) return "redirect:/";

        model.addAttribute("alunos", usuarioRepository.findAll().stream()
                .filter(u -> "USER".equals(u.getPerfil())).toList());

        return "admin-nova-ficha";
    }

    @PostMapping("/salvar-ficha")
    public String salvarFicha(@RequestParam String nomeTreino, @RequestParam String diaDaSemana,
                              @RequestParam Long alunoId, HttpSession session) {
        Usuario logado = (Usuario) session.getAttribute("usuarioLogado");

        if (logado != null && "ADMIN".equals(logado.getPerfil())) {
            usuarioRepository.findById(alunoId).ifPresent(aluno -> {
                FichaTreino novaFicha = new FichaTreino(nomeTreino, aluno);
                novaFicha.setDiaDaSemana(diaDaSemana);
                fichaRepository.save(novaFicha);
            });
        }
        return "redirect:/admin/fichas-aluno/" + alunoId;
    }

    @GetMapping("/editar-ficha/{id}")
    public String abrirTelaEditar(@PathVariable Long id, HttpSession session, Model model) {
        Usuario logado = (Usuario) session.getAttribute("usuarioLogado");
        if (logado == null || !"ADMIN".equals(logado.getPerfil())) return "redirect:/";

        Optional<FichaTreino> ficha = fichaRepository.findById(id);
        if (ficha.isPresent()) {
            model.addAttribute("ficha", ficha.get());
            return "admin-editar-ficha";
        }
        return "redirect:/admin/painel";
    }

    @PostMapping("/atualizar-ficha")
    public String atualizarFicha(@RequestParam Long id, @RequestParam String nomeTreino,
                                 @RequestParam String diaDaSemana, HttpSession session) {
        Usuario logado = (Usuario) session.getAttribute("usuarioLogado");
        if (logado != null && "ADMIN".equals(logado.getPerfil())) {
            Optional<FichaTreino> fichaOpt = fichaRepository.findById(id);
            if (fichaOpt.isPresent()) {
                FichaTreino f = fichaOpt.get();
                f.setNomeTreino(nomeTreino);
                f.setDiaDaSemana(diaDaSemana);
                fichaRepository.save(f);
                return "redirect:/admin/fichas-aluno/" + f.getUsuario().getId();
            }
        }
        return "redirect:/admin/painel";
    }

    @PostMapping("/excluir-ficha/{id}")
    public String excluirFicha(@PathVariable Long id, HttpSession session) {
        Usuario logado = (Usuario) session.getAttribute("usuarioLogado");
        if (logado != null && "ADMIN".equals(logado.getPerfil())) {
            Optional<FichaTreino> ficha = fichaRepository.findById(id);
            if (ficha.isPresent()) {
                Long alunoId = ficha.get().getUsuario().getId();
                fichaRepository.deleteById(id);
                return "redirect:/admin/fichas-aluno/" + alunoId;
            }
        }
        return "redirect:/admin/painel";
    }

    // ==========================================
    // GESTÃO DE ALUNOS
    // ==========================================
    @GetMapping("/alunos")
    public String listarAlunos(@RequestParam(required = false) String busca, HttpSession session, Model model) {
        Usuario logado = (Usuario) session.getAttribute("usuarioLogado");
        if (logado == null || !"ADMIN".equals(logado.getPerfil())) return "redirect:/";

        List<Usuario> alunos;

        if (busca != null && !busca.trim().isEmpty()) {
            alunos = usuarioRepository.findAll().stream()
                    .filter(u -> "USER".equals(u.getPerfil()) && u.getNome().toLowerCase().contains(busca.toLowerCase()))
                    .collect(Collectors.toList());
        } else {
            alunos = usuarioRepository.findAll().stream().filter(u -> "USER".equals(u.getPerfil())).toList();
        }

        model.addAttribute("alunos", alunos);
        model.addAttribute("busca", busca);
        return "admin-alunos";
    }

    @GetMapping("/cadastrar-aluno")
    public String abrirFormAluno(HttpSession session) {
        Usuario logado = (Usuario) session.getAttribute("usuarioLogado");
        if (logado == null || !"ADMIN".equals(logado.getPerfil())) return "redirect:/";
        return "admin-cadastrar-aluno";
    }

    @PostMapping("/salvar-aluno")
    public String salvarAluno(@RequestParam String nome, @RequestParam String email,
                              @RequestParam String senha, HttpSession session, Model model) {
        Usuario logado = (Usuario) session.getAttribute("usuarioLogado");
        if (logado != null && "ADMIN".equals(logado.getPerfil())) {
            String emailNormalizado = normalizarEmail(email);
            if (usuarioRepository.existsByEmail(emailNormalizado)) {
                model.addAttribute("erro", "Ja existe um usuario cadastrado com este e-mail.");
                model.addAttribute("nome", nome);
                model.addAttribute("email", emailNormalizado);
                return "admin-cadastrar-aluno";
            }

            Usuario novoAluno = new Usuario(null, nome, emailNormalizado, passwordEncoder.encode(senha), "USER");
            usuarioRepository.save(novoAluno);
        }
        return "redirect:/admin/alunos";
    }

    @GetMapping("/editar-aluno/{id}")
    public String abrirEditarAluno(@PathVariable Long id, HttpSession session, Model model) {
        Usuario logado = (Usuario) session.getAttribute("usuarioLogado");
        if (logado == null || !"ADMIN".equals(logado.getPerfil())) return "redirect:/";

        Optional<Usuario> aluno = usuarioRepository.findById(id);
        if (aluno.isPresent() && "USER".equals(aluno.get().getPerfil())) {
            model.addAttribute("aluno", aluno.get());
            return "admin-editar-aluno";
        }

        return "redirect:/admin/alunos";
    }

    @PostMapping("/atualizar-aluno")
    public String atualizarAluno(@RequestParam Long id, @RequestParam String nome,
                                 @RequestParam String email, HttpSession session, Model model) {
        Usuario logado = (Usuario) session.getAttribute("usuarioLogado");
        if (logado == null || !"ADMIN".equals(logado.getPerfil())) return "redirect:/";

        Optional<Usuario> alunoOpt = usuarioRepository.findById(id);
        if (alunoOpt.isEmpty() || !"USER".equals(alunoOpt.get().getPerfil())) {
            return "redirect:/admin/alunos";
        }

        String emailNormalizado = normalizarEmail(email);
        if (usuarioRepository.existsByEmailAndIdNot(emailNormalizado, id)) {
            Usuario aluno = alunoOpt.get();
            model.addAttribute("aluno", aluno);
            model.addAttribute("erro", "Ja existe outro usuario cadastrado com este e-mail.");
            return "admin-editar-aluno";
        }

        Usuario aluno = alunoOpt.get();
        aluno.setNome(nome);
        aluno.setEmail(emailNormalizado);
        usuarioRepository.save(aluno);

        return "redirect:/admin/alunos";
    }

    // ==========================================
    // GESTÃO DE PERSONAIS (APENAS SUPER ADMIN)
    // ==========================================
    @GetMapping("/personais")
    public String listarPersonais(@RequestParam(required = false) String busca, HttpSession session, Model model) {
        Usuario logado = (Usuario) session.getAttribute("usuarioLogado");
        if (logado == null || !"admin@diario.com".equals(logado.getEmail())) return "redirect:/admin/painel";

        List<Usuario> personais;

        if (busca != null && !busca.trim().isEmpty()) {
            personais = usuarioRepository.findAll().stream()
                    .filter(u -> "ADMIN".equals(u.getPerfil()) && u.getNome().toLowerCase().contains(busca.toLowerCase()))
                    .collect(Collectors.toList());
        } else {
            personais = usuarioRepository.findAll().stream().filter(u -> "ADMIN".equals(u.getPerfil())).toList();
        }

        model.addAttribute("personais", personais);
        model.addAttribute("busca", busca);
        return "admin-personais";
    }

    @GetMapping("/cadastrar-personal")
    public String abrirFormPersonal(HttpSession session) {
        Usuario logado = (Usuario) session.getAttribute("usuarioLogado");
        if (logado == null || !"admin@diario.com".equals(logado.getEmail())) return "redirect:/admin/painel";
        return "admin-cadastrar-personal";
    }

    @PostMapping("/salvar-personal")
    public String salvarPersonal(@RequestParam String nome, @RequestParam String email,
                                 @RequestParam String senha, HttpSession session, Model model) {
        Usuario logado = (Usuario) session.getAttribute("usuarioLogado");
        if (logado != null && "admin@diario.com".equals(logado.getEmail())) {
            String emailNormalizado = normalizarEmail(email);
            if (usuarioRepository.existsByEmail(emailNormalizado)) {
                model.addAttribute("erro", "Ja existe um usuario cadastrado com este e-mail.");
                model.addAttribute("nome", nome);
                model.addAttribute("email", emailNormalizado);
                return "admin-cadastrar-personal";
            }

            Usuario novoPersonal = new Usuario(null, nome, emailNormalizado, passwordEncoder.encode(senha), "ADMIN");
            usuarioRepository.save(novoPersonal);
        }
        return "redirect:/admin/personais";
    }

    // ==========================================
    // EXCLUIR E SUSPENDER
    // ==========================================
    @PostMapping("/excluir-usuario/{id}")
    public String excluirUsuario(@PathVariable Long id, HttpSession session) {
        Usuario logado = (Usuario) session.getAttribute("usuarioLogado");
        if (logado != null && "admin@diario.com".equals(logado.getEmail())) {
            if (!logado.getId().equals(id)) {
                usuarioRepository.deleteById(id);
            }
        }
        return "redirect:/admin/personais";
    }

    @PostMapping("/suspender-usuario/{id}")
    public String suspenderUsuario(@PathVariable Long id, HttpSession session) {
        Usuario logado = (Usuario) session.getAttribute("usuarioLogado");

        if (logado != null && "ADMIN".equals(logado.getPerfil())) {
            if (!logado.getId().equals(id)) {
                usuarioRepository.findById(id).ifPresent(alvo -> {
                    if ("ADMIN".equals(alvo.getPerfil()) && !"admin@diario.com".equals(logado.getEmail())) {
                        return;
                    }
                    boolean novoStatus = !alvo.getAtivo();
                    alvo.setAtivo(novoStatus);
                    if (novoStatus) {
                        alvo.setTentativasFalhas(0);
                    }
                    usuarioRepository.save(alvo);
                });
            }
        }

        Optional<Usuario> usuarioAlterado = usuarioRepository.findById(id);
        if (usuarioAlterado.isPresent() && "ADMIN".equals(usuarioAlterado.get().getPerfil())) {
            return "redirect:/admin/personais";
        }
        return "redirect:/admin/alunos";
    }

    private String normalizarEmail(String email) {
        return email == null ? "" : email.trim().toLowerCase();
    }
}
