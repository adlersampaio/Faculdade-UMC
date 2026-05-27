package com.example.diariotreino.controller;

import com.example.diariotreino.model.Usuario;
import com.example.diariotreino.repository.FichaTreinoRepository;
import com.example.diariotreino.repository.UsuarioRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class LoginController {

    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private FichaTreinoRepository fichaRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/")
    public String login() {
        return "index";
    }

    // ==========================================
    // ROTAS DO PRIMEIRO ACESSO
    // ==========================================
    @GetMapping("/primeiro-acesso")
    public String telaPrimeiroAcesso(HttpSession session) {
        Usuario logado = (Usuario) session.getAttribute("usuarioLogado");
        if (logado == null) return "redirect:/";

        if (!logado.getPrimeiroAcesso()) return "redirect:/";

        return "primeiro-acesso";
    }

    @PostMapping("/salvar-nova-senha")
    public String salvarNovaSenha(@RequestParam String novaSenha,
                                  @RequestParam String confirmarSenha,
                                  HttpSession session, Model model) {
        Usuario logado = (Usuario) session.getAttribute("usuarioLogado");
        if (logado == null) return "redirect:/";

        if (!novaSenha.equals(confirmarSenha)) {
            model.addAttribute("erro", "As senhas digitadas não coincidem. Tente novamente.");
            return "primeiro-acesso";
        }

        if (!senhaAtendePolitica(novaSenha)) {
            model.addAttribute("erro", "A senha deve ter no minimo 12 caracteres e pelo menos 1 caractere especial.");
            return "primeiro-acesso";
        }

        Optional<Usuario> usuarioDb = repository.findById(logado.getId());
        if (usuarioDb.isPresent()) {
            Usuario u = usuarioDb.get();
            u.setSenha(passwordEncoder.encode(novaSenha));
            u.setPrimeiroAcesso(false);
            repository.save(u);

            session.setAttribute("usuarioLogado", u);

            if ("ADMIN".equals(u.getPerfil())) {
                return "redirect:/admin/dashboard";
            }
            return "redirect:/painel";
        }

        return "redirect:/";
    }

    // ==========================================
    // PAINEL DO ALUNO
    // ==========================================
    @GetMapping("/painel")
    public String painel(HttpSession session, Model model) {
        Usuario logado = (Usuario) session.getAttribute("usuarioLogado");
        if (logado == null) return "redirect:/";

        java.util.List<com.example.diariotreino.model.FichaTreino> todasFichas = fichaRepository.findByUsuarioId(logado.getId());

        int diaAtualNumero = java.time.LocalDate.now().getDayOfWeek().getValue();
        String diaFormatado = formatarDiaDaSemana(diaAtualNumero);

        com.example.diariotreino.model.FichaTreino treinoDeHoje = todasFichas.stream()
                .filter(f -> diaFormatado.equalsIgnoreCase(f.getDiaDaSemana()))
                .findFirst().orElse(null);

        model.addAttribute("minhasFichas", todasFichas);
        model.addAttribute("treinoDeHoje", treinoDeHoje);
        model.addAttribute("diaAtual", diaFormatado);
        model.addAttribute("totalFichas", todasFichas.size());

        return "painel";
    }

    private String formatarDiaDaSemana(int dayOfWeek) {
        return switch (dayOfWeek) {
            case 1 -> "Segunda-feira";
            case 2 -> "Terça-feira";
            case 3 -> "Quarta-feira";
            case 4 -> "Quinta-feira";
            case 5 -> "Sexta-feira";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "";
        };
    }

    private boolean senhaAtendePolitica(String senha) {
        if (senha == null || senha.length() < 12) {
            return false;
        }
        return senha.matches(".*[^a-zA-Z0-9].*");
    }
}
