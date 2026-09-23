package projetopessoas;

public class FormPrincipal extends javax.swing.JFrame {

    public FormPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btnPessoaFisica = new javax.swing.JButton();
        btnPessoaJuridica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Pessoas");

        lblTitulo.setText("Selecione o tipo de pessoa:");

        btnPessoaFisica.setText("Pessoa Física");
        btnPessoaFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPessoaFisicaActionPerformed(evt);
            }
        });

        btnPessoaJuridica.setText("Pessoa Jurídica");
        btnPessoaJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPessoaJuridicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo)
                    .addComponent(btnPessoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPessoaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitulo)
                .addGap(20, 20, 20)
                .addComponent(btnPessoaFisica)
                .addGap(12, 12, 12)
                .addComponent(btnPessoaJuridica)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPessoaFisicaActionPerformed
        new FormPessoaFisica().setVisible(true);
    }//GEN-LAST:event_btnPessoaFisicaActionPerformed

    private void btnPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPessoaJuridicaActionPerformed
        new FormPessoaJuridica().setVisible(true);
    }//GEN-LAST:event_btnPessoaJuridicaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPessoaFisica;
    private javax.swing.JButton btnPessoaJuridica;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
