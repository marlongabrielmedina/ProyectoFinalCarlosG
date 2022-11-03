/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.forms;

import com.mycompany.proyectofinal.ProyectoFinal;

/**
 *
 * @author mmedina
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menu() {
        ProyectoFinal.setWhereami("menu.form");
       // System.out.println("menu.initComponents-Whereami:"+ProyectoFinal.getWhereami());
       // System.out.println("menu.initComponents-Whereibeen:"+ProyectoFinal.getWhereibeen());
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

        addCuentaPlus3 = new java.awt.Label();
        jPanel4 = new javax.swing.JPanel();
        jBtnCancel3 = new javax.swing.JButton();
        retirobtn = new javax.swing.JButton();
        depositobtn = new javax.swing.JButton();
        transferbtn = new javax.swing.JButton();
        reportesbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addCuentaPlusMenu = new java.awt.Label();

        addCuentaPlus3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addCuentaPlus3.setForeground(new java.awt.Color(102, 102, 255));
        addCuentaPlus3.setText("+Crear cuenta");
        addCuentaPlus3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCuentaPlus3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addCuentaPlus3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addCuentaPlus3MouseExited(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(900, 250));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jBtnCancel3.setBackground(new java.awt.Color(255, 102, 102));
        jBtnCancel3.setText("Salir");
        jBtnCancel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancel3ActionPerformed(evt);
            }
        });

        retirobtn.setIcon(new javax.swing.ImageIcon("/Users/mmedina/NetBeansProjects/ProyectoFinalCarlosG/ProyectoFinal/icons8-cajero-automático-48.png")); // NOI18N
        retirobtn.setText("Retiro (-)");
        retirobtn.setMaximumSize(new java.awt.Dimension(168, 70));
        retirobtn.setMinimumSize(new java.awt.Dimension(168, 70));
        retirobtn.setPreferredSize(new java.awt.Dimension(168, 70));
        retirobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retirobtnActionPerformed(evt);
            }
        });

        depositobtn.setIcon(new javax.swing.ImageIcon("/Users/mmedina/NetBeansProjects/ProyectoFinalCarlosG/ProyectoFinal/icons8-depósito-64.png")); // NOI18N
        depositobtn.setText("Deposito (+)");
        depositobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositobtnActionPerformed(evt);
            }
        });

        transferbtn.setIcon(new javax.swing.ImageIcon("/Users/mmedina/NetBeansProjects/ProyectoFinalCarlosG/ProyectoFinal/icons8-transferencia-entre-usuarios-48.png")); // NOI18N
        transferbtn.setText("Transferencias");
        transferbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferbtnActionPerformed(evt);
            }
        });

        reportesbtn.setIcon(new javax.swing.ImageIcon("/Users/mmedina/NetBeansProjects/ProyectoFinalCarlosG/ProyectoFinal/icons8-reporte-de-negocios-64.png")); // NOI18N
        reportesbtn.setText("Reportes");
        reportesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportesbtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("BIENVENIDO");

        jLabel5.setText("NOMBRE NOMBRE APELLIDO APELLIDO");

        addCuentaPlusMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addCuentaPlusMenu.setForeground(new java.awt.Color(102, 102, 255));
        addCuentaPlusMenu.setText("+Crear cuenta");
        addCuentaPlusMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCuentaPlusMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addCuentaPlusMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addCuentaPlusMenuMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel5))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(retirobtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(depositobtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(transferbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reportesbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(addCuentaPlusMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnCancel3)))
                .addGap(9, 9, 9))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reportesbtn)
                    .addComponent(depositobtn))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(retirobtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transferbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnCancel3)
                    .addComponent(addCuentaPlusMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCuentaPlus3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCuentaPlus3MouseClicked
        // TODO add your handling code here:
        // System.out.println("click label");
        createAccounts cadd = new createAccounts();
        cadd.show();
        dispose();
    }//GEN-LAST:event_addCuentaPlus3MouseClicked

    private void addCuentaPlus3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCuentaPlus3MouseEntered
        // TODO add your handling code here:
        System.out.println("Mouse entered");
        String xett = "<html><u>+Crear cuenta</u></html>";
        addCuentaPlus3.setText(xett);
    }//GEN-LAST:event_addCuentaPlus3MouseEntered

    private void addCuentaPlus3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCuentaPlus3MouseExited
        // TODO add your handling code here:
        System.out.println("Mouse exited");
        String xett = "<html>+Crear cuenta</html>";
        addCuentaPlus3.setText(xett);
    }//GEN-LAST:event_addCuentaPlus3MouseExited

    private void transferbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferbtnActionPerformed
        // TODO add your handling code here:
        movimientos("transfer");
    }//GEN-LAST:event_transferbtnActionPerformed

    private void depositobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositobtnActionPerformed
        // TODO add your handling code here:
        movimientos("deposito");
    }//GEN-LAST:event_depositobtnActionPerformed

    private void jBtnCancel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancel3ActionPerformed
        // TODO add your handling code here:
        System.out.println("click label");
        main mn = new main();
        mn.show();
        dispose();
    }//GEN-LAST:event_jBtnCancel3ActionPerformed

    private void addCuentaPlusMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCuentaPlusMenuMouseClicked
        // TODO add your handling code here:
        System.out.println("click label");
        createAccounts cadd = new createAccounts();
        cadd.show();
        dispose();
    }//GEN-LAST:event_addCuentaPlusMenuMouseClicked

    private void addCuentaPlusMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCuentaPlusMenuMouseEntered
        // TODO add your handling code here:
        System.out.println("Mouse entered");
        String xett = "<html><u>+Crear cuenta</u></html>";
        addCuentaPlusMenu.setText(xett);
    }//GEN-LAST:event_addCuentaPlusMenuMouseEntered

    private void addCuentaPlusMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCuentaPlusMenuMouseExited
        // TODO add your handling code here:
        System.out.println("Mouse exited");
        String xett = "<html>+Crear cuenta</html>";
        addCuentaPlusMenu.setText(xett);
    }//GEN-LAST:event_addCuentaPlusMenuMouseExited

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        ProyectoFinal.setWhereibeen("menu.form");
        // System.out.println("menu.WindowClosed-Whereami:"+ProyectoFinal.getWhereami());
        // System.out.println("menu.WindowClosed-Whereibeen:"+ProyectoFinal.getWhereibeen());
    }//GEN-LAST:event_formWindowClosed

    private void reportesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportesbtnActionPerformed
        // TODO add your handling code here:
        movimientos("reporte");
    }//GEN-LAST:event_reportesbtnActionPerformed

    private void retirobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retirobtnActionPerformed
        // TODO add your handling code here:
        movimientos("retiro");
    }//GEN-LAST:event_retirobtnActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }
    
    private void movimientos(String opcion) {
        System.out.println("movimientos()-presionadoX:"+opcion);
        ProyectoFinal.setOpcpressed(opcion);
        movimientos movs = new movimientos();
        movs.show();
        dispose();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label addCuentaPlus3;
    private java.awt.Label addCuentaPlusMenu;
    private javax.swing.JButton depositobtn;
    private javax.swing.JButton jBtnCancel3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton reportesbtn;
    private javax.swing.JButton retirobtn;
    private javax.swing.JButton transferbtn;
    // End of variables declaration//GEN-END:variables
}