package com.example.diariotreino.repository;

import com.example.diariotreino.model.Exercicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExercicioRepository extends JpaRepository<Exercicio, Long> {

    // Busca todos os exercícios de uma ficha específica
    List<Exercicio> findByFichaId(Long fichaId);
}