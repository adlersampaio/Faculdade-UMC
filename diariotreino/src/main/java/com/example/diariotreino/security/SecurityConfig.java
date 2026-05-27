package com.example.diariotreino.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    private CustomSuccessHandler successHandler;

    @Autowired
    private CustomFailureHandler failureHandler;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        // Rotas públicas (estilos, imagens e a página inicial)
                        .requestMatchers("/", "/style.css", "/images/**").permitAll()
                        // Rotas exclusivas para ADMIN
                        .requestMatchers("/admin/**").hasRole("ADMIN")
                        // Qualquer outra rota exige utilizador logado
                        .anyRequest().authenticated()
                )
                .formLogin(form -> form
                        .loginPage("/") // Usa a sua página index.html como login
                        .loginProcessingUrl("/logar") // O Spring Security vai interceptar o POST para /logar
                        .successHandler(successHandler) // Usa a nossa lógica de redirecionamento
                        .failureHandler(failureHandler)
                        .usernameParameter("email") // Indica que o campo do formulário se chama 'email'
                        .passwordParameter("senha") // Indica que o campo se chama 'senha'
                        .permitAll()
                )
                .logout(logout -> logout
                        .logoutUrl("/sair")
                        .logoutSuccessUrl("/")
                        .permitAll()
                );

        return http.build();
    }

    // Configura a encriptação de senhas com BCrypt
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
