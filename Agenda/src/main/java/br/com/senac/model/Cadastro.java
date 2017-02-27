/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.model;

/**
 *
 * @author Karol
 */
public class Cadastro {
    
    private String nome;
    private String dataDeNascimento;
    private String email;
    private int prefixo;
    private int telefone;
    
    public Cadastro(String nome, String dataDeNascimento, String email, int prefixo, int telefone) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.email = email;
        this.prefixo = prefixo;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
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

    
}
