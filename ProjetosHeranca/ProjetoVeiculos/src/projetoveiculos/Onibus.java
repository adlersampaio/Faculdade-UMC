package projetoveiculos;

/**
 * Subclasse Onibus: herda placa e ano de Veiculo e acrescenta o numero de assentos.
 */
public class Onibus extends Veiculo {

    public int assentos;

    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }

    @Override
    public String exibirDados() {
        return "=== ÔNIBUS ===\n" + super.exibirDados() + "\nNúmero de assentos: " + assentos;
    }
}
