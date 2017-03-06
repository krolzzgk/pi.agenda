/*
 * Senac - SP
 * Projeto: Agenda
 * Desenvolvido por: Ana Paula Gandorin, Karolina Kallajian e Paulo Nunes
 * Março - 2017
 */
package br.com.senac.servico;

import br.com.senac.db.utils.ConnectionUtils;
import java.sql.Connection;

/**
 *
 * @author Karol
 */
public class Util {

    public static boolean checkConnection() {
        boolean validConnection = false;
        Connection connection = null;
        try {
            connection = ConnectionUtils.getConnection();
            if (connection != null && connection.isValid(1000)) {
                validConnection = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return validConnection;
    }
}
