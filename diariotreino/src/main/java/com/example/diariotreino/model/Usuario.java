package com.example.diariotreino.model;

import jakarta.persistence.*;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(nullable = false, unique = true)
    private String email;

    private String senha;
    private String perfil; // "ADMIN" ou "USER"
    private Boolean ativo = true;
    private Boolean primeiroAcesso = true;
    private Integer tentativasFalhas = 0;

    // NOVOS CAMPOS DO PERFIL
    private String telefone;
    private String endereco;

    @Lob
    @Column(columnDefinition = "LONGTEXT") // Armazena a foto em Base64 de forma segura na nuvem
    private String fotoPerfil;

    // 1. Construtor vazio (obrigatório para o Spring/JPA)
    public Usuario() {
    }

    // 2. Construtor com todos os parâmetros
    public Usuario(Long id, String nome, String email, String senha, String perfil) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.perfil = perfil;
    }

    // --- Getters e Setters Antigos ---
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    public String getPerfil() { return perfil; }
    public void setPerfil(String perfil) { this.perfil = perfil; }

    public Boolean getAtivo() {
        return ativo == null ? true : ativo;
    }
    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Boolean getPrimeiroAcesso() {
        return primeiroAcesso == null ? true : primeiroAcesso;
    }
    public void setPrimeiroAcesso(Boolean primeiroAcesso) {
        this.primeiroAcesso = primeiroAcesso;
    }

    public Integer getTentativasFalhas() {
        return tentativasFalhas == null ? 0 : tentativasFalhas;
    }
    public void setTentativasFalhas(Integer tentativasFalhas) {
        this.tentativasFalhas = tentativasFalhas;
    }

    // --- NOVOS GETTERS E SETTERS DO PERFIL ---
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getFotoPerfil() { return fotoPerfil; }
    public void setFotoPerfil(String fotoPerfil) { this.fotoPerfil = fotoPerfil; }
}
