package es.uva.eii.ds.vinoteca_g01.interfaz.pares_vista_control.empleado;

import javax.swing.JOptionPane;

/**
 *
 * @author ricalba
 * @author silmont
 * @author marrobl
 */
public class VistaPersonalAtencionCliente extends javax.swing.JFrame {
    
    private final CtrlVistaPersonalAtencionCliente controlador;

    /**
     * Creates new form VistaPersonalAtencionCliente
     */
    public VistaPersonalAtencionCliente() {
        initComponents();
        controlador = new CtrlVistaPersonalAtencionCliente(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        crearPedidoAbonadoButton = new javax.swing.JButton();
        registrarEnvioPedidoButton = new javax.swing.JButton();
        registrarEntregaPedidoButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cerrarSesionButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        crearPedidoAbonadoButton.setText("Crear pedido de abonado");
        crearPedidoAbonadoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearPedidoAbonadoButtonActionPerformed(evt);
            }
        });

        registrarEnvioPedidoButton.setText("Registrar envío de pedido");
        registrarEnvioPedidoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarEnvioPedidoButtonActionPerformed(evt);
            }
        });

        registrarEntregaPedidoButton.setText("Registrar entrega pedido");
        registrarEntregaPedidoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarEntregaPedidoButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel1.setText("Personal de Atención al Cliente");

        cerrarSesionButton.setText("Cerrar Sesión");
        cerrarSesionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cerrarSesionButton)
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(registrarEntregaPedidoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registrarEnvioPedidoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(crearPedidoAbonadoButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel1)))
                .addContainerGap(146, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {crearPedidoAbonadoButton, registrarEntregaPedidoButton, registrarEnvioPedidoButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(cerrarSesionButton)
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(crearPedidoAbonadoButton)
                .addGap(42, 42, 42)
                .addComponent(registrarEnvioPedidoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(registrarEntregaPedidoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {crearPedidoAbonadoButton, registrarEntregaPedidoButton, registrarEnvioPedidoButton});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearPedidoAbonadoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearPedidoAbonadoButtonActionPerformed
        controlador.procesaEventoCrearPedidoAbonado();
    }//GEN-LAST:event_crearPedidoAbonadoButtonActionPerformed

    private void cerrarSesionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionButtonActionPerformed
        controlador.procesaEventoCerrarSesion();
    }//GEN-LAST:event_cerrarSesionButtonActionPerformed

    private void registrarEnvioPedidoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarEnvioPedidoButtonActionPerformed
        JOptionPane.showMessageDialog(this, "Opción aún no implementada");
    }//GEN-LAST:event_registrarEnvioPedidoButtonActionPerformed

    private void registrarEntregaPedidoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarEntregaPedidoButtonActionPerformed
        JOptionPane.showMessageDialog(this, "Opción aún no implementada");
    }//GEN-LAST:event_registrarEntregaPedidoButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrarSesionButton;
    private javax.swing.JButton crearPedidoAbonadoButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton registrarEntregaPedidoButton;
    private javax.swing.JButton registrarEnvioPedidoButton;
    // End of variables declaration//GEN-END:variables
}
