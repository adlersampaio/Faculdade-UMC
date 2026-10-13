/*
 * Projeto: Inscrição para Evento - Atividade 1 - M1
 * Classe DAO (Data Access Object): faz a comunicação entre o modelo
 * Inscricao e a tabela "inscricoes" do banco de dados.
 */
package model.DAO;

import model.Inscricao;
import java.sql.*;
import config.ConectaBanco;

/**
 *
 * @author Gabriel Gomes, Adler Augusto Vendramel Sampaio, Julia Nascimento Ignácio
 */
public class InscricaoDAO {

    // + cadastrar( Inscricao ): boolean
    public boolean cadastrar(Inscricao p_insc) throws ClassNotFoundException{
        Connection conexao = null;

        try{
            conexao = ConectaBanco.conectar(); // abrir a conexão
            // pk_id e data_inscricao são gerados automaticamente pelo banco
            String sql = "INSERT INTO inscricoes (nome, email, telefone, cpf, data_nasc, empresa, cargo, cidade, estado, modalidade) "
                       + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            // Preenche cada "?" com o valor correspondente do objeto
            PreparedStatement pstm = conexao.prepareStatement(sql);
            pstm.setString(1, p_insc.getNome());
            pstm.setString(2, p_insc.getEmail());
            pstm.setString(3, p_insc.getTelefone());
            pstm.setString(4, p_insc.getCpf());
            pstm.setString(5, p_insc.getDataNasc());
            pstm.setString(6, p_insc.getEmpresa());
            pstm.setString(7, p_insc.getCargo());
            pstm.setString(8, p_insc.getCidade());
            pstm.setString(9, p_insc.getEstado());
            pstm.setString(10, p_insc.getModalidade());
            pstm.executeUpdate();  // Insert, Update, Delete
            pstm.close();
            conexao.close();       // fechar a conexão

            return true;
        }
        catch(SQLException ex){
            System.out.println("Erro - SQL: " + ex);
            return false;
        }
    }

    // + consultarId( int ): Inscricao
    public Inscricao consultarId(int p_id) throws ClassNotFoundException{
        Connection conexao = null;

        try{
            conexao = ConectaBanco.conectar(); // abrir a conexão
            String sql = "SELECT * FROM inscricoes WHERE pk_id = ?";

            PreparedStatement pstm = conexao.prepareStatement(sql);
            pstm.setInt(1, p_id);
            ResultSet rs = pstm.executeQuery();  // SELECT

            Inscricao insc = preencher(rs); // monta o objeto com o resultado

            pstm.close();
            conexao.close();
            return insc;
        }
        catch(SQLException ex){
            System.out.println("Erro - SQL: " + ex);
            return null;
        }
    }

    // + consultarNome( String ): Inscricao
    public Inscricao consultarNome(String p_nome) throws ClassNotFoundException{
        Connection conexao = null;

        try{
            conexao = ConectaBanco.conectar(); // abrir a conexão
            String sql = "SELECT * FROM inscricoes WHERE nome = ?"; // Define a instr. SQL

            PreparedStatement pstm = conexao.prepareStatement(sql);
            pstm.setString(1, p_nome);
            ResultSet rs = pstm.executeQuery();  // SELECT

            Inscricao insc = preencher(rs); // monta o objeto com o resultado

            pstm.close();
            conexao.close();
            return insc;
        }
        catch(SQLException ex){
            System.out.println("Erro - SQL: " + ex);
            return null;
        }
    }

    // - preencher( ResultSet ): Inscricao
    // Copia a linha retornada pelo SELECT para um objeto Inscricao.
    // Se nada for encontrado, devolve o objeto vazio (cod = 0).
    private Inscricao preencher(ResultSet rs) throws SQLException{
        Inscricao insc = new Inscricao();
        if (rs.next()){
            insc.setCod(rs.getInt("pk_id"));
            insc.setNome(rs.getString("nome"));
            insc.setEmail(rs.getString("email"));
            insc.setTelefone(rs.getString("telefone"));
            insc.setCpf(rs.getString("cpf"));
            insc.setDataNasc(rs.getString("data_nasc"));
            insc.setEmpresa(rs.getString("empresa"));
            insc.setCargo(rs.getString("cargo"));
            insc.setCidade(rs.getString("cidade"));
            insc.setEstado(rs.getString("estado"));
            insc.setModalidade(rs.getString("modalidade"));
            insc.setDataInscricao(rs.getString("data_inscricao"));
        }
        return insc;
    }
}
