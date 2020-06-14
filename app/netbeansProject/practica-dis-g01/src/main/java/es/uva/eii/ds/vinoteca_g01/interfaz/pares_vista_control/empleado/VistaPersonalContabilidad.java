/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uva.eii.ds.vinoteca_g01.interfaz.pares_vista_control.empleado;

import javax.swing.JOptionPane;

/**
 *
 * @author richard
 */
public class VistaPersonalContabilidad extends javax.swing.JFrame {
    
    public final CtrlVistaPersonalContabilidad controlador;

    /**
     * Creates new form VistaPersonalContabilidad
     */
    public VistaPersonalContabilidad() {
        initComponents();
        controlador = new CtrlVistaPersonalContabilidad(this);
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
        facturarAbonadoButton = new javax.swing.JButton();
        anotarFacturaPagadaButton = new javax.swing.JButton();
        consultarImpagosButton = new javax.swing.JButton();
        pagarABodegaButton = new javax.swing.JButton();
        cerrarSesionButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel1.setText("Personal de Contabilidad");

        facturarAbonadoButton.setText("Facturar a abonado");
        facturarAbonadoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturarAbonadoButtonActionPerformed(evt);
            }
        });

        anotarFacturaPagadaButton.setText("Anotar factura pagada");
        anotarFacturaPagadaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anotarFacturaPagadaButtonActionPerformed(evt);
            }
        });

        consultarImpagosButton.setText("Consultar impagos");
        consultarImpagosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarImpagosButtonActionPerformed(evt);
            }
        });

        pagarABodegaButton.setText("Pagar a bodega");
        pagarABodegaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagarABodegaButtonActionPerformed(evt);
            }
        });

        cerrarSesionButton.setText("Cerrar Sesion");
        cerrarSesionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(anotarFacturaPagadaButton)
                            .addComponent(consultarImpagosButton)
                            .addComponent(facturarAbonadoButton)
                            .addComponent(pagarABodegaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel1)))
                .addContainerGap(236, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cerrarSesionButton)
                .addGap(48, 48, 48))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {anotarFacturaPagadaButton, consultarImpagosButton, facturarAbonadoButton, pagarABodegaButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(cerrarSesionButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(facturarAbonadoButton)
                .addGap(36, 36, 36)
                .addComponent(anotarFacturaPagadaButton)
                .addGap(38, 38, 38)
                .addComponent(consultarImpagosButton)
                .addGap(36, 36, 36)
                .addComponent(pagarABodegaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {anotarFacturaPagadaButton, consultarImpagosButton, facturarAbonadoButton, pagarABodegaButton});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarSesionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionButtonActionPerformed
        controlador.procesaEventoCerrarSesion();
    }//GEN-LAST:event_cerrarSesionButtonActionPerformed

    private void consultarImpagosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarImpagosButtonActionPerformed
        controlador.procesaEventoConsultarImpagos();
    }//GEN-LAST:event_consultarImpagosButtonActionPerformed

    private void facturarAbonadoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturarAbonadoButtonActionPerformed
        JOptionPane.showMessageDialog(this, "Opción aún no implementada");
    }//GEN-LAST:event_facturarAbonadoButtonActionPerformed

    private void anotarFacturaPagadaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anotarFacturaPagadaButtonActionPerformed
        JOptionPane.showMessageDialog(this, "Opción aún no implementada");
    }//GEN-LAST:event_anotarFacturaPagadaButtonActionPerformed

    private void pagarABodegaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagarABodegaButtonActionPerformed
        JOptionPane.showMessageDialog(this, "Opción aún no implementada");
    }//GEN-LAST:event_pagarABodegaButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anotarFacturaPagadaButton;
    private javax.swing.JButton cerrarSesionButton;
    private javax.swing.JButton consultarImpagosButton;
    private javax.swing.JButton facturarAbonadoButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton pagarABodegaButton;
    // End of variables declaration//GEN-END:variables
}
