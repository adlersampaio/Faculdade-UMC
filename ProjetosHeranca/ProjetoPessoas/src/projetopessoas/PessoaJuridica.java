package projetopessoas;

/**
 * Subclasse PessoaJuridica: herda o endereco de Pessoa e acrescenta nome fantasia e CNPJ.
 */
public class PessoaJuridica extends Pessoa {

    public String nomeFantasia;
    public String cnpj;

    public PessoaJuridica(String nomeFantasia, String cnpj, String endereco, String cidade, String estado) {
        super(endereco, cidade, estado);
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    @Override
    public String exibirDados() {
        return "=== PESSOA JURÍDICA ===\nNome fantasia: " + nomeFantasia + "\nCNPJ: " + cnpj + "\n" + super.exibirDados();
    }
}
