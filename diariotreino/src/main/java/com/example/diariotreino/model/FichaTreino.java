package com.example.diariotreino.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class FichaTreino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeTreino;
    private String diaDaSemana; 
    private LocalDate dataCriacao;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @OneToMany(mappedBy = "ficha", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Exercicio> exercicios;

    public FichaTreino() {
        this.dataCriacao = LocalDate.now();
    }

    public FichaTreino(String nomeTreino, Usuario usuario) {
        this.nomeTreino = nomeTreino;
        this.usuario = usuario;
        this.dataCriacao = LocalDate.now();
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNomeTreino() { return nomeTreino; }
    public void setNomeTreino(String nomeTreino) { this.nomeTreino = nomeTreino; }

    public String getDiaDaSemana() { return diaDaSemana; }
    public void setDiaDaSemana(String diaDaSemana) { this.diaDaSemana = diaDaSemana; }

    public LocalDate getDataCriacao() { return dataCriacao; }
    public void setDataCriacao(LocalDate dataCriacao) { this.dataCriacao = dataCriacao; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }

    public List<Exercicio> getExercicios() { return exercicios; }
    public void setExercicios(List<Exercicio> exercicios) { this.exercicios = exercicios; }
}