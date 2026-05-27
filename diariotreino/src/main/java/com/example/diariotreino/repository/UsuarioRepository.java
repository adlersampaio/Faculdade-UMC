package com.example.diariotreino.repository;

import com.example.diariotreino.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // Pega apenas o primeiro que encontrar e ignora os clones
    Optional<Usuario> findFirstByEmail(String email);

    boolean existsByEmail(String email);

    boolean existsByEmailAndIdNot(String email, Long id);
}
