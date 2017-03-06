/*
 * Senac - SP
 * Projeto: Agenda
 * Desenvolvido por: Ana Paula Gandorin, Karolina Kallajian e Paulo Nunes
 * Março - 2017
 */
package br.com.senac.db.dao;

import br.com.senac.db.utils.ConnectionUtils;
import com.sun.jmx.mbeanserver.Util;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Karol
 */
public class DaoLista {
   private static Connection conexao = null;
    
    public static ArrayList<Object[]> gerarLista() throws SQLException, Exception{
        
        ArrayList<Object[]> listaResultado = new ArrayList<>();
        
        PreparedStatement lista = null;
        
        ResultSet result = null;
        
        String sql = "SELECT Nome, DataDeNascimento, Email, Prefixo, Telefone "
                + "FROM Agenda "
                + "ORDER BY Nome";
        
        try {
            conexao = ConnectionUtils.getConnection();
            lista = conexao.prepareStatement(sql);
            result = lista.executeQuery();
            
            Object[] row;
            while(result.next()){
                row = new Object[5];
                row[0] = result.getString("Nome");
                row[1] = result.getDate("DataDeNascimento");
                row[2] = result.getString("Email");
                row[3] = result.getInt("Prefixo");
                row[4] = result.getInt("Telefone");
                listaResultado.add(row);
                
            }
        } finally {
            if (result != null && !result.isClosed()) {
                result.close();
            }
            if (lista != null && !lista.isClosed()) {
                lista.close();
            }
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        }
        return listaResultado;
    }
}
