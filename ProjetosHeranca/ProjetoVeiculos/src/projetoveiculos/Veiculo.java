package projetoveiculos;

/**
 * Superclasse com as caracteristicas comuns a todos os veiculos.
 */
public class Veiculo {

    public String placa;
    public int ano;

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public String exibirDados() {
        return "Placa: " + placa + "\nAno de fabricação: " + ano;
    }
}
