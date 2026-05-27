package com.example.diariotreino.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.diariotreino.repository.UsuarioRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class CustomSuccessHandler implements AuthenticationSuccessHandler {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication) throws IOException, ServletException {

        CustomUserDetails userDetails = (CustomUserDetails) authentication.getPrincipal();
        var usuario = userDetails.getUsuario();
        usuario.setTentativasFalhas(0);
        usuarioRepository.save(usuario);

        // Salvar na sessão para manter compatibilidade com o resto do seu código
        request.getSession().setAttribute("usuarioLogado", usuario);

        if (usuario.getPrimeiroAcesso()) {
            response.sendRedirect("/primeiro-acesso");
            return;
        }

        if ("ADMIN".equals(usuario.getPerfil())) {
            response.sendRedirect("/admin/dashboard");
        } else {
            response.sendRedirect("/painel");
        }
    }
}
