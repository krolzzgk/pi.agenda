/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
                + c.getDataDeNascimento() + ", '"
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

