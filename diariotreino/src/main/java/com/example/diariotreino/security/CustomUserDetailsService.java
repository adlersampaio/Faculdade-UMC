package com.example.diariotreino.security;

import com.example.diariotreino.model.Usuario;
import com.example.diariotreino.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UsuarioRepository repository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario = repository.findFirstByEmail(email.trim().toLowerCase())
                .orElseThrow(() -> new UsernameNotFoundException("Utilizador não encontrado"));
        return new CustomUserDetails(usuario);
    }
}
