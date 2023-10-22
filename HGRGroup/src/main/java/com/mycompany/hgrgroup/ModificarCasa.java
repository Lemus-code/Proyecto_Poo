/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hgrgroup;
import Clases.*;
import com.formdev.flatlaf.json.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author Familia
 */
public class ModificarCasa extends javax.swing.JFrame {
    private SharedData sharedData;
    private String cliente;
    /**
     * Creates new form ModificarUserr
     */
    public ModificarCasa(SharedData sharedData, String cliente) {
        initComponents();
        this.setSize(671, 480);
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
        txtFieldCliente.setEnabled(false);               
        txtFieldCodigo.setEnabled(false);
        txtFieldFase.setEnabled(false);
        txtFieldCBase.setEnabled(false);
        txtFieldEntrega.setEnabled(false);
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
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        txtFieldCliente = new java.awt.TextField();
        txtFieldFase = new java.awt.TextField();
        label1 = new java.awt.Label();
        txtFieldCBase = new java.awt.TextField();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        txtFieldEntrega = new java.awt.TextField();
        btnModificarAgg = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtFieldCodigo = new java.awt.TextField();
        btnRegresar = new javax.swing.JButton();
        label2 = new java.awt.Label();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panelTextFields.setBackground(new java.awt.Color(255, 255, 255));

        label5.setAlignment(java.awt.Label.CENTER);
        label5.setBackground(new java.awt.Color(0, 51, 102));
        label5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("Fecha Entrega");

        label6.setAlignment(java.awt.Label.CENTER);
        label6.setBackground(new java.awt.Color(0, 51, 102));
        label6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setText("Costo Base");

        txtFieldCliente.setEnabled(false);
        txtFieldCliente.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txtFieldFase.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(0, 51, 102));
        label1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Código");

        txtFieldCBase.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setBackground(new java.awt.Color(0, 51, 102));
        label3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Nombre Cliente");

        label4.setAlignment(java.awt.Label.CENTER);
        label4.setBackground(new java.awt.Color(0, 51, 102));
        label4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("Fase Construcción");

        txtFieldEntrega.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

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

        txtFieldCodigo.setEnabled(false);
        txtFieldCodigo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelTextFieldsLayout = new javax.swing.GroupLayout(panelTextFields);
        panelTextFields.setLayout(panelTextFieldsLayout);
        panelTextFieldsLayout.setHorizontalGroup(
            panelTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTextFieldsLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(btnModificarAgg, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(panelTextFieldsLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(panelTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldCBase, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldFase, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTextFieldsLayout.setVerticalGroup(
            panelTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTextFieldsLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panelTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldFase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldCBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(panelTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(panelTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnModificarAgg, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAceptar))
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
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

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        label2.setName("Nuevo Usuario"); // NOI18N
        label2.setText("Modificar Casas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 16, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(panelTextFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(205, 205, 205))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTextFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 460));
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarAggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarAggActionPerformed
        //Desbloqueamos el uso
        txtFieldCliente.setEnabled(true);               
        txtFieldCodigo.setEnabled(true);
        txtFieldFase.setEnabled(true);
        txtFieldCBase.setEnabled(true);
        txtFieldEntrega.setEnabled(true);
        btnAceptar.setVisible(true);
        btnModificarAgg.setVisible(false);
        btnCancelar.setVisible(true);
    }//GEN-LAST:event_btnModificarAggActionPerformed
    private void mostrarDatos(){
        bloquearTextFields();
        
        for(int i = 0; i < sharedData.getCasas().size(); i++){
            if(getCliente().equals(sharedData.getCasas().get(i).getNombreCliente())){
                //Extraemos y bloqueamos
                txtFieldCliente.setText(sharedData.getCasas().get(i).getNombreCliente());
                txtFieldCodigo.setText(sharedData.getCasas().get(i).getCodigo());
                txtFieldFase.setText(sharedData.getCasas().get(i).getFaseConstru());
                txtFieldCBase.setText(String.valueOf(sharedData.getCasas().get(i).getCostoBase()));
                txtFieldEntrega.setText(String.valueOf(sharedData.getCasas().get(i).getFechaEntrega()));
                bloquearTextFields();
                btnModificarAgg.setVisible(true);
            }
        };
        
    };
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        //Esto establece el formato "yyyyMMdd"
        String fecha;
        double costoBaseViejo, diferenciaCostos;
        try{
        //Recorremos la lista Usuarios y si encuentra entonces  mostramos su información blocked
            for(int i = 0; i < sharedData.getCasas().size(); i++){
                if(getCliente().equals(sharedData.getCasas().get(i).getNombreCliente())){
                    //Extraemos el dato actual de Costo base
                    costoBaseViejo = sharedData.getCasas().get(i).getCostoBase();
                    
                    //Actualizamos
                    sharedData.getCasas().get(i).setNombreCliente(txtFieldCliente.getText());
                    sharedData.getCasas().get(i).setCodigo(txtFieldCodigo.getText());
                    sharedData.getCasas().get(i).setFaseConstru(txtFieldFase.getText());
                    sharedData.getCasas().get(i).setCostoBase(Double.parseDouble(txtFieldCBase.getText()));
                    
                    //Dato fecha
                    
                   // Matcher matcher = pattern.matcher(fecha);
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    dateFormat.setLenient(false); // Desactiva el modo flexible para el análisis de fechas
                    
                    fecha = txtFieldEntrega.getText();
                    
                    try {
                        Date fecha2 = dateFormat.parse(fecha);
                        LocalDate fechaEntrega = fecha2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                        sharedData.getCasas().get(i).setFechaEntrega(fechaEntrega);
                    } catch (ParseException e) {
                        JOptionPane.showMessageDialog(null, "Ingrese el formato correcto de la fecha dd/mm/yy", "Error",JOptionPane.ERROR_MESSAGE);
                    }
                    //Actualizamos dato "Costo Final"
                    if(sharedData.getCasas().get(i).getCostoBase() <= costoBaseViejo ){
                        //Si es menor al original restamos el viejo con el actual para obtener la diferencia y restarlo al costo final
                        diferenciaCostos = costoBaseViejo - Double.parseDouble(txtFieldCBase.getText());
                        sharedData.getCasas().get(i).setCostoFinal((sharedData.getCasas().get(i).getCostoFinal() - diferenciaCostos));
                    }else{
                        //Si es mayor al original restamos el viejo al actual para obtener la diferencia y sumarlo al costo final
                        diferenciaCostos =  Double.parseDouble(txtFieldCBase.getText()) - costoBaseViejo;
                        sharedData.getCasas().get(i).setCostoFinal((sharedData.getCasas().get(i).getCostoFinal() + diferenciaCostos));
                    };
                };
            };
            btnAceptar.setVisible(false);
            btnCancelar.setVisible(false);
            btnModificarAgg.setVisible(false);
            mostrarDatos();
        } catch (ParseException e) {
            if (e.getMessage() != null && e.getMessage().contains("Unparseable date")) {
                JOptionPane.showMessageDialog(null, "Ingrese el formato correcto de la fecha dd/mm/yy", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            // Este bloque se ejecutará si se lanza una excepción de cualquier otro tipo (diferente de ParseException)
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Ingrese valores válidos en los campos", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
     
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        bloquearTextFields();
        btnModificarAgg.setVisible(true);
        btnCancelar.setVisible(false);
        
        
        for(int i = 0; i < sharedData.getUsuarios().size(); i++){
            if(getCliente().equals(sharedData.getUsuarios().get(i).getUsuario())){
                //Mostramos panel y aviso
                panelTextFields.setVisible(true);
               
                
                //Extraemos y bloqueamos
                txtFieldCliente.setText(sharedData.getCasas().get(i).getNombreCliente());
                txtFieldCodigo.setText(sharedData.getCasas().get(i).getCodigo());
                txtFieldFase.setText(sharedData.getCasas().get(i).getFaseConstru());
                txtFieldCBase.setText(String.valueOf(sharedData.getCasas().get(i).getCostoBase()));
                txtFieldEntrega.setText(String.valueOf(sharedData.getCasas().get(i).getFechaEntrega()));

                bloquearTextFields();
                btnModificarAgg.setVisible(true);
            }
        };
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        CasasLandingPage casasPage = new CasasLandingPage(getSharedData());
        this.setVisible(false);
        casasPage.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed


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
    private java.awt.Label label5;
    private java.awt.Label label6;
    private javax.swing.JPanel panelTextFields;
    private java.awt.TextField txtFieldCBase;
    private java.awt.TextField txtFieldCliente;
    private java.awt.TextField txtFieldCodigo;
    private java.awt.TextField txtFieldEntrega;
    private java.awt.TextField txtFieldFase;
    // End of variables declaration//GEN-END:variables
}
