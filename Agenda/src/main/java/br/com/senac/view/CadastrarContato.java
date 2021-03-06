/*
 * Senac - SP
 * Projeto: Agenda
 * Desenvolvido por: Ana Paula Gandorin, Karolina Kallajian e Paulo Nunes
 * Março - 2017
 */
package br.com.senac.view;

import br.com.senac.db.dao.DaoAgenda;
import br.com.senac.model.Cadastro;
import br.com.senac.servico.CadastroException;
import br.com.senac.servico.CadastroServico;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

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

        dadosContato.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Contato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        try {
            campoDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        nome.setText("Nome");

        dataNasc.setText("Data de Nasc");

        telefone.setText("Telefone");

        email.setText("E-mail");

        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

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
                .addGap(40, 40, 40)
                .addGroup(dadosContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dadosContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(dadosContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(campoDataNasc, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dadosContatoLayout.createSequentialGroup()
                                .addComponent(prefixoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numeroTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(dadosContatoLayout.createSequentialGroup()
                        .addComponent(salvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelar)))
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(dadosContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar)
                    .addComponent(salvar)))
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


    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        try {
            CadastroServico.validarNome(campoNome.getText());
            CadastroServico.validarDataNascimento(campoDataNasc.getText());
            CadastroServico.validarEmail(campoEmail.getText());
            int prefixo = CadastroServico.validarPrefixo(prefixoTelefone.getText());
            int tel = CadastroServico.validarTelefone(numeroTelefone.getText());

            Date dtFormat = new SimpleDateFormat("dd/mm/yyyy").parse((String) campoDataNasc.getText());
            String dtNasc = new SimpleDateFormat("yyyy-MM-dd").format(dtFormat);

            Cadastro cadastro = new Cadastro(campoNome.getText(), dtNasc, campoEmail.getText(), prefixo, tel);

            DaoAgenda.cadastrar(cadastro);

            limparCampos();
            JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!", "Mensagem", JOptionPane.DEFAULT_OPTION);

        } catch (CadastroException cx) {
            JOptionPane.showMessageDialog(null, cx.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
        } catch (ParseException px) {
            JOptionPane.showMessageDialog(null, "Falha na Data de Nascimento.", "Atenção", JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao cadastrar.", "Atenção", JOptionPane.WARNING_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_salvarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        int resposta;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja cancelar?", "Deseja cancelar?", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            limparCampos();
            this.dispose();
        }
        if (resposta == JOptionPane.NO_OPTION) {
            remove(resposta);
        }

    }//GEN-LAST:event_cancelarActionPerformed

    private void limparCampos() {
        campoNome.setText(null);
        prefixoTelefone.setText(null);
        numeroTelefone.setText(null);
        campoEmail.setText(null);
        campoDataNasc.setText(null);
        campoDataNasc.setValue(null);
    }
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
