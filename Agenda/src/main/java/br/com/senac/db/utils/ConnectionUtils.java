/*
 * Senac - SP
 * Projeto: Agenda
 * Desenvolvido por: Ana Paula Gandorin, Karolina Kallajian e Paulo Nunes
 * Março - 2017
 */
package br.com.senac.db.utils;

import br.com.senac.db.constants.Constants;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Karol
 */
public class ConnectionUtils {

    public static Connection getConnection() {

        Connection con = null;

        try {
            String URL = Constants.URL;
            Properties prop = new Properties();
            prop.put("user", Constants.USER);
            prop.put("password", Constants.PASSWORD);
            con = DriverManager.getConnection(URL, prop);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return con;
    }

}
