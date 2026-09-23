package projetoveiculos;

public class FormPrincipal extends javax.swing.JFrame {

    public FormPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btnOnibus = new javax.swing.JButton();
        btnCaminhao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Veículos");

        lblTitulo.setText("Selecione o tipo de veículo:");

        btnOnibus.setText("Ônibus");
        btnOnibus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOnibusActionPerformed(evt);
            }
        });

        btnCaminhao.setText("Caminhão");
        btnCaminhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaminhaoActionPerformed(evt);
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
                    .addComponent(btnOnibus, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCaminhao, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitulo)
                .addGap(20, 20, 20)
                .addComponent(btnOnibus)
                .addGap(12, 12, 12)
                .addComponent(btnCaminhao)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOnibusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOnibusActionPerformed
        new FormOnibus().setVisible(true);
    }//GEN-LAST:event_btnOnibusActionPerformed

    private void btnCaminhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaminhaoActionPerformed
        new FormCaminhao().setVisible(true);
    }//GEN-LAST:event_btnCaminhaoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCaminhao;
    private javax.swing.JButton btnOnibus;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
