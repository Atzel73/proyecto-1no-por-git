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

        texto5 = new javax.swing.JTextField();
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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        texto5.setBackground(new java.awt.Color(255, 255, 204));

        BotonFin2.setBackground(new java.awt.Color(0, 153, 255));
        BotonFin2.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        BotonFin2.setForeground(new java.awt.Color(102, 0, 0));
        BotonFin2.setText("Terminar");
        BotonFin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFin2ActionPerformed(evt);
            }
        });

        eti33.setFont(new java.awt.Font("Tw Cen MT", 0, 11)); // NOI18N
        eti33.setForeground(new java.awt.Color(0, 102, 204));
        eti33.setText("Correo electronico");

        eti44.setFont(new java.awt.Font("Tw Cen MT", 0, 11)); // NOI18N
        eti44.setForeground(new java.awt.Color(0, 102, 204));
        eti44.setText("Numero de telefono");

        texto11.setBackground(new java.awt.Color(255, 255, 204));
        texto11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto11ActionPerformed(evt);
            }
        });

        texto22.setBackground(new java.awt.Color(255, 255, 204));
        texto22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto22ActionPerformed(evt);
            }
        });

        texto33.setBackground(new java.awt.Color(255, 255, 204));
        texto33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto33ActionPerformed(evt);
            }
        });

        texto44.setBackground(new java.awt.Color(255, 255, 204));
        texto44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto44ActionPerformed(evt);
            }
        });

        BotonBor2.setBackground(new java.awt.Color(0, 153, 204));
        BotonBor2.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        BotonBor2.setForeground(new java.awt.Color(102, 0, 0));
        BotonBor2.setText("Eliminar registros");
        BotonBor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBor2ActionPerformed(evt);
            }
        });

        eti77.setFont(new java.awt.Font("Tw Cen MT", 0, 11)); // NOI18N
        eti77.setForeground(new java.awt.Color(0, 102, 204));
        eti77.setText("¿Tienes experiencia con los instrumentos?");

        checuno.setText("Sí");
        checuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checunoActionPerformed(evt);
            }
        });

        eti11.setFont(new java.awt.Font("Tw Cen MT", 0, 11)); // NOI18N
        eti11.setForeground(new java.awt.Color(0, 102, 204));
        eti11.setText("Nombre");

        eti22.setFont(new java.awt.Font("Tw Cen MT", 0, 11)); // NOI18N
        eti22.setForeground(new java.awt.Color(0, 102, 204));
        eti22.setText("Apellidos");

        eti66.setForeground(new java.awt.Color(0, 102, 204));
        eti66.setText("Tipo de instrumento");

        boxuno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Viento", "Cuerda", "Percusion", "Electrofono", "Idiofono" }));
        boxuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxunoActionPerformed(evt);
            }
        });

        BotonEn2.setBackground(new java.awt.Color(0, 204, 204));
        BotonEn2.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        BotonEn2.setForeground(new java.awt.Color(102, 0, 0));
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

        eti55.setFont(new java.awt.Font("Tw Cen MT", 0, 11)); // NOI18N
        eti55.setForeground(new java.awt.Color(0, 102, 204));
        eti55.setText("Dirección de casa");

        jLabel1.setIcon(new javax.swing.ImageIcon("e:\\Users\\Propietario\\Downloads\\AAAA.jfif")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eti11, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eti22, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(texto11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texto22, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(eti33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(texto33, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(eti44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texto44, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(eti55, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texto5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chechdos)
                            .addComponent(checuno, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonFin2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotonBor2))
                            .addComponent(jLabel1))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eti66, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(boxuno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(eti77)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonEn2)
                .addGap(281, 281, 281))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eti11)
                    .addComponent(texto11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eti22)
                    .addComponent(texto22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eti33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(texto33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eti44)
                    .addComponent(texto44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eti55)
                    .addComponent(texto5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eti77)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checuno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chechdos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(eti66)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxuno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonBor2)
                            .addComponent(BotonFin2))
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(BotonEn2)
                        .addGap(66, 66, 66))))
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
        texto5.setText("");
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
        texto5.setText("");
    }//GEN-LAST:event_BotonEn2ActionPerformed

    private void chechdosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chechdosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chechdosActionPerformed

    private void texto22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto22ActionPerformed

    private void texto33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto33ActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField texto11;
    private javax.swing.JTextField texto22;
    private javax.swing.JTextField texto33;
    private javax.swing.JTextField texto44;
    private javax.swing.JTextField texto5;
    // End of variables declaration//GEN-END:variables
}
