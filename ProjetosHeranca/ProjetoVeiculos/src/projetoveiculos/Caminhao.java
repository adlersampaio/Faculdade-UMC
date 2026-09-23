package projetoveiculos;

/**
 * Subclasse Caminhao: herda placa e ano de Veiculo e acrescenta o numero de eixos.
 */
public class Caminhao extends Veiculo {

    public int eixos;

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    @Override
    public String exibirDados() {
        return "=== CAMINHÃO ===\n" + super.exibirDados() + "\nNúmero de eixos: " + eixos;
    }
}
