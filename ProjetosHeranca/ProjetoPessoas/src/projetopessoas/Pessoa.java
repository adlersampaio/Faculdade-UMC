package projetopessoas;

/**
 * Superclasse com o endereco comum a pessoa fisica e juridica.
 */
public class Pessoa {

    public String endereco;
    public String cidade;
    public String estado;

    public Pessoa(String endereco, String cidade, String estado) {
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String exibirDados() {
        return "Endereço: " + endereco + "\nCidade: " + cidade + "\nEstado: " + estado;
    }
}
