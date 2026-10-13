/*
 * Projeto: Inscrição para Evento - Atividade 1 - M1
 * Classe de modelo (Model) que representa uma inscrição no evento.
 */
package model;

/**
 *
 * @author Gabriel Gomes, Adler Augusto Vendramel Sampaio, Julia Nascimento Ignácio
 */
public class Inscricao {
    // Atributos (um para cada campo da tabela "inscricoes")
    private int cod;               // pk_id
    private String nome;           // nome completo
    private String email;          // e-mail
    private String telefone;       // telefone / celular
    private String cpf;            // CPF
    private String dataNasc;       // data de nascimento (aaaa-mm-dd)
    private String empresa;        // empresa / instituição
    private String cargo;          // cargo / função
    private String cidade;         // cidade
    private String estado;         // UF
    private String modalidade;     // Presencial ou Online
    private String dataInscricao;  // data/hora gerada pelo banco

    // Métodos Construtores
    public Inscricao(){
    }
    public Inscricao(int p_cod, String p_nome, String p_email, String p_telefone, String p_cpf,
                     String p_dataNasc, String p_empresa, String p_cargo, String p_cidade,
                     String p_estado, String p_modalidade){
        this.cod = p_cod;
        this.nome = p_nome;
        this.email = p_email;
        this.telefone = p_telefone;
        this.cpf = p_cpf;
        this.dataNasc = p_dataNasc;
        this.empresa = p_empresa;
        this.cargo = p_cargo;
        this.cidade = p_cidade;
        this.estado = p_estado;
        this.modalidade = p_modalidade;
    }

    // M. Setters
    public void setCod(int p_cod) {
        this.cod = p_cod;
    }
    public void setNome(String p_nome) {
        this.nome = p_nome;
    }
    public void setEmail(String p_email) {
        this.email = p_email;
    }
    public void setTelefone(String p_telefone) {
        this.telefone = p_telefone;
    }
    public void setCpf(String p_cpf) {
        this.cpf = p_cpf;
    }
    public void setDataNasc(String p_dataNasc) {
        this.dataNasc = p_dataNasc;
    }
    public void setEmpresa(String p_empresa) {
        this.empresa = p_empresa;
    }
    public void setCargo(String p_cargo) {
        this.cargo = p_cargo;
    }
    public void setCidade(String p_cidade) {
        this.cidade = p_cidade;
    }
    public void setEstado(String p_estado) {
        this.estado = p_estado;
    }
    public void setModalidade(String p_modalidade) {
        this.modalidade = p_modalidade;
    }
    public void setDataInscricao(String p_dataInscricao) {
        this.dataInscricao = p_dataInscricao;
    }

    // M. Getters
    public int getCod() {
        return this.cod;
    }
    public String getNome() {
        return this.nome;
    }
    public String getEmail() {
        return this.email;
    }
    public String getTelefone() {
        return this.telefone;
    }
    public String getCpf() {
        return this.cpf;
    }
    public String getDataNasc() {
        return this.dataNasc;
    }
    public String getEmpresa() {
        return this.empresa;
    }
    public String getCargo() {
        return this.cargo;
    }
    public String getCidade() {
        return this.cidade;
    }
    public String getEstado() {
        return this.estado;
    }
    public String getModalidade() {
        return this.modalidade;
    }
    public String getDataInscricao() {
        return this.dataInscricao;
    }
}
