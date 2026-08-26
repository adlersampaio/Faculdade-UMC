/**
 * Classe de modelo que representa o funcionario e concentra TODAS as regras
 * de calculo da folha de pagamento.
 *
 * Conforme a observacao do enunciado ("Para cada calculo metodos especificos
 * deverao existir na classe correspondente"), cada desconto possui o seu
 * proprio metodo:
 *
 *   calcInss()            -> desconto do INSS (5% do salario bruto)
 *   calcIr()              -> desconto do Imposto de Renda (0%, 12% ou 27,5%)
 *   calcFaltas(faltas)    -> valor descontado pelos dias de falta
 *   calcSalarioLiq(desc)  -> salario liquido (bruto - total de descontos)
 *
 * A classe e um POJO puro: nao conhece a interface grafica, nao imprime nada
 * na tela e nao le nada do teclado. Isso permite testar as regras de negocio
 * isoladamente (ver teste/TesteFuncionario.java).
 *
 * @author Adler Sampaio
 * @version 1.0
 */
public class Funcionario {

    // ------------------------------------------------------------------
    // Constantes das regras de negocio (evitam "numeros magicos" no codigo)
    // ------------------------------------------------------------------

    /** Aliquota unica do INSS: 5% sobre o salario bruto. */
    public static final double ALIQUOTA_INSS = 0.05;

    /** Aliquota do IR para salario bruto ACIMA de R$ 10.000,00: 27,5%. */
    public static final double ALIQUOTA_IR_ALTA = 0.275;

    /** Aliquota do IR para salario bruto de R$ 5.000,00 ate R$ 10.000,00: 12%. */
    public static final double ALIQUOTA_IR_MEDIA = 0.12;

    /** Aliquota do IR para salario bruto INFERIOR a R$ 5.000,00: isento (0%). */
    public static final double ALIQUOTA_IR_ISENTA = 0.0;

    /** Teto da faixa de 12% do IR. Acima desse valor aplica-se 27,5%. */
    public static final double TETO_IR = 10000.00;

    /** Piso da faixa de 12% do IR. Abaixo desse valor o funcionario e isento. */
    public static final double PISO_IR = 5000.00;

    /** Numero de dias considerado no mes comercial para o calculo das faltas. */
    public static final int DIAS_DO_MES = 30;

    /** Numero de horas da jornada diaria usado no calculo das faltas. */
    public static final int HORAS_DO_DIA = 8;

    // ------------------------------------------------------------------
    // Atributos (conforme o diagrama de classes)
    // ------------------------------------------------------------------

    /** Nome do funcionario. */
    public String nomeFuncionario;

    /** Cargo ocupado pelo funcionario. */
    public String cargo;

    /** Salario bruto mensal, base de todos os calculos. */
    public double salario;

    // ------------------------------------------------------------------
    // Construtores
    // ------------------------------------------------------------------

    /** Construtor vazio (permite criar o objeto e preencher os campos depois). */
    public Funcionario() {
    }

    /**
     * Construtor completo, usado pela tela no momento do cadastro.
     *
     * @param nomeFuncionario nome do funcionario
     * @param cargo           cargo ocupado
     * @param salario         salario bruto mensal
     */
    public Funcionario(String nomeFuncionario, String cargo, double salario) {
        this.nomeFuncionario = nomeFuncionario;
        this.cargo = cargo;
        this.salario = salario;
    }

    // ------------------------------------------------------------------
    // Metodos de calculo
    // ------------------------------------------------------------------

    /**
     * Regra 1 do enunciado - Desconto do INSS: 5% do salario bruto.
     *
     * @return valor em reais descontado a titulo de INSS
     */
    public double calcInss() {
        return salario * ALIQUOTA_INSS;
    }

    /**
     * Regra 2 do enunciado - Desconto do Imposto de Renda, por faixa de salario:
     *
     *   salario bruto ACIMA de 10.000,00 ................ 27,5%
     *   salario bruto de 5.000,00 ate 10.000,00 ......... 12%
     *   salario bruto INFERIOR a 5.000,00 ............... isento (0%)
     *
     * @return valor em reais descontado a titulo de Imposto de Renda
     */
    public double calcIr() {
        double aliquota;

        if (salario > TETO_IR) {
            aliquota = ALIQUOTA_IR_ALTA;      // 27,5%
        } else if (salario >= PISO_IR) {
            aliquota = ALIQUOTA_IR_MEDIA;     // 12%
        } else {
            aliquota = ALIQUOTA_IR_ISENTA;    // 0%
        }

        return salario * aliquota;
    }

    /**
     * Regra 3 do enunciado - Desconto das faltas.
     *
     * O valor de cada falta e obtido dividindo o salario bruto por 30 dias e
     * por 8 horas, exatamente como pede o enunciado ("salario bruto/30/8"),
     * e o resultado e multiplicado pela quantidade de faltas informada.
     *
     * @param faltas quantidade de faltas do funcionario no mes
     * @return valor em reais descontado pelas faltas (zero quando nao ha faltas)
     */
    public double calcFaltas(double faltas) {
        if (faltas <= 0) {
            return 0.0;
        }
        return (salario / DIAS_DO_MES / HORAS_DO_DIA) * faltas;
    }

    /**
     * Calcula o salario liquido: salario bruto menos o total dos descontos
     * (INSS + Imposto de Renda + faltas).
     *
     * @param desc soma de todos os descontos apurados
     * @return salario liquido do funcionario
     */
    public double calcSalarioLiq(double desc) {
        return salario - desc;
    }

    // ------------------------------------------------------------------
    // Utilitario
    // ------------------------------------------------------------------

    /**
     * Representacao textual usada pelo botao "Exibir" da tela.
     *
     * @return dados cadastrais do funcionario
     */
    @Override
    public String toString() {
        return "Nome do funcionario: " + nomeFuncionario
                + "\nCargo: " + cargo
                + "\nSalario bruto: " + salario;
    }
}
