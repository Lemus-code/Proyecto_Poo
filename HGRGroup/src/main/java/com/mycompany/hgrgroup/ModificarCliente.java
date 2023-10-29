/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hgrgroup;
import Clases.*;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Familia
 */
public class ModificarCliente extends javax.swing.JFrame {
    private SharedData sharedData;
    private String cliente;
    /**
     * Creates new form ModificarUserr
     */
    public ModificarCliente(SharedData sharedData, String cliente) {
        initComponents();
        this.setSize(671, 430);
        //Ocultamos los texField,  mensaje de aviso y btn aceptar
        panelTextFields.setVisible(true);
        btnAceptar.setVisible(false);
        btnCancelar.setVisible(false);
       
        
        //Iniciar Atributos
        this.sharedData = sharedData;
        this.cliente = cliente;
        
        //MostramosDatos
         mostrarDatos();
    }

    public SharedData getSharedData() {
        return sharedData;
    }

    public String getCliente() {
        return cliente;
    }
    
    
    
    

    public void bloquearTextFields(){
        txtFieldNombre.setEnabled(false);               
        txtFieldEmail.setEnabled(false);
        txtFieldTelefono.setEnabled(false);
        txtFieldCasaAsociada.setEnabled(false);
        btnAceptar.setVisible(false);
    };
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelTextFields = new javax.swing.JPanel();
        label6 = new java.awt.Label();
        txtFieldEmail = new java.awt.TextField();
        txtFieldTelefono = new java.awt.TextField();
        label1 = new java.awt.Label();
        txtFieldCasaAsociada = new java.awt.TextField();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        btnModificarAgg = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        label2 = new java.awt.Label();
        txtFieldNombre = new java.awt.TextField();
        btnRegresar = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panelTextFields.setBackground(new java.awt.Color(255, 255, 255));

        label6.setAlignment(java.awt.Label.CENTER);
        label6.setBackground(new java.awt.Color(0, 51, 102));
        label6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setText("Casa Asociada");

        txtFieldEmail.setEnabled(false);
        txtFieldEmail.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txtFieldTelefono.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtFieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldTelefonoActionPerformed(evt);
            }
        });

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(0, 51, 102));
        label1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Email");

        txtFieldCasaAsociada.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setBackground(new java.awt.Color(0, 51, 102));
        label3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Nombre");

        label4.setAlignment(java.awt.Label.CENTER);
        label4.setBackground(new java.awt.Color(0, 51, 102));
        label4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("Teléfono");

        btnModificarAgg.setBackground(new java.awt.Color(0, 51, 102));
        btnModificarAgg.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnModificarAgg.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarAgg.setText("Modificar");
        btnModificarAgg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarAggActionPerformed(evt);
            }
        });

        btnAceptar.setBackground(new java.awt.Color(0, 51, 102));
        btnAceptar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(0, 51, 102));
        btnCancelar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        label2.setName("Nuevo Usuario"); // NOI18N
        label2.setText("Modificar Cliente");

        txtFieldNombre.setEnabled(false);
        txtFieldNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelTextFieldsLayout = new javax.swing.GroupLayout(panelTextFields);
        panelTextFields.setLayout(panelTextFieldsLayout);
        panelTextFieldsLayout.setHorizontalGroup(
            panelTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTextFieldsLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(label3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFieldCasaAsociada, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTextFieldsLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnModificarAgg, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        panelTextFieldsLayout.setVerticalGroup(
            panelTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTextFieldsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(panelTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldCasaAsociada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(panelTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnModificarAgg, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        btnRegresar.setBackground(new java.awt.Color(0, 51, 102));
        btnRegresar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(panelTextFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(panelTextFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 460));
    }// </editor-fold>//GEN-END:initComponents
    private void mostrarDatos(){
        bloquearTextFields();
        
        
        for(int i = 0; i < sharedData.getClientes().size(); i++){
            if(getCliente().equals(sharedData.getClientes().get(i).getNombreCliente())){
                //Extraemos y bloqueamos
                txtFieldNombre.setText(sharedData.getClientes().get(i).getNombreCliente());
                txtFieldEmail.setText(sharedData.getClientes().get(i).getEmail());
                txtFieldTelefono.setText(String.valueOf(sharedData.getClientes().get(i).getNumTelefono()));
                txtFieldCasaAsociada.setText(sharedData.getClientes().get(i).getCasasAsocionadas().getCodigo());
                bloquearTextFields();
                btnModificarAgg.setVisible(true);
            }
        };
        
    };
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        ClientesLandingPage ClientesPage = new ClientesLandingPage(getSharedData());
        this.setVisible(false);
        ClientesPage.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtFieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldTelefonoActionPerformed
    private boolean verificar(){
    boolean verificacion = false;
        for(int i = 0; i < sharedData.getClientes().size(); i++){
            if(sharedData.getCasas().size() > 0){
                    for(int k = 0;  k < sharedData.getCasas().size(); k++){
                        System.out.println(txtFieldNombre);
                           if(sharedData.getCasas().get(k).getNombreCliente().equals(txtFieldNombre.getText()) && sharedData.getCasas().get(k).getCodigo().equals(txtFieldCasaAsociada.getText()) ){
                               verificacion = true;
                               System.out.println("adasdf");
                            }     
                        }
            }
        }
        return verificacion;
    }
    
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        boolean veri2 = verificar();
        
        try{
            boolean verificacion = false;
            if(veri2 == true){
            //Recorremos la lista Usuarios y si encuentra entonces mostramos su información blocked
            for(int i = 0; i < sharedData.getClientes().size(); i++){
                if(getCliente().equals(sharedData.getClientes().get(i).getNombreCliente())){
                    //Actualizamos
                    sharedData.getClientes().get(i).setNombreCliente(txtFieldNombre.getText());
                    sharedData.getClientes().get(i).setEmail(txtFieldEmail.getText());
                    sharedData.getClientes().get(i).setNumTelefono(Integer.parseInt(txtFieldTelefono.getText()));
                    for(int k = 0; k < sharedData.getCasas().size(); k++){
                        try{
                            if(sharedData.getCasas().get(k).getCodigo().equals(txtFieldCasaAsociada.getText())){
                                sharedData.getClientes().get(i).setCasasAsociadas(sharedData.getCasas().get(k));
                                sharedData.getClientes().get(i).setPagoTotal(sharedData.getClientes().get(i).getCasasAsocionadas().getCostoFinal());
                                
                                verificacion = true;
                            }
                        }catch(Exception e){
                            JOptionPane.showMessageDialog(null, "El código de la casa no existe", "Error",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    if(verificacion == false){
                       JOptionPane.showMessageDialog(null, "El código de la casa no existe", "Error",JOptionPane.ERROR_MESSAGE);
                    };
                };
            };
            btnAceptar.setVisible(false);
            btnCancelar.setVisible(false);
            btnModificarAgg.setVisible(false);
            mostrarDatos();
            }else{
                JOptionPane.showMessageDialog(null, "El cliente y el código de la casa no coincide", "Error",JOptionPane.ERROR_MESSAGE);
                btnAceptar.setVisible(false);
                btnCancelar.setVisible(false);
                btnModificarAgg.setVisible(false);
                mostrarDatos();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ingrese valores válidos en los campos numéricos", "Error",JOptionPane.ERROR_MESSAGE);
        };
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnModificarAggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarAggActionPerformed
        //Desbloqueamos el uso
        txtFieldNombre.setEnabled(true);
        txtFieldEmail.setEnabled(true);
        txtFieldTelefono.setEnabled(true);
        txtFieldCasaAsociada.setEnabled(true);
        btnAceptar.setVisible(true);
        btnModificarAgg.setVisible(false);
        btnCancelar.setVisible(true);
    }//GEN-LAST:event_btnModificarAggActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        bloquearTextFields();
        btnModificarAgg.setVisible(true);
        btnCancelar.setVisible(false);

        for(int i = 0; i < sharedData.getUsuarios().size(); i++){
            if(getCliente().equals(sharedData.getClientes().get(i).getNombreCliente())){
                //Mostramos panel y aviso
                panelTextFields.setVisible(true);

                //Extraemos y bloqueamos
                txtFieldEmail.setText(sharedData.getClientes().get(i).getNombreCliente());
                txtFieldEmail.setText(sharedData.getClientes().get(i).getEmail());
                txtFieldTelefono.setText(String.valueOf(sharedData.getClientes().get(i).getNumTelefono()));
                txtFieldCasaAsociada.setText(sharedData.getClientes().get(i).getCasasAsocionadas().getCodigo());

                bloquearTextFields();
                btnModificarAgg.setVisible(true);
            }
        };
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModificarAgg;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label6;
    private javax.swing.JPanel panelTextFields;
    private java.awt.TextField txtFieldCasaAsociada;
    private java.awt.TextField txtFieldEmail;
    private java.awt.TextField txtFieldNombre;
    private java.awt.TextField txtFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
