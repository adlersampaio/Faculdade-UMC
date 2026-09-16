package funcionarios;

/**
 * Mensalista: possui um salario bruto e um valor de desconto.
 */
public class Mensalista extends Funcionario {

    public double salbruto;
    public double desconto;

    public Mensalista(String nome, int registro, double salbruto, double desconto) {
        super(nome, registro);
        this.salbruto = salbruto;
        this.desconto = desconto;
    }

    public double calculaSal() {
        return salbruto - desconto;
    }
}
