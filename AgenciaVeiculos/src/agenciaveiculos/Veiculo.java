package agenciaveiculos;

/**
 * Classe Veiculo - os valores iniciais dos atributos sao definidos pelo construtor.
 */
public class Veiculo {

    public String marca;
    public String modelo;
    public int ano;
    public double valor;

    public Veiculo(String marca, String modelo, int ano, double valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }

    /**
     * Calcula o valor final da venda.
     *
     * @param op 1 - A vista (10% de desconto) / 2 - A prazo (10% de aumento)
     * @return valor final da venda
     */
    public double vender(int op) {
        if (op == 1) {
            return valor - (valor * 0.10);
        } else if (op == 2) {
            return valor + (valor * 0.10);
        }
        return valor;
    }
}
