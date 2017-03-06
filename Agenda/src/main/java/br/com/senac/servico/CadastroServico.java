/*
 * Senac - SP
 * Projeto: Agenda
 * Desenvolvido por: Ana Paula Gandorin, Karolina Kallajian e Paulo Nunes
 * Março - 2017
 */
package br.com.senac.servico;

import br.com.senac.model.Cadastro;

/**
 *
 * @author Karol
 */
public class CadastroServico {

    public static void validarCadastro(Cadastro c) throws CadastroException {
        if (c == null) {
            throw new CadastroException("Cadastro inválido.");
        }
    }

    public static void validarNome(String nome) throws CadastroException {
        if (nome == null || nome.trim().equals("")) {
            throw new CadastroException("Nome não pode ser vazio.");
        }
    }

    public static void validarEmail(String email) throws CadastroException {
        if (email == null || email.trim().equals("")) {
            throw new CadastroException("E-mail não pode ser vazio.");
        }
        if (!email.contains("@")) {
            throw new CadastroException("E-mail inválido.");
        }
    }

    public static void validarDataNascimento(String dataNasc) throws CadastroException {
        if (dataNasc.trim().equals("//") || dataNasc.length() < 10) {
            throw new CadastroException("Data de nascimento inválida");
        }
    }

    public static int validarPrefixo(String pref) throws CadastroException {
        try {
            if (pref == null || pref.equals("")) {
                throw new CadastroException("Prefixo não pode ser vazio.");
            }
            if (pref.length() != 2) {
                throw new CadastroException("Prefixo inválido");
            }
            int prefixo = Integer.parseInt(pref);
            return prefixo;
        } catch (CadastroException e) {
            throw new CadastroException("Prefixo inválido.");
        }
    }

    public static int validarTelefone(String tel) throws CadastroException {
        try {
            if (tel == null || tel.equals("")) {
                throw new CadastroException("Telefone não pode ser vazio.");
            }
            if (tel.length() < 6 || tel.length() > 9) {
                throw new CadastroException("Telefone inválido");
            }
            int telefone = Integer.parseInt(tel);
            return telefone;
        } catch (CadastroException e) {
            throw new CadastroException("Telefone inválido.");
        }
    }
}
