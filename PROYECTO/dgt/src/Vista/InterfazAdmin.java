/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.dgt;
import javax.swing.JOptionPane;

/**
 *
 * @author Naia
 */
public class InterfazAdmin extends javax.swing.JFrame {

    /**
     * Creates new form InterfazAdmin
     */
    public InterfazAdmin() {
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

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mMultas = new javax.swing.JMenu();
        mAñadirTipoMulta = new javax.swing.JMenuItem();
        mAsignarMulta = new javax.swing.JMenuItem();
        mBajaMulta = new javax.swing.JMenuItem();
        mMultas1 = new javax.swing.JMenu();
        mDesguazar = new javax.swing.JMenuItem();
        mEstadistica = new javax.swing.JMenu();
        mMultasImpuestas = new javax.swing.JMenuItem();
        mMultasVehiculo = new javax.swing.JMenuItem();
        bSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/logodgt.png"))); // NOI18N

        mMultas.setText("Multas");

        mAñadirTipoMulta.setText("Añadir tipo multa");
        mAñadirTipoMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAñadirTipoMultaActionPerformed(evt);
            }
        });
        mMultas.add(mAñadirTipoMulta);

        mAsignarMulta.setText("Asignar multa a vehiculo");
        mAsignarMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAsignarMultaActionPerformed(evt);
            }
        });
        mMultas.add(mAsignarMulta);

        mBajaMulta.setText("Quitar multa");
        mBajaMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBajaMultaActionPerformed(evt);
            }
        });
        mMultas.add(mBajaMulta);

        jMenuBar1.add(mMultas);

        mMultas1.setText("Vehiculo");

        mDesguazar.setText("Desguazar vehiculo");
        mDesguazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDesguazarActionPerformed(evt);
            }
        });
        mMultas1.add(mDesguazar);

        jMenuBar1.add(mMultas1);

        mEstadistica.setText("Estadisticas");

        mMultasImpuestas.setText("Multas impuestas");
        mMultasImpuestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mMultasImpuestasActionPerformed(evt);
            }
        });
        mEstadistica.add(mMultasImpuestas);

        mMultasVehiculo.setText("Multas vehículo");
        mEstadistica.add(mMultasVehiculo);

        jMenuBar1.add(mEstadistica);

        bSalir.setText("Salir");
        bSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bSalirMouseClicked(evt);
            }
        });
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(bSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(106, 106, 106))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mAñadirTipoMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAñadirTipoMultaActionPerformed
        // TODO add your handling code here:
        dgt.abrirVentanaTipoMultas();
        
    }//GEN-LAST:event_mAñadirTipoMultaActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_bSalirActionPerformed

    private void mBajaMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBajaMultaActionPerformed
        // TODO add your handling code here:
        dgt.abrirBajaMulta();
        
        
    }//GEN-LAST:event_mBajaMultaActionPerformed

    private void mDesguazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mDesguazarActionPerformed
        // TODO add your handling code here:
        try {
            String matricula = JOptionPane.showInputDialog("Introduce la matrícula del vehículo a desguazar");
            dgt.bajavehiculo(matricula);
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_mDesguazarActionPerformed

    private void bSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSalirMouseClicked
        // TODO add your handling code here:
        dgt.salirAPaginaIncioIA();
    }//GEN-LAST:event_bSalirMouseClicked

    private void mAsignarMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAsignarMultaActionPerformed
        // TODO add your handling code here:
        dgt.abrirVentanaMultas();
    }//GEN-LAST:event_mAsignarMultaActionPerformed

    private void mMultasImpuestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mMultasImpuestasActionPerformed
        // TODO add your handling code here:
        dgt.abrirVentanaEstadisticaMultasImpuestas();
    }//GEN-LAST:event_mMultasImpuestasActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu bSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mAsignarMulta;
    private javax.swing.JMenuItem mAñadirTipoMulta;
    private javax.swing.JMenuItem mBajaMulta;
    private javax.swing.JMenuItem mDesguazar;
    private javax.swing.JMenu mEstadistica;
    private javax.swing.JMenu mMultas;
    private javax.swing.JMenu mMultas1;
    private javax.swing.JMenuItem mMultasImpuestas;
    private javax.swing.JMenuItem mMultasVehiculo;
    // End of variables declaration//GEN-END:variables
}
