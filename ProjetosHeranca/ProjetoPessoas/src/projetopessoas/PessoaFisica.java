package projetopessoas;

/**
 * Subclasse PessoaFisica: herda o endereco de Pessoa e acrescenta nome e CPF.
 */
public class PessoaFisica extends Pessoa {

    public String nome;
    public String cpf;

    public PessoaFisica(String nome, String cpf, String endereco, String cidade, String estado) {
        super(endereco, cidade, estado);
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String exibirDados() {
        return "=== PESSOA FÍSICA ===\nNome: " + nome + "\nCPF: " + cpf + "\n" + super.exibirDados();
    }
}
