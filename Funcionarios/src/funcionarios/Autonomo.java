package funcionarios;

/**
 * Autonomo: recebe por um percentual de um valor total de vendas.
 */
public class Autonomo extends Funcionario {

    public double totvendas;
    public double percentual;

    public Autonomo(String nome, int registro, double totvendas, double percentual) {
        super(nome, registro);
        this.totvendas = totvendas;
        this.percentual = percentual;
    }

    public double calculaSal() {
        return totvendas * (percentual / 100);
    }
}
