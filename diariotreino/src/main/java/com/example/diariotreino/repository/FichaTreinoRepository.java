package com.example.diariotreino.repository;

import com.example.diariotreino.model.FichaTreino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FichaTreinoRepository extends JpaRepository<FichaTreino, Long> {

    //busca todas as fichas que pertencem a um ID de utilizador específico.
    List<FichaTreino> findByUsuarioId(Long usuarioId);
}