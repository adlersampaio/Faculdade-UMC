import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

/**
 * Interface grafica (Java Swing) da folha de pagamento.
 *
 * A tela e responsavel apenas por:
 *   1) ler os dados digitados pelo usuario;
 *   2) pedir os calculos ao objeto Funcionario;
 *   3) exibir os resultados formatados.
 *
 * Nenhuma regra de calculo e escrita aqui - todas moram na classe Funcionario,
 * conforme a observacao do enunciado.
 *
 * Botoes da tela:
 *   [Cadastrar]      - cria o objeto Funcionario com os dados digitados
 *   [Exibir]         - mostra os dados cadastrados do funcionario
 *   [Calcular Folha] - calcula INSS, IR, faltas e salario liquido
 *
 * @author Adler Sampaio
 * @version 1.0
 */
public class FormFuncionario extends JFrame {

    private static final long serialVersionUID = 1L;

    /** Formatador de moeda no padrao brasileiro (R$ 1.234,56). */
    private static final NumberFormat MOEDA =
            NumberFormat.getCurrencyInstance(Locale.forLanguageTag("pt-BR"));

    /**
     * Funcionario cadastrado na tela. Fica nulo enquanto o botao "Cadastrar"
     * nao for acionado - e por isso que "Exibir" e "Calcular Folha" avisam o
     * usuario quando nao ha ninguem cadastrado.
     */
    private Funcionario func;

    // ------------------------------------------------------------------
    // Componentes de entrada
    // ------------------------------------------------------------------
    private final JTextField txtNomeFuncionario = new JTextField(20);
    private final JTextField txtCargo = new JTextField(20);
    private final JTextField txtSalarioBruto = new JTextField(20);
    private final JTextField txtFaltas = new JTextField(5);

    // ------------------------------------------------------------------
    // Componentes de saida (somente leitura)
    // ------------------------------------------------------------------
    private final JTextField txtInss = new JTextField(12);
    private final JTextField txtIr = new JTextField(12);
    private final JTextField txtValorFaltas = new JTextField(12);
    private final JTextField txtSalarioLiquido = new JTextField(12);

    // ------------------------------------------------------------------
    // Botoes
    // ------------------------------------------------------------------
    private final JButton btnCadastrar = new JButton("Cadastrar");
    private final JButton btnExibir = new JButton("Exibir");
    private final JButton btnCalcularFolha = new JButton("Calcular Folha");

    /**
     * Monta a janela e registra os eventos dos botoes.
     */
    public FormFuncionario() {
        super("Folha de Pagamento - Cálculo do Salário Líquido");

        montarTela();
        registrarEventos();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setMinimumSize(getSize());
        setLocationRelativeTo(null); // centraliza a janela na tela
    }

    // ==================================================================
    // Construcao da interface
    // ==================================================================

    /** Cria e posiciona todos os componentes da janela. */
    private void montarTela() {
        JPanel painel = new JPanel(new GridBagLayout());
        painel.setBorder(BorderFactory.createEmptyBorder(15, 20, 15, 20));

        // --- Dados cadastrais -----------------------------------------
        painel.add(criarTitulo("Dados do funcionário"), posicao(0, 0, 4));

        painel.add(new JLabel("Nome do funcionário:"), posicao(0, 1, 1));
        painel.add(txtNomeFuncionario, posicao(1, 1, 3));

        painel.add(new JLabel("Cargo:"), posicao(0, 2, 1));
        painel.add(txtCargo, posicao(1, 2, 3));

        painel.add(new JLabel("Salário bruto:"), posicao(0, 3, 1));
        painel.add(txtSalarioBruto, posicao(1, 3, 3));

        // --- Botoes de acao -------------------------------------------
        JPanel painelBotoes = new JPanel();
        painelBotoes.add(btnCadastrar);
        painelBotoes.add(btnExibir);
        painelBotoes.add(btnCalcularFolha);
        painel.add(painelBotoes, posicao(0, 4, 4));

        painel.add(new JSeparator(SwingConstants.HORIZONTAL), posicao(0, 5, 4));

        // --- Resultado da folha ---------------------------------------
        painel.add(criarTitulo("Folha de pagamento"), posicao(0, 6, 4));

        painel.add(new JLabel("INSS (5%):"), posicao(0, 7, 1));
        painel.add(txtInss, posicao(1, 7, 1));

        painel.add(new JLabel("IR:"), posicao(0, 8, 1));
        painel.add(txtIr, posicao(1, 8, 1));

        painel.add(new JLabel("Faltas (dias):"), posicao(0, 9, 1));
        painel.add(txtFaltas, posicao(1, 9, 1));
        painel.add(new JLabel("Valor das faltas:"), posicao(2, 9, 1));
        painel.add(txtValorFaltas, posicao(3, 9, 1));

        painel.add(new JLabel("Salário líquido:"), posicao(0, 10, 1));
        painel.add(txtSalarioLiquido, posicao(1, 10, 1));

        // Campos calculados nao podem ser digitados pelo usuario.
        somenteLeitura(txtInss);
        somenteLeitura(txtIr);
        somenteLeitura(txtValorFaltas);
        somenteLeitura(txtSalarioLiquido);

        // Destaque para o resultado final.
        txtSalarioLiquido.setFont(txtSalarioLiquido.getFont().deriveFont(Font.BOLD));

        setContentPane(painel);
    }

    /** Cria um rotulo de secao em negrito. */
    private JLabel criarTitulo(String texto) {
        JLabel titulo = new JLabel(texto);
        titulo.setFont(titulo.getFont().deriveFont(Font.BOLD, 14f));
        return titulo;
    }

    /**
     * Monta as restricoes de posicionamento do GridBagLayout.
     *
     * @param coluna  coluna do componente
     * @param linha   linha do componente
     * @param largura quantidade de colunas ocupadas
     * @return restricoes prontas para uso
     */
    private GridBagConstraints posicao(int coluna, int linha, int largura) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = coluna;
        gbc.gridy = linha;
        gbc.gridwidth = largura;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(4, 4, 4, 4);
        return gbc;
    }

    /** Deixa o campo apenas para leitura (resultado calculado). */
    private void somenteLeitura(JTextField campo) {
        campo.setEditable(false);
        campo.setFocusable(false);
        campo.setBackground(new Color(238, 238, 238));
        campo.setHorizontalAlignment(SwingConstants.RIGHT);
        campo.setPreferredSize(new Dimension(140, campo.getPreferredSize().height));
    }

    /** Liga cada botao ao seu respectivo metodo. */
    private void registrarEventos() {
        btnCadastrar.addActionListener(e -> cadastrar());
        btnExibir.addActionListener(e -> exibir());
        btnCalcularFolha.addActionListener(e -> calcularFolha());
    }

    // ==================================================================
    // Acoes dos botoes
    // ==================================================================

    /**
     * Botao [Cadastrar] - valida os campos digitados e cria o objeto
     * Funcionario que sera usado nos calculos.
     */
    private void cadastrar() {
        String nome = txtNomeFuncionario.getText().trim();
        String cargoDigitado = txtCargo.getText().trim();

        if (nome.isEmpty()) {
            avisar("Informe o nome do funcionário.");
            txtNomeFuncionario.requestFocus();
            return;
        }
        if (cargoDigitado.isEmpty()) {
            avisar("Informe o cargo do funcionário.");
            txtCargo.requestFocus();
            return;
        }

        double salarioBruto;
        try {
            salarioBruto = lerNumero(txtSalarioBruto.getText());
        } catch (NumberFormatException ex) {
            avisar("Salário bruto inválido. Use apenas números, por exemplo: 3500,00");
            txtSalarioBruto.requestFocus();
            return;
        }

        if (salarioBruto <= 0) {
            avisar("O salário bruto deve ser maior que zero.");
            txtSalarioBruto.requestFocus();
            return;
        }

        // Cria o objeto do modelo com os dados da tela.
        func = new Funcionario(nome, cargoDigitado, salarioBruto);

        limparResultados();
        JOptionPane.showMessageDialog(this,
                "Funcionário cadastrado com sucesso!",
                "Cadastro", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Botao [Exibir] - mostra os dados cadastrados do funcionario.
     */
    private void exibir() {
        if (!existeFuncionario()) {
            return;
        }

        String dados = "Nome do funcionário: " + func.nomeFuncionario
                + "\nCargo: " + func.cargo
                + "\nSalário bruto: " + MOEDA.format(func.salario);

        JOptionPane.showMessageDialog(this, dados,
                "Dados do funcionário", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Botao [Calcular Folha] - pede a classe Funcionario o valor de cada
     * desconto e exibe o salario liquido.
     */
    private void calcularFolha() {
        if (!existeFuncionario()) {
            return;
        }

        double faltas;
        try {
            faltas = lerFaltas(txtFaltas.getText());
        } catch (NumberFormatException ex) {
            avisar("Quantidade de faltas inválida. Informe um número inteiro, por exemplo: 2");
            txtFaltas.requestFocus();
            return;
        }

        // Um metodo especifico para cada calculo (regra do enunciado).
        double inss = func.calcInss();
        double ir = func.calcIr();
        double valorFaltas = func.calcFaltas(faltas);
        double totalDescontos = inss + ir + valorFaltas;
        double salarioLiquido = func.calcSalarioLiq(totalDescontos);

        txtInss.setText(MOEDA.format(inss));
        txtIr.setText(MOEDA.format(ir));
        txtValorFaltas.setText(MOEDA.format(valorFaltas));
        txtSalarioLiquido.setText(MOEDA.format(salarioLiquido));
    }

    // ==================================================================
    // Metodos auxiliares da tela
    // ==================================================================

    /** Verifica se ja existe um funcionario cadastrado, avisando se nao existir. */
    private boolean existeFuncionario() {
        if (func == null) {
            avisar("Cadastre um funcionário antes de continuar.");
            txtNomeFuncionario.requestFocus();
            return false;
        }
        return true;
    }

    /**
     * Converte o texto digitado em numero, aceitando tanto o padrao brasileiro
     * (1.234,56) quanto o padrao com ponto decimal (1234.56).
     *
     * @param texto conteudo do campo
     * @return valor numerico correspondente
     * @throws NumberFormatException quando o texto nao representa um numero
     */
    private double lerNumero(String texto) {
        String limpo = texto.replace("R$", "").replace(" ", "").trim();

        if (limpo.isEmpty()) {
            throw new NumberFormatException("campo vazio");
        }
        if (limpo.contains(",")) {
            // Padrao brasileiro: ponto separa milhar e virgula separa decimais.
            limpo = limpo.replace(".", "").replace(",", ".");
        }
        return Double.parseDouble(limpo);
    }

    /**
     * Le a quantidade de faltas. Campo vazio significa nenhuma falta.
     *
     * @param texto conteudo do campo de faltas
     * @return quantidade de faltas (nunca negativa)
     * @throws NumberFormatException quando o texto nao representa um numero valido
     */
    private double lerFaltas(String texto) {
        if (texto.trim().isEmpty()) {
            return 0.0;
        }
        double faltas = lerNumero(texto);
        if (faltas < 0) {
            throw new NumberFormatException("faltas negativas");
        }
        return faltas;
    }

    /** Limpa os campos calculados (usado apos um novo cadastro). */
    private void limparResultados() {
        txtInss.setText("");
        txtIr.setText("");
        txtValorFaltas.setText("");
        txtSalarioLiquido.setText("");
    }

    /** Mostra uma mensagem de aviso ao usuario. */
    private void avisar(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem,
                "Atenção", JOptionPane.WARNING_MESSAGE);
    }

    // ==================================================================
    // Ponto de entrada da aplicacao
    // ==================================================================

    /**
     * Metodo principal: abre a janela da folha de pagamento.
     *
     * @param args nao utilizado
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            // Se o tema do sistema nao estiver disponivel, usa o tema padrao do Java.
        }

        // Toda a interface grafica deve ser criada na thread de eventos do Swing.
        SwingUtilities.invokeLater(() -> new FormFuncionario().setVisible(true));
    }
}
