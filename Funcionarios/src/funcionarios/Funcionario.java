package funcionarios;

/**
 * Superclasse com os dados comuns a todos os tipos de funcionario.
 */
public class Funcionario {

    public String nome;
    public int registro;

    public Funcionario(String nome, int registro) {
        this.nome = nome;
        this.registro = registro;
    }
}
