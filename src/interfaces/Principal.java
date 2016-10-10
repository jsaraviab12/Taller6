/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import clases.Helper;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jesus
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNfilas1 = new javax.swing.JTextField();
        txtNcolumnas1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablaInicial = new javax.swing.JTable();
        cmbOperaciones = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdOperacion = new javax.swing.JButton();
        cmdAutomatic = new javax.swing.JButton();
        cmdManual = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtRoute = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos iniciales ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 153, 255))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(51, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setForeground(new java.awt.Color(51, 153, 255));
        jLabel4.setText("Numero de filas:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setText("Numero de columnas: ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        txtNfilas1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNfilas1KeyTyped(evt);
            }
        });
        jPanel3.add(txtNfilas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 30, -1));

        txtNcolumnas1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNcolumnas1KeyTyped(evt);
            }
        });
        jPanel3.add(txtNcolumnas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 30, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 230, 100));

        tblTablaInicial.setBackground(new java.awt.Color(51, 51, 51));
        tblTablaInicial.setForeground(new java.awt.Color(51, 153, 255));
        tblTablaInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblTablaInicial.setCellSelectionEnabled(true);
        jScrollPane2.setViewportView(tblTablaInicial);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 410, 190));

        cmbOperaciones.setBackground(new java.awt.Color(51, 51, 51));
        cmbOperaciones.setForeground(new java.awt.Color(51, 153, 255));
        cmbOperaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Recorrido 1", "Recorrido 2", "Recorrido 3", "Recorrido 4", "Recorrido 5" }));
        jPanel1.add(cmbOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 160, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 255, 255))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setBackground(new java.awt.Color(204, 204, 204));
        cmdCrear.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        cmdCrear.setForeground(new java.awt.Color(0, 153, 204));
        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel2.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, -1));

        cmdLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        cmdLimpiar.setForeground(new java.awt.Color(153, 0, 0));
        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 70, -1));

        cmdOperacion.setBackground(new java.awt.Color(204, 204, 204));
        cmdOperacion.setText("Operacion");
        cmdOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOperacionActionPerformed(evt);
            }
        });
        jPanel2.add(cmdOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 90, -1));

        cmdAutomatic.setBackground(new java.awt.Color(204, 204, 204));
        cmdAutomatic.setText("Automatico");
        cmdAutomatic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAutomaticActionPerformed(evt);
            }
        });
        jPanel2.add(cmdAutomatic, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 90, -1));

        cmdManual.setBackground(new java.awt.Color(204, 204, 204));
        cmdManual.setText("Manual");
        cmdManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdManualActionPerformed(evt);
            }
        });
        jPanel2.add(cmdManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 90, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 150, 230));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Recorrido de matrices");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 153, 255))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtRoute.setBackground(new java.awt.Color(0, 0, 0));
        txtRoute.setForeground(new java.awt.Color(51, 153, 255));
        jPanel4.add(txtRoute, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 660, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 680, 60));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("jButton1");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 530, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/black-minimalistic_00416715 (1).jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, -70, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(968, 597));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNfilas1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNfilas1KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(evt.getKeyChar())) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtNfilas1KeyTyped

    private void txtNcolumnas1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNcolumnas1KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(evt.getKeyChar())) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtNcolumnas1KeyTyped

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        int sw;
        sw = 1;
        if (txtNfilas1.getText().isEmpty()) {
            Helper.mensaje(this, "Por favor digite el numero de Filas", 2);
            txtNfilas1.requestFocusInWindow();
            sw = 0;
        } else if (txtNcolumnas1.getText().isEmpty()) {
            Helper.mensaje(this, "Por favor digite el numero de Columnas", 2);
            txtNcolumnas1.requestFocusInWindow();
            sw = 0;
        }
        if (sw == 1) {

            int nf, nc;
            DefaultTableModel tm;
            nf = Integer.parseInt(txtNfilas1.getText());
            nc = Integer.parseInt(txtNcolumnas1.getText());

            if (nf > 15) {
                Helper.mensaje(this, "Para una correcta vizualizacion el numero de fila no debe ser mayor de 15", 2);
                txtNfilas1.requestFocusInWindow();
            } else if (nc > 15) {
                Helper.mensaje(this, "Para una correcta vizualizacion el numero de columnas no debe ser mayor de 15", 2);
                txtNcolumnas1.requestFocusInWindow();
            } else {
                tm = (DefaultTableModel) tblTablaInicial.getModel();
               

                tm.setRowCount(nf);
                tm.setColumnCount(nc);

                

                JButton botonesH[] = {cmdManual, cmdAutomatic, cmdLimpiar};
                JButton botonesD[] = {cmdCrear, cmdOperacion};

                Helper.habilitarBotones(botonesH);
                Helper.deshabilitarBotones(botonesD);

            }
            txtNcolumnas1.setEditable(false);
            txtNfilas1.setEditable(false);
        }
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        txtNfilas1.setText("");
        txtNcolumnas1.setText("");
        txtNfilas1.requestFocusInWindow();
        cmbOperaciones.setSelectedIndex(0);

        Helper.porDefectoTabla(tblTablaInicial);
        

        JButton botonesH[] = {cmdCrear, cmdLimpiar};
        JButton botonesD[] = {cmdManual, cmdAutomatic, cmdOperacion};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
        txtNcolumnas1.setEditable(true);
        txtNfilas1.setEditable(true);
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOperacionActionPerformed
        int op, nf, nc;
        op = cmbOperaciones.getSelectedIndex();
        

        nf = tblTablaInicial.getRowCount();
        nc = tblTablaInicial.getColumnCount();
        if (nf < 5 || nc < 5) {
            Helper.mensaje(this, "Para poder hacer las operaciones el numero de columnas debes ser superior a 5", 2);
            JButton botonesH[] = {cmdLimpiar};
            JButton botonesD[] = {cmdManual, cmdAutomatic, cmdOperacion, cmdCrear};

            Helper.habilitarBotones(botonesH);
            Helper.deshabilitarBotones(botonesD);

        } else {
            switch (op) {

                case 0://Recorrido1-Route1
                    txtRoute.setText(Helper.R1(tblTablaInicial));
                    break;
            }
        }
        
    }//GEN-LAST:event_cmdOperacionActionPerformed

    private void cmdAutomaticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAutomaticActionPerformed
        int nf, nc, n;
        nf = tblTablaInicial.getRowCount();
        nc = tblTablaInicial.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                n = (int) (Math.random() * 50 + 1);
                tblTablaInicial.setValueAt(n, i, j);
            }

        }
        JButton botonesH[] = {cmdOperacion, cmdLimpiar};
        JButton botonesD[] = {cmdCrear, cmdManual, cmdAutomatic};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdAutomaticActionPerformed

    private void cmdManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdManualActionPerformed
        int nf, nc;
        int n;
        int sw, res;

        nc = tblTablaInicial.getColumnCount();
        nf = tblTablaInicial.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                do {
                    sw = 1;
                    try {
                        n = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite el elmento en la posición [" + i + "]" + "[" + j + "]").trim());
                        tblTablaInicial.setValueAt(n, i, j);
                    } catch (NumberFormatException e) {
                        Helper.mensaje(this, "Digite un número válido", 3);
                        sw = 0;
                    } catch (NullPointerException e) {
                        res = JOptionPane.showConfirmDialog(this, "¿Seguro que desea salir?", "Salir", JOptionPane.YES_NO_OPTION);
                        if (res == 0) {
                            sw = 1;
                            i = nf;
                            j = nc;

                            Helper.porDefectoTabla(tblTablaInicial);
                            
                        } else {
                            sw = 0;
                        }
                    }
                } while (sw == 0);
            }
        }
        JButton botonesH[] = {cmdOperacion, cmdLimpiar};
        JButton botonesD[] = {cmdCrear, cmdManual, cmdAutomatic};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdManualActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbOperaciones;
    private javax.swing.JButton cmdAutomatic;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdManual;
    private javax.swing.JButton cmdOperacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTablaInicial;
    private javax.swing.JTextField txtNcolumnas1;
    private javax.swing.JTextField txtNfilas1;
    private javax.swing.JTextField txtRoute;
    // End of variables declaration//GEN-END:variables
}
