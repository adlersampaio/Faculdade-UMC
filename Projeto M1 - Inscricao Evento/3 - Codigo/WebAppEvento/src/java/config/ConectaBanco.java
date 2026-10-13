/*
 * Projeto: Inscrição para Evento - Atividade 1 - M1
 * Classe responsável por abrir a conexão com o banco de dados MySQL.
 */
package config;
import java.sql.*;

/**
 *
 * @author Gabriel Gomes, Adler Augusto Vendramel Sampaio, Julia Nascimento Ignácio
 */
public class ConectaBanco {
    // + conectar(): Connection
    public static Connection conectar() throws ClassNotFoundException{
        Connection conn = null;

        try {
            // Carrega o driver JDBC do MySQL (mysql-connector-java-8.0.30.jar)
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Abre a conexão: servidor local, banco "evento", usuário root, sem senha (padrão XAMPP)
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/evento","root","");
        } catch (Exception ex) {
            System.out.println("Erro - SQL: " + ex);
        }
        return conn;
    }
}
