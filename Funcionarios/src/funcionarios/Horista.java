package funcionarios;

/**
 * Horista: recebe pelo valor da hora x numero de horas trabalhadas.
 */
public class Horista extends Funcionario {

    public double valorhora;
    public double tothoras;

    public Horista(String nome, int registro, double valorhora, double tothoras) {
        super(nome, registro);
        this.valorhora = valorhora;
        this.tothoras = tothoras;
    }

    public double calculaSal() {
        return valorhora * tothoras;
    }
}
