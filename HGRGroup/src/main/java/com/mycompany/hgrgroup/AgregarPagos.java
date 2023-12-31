/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.hgrgroup;
import Clases.*;
import java.util.List;
import java.util.ArrayList;
import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;


/**
 *
 * @author uriel
 */
public class AgregarPagos extends javax.swing.JFrame {

    private SharedData sharedData;
    private String cliente;
    /**
     * Creates new form AgregarUsuario
     */
    public AgregarPagos(SharedData sharedData, String cliente) {
        initComponents();
        this.sharedData = sharedData;
        this.cliente = cliente;
        
        this.setSize(671, 475);
    }

    public SharedData getSharedData() {
        return sharedData;
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        label1 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        txtFieldMonto = new java.awt.TextField();
        txtFieldFecha = new java.awt.TextField();
        btnRegresar = new javax.swing.JButton();
        botonAgg1 = new javax.swing.JButton();
        txtFieldEstado = new java.awt.TextField();
        label5 = new java.awt.Label();
        txtFieldMetodo = new java.awt.TextField();

        jCheckBox1.setText("jCheckBox1");

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        label2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        label2.setName("Nuevo Pago"); // NOI18N
        label2.setText("Nuevo Pago");

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(0, 51, 102));
        label1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Estado");

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setBackground(new java.awt.Color(0, 51, 102));
        label3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Monto");

        label4.setAlignment(java.awt.Label.CENTER);
        label4.setBackground(new java.awt.Color(0, 51, 102));
        label4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("Método");

        txtFieldMonto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txtFieldFecha.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        btnRegresar.setBackground(new java.awt.Color(0, 51, 102));
        btnRegresar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        botonAgg1.setBackground(new java.awt.Color(0, 51, 102));
        botonAgg1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        botonAgg1.setForeground(new java.awt.Color(255, 255, 255));
        botonAgg1.setText("Agregar");
        botonAgg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgg1ActionPerformed(evt);
            }
        });

        txtFieldEstado.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        label5.setAlignment(java.awt.Label.CENTER);
        label5.setBackground(new java.awt.Color(0, 51, 102));
        label5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("Fecha");

        txtFieldMetodo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFieldMonto, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                                    .addComponent(txtFieldFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtFieldEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                                    .addComponent(txtFieldMetodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(143, 143, 143))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(botonAgg1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFieldMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFieldMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(botonAgg1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 460));
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgg1ActionPerformed
        // TODO add your handling code here:
        int tamano = 0;
        try {
            String estado,metodo, fecha;
            double monto;
            for(int i = 0; i < sharedData.getClientes().size(); i++){
                if(cliente.equals(sharedData.getClientes().get(i).getNombreCliente())){
                    tamano = sharedData.getClientes().get(i).getPagosRealizados().size();
                    tamano++;
                };
            };
            monto = Double.parseDouble(txtFieldMonto.getText());
            estado = txtFieldEstado.getText();
            metodo = txtFieldMetodo.getText();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            dateFormat.setLenient(false); // Desactiva el modo flexible para el análisis de fechas
            
            try {
                fecha = txtFieldFecha.getText();
                Date fechaEntrega = dateFormat.parse(fecha);
                    LocalDate datePago = fechaEntrega.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                // Verificar si los campos están vacíos
                if (txtFieldMonto.getText().isEmpty() || estado.isEmpty() || metodo.isEmpty() || fecha.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Llene todos los espacios del formulario", "Error",
                    JOptionPane.ERROR_MESSAGE);
                } else {
                    Pagos pago = new Pagos(String.valueOf(tamano),monto, datePago, estado, cliente, metodo);
                    for(int i = 0; i < sharedData.getClientes().size(); i++){
                        if(cliente.equals(sharedData.getClientes().get(i).getNombreCliente())){
                            sharedData.getClientes().get(i).agregarPago(pago);
                        }
                    };

                    txtFieldMonto.setText("");
                    txtFieldMetodo.setText("");
                    txtFieldEstado.setText("");
                    txtFieldFecha.setText("");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingrese el formato correcto de la fecha dd/mm/yy", "Error",JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese valores válidos en los campos numéricos", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonAgg1ActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        PagosLandingPage clientesPage = new PagosLandingPage(getSharedData(), cliente);
        this.setVisible(false);
        clientesPage.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgg1;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.TextField txtFieldEstado;
    private java.awt.TextField txtFieldFecha;
    private java.awt.TextField txtFieldMetodo;
    private java.awt.TextField txtFieldMonto;
    // End of variables declaration//GEN-END:variables
}
