/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Cuenta;
import javax.swing.JOptionPane;


/**
 *
 * @author USER
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    Cuenta c;

    public Principal() {
        initComponents();
        cmdActualizar.setEnabled(false);
        cmdIngresar.setEnabled(false);
        cmdRetirar.setEnabled(false);
        cmdMostrar.setEnabled(false);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNoIdentificacion = new javax.swing.JTextField();
        txtNoCuenta = new javax.swing.JTextField();
        txtInteresAnual = new javax.swing.JTextField();
        txtSaldoInicial = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cmdBorrar = new javax.swing.JButton();
        cmdMostrar = new javax.swing.JButton();
        cmdRetirar = new javax.swing.JButton();
        cmdIngresar = new javax.swing.JButton();
        cmdCrear = new javax.swing.JButton();
        cmdActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultadoConsulta = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Iniciales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel1.setText("No. Cuenta :");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel2.setText("No. Identificacion :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel3.setText("Saldo Inicial :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel4.setText("Interes Anual :");

        txtNoIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoIdentificacionActionPerformed(evt);
            }
        });
        txtNoIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoIdentificacionKeyTyped(evt);
            }
        });

        txtNoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoCuentaActionPerformed(evt);
            }
        });
        txtNoCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoCuentaKeyTyped(evt);
            }
        });

        txtInteresAnual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInteresAnualKeyTyped(evt);
            }
        });

        txtSaldoInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSaldoInicialKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtNoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtNoIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtSaldoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtInteresAnual, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNoIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSaldoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtInteresAnual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 250, 260));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("CAJERO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });

        cmdMostrar.setText("Mostrar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });

        cmdRetirar.setText("Retirar");
        cmdRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRetirarActionPerformed(evt);
            }
        });

        cmdIngresar.setText("Ingresar");
        cmdIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdIngresarActionPerformed(evt);
            }
        });

        cmdCrear.setText("Crear Cuenta");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });

        cmdActualizar.setText("Actualizar Saldo");
        cmdActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cmdCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cmdIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cmdMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 240, 130));

        txtResultadoConsulta.setEditable(false);
        txtResultadoConsulta.setColumns(20);
        txtResultadoConsulta.setRows(5);
        jScrollPane1.setViewportView(txtResultadoConsulta);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 270, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("RESULTADO CONSULTA");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed
        Cuenta cue_nta;
        int num_cuenta, num_ident;
        double saldo;
        num_cuenta = Integer.parseInt(txtNoCuenta.getText());
        num_ident = Integer.parseInt(txtNoIdentificacion.getText());
        saldo = Double.parseDouble(txtSaldoInicial.getText());
        cue_nta = new Cuenta(num_cuenta, num_ident, saldo);
        txtResultadoConsulta.setText(cue_nta.mostrar());

        // TODO add your handling code here:
    }//GEN-LAST:event_cmdMostrarActionPerformed

    private void cmdActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdActualizarActionPerformed
        int saldoi = Integer.parseInt(txtSaldoInicial.getText());
        int interes = Integer.parseInt(txtInteresAnual.getText());
        int resta = saldoi - (interes / 365);
        txtSaldoInicial.setText("" + resta);
        JOptionPane.showMessageDialog(this, "Saldo actualizado (interes de " + interes + ")");
    }//GEN-LAST:event_cmdActualizarActionPerformed

    private void cmdRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRetirarActionPerformed
        Cuenta cue_nta;
        int cuenta, identificacion;
        double retirar, saldo;
        cuenta=Integer.parseInt(txtNoCuenta.getText());
        identificacion = Integer.parseInt(txtNoIdentificacion.getText());
        saldo=Double.parseDouble(txtSaldoInicial.getText());
        cue_nta=new Cuenta(cuenta, identificacion, saldo);
        retirar = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese La Cantidad De Dinero Que Desea Retirar"));
        if (retirar > saldo) {
            JOptionPane.showMessageDialog(this, "Su Saldo es insuficiente",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            cue_nta.retirar(retirar);
            txtResultadoConsulta.setText(cue_nta.mostrar());
        }
    }//GEN-LAST:event_cmdRetirarActionPerformed

    private void cmdIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdIngresarActionPerformed
        Cuenta cue_nta;
        int num_cuenta,num_identificacion;
        double ingresos,saldo,saldonuevo;
        
        num_cuenta = Integer.parseInt(txtNoCuenta.getText());
        num_identificacion = Integer.parseInt(txtNoIdentificacion.getText());
        saldo = Double.parseDouble(txtSaldoInicial.getText());
        cue_nta = new Cuenta(num_cuenta, num_identificacion, saldo);
        ingresos = Double.parseDouble(JOptionPane.showInputDialog(this, "Dijite El Dinero a ingresar en la Cuenta"));
        cue_nta.ingresar(ingresos);    
        txtResultadoConsulta.setText(cue_nta.mostrar());
    }//GEN-LAST:event_cmdIngresarActionPerformed

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        if (txtNoCuenta.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite El Número De Cuenta", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtNoCuenta.requestFocusInWindow();
        } else if (txtNoIdentificacion.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese El Numero De Identificacion Del Cliente",
                    "Error", JOptionPane.ERROR_MESSAGE);
            txtNoIdentificacion.requestFocusInWindow();
        } else if (Integer.parseInt(txtNoIdentificacion.getText().trim())== 0) {
            JOptionPane.showMessageDialog(this, "El Numero de Identificacion No Puede Ser Cero", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtNoIdentificacion.requestFocusInWindow();
            txtNoIdentificacion.selectAll();
        } else if (txtSaldoInicial.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite El Saldo Actual Su La cuenta",
                    "Error", JOptionPane.ERROR_MESSAGE);
            txtSaldoInicial.requestFocusInWindow();
        } else if (txtInteresAnual.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite Interes Anual Que Le Asignará A La Cuenta ",
                    "Error", JOptionPane.ERROR_MESSAGE);
            txtInteresAnual.requestFocusInWindow();
        } else {
            cmdActualizar.setEnabled(true);
            cmdIngresar.setEnabled(true);
            cmdRetirar.setEnabled(true);
            cmdMostrar.setEnabled(true);
            txtSaldoInicial.setEditable(false);
            txtNoCuenta.setEditable(false);
            txtNoIdentificacion.setEditable(false);
        }
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
        cmdActualizar.setEnabled(false);
        cmdIngresar.setEnabled(false);
        cmdRetirar.setEnabled(false);
        txtSaldoInicial.setEditable(true);
        txtNoCuenta.setEditable(true);
        txtNoIdentificacion.setEditable(true);
        txtInteresAnual.setEditable(true);
        txtResultadoConsulta.setText("");
        txtNoCuenta.setText("");
        txtNoCuenta.requestFocusInWindow();
        txtNoIdentificacion.setText("");
        txtSaldoInicial.setText("");
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void txtNoIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoIdentificacionActionPerformed

    private void txtNoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoCuentaActionPerformed
       
    }//GEN-LAST:event_txtNoCuentaActionPerformed

    private void txtNoCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoCuentaKeyTyped
        char cue_nta = evt.getKeyChar();

        if (!Character.isDigit(evt.getKeyChar())) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtNoCuentaKeyTyped

    private void txtInteresAnualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInteresAnualKeyTyped
        char cue_nta = evt.getKeyChar();
        if ((!Character.isDigit(cue_nta)) && (evt.getKeyChar() != '.')) {
            getToolkit().beep();
            evt.consume();
        }
        if (evt.getKeyChar() == '.' && txtSaldoInicial.getText().contains(".")) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtInteresAnualKeyTyped

    private void txtNoIdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoIdentificacionKeyTyped
        char cue_nta = evt.getKeyChar();
        if (!Character.isDigit(evt.getKeyChar())) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNoIdentificacionKeyTyped

    private void txtSaldoInicialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaldoInicialKeyTyped
         char cue_nta = evt.getKeyChar();
        if (!Character.isDigit(evt.getKeyChar())) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtSaldoInicialKeyTyped

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
    private javax.swing.JButton cmdActualizar;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdIngresar;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JButton cmdRetirar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtInteresAnual;
    private javax.swing.JTextField txtNoCuenta;
    private javax.swing.JTextField txtNoIdentificacion;
    private javax.swing.JTextArea txtResultadoConsulta;
    private javax.swing.JTextField txtSaldoInicial;
    // End of variables declaration//GEN-END:variables
}
