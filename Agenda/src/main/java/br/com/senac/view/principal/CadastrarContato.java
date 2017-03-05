/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.view.principal;

/**
 *
 * @author AnaPaula
 */
public class CadastrarContato extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastrarContato
     */
    public CadastrarContato() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dadosContato = new javax.swing.JPanel();
        campoNome = new javax.swing.JTextField();
        campoDataNasc = new javax.swing.JFormattedTextField();
        prefixoTelefone = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();
        nome = new javax.swing.JLabel();
        dataNasc = new javax.swing.JLabel();
        telefone = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        salvar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        numeroTelefone = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Contatos");

        dadosContato.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Contato"));

        nome.setText("Nome");

        dataNasc.setText("Data de Nasc");

        telefone.setText("Telefone");

        email.setText("E-mail");

        salvar.setText("Salvar");

        cancelar.setText("Cancelar");

        javax.swing.GroupLayout dadosContatoLayout = new javax.swing.GroupLayout(dadosContato);
        dadosContato.setLayout(dadosContatoLayout);
        dadosContatoLayout.setHorizontalGroup(
            dadosContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosContatoLayout.createSequentialGroup()
                .addGroup(dadosContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome)
                    .addComponent(dataNasc)
                    .addComponent(telefone)
                    .addComponent(email))
                .addGroup(dadosContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosContatoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salvar)
                        .addGap(18, 18, 18)
                        .addComponent(cancelar)
                        .addGap(26, 26, 26))
                    .addGroup(dadosContatoLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(dadosContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(dadosContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(dadosContatoLayout.createSequentialGroup()
                                    .addComponent(prefixoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(numeroTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 14, Short.MAX_VALUE))))
        );
        dadosContatoLayout.setVerticalGroup(
            dadosContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosContatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome))
                .addGap(18, 18, 18)
                .addGroup(dadosContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataNasc))
                .addGap(18, 18, 18)
                .addGroup(dadosContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prefixoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefone)
                    .addComponent(numeroTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dadosContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(dadosContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar)
                    .addComponent(cancelar))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dadosContato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dadosContato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(250, 10, 400, 316);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField campoDataNasc;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoNome;
    private javax.swing.JButton cancelar;
    private javax.swing.JPanel dadosContato;
    private javax.swing.JLabel dataNasc;
    private javax.swing.JLabel email;
    private javax.swing.JLabel nome;
    private javax.swing.JTextField numeroTelefone;
    private javax.swing.JTextField prefixoTelefone;
    private javax.swing.JButton salvar;
    private javax.swing.JLabel telefone;
    // End of variables declaration//GEN-END:variables
}