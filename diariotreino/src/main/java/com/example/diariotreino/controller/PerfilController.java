package com.example.diariotreino.controller;

import com.example.diariotreino.model.Usuario;
import com.example.diariotreino.repository.UsuarioRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import java.util.Base64;
import java.util.Optional;

@Controller
public class PerfilController {

    private static final long TAMANHO_MAXIMO_FOTO = 2 * 1024 * 1024;

    @Autowired
    private UsuarioRepository usuarioRepository;

    // Abre a tela de perfil do usuário logado
    @GetMapping("/perfil")
    public String verPerfil(HttpSession session, Model model) {
        Usuario logado = (Usuario) session.getAttribute("usuarioLogado");
        if (logado == null) return "redirect:/";

        // Busca do banco de dados para garantir que temos as informações mais recentes
        usuarioRepository.findById(logado.getId()).ifPresent(u -> {
            model.addAttribute("usuario", u);
        });

        return "perfil";
    }

    // Atualiza os dados cadastrais e processa a imagem
    @PostMapping("/perfil/atualizar")
    public String atualizarPerfil(
            @RequestParam String nome,
            @RequestParam String telefone,
            @RequestParam String endereco,
            @RequestParam("foto") MultipartFile foto,
            HttpSession session, Model model) {

        Usuario logado = (Usuario) session.getAttribute("usuarioLogado");
        if (logado == null) return "redirect:/";

        Optional<Usuario> usuarioOpt = usuarioRepository.findById(logado.getId());
        if (usuarioOpt.isPresent()) {
            Usuario u = usuarioOpt.get();
            u.setNome(nome);
            u.setTelefone(telefone);
            u.setEndereco(endereco);

            // Se o usuário enviou uma nova foto, converte para Base64
            if (!foto.isEmpty()) {
                if (foto.getSize() > TAMANHO_MAXIMO_FOTO) {
                    model.addAttribute("erro", "A imagem deve ter no maximo 2MB.");
                    model.addAttribute("usuario", u);
                    return "perfil";
                }

                String contentType = foto.getContentType();
                if (!"image/jpeg".equals(contentType) && !"image/png".equals(contentType)) {
                    model.addAttribute("erro", "Envie apenas imagens JPG ou PNG.");
                    model.addAttribute("usuario", u);
                    return "perfil";
                }

                try {
                    byte[] bytes = foto.getBytes();
                    String base64Image = Base64.getEncoder().encodeToString(bytes);
                    // Formata a string Base64 para que o HTML consiga exibir direto na tag <img>
                    u.setFotoPerfil("data:" + foto.getContentType() + ";base64," + base64Image);
                } catch (Exception e) {
                    model.addAttribute("erro", "Erro ao processar a imagem. Tente novamente.");
                    model.addAttribute("usuario", u);
                    return "perfil";
                }
            }

            usuarioRepository.save(u); // Salva no banco de dados
            session.setAttribute("usuarioLogado", u); // Atualiza a sessão
        }

        return "redirect:/perfil?sucesso=true";
    }
}
