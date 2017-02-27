/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.views;

/**
 *
 * @author Nuneez
 */
public class Agenda extends javax.swing.JFrame {

    /**
     * Creates new form Agenda
     */
    public Agenda() {
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

        Botao_Salvar = new javax.swing.JButton();
        Botao_Cancelar = new javax.swing.JButton();
        Label_Nome = new javax.swing.JLabel();
        Label_DataNasc = new javax.swing.JLabel();
        Label_Email = new javax.swing.JLabel();
        Label_Telefone = new javax.swing.JLabel();
        Campo_Nome = new javax.swing.JTextField();
        Campo_DataNasc = new javax.swing.JTextField();
        Campo_Email = new javax.swing.JTextField();
        Campo_Telefone = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Botao_Salvar.setText("Salvar");

        Botao_Cancelar.setText("Cancelar");
        Botao_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_CancelarActionPerformed(evt);
            }
        });

        Label_Nome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Label_Nome.setText("Nome");

        Label_DataNasc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Label_DataNasc.setText("Data de Nascimento");

        Label_Email.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Label_Email.setText("E-mail");

        Label_Telefone.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Label_Telefone.setText("Telefone");

        Campo_DataNasc.setForeground(new java.awt.Color(153, 153, 153));
        Campo_DataNasc.setText("  /  /");

        Campo_Telefone.setForeground(new java.awt.Color(153, 153, 153));
        Campo_Telefone.setText("(  )     -");
        Campo_Telefone.setCaretPosition(1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label_Nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Campo_Nome))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label_DataNasc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Campo_DataNasc))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 141, Short.MAX_VALUE)
                        .addComponent(Botao_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Botao_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label_Email)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Campo_Email))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label_Telefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Campo_Telefone)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Nome)
                    .addComponent(Campo_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_DataNasc)
                    .addComponent(Campo_DataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Email)
                    .addComponent(Campo_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Telefone)
                    .addComponent(Campo_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botao_Salvar)
                    .addComponent(Botao_Cancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Botao_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_CancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao_CancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_Cancelar;
    private javax.swing.JButton Botao_Salvar;
    private javax.swing.JTextField Campo_DataNasc;
    private javax.swing.JTextField Campo_Email;
    private javax.swing.JTextField Campo_Nome;
    private javax.swing.JTextField Campo_Telefone;
    private javax.swing.JLabel Label_DataNasc;
    private javax.swing.JLabel Label_Email;
    private javax.swing.JLabel Label_Nome;
    private javax.swing.JLabel Label_Telefone;
    // End of variables declaration//GEN-END:variables
}
