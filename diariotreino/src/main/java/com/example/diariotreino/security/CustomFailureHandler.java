package com.example.diariotreino.security;

import com.example.diariotreino.model.Usuario;
import com.example.diariotreino.repository.UsuarioRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Optional;

@Component
public class CustomFailureHandler implements AuthenticationFailureHandler {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
                                        AuthenticationException exception) throws IOException, ServletException {
        String email = request.getParameter("email");
        String mensagem = "Credenciais invalidas.";

        if (email != null && !email.isBlank()) {
            Optional<Usuario> usuarioOpt = usuarioRepository.findFirstByEmail(email.trim().toLowerCase());

            if (usuarioOpt.isPresent()) {
                Usuario usuario = usuarioOpt.get();

                if (!usuario.getAtivo()) {
                    mensagem = "Conta suspensa. Procure um personal.";
                } else if (!"USER".equals(usuario.getPerfil())) {
                    mensagem = "Credenciais invalidas.";
                } else {
                    int tentativas = usuario.getTentativasFalhas() + 1;
                    usuario.setTentativasFalhas(tentativas);

                    if (tentativas >= 3) {
                        usuario.setAtivo(false);
                        mensagem = "Conta suspensa apos 3 tentativas incorretas. Procure um personal.";
                    } else {
                        int restantes = 3 - tentativas;
                        mensagem = "Credenciais invalidas. Tentativas restantes: " + restantes + ".";
                    }

                    usuarioRepository.save(usuario);
                }
            }
        }

        response.sendRedirect("/?erro=" + URLEncoder.encode(mensagem, StandardCharsets.UTF_8));
    }
}
