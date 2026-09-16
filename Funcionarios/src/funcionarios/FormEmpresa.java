package funcionarios;

public class FormEmpresa extends javax.swing.JFrame {

    public FormEmpresa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btnMensalista = new javax.swing.JButton();
        btnAutonomo = new javax.swing.JButton();
        btnHorista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Empresa - Calculo de Salario");

        lblTitulo.setText("Selecione o tipo de funcionario:");

        btnMensalista.setText("Mensalista");
        btnMensalista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMensalistaActionPerformed(evt);
            }
        });

        btnAutonomo.setText("Autonomo");
        btnAutonomo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutonomoActionPerformed(evt);
            }
        });

        btnHorista.setText("Horista");
        btnHorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoristaActionPerformed(evt);
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
                    .addComponent(btnMensalista, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAutonomo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHorista, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitulo)
                .addGap(20, 20, 20)
                .addComponent(btnMensalista)
                .addGap(12, 12, 12)
                .addComponent(btnAutonomo)
                .addGap(12, 12, 12)
                .addComponent(btnHorista)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMensalistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMensalistaActionPerformed
        new FormMensalista().setVisible(true);
    }//GEN-LAST:event_btnMensalistaActionPerformed

    private void btnAutonomoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutonomoActionPerformed
        new FormAutonomo().setVisible(true);
    }//GEN-LAST:event_btnAutonomoActionPerformed

    private void btnHoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoristaActionPerformed
        new FormHorista().setVisible(true);
    }//GEN-LAST:event_btnHoristaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEmpresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAutonomo;
    private javax.swing.JButton btnHorista;
    private javax.swing.JButton btnMensalista;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
