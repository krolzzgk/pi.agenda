/*
 * Senac - SP
 * Projeto: Agenda
 * Desenvolvido por: Ana Paula Gandorin, Karolina Kallajian e Paulo Nunes
 * Fevereiro - 2017
 */
package br.com.senac.servico;

import br.com.senac.db.dao.DaoLista;
import java.util.ArrayList;

/**
 *
 * @author Karol
 */
public class ListaServico {
    public static ArrayList<Object[]> gerarLista() throws Exception {
        try {
            return DaoLista.gerarLista();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception("Falha ao obter lista da agenda.");
        }
    }
}
