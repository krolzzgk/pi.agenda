/*
 * Senac - SP
 * Projeto: Agenda
 * Desenvolvido por: Ana Paula Gandorin, Karolina Kallajian e Paulo Nunes
 * Fevereiro - 2017
 */
package br.com.senac.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karol e Paulo
 */
public class Cadastro {

    private String nome;
    private String DataNascimento;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private String email;
    private int prefixo;
    private int telefone;
    private String DataCadastro;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return this.DataNascimento;
    }

    public Date getDataNascimento() {
        if (this.DataNascimento != null) {
            try {
                return new SimpleDateFormat("yyyy-MM-dd").parse(this.DataNascimento);
            } catch (ParseException ex) {
                Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    public void setDataNascimento(Date DataNascimento) {
        this.DataNascimento = DataNascimento.toString();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(int prefixo) {
        this.prefixo = prefixo;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    private Date getDataCadastro() {
        try {
            return dateFormat.parse(this.DataCadastro);
        } catch (ParseException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public java.sql.Date getDataCadastroSQL() {
        return new java.sql.Date(this.getDataCadastro().getTime());
    }

    public java.sql.Date getDataNascimentoSQL() {
        if (this.getDataNascimento() != null) {
            return new java.sql.Date(this.getDataNascimento().getTime());
        }
        return null;
    }

        public Cadastro(
                String nome, 
                String DataNascimento, 
                String email, 
                int prefixo, 
                int telefone){        
        this.nome = nome;
        this.DataNascimento = DataNascimento;
        this.email = email;
        this.prefixo = prefixo;
        this.telefone = telefone;
        this.DataCadastro = dateFormat.format(GregorianCalendar.getInstance().getTime());
        }
    
}
