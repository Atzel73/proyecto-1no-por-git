/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Propietario
 */
public class edicion extends javax.swing.JFrame {

    /**
     * Creates new form edicion
     */
    public edicion() {
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

        texto55 = new javax.swing.JTextField();
        BotonFin2 = new javax.swing.JButton();
        eti33 = new javax.swing.JLabel();
        eti44 = new javax.swing.JLabel();
        texto11 = new javax.swing.JTextField();
        texto22 = new javax.swing.JTextField();
        texto33 = new javax.swing.JTextField();
        texto44 = new javax.swing.JTextField();
        BotonBor2 = new javax.swing.JButton();
        eti77 = new javax.swing.JLabel();
        checuno = new javax.swing.JCheckBox();
        eti11 = new javax.swing.JLabel();
        eti22 = new javax.swing.JLabel();
        eti66 = new javax.swing.JLabel();
        boxuno = new javax.swing.JComboBox<>();
        BotonEn2 = new javax.swing.JButton();
        chechdos = new javax.swing.JCheckBox();
        eti55 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonFin2.setText("Terminar");
        BotonFin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFin2ActionPerformed(evt);
            }
        });

        eti33.setText("Correo electronico");

        eti44.setText("Numero de telefono");

        texto11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto11ActionPerformed(evt);
            }
        });

        texto44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto44ActionPerformed(evt);
            }
        });

        BotonBor2.setText("Eliminar registros");
        BotonBor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBor2ActionPerformed(evt);
            }
        });

        eti77.setText("¿Tienes experiencia con los instrumentos?");

        checuno.setText("Sí");
        checuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checunoActionPerformed(evt);
            }
        });

        eti11.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        eti11.setText("Nombre");

        eti22.setText("Apellidos");

        eti66.setText("Tipo de instrumento");

        boxuno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Viento", "Cuerda", "Percusion", "Electrofono", "Idiofono" }));
        boxuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxunoActionPerformed(evt);
            }
        });

        BotonEn2.setText("Enviar");
        BotonEn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEn2ActionPerformed(evt);
            }
        });

        chechdos.setText("No");
        chechdos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chechdosActionPerformed(evt);
            }
        });

        eti55.setText("Dirección de casa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(BotonEn2)
                        .addGap(18, 18, 18)
                        .addComponent(BotonFin2)
                        .addGap(26, 26, 26)
                        .addComponent(BotonBor2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eti22, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eti11, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(texto22, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(texto11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eti44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(texto44, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eti33)
                                .addGap(18, 18, 18)
                                .addComponent(texto33, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(eti55)
                                .addGap(18, 18, 18)
                                .addComponent(texto55, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(boxuno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(checuno))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(eti66)
                                    .addGap(18, 18, 18)
                                    .addComponent(eti77)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(280, 280, 280)
                                .addComponent(chechdos)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eti11)
                            .addComponent(texto11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eti33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(texto33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eti55)
                            .addComponent(texto55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eti22)
                    .addComponent(eti44)
                    .addComponent(texto22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eti66)
                    .addComponent(eti77))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxuno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checuno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chechdos)
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonEn2)
                    .addComponent(BotonFin2)
                    .addComponent(BotonBor2))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonFin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFin2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BotonFin2ActionPerformed

    private void texto11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto11ActionPerformed

    private void texto44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto44ActionPerformed

    private void BotonBor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBor2ActionPerformed
        texto11.setText("");
        texto22.setText("");
        texto33.setText("");
        texto44.setText("");
    }//GEN-LAST:event_BotonBor2ActionPerformed

    private void checunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checunoActionPerformed

    private void boxunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxunoActionPerformed

    private void BotonEn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEn2ActionPerformed
        javax.swing.JOptionPane.showMessageDialog(null, "Los datos han sido editados y gurdados correctamente!");
        texto11.setText("");
        texto22.setText("");
        texto33.setText("");
        texto44.setText("");
    }//GEN-LAST:event_BotonEn2ActionPerformed

    private void chechdosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chechdosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chechdosActionPerformed

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
            java.util.logging.Logger.getLogger(edicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(edicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(edicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(edicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new edicion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBor2;
    private javax.swing.JButton BotonEn2;
    private javax.swing.JButton BotonFin2;
    private javax.swing.JComboBox<String> boxuno;
    private javax.swing.JCheckBox chechdos;
    private javax.swing.JCheckBox checuno;
    private javax.swing.JLabel eti11;
    private javax.swing.JLabel eti22;
    private javax.swing.JLabel eti33;
    private javax.swing.JLabel eti44;
    private javax.swing.JLabel eti55;
    private javax.swing.JLabel eti66;
    private javax.swing.JLabel eti77;
    private javax.swing.JTextField texto11;
    private javax.swing.JTextField texto22;
    private javax.swing.JTextField texto33;
    private javax.swing.JTextField texto44;
    private javax.swing.JTextField texto55;
    // End of variables declaration//GEN-END:variables
}