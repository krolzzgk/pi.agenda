/*
 * Senac - SP
 * Projeto: Agenda
 * Desenvolvido por: Ana Paula Gandorin, Karolina Kallajian e Paulo Nunes
 * Fevereiro - 2017
 */
package br.com.senac.db.dao;

import br.com.senac.db.utils.ConnectionUtils;
import br.com.senac.model.Cadastro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Karol
 */
public class DaoAgenda {

    private static Connection conexao = null;

    public static void cadastrar(Cadastro c) throws SQLException, Exception {

        String sql = "INSERT INTO Agenda (Nome, DataDeNascimento, Email, Prefixo, Telefone, DataCadastro)"
                + "VALUES (?, ?, ?, ?, ?, ?)";

        PreparedStatement statementCadastro = null;

        try {
            conexao = ConnectionUtils.getConnection();
            statementCadastro = conexao.prepareStatement(sql);
            statementCadastro.setString(1, c.getNome());
            statementCadastro.setDate(2, c.getDataNascimentoSQL());
            statementCadastro.setString(3, c.getEmail());
            statementCadastro.setInt(4, c.getPrefixo());
            statementCadastro.setInt(5, c.getTelefone());
            statementCadastro.setDate(6, c.getDataCadastroSQL());
        } catch (Exception e) {

        }

        statementCadastro.execute();

    }

    private static void executarSQL(String sql) throws SQLException, Exception {

        Connection connection = null;

        Statement statement = null;
        try {

            connection = ConnectionUtils.getConnection();
            statement = connection.createStatement();
            System.out.println("Executando COMANDO SQL: " + sql);
            statement.execute(sql);

        } finally {

            if (statement != null && !statement.isClosed()) {
                statement.close();
            }

            if (connection != null && !connection.isClosed()) {
                connection.close();
            }

        }
    }
}
