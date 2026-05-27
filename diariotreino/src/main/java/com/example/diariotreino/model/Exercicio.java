package com.example.diariotreino.model;

import jakarta.persistence.*;

@Entity
public class Exercicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeExercicio;    // Ex: "Supino Reto"
    private Integer series;          // Ex: 4
    private Integer repeticoes;      // Ex: 10
    private String peso;             // Ex: "20kg" ou "sem peso"
    private String descanso;         // Ex: "60s"
    private String observacoes;      // Notas extras

    // RELACIONAMENTO: Muitos exercícios pertencem a UMA ficha
    @ManyToOne
    @JoinColumn(name = "id_ficha")
    private FichaTreino ficha;

    // Construtor vazio (obrigatório para JPA)
    public Exercicio() {
    }

    // Construtor com parâmetros
    public Exercicio(String nomeExercicio, Integer series, Integer repeticoes, String peso, FichaTreino ficha) {
        this.nomeExercicio = nomeExercicio;
        this.series = series;
        this.repeticoes = repeticoes;
        this.peso = peso;
        this.ficha = ficha;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNomeExercicio() { return nomeExercicio; }
    public void setNomeExercicio(String nomeExercicio) { this.nomeExercicio = nomeExercicio; }

    public Integer getSeries() { return series; }
    public void setSeries(Integer series) { this.series = series; }

    public Integer getRepeticoes() { return repeticoes; }
    public void setRepeticoes(Integer repeticoes) { this.repeticoes = repeticoes; }

    public String getPeso() { return peso; }
    public void setPeso(String peso) { this.peso = peso; }

    public String getDescanso() { return descanso; }
    public void setDescanso(String descanso) { this.descanso = descanso; }

    public String getObservacoes() { return observacoes; }
    public void setObservacoes(String observacoes) { this.observacoes = observacoes; }

    public FichaTreino getFicha() { return ficha; }
    public void setFicha(FichaTreino ficha) { this.ficha = ficha; }
}
