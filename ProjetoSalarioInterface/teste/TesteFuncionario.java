/**
 * Testes das regras de negocio da classe Funcionario.
 *
 * Nao utiliza nenhuma biblioteca externa (JUnit): e uma classe Java comum,
 * com um metodo main, para poder ser executada em qualquer IDE ou pelo
 * terminal, exatamente como o restante do projeto.
 *
 * Execucao pelo terminal (a partir da pasta ProjetoSalarioInterface):
 *   javac -encoding UTF-8 -d build src/Funcionario.java teste/TesteFuncionario.java
 *   java -cp build TesteFuncionario
 *
 * @author Adler Sampaio
 * @version 1.0
 */
public class TesteFuncionario {

    /** Margem de erro aceita nas comparacoes de ponto flutuante. */
    private static final double TOLERANCIA = 0.0001;

    private static int totalTestes = 0;
    private static int totalFalhas = 0;

    public static void main(String[] args) {
        testarInss();
        testarIr();
        testarFaltas();
        testarSalarioLiquido();
        testarCenariosCompletos();

        System.out.println();
        System.out.println("Testes executados: " + totalTestes);
        System.out.println("Falhas: " + totalFalhas);

        if (totalFalhas > 0) {
            System.out.println("RESULTADO: FALHOU");
            System.exit(1);
        }
        System.out.println("RESULTADO: TODOS OS TESTES PASSARAM");
    }

    // ------------------------------------------------------------------
    // Regra 1 - INSS: 5% do salario bruto
    // ------------------------------------------------------------------
    private static void testarInss() {
        System.out.println("== INSS (5% do salario bruto) ==");
        verificar("INSS de 3.000,00", 150.00, novo(3000.00).calcInss());
        verificar("INSS de 5.000,00", 250.00, novo(5000.00).calcInss());
        verificar("INSS de 12.000,00", 600.00, novo(12000.00).calcInss());
        verificar("INSS de 0,00", 0.00, novo(0.00).calcInss());
    }

    // ------------------------------------------------------------------
    // Regra 2 - IR: 27,5% acima de 10.000 / 12% de 5.000 a 10.000 / isento
    // ------------------------------------------------------------------
    private static void testarIr() {
        System.out.println();
        System.out.println("== Imposto de Renda (faixas) ==");
        verificar("IR de 1.500,00 (isento)", 0.00, novo(1500.00).calcIr());
        verificar("IR de 4.999,99 (isento)", 0.00, novo(4999.99).calcIr());
        verificar("IR de 5.000,00 (12%)", 600.00, novo(5000.00).calcIr());
        verificar("IR de 7.500,00 (12%)", 900.00, novo(7500.00).calcIr());
        verificar("IR de 10.000,00 (12%)", 1200.00, novo(10000.00).calcIr());
        verificar("IR de 10.000,01 (27,5%)", 2750.0028, novo(10000.01).calcIr());
        verificar("IR de 12.000,00 (27,5%)", 3300.00, novo(12000.00).calcIr());
    }

    // ------------------------------------------------------------------
    // Regra 3 - Faltas: (salario bruto / 30 / 8) x quantidade de faltas
    // ------------------------------------------------------------------
    private static void testarFaltas() {
        System.out.println();
        System.out.println("== Faltas ((salario / 30 / 8) x faltas) ==");
        verificar("Sem faltas", 0.00, novo(3000.00).calcFaltas(0));
        verificar("1 falta com salario de 2.400,00", 10.00, novo(2400.00).calcFaltas(1));
        verificar("2 faltas com salario de 3.000,00", 25.00, novo(3000.00).calcFaltas(2));
        verificar("3 faltas com salario de 12.000,00", 150.00, novo(12000.00).calcFaltas(3));
        verificar("Faltas negativas nao descontam", 0.00, novo(3000.00).calcFaltas(-2));
    }

    // ------------------------------------------------------------------
    // Salario liquido = salario bruto - descontos
    // ------------------------------------------------------------------
    private static void testarSalarioLiquido() {
        System.out.println();
        System.out.println("== Salario liquido ==");
        verificar("Sem descontos", 3000.00, novo(3000.00).calcSalarioLiq(0));
        verificar("Com 175,00 de descontos", 2825.00, novo(3000.00).calcSalarioLiq(175.00));
    }

    // ------------------------------------------------------------------
    // Cenarios completos: os quatro calculos em sequencia, como faz a tela
    // ------------------------------------------------------------------
    private static void testarCenariosCompletos() {
        System.out.println();
        System.out.println("== Cenarios completos ==");

        // Cenario A: isento de IR, 2 faltas.
        Funcionario a = new Funcionario("Ana Souza", "Assistente", 3000.00);
        double inssA = a.calcInss();          // 150,00
        double irA = a.calcIr();              // 0,00 (isento)
        double faltasA = a.calcFaltas(2);     // 25,00
        double liquidoA = a.calcSalarioLiq(inssA + irA + faltasA);
        verificar("Cenario A - INSS", 150.00, inssA);
        verificar("Cenario A - IR", 0.00, irA);
        verificar("Cenario A - faltas", 25.00, faltasA);
        verificar("Cenario A - liquido", 2825.00, liquidoA);

        // Cenario B: faixa de 12%, sem faltas.
        Funcionario b = new Funcionario("Bruno Lima", "Analista", 8000.00);
        double inssB = b.calcInss();          // 400,00
        double irB = b.calcIr();              // 960,00
        double faltasB = b.calcFaltas(0);     // 0,00
        double liquidoB = b.calcSalarioLiq(inssB + irB + faltasB);
        verificar("Cenario B - INSS", 400.00, inssB);
        verificar("Cenario B - IR", 960.00, irB);
        verificar("Cenario B - faltas", 0.00, faltasB);
        verificar("Cenario B - liquido", 6640.00, liquidoB);

        // Cenario C: faixa de 27,5%, 3 faltas.
        Funcionario c = new Funcionario("Carla Dias", "Gerente", 12000.00);
        double inssC = c.calcInss();          // 600,00
        double irC = c.calcIr();              // 3.300,00
        double faltasC = c.calcFaltas(3);     // 150,00
        double liquidoC = c.calcSalarioLiq(inssC + irC + faltasC);
        verificar("Cenario C - INSS", 600.00, inssC);
        verificar("Cenario C - IR", 3300.00, irC);
        verificar("Cenario C - faltas", 150.00, faltasC);
        verificar("Cenario C - liquido", 7950.00, liquidoC);
    }

    // ------------------------------------------------------------------
    // Infraestrutura dos testes
    // ------------------------------------------------------------------

    /** Cria um funcionario apenas com o salario informado. */
    private static Funcionario novo(double salario) {
        return new Funcionario("Funcionario Teste", "Cargo Teste", salario);
    }

    /** Compara o valor esperado com o valor obtido e imprime o resultado. */
    private static void verificar(String descricao, double esperado, double obtido) {
        totalTestes++;
        boolean passou = Math.abs(esperado - obtido) <= TOLERANCIA;
        if (!passou) {
            totalFalhas++;
        }
        System.out.printf("[%s] %-42s esperado=%.4f obtido=%.4f%n",
                passou ? "OK  " : "FALHA", descricao, esperado, obtido);
    }
}
