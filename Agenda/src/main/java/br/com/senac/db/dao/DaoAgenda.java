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
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Karol
 */
public class DaoAgenda {

    public static void cadastrar(Cadastro c)
            throws SQLException, Exception {

        String sql = "INSERT INTO Agenda (Nome, DataDeNascimento, Email, Prefixo, Telefone)"
                + "VALUES ('" + c.getNome() + ", '"
                + c.getDataNascimento()+ ", '"
                + c.getEmail() + ", "
                + c.getPrefixo() + ", "
                + c.getTelefone() + ");";
                
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

