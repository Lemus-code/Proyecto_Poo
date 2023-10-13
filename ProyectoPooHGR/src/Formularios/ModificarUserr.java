/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;
import Clases.*;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Familia
 */
public class ModificarUserr extends javax.swing.JFrame {
    private SharedData sharedData;
    private String usuario;
    /**
     * Creates new form ModificarUserr
     */
    public ModificarUserr(SharedData sharedData, String usuario) {
        initComponents();
        this.setSize(671, 480);
        //Ocultamos los texField,  mensaje de aviso y btn aceptar
        panelTextFields.setVisible(true);
        btnAceptar.setVisible(false);
        btnCancelar.setVisible(false);
       
        
        //Iniciar Atributos
        this.sharedData = sharedData;
        this.usuario = usuario;
        
        //MostramosDatos
         mostrarDatos();
    }

    public SharedData getSharedData() {
        return sharedData;
    }

    public String getUsuario() {
        return usuario;
    }
    
    
    
    

    public void bloquearTextFields(){
        textUsuario.setEnabled(false);               
        textContra.setEnabled(false);
        textNomUser.setEnabled(false);
        textDPI.setEnabled(false);
        textEdad.setEnabled(false);
        textCargo.setEnabled(false);
        textTelefono.setEnabled(false);
        textDepar.setEnabled(false);
        textEmail.setEnabled(false);
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
        label2 = new java.awt.Label();
        panelTextFields = new javax.swing.JPanel();
        label5 = new java.awt.Label();
        label9 = new java.awt.Label();
        textDepar = new java.awt.TextField();
        label10 = new java.awt.Label();
        label6 = new java.awt.Label();
        textUsuario = new java.awt.TextField();
        textTelefono = new java.awt.TextField();
        textNomUser = new java.awt.TextField();
        label1 = new java.awt.Label();
        textDPI = new java.awt.TextField();
        label3 = new java.awt.Label();
        label7 = new java.awt.Label();
        textCargo = new java.awt.TextField();
        textEmail = new java.awt.TextField();
        label4 = new java.awt.Label();
        label8 = new java.awt.Label();
        textEdad = new java.awt.TextField();
        btnModificarAgg = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        textContra = new javax.swing.JPasswordField();
        btnRegresar = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        label2.setName("Nuevo Usuario"); // NOI18N
        label2.setText("Modificar Usuario");

        panelTextFields.setBackground(new java.awt.Color(255, 255, 255));

        label5.setAlignment(java.awt.Label.CENTER);
        label5.setBackground(new java.awt.Color(0, 51, 102));
        label5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("Edad");

        label9.setAlignment(java.awt.Label.CENTER);
        label9.setBackground(new java.awt.Color(0, 51, 102));
        label9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        label9.setForeground(new java.awt.Color(255, 255, 255));
        label9.setText("Correo Electronico");

        textDepar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        label10.setAlignment(java.awt.Label.CENTER);
        label10.setBackground(new java.awt.Color(0, 51, 102));
        label10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        label10.setForeground(new java.awt.Color(255, 255, 255));
        label10.setText("Departamento");

        label6.setAlignment(java.awt.Label.CENTER);
        label6.setBackground(new java.awt.Color(0, 51, 102));
        label6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setText("DPI");

        textUsuario.setEnabled(false);
        textUsuario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        textTelefono.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        textNomUser.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(0, 51, 102));
        label1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Contraseña");

        textDPI.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setBackground(new java.awt.Color(0, 51, 102));
        label3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Usuario");

        label7.setAlignment(java.awt.Label.CENTER);
        label7.setBackground(new java.awt.Color(0, 51, 102));
        label7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        label7.setForeground(new java.awt.Color(255, 255, 255));
        label7.setText("Cargo");

        textCargo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        textEmail.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        label4.setAlignment(java.awt.Label.CENTER);
        label4.setBackground(new java.awt.Color(0, 51, 102));
        label4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("Nombre");

        label8.setAlignment(java.awt.Label.CENTER);
        label8.setBackground(new java.awt.Color(0, 51, 102));
        label8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        label8.setForeground(new java.awt.Color(255, 255, 255));
        label8.setText("Telefono");

        textEdad.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

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

        textContra.setBackground(new java.awt.Color(255, 255, 255));
        textContra.setForeground(new java.awt.Color(0, 0, 0));
        textContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textContraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTextFieldsLayout = new javax.swing.GroupLayout(panelTextFields);
        panelTextFields.setLayout(panelTextFieldsLayout);
        panelTextFieldsLayout.setHorizontalGroup(
            panelTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTextFieldsLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(panelTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelTextFieldsLayout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panelTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTextFieldsLayout.createSequentialGroup()
                        .addGroup(panelTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textDepar, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textDPI, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textNomUser, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelTextFieldsLayout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(btnModificarAgg, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(56, 56, 56))
                    .addGroup(panelTextFieldsLayout.createSequentialGroup()
                        .addComponent(textContra, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelTextFieldsLayout.setVerticalGroup(
            panelTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTextFieldsLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panelTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNomUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textDPI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(panelTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textDepar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addComponent(panelTextFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addComponent(panelTextFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 460));
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarAggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarAggActionPerformed
        //Desbloqueamos el uso
        textUsuario.setEnabled(true);               
        textContra.setEnabled(true);
        textNomUser.setEnabled(true);
        textDPI.setEnabled(true);
        textEdad.setEnabled(true);
        textCargo.setEnabled(true);
        textTelefono.setEnabled(true);
        textDepar.setEnabled(true);
        textEmail.setEnabled(true);
        btnAceptar.setVisible(true);
        btnModificarAgg.setVisible(false);
        btnCancelar.setVisible(true);
    }//GEN-LAST:event_btnModificarAggActionPerformed
    private void mostrarDatos(){
        bloquearTextFields();
        
        for(int i = 0; i < sharedData.getUsuarios().size(); i++){
            if(getUsuario().equals(sharedData.getUsuarios().get(i).getUsuario())){
                //Extraemos y bloqueamos
                textUsuario.setText(sharedData.getUsuarios().get(i).getUsuario());
                textContra.setText(sharedData.getUsuarios().get(i).getContrasenaOfuscada());
                textNomUser.setText(sharedData.getUsuarios().get(i).getNombreUsuario());
                textDPI.setText(String.valueOf(sharedData.getUsuarios().get(i).getDpi()));
                textEdad.setText(String.valueOf(sharedData.getUsuarios().get(i).getEdad()));
                textCargo.setText(sharedData.getUsuarios().get(i).getCargo());
                textTelefono.setText(String.valueOf(sharedData.getUsuarios().get(i).getTelefono()));
                textDepar.setText(sharedData.getUsuarios().get(i).getDepartamento());
                textEmail.setText(sharedData.getUsuarios().get(i).getEmail());
                
                bloquearTextFields();
                btnModificarAgg.setVisible(true);
            }
        };
        
    };
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        try{
        //Recorremos la lista Usuarios y si encuentra entonces mostramos su información blocked
            for(int i = 0; i < sharedData.getUsuarios().size(); i++){
                if(getUsuario().equals(sharedData.getUsuarios().get(i).getUsuario())){
                    //Actualizamos
                    sharedData.getUsuarios().get(i).setUsuario(textUsuario.getText());
                    sharedData.getUsuarios().get(i).setContrasena(textContra.getText());
                    sharedData.getUsuarios().get(i).setNombreUsuario(textNomUser.getText());
                    sharedData.getUsuarios().get(i).setDpi(Integer.parseInt(textDPI.getText()));
                    sharedData.getUsuarios().get(i).setEdad(Integer.parseInt(textEdad.getText()));
                    sharedData.getUsuarios().get(i).setCargo(textCargo.getText());
                    sharedData.getUsuarios().get(i).setTelefono(Integer.parseInt(textTelefono.getText()));
                    sharedData.getUsuarios().get(i).setDepartamento(textDepar.getText());
                    sharedData.getUsuarios().get(i).setEmail(textEmail.getText());
                    System.out.println("Nombre: " + sharedData.getUsuarios().get(i).getUsuario() + "\n" + "Email: " + sharedData.getUsuarios().get(i).getEmail());
                };
            };
            btnAceptar.setVisible(false);
            btnCancelar.setVisible(false);
            btnModificarAgg.setVisible(false);
            mostrarDatos();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ingrese valores válidos en los campos numéricos", "Error",JOptionPane.ERROR_MESSAGE);
        };
        
        
     
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        bloquearTextFields();
        btnModificarAgg.setVisible(true);
        btnCancelar.setVisible(false);
        
        
        for(int i = 0; i < sharedData.getUsuarios().size(); i++){
            if(getUsuario().equals(sharedData.getUsuarios().get(i).getUsuario())){
                //Mostramos panel y aviso
                panelTextFields.setVisible(true);
               
                
                //Extraemos y bloqueamos
                textUsuario.setText(sharedData.getUsuarios().get(i).getUsuario());
                textContra.setText(sharedData.getUsuarios().get(i).getContrasenaOfuscada());
                textNomUser.setText(sharedData.getUsuarios().get(i).getNombreUsuario());
                textDPI.setText(String.valueOf(sharedData.getUsuarios().get(i).getDpi()));
                textEdad.setText(String.valueOf(sharedData.getUsuarios().get(i).getEdad()));
                textCargo.setText(sharedData.getUsuarios().get(i).getCargo());
                textTelefono.setText(String.valueOf(sharedData.getUsuarios().get(i).getTelefono()));
                textDepar.setText(sharedData.getUsuarios().get(i).getDepartamento());
                textEmail.setText(sharedData.getUsuarios().get(i).getEmail());
                
                bloquearTextFields();
                btnModificarAgg.setVisible(true);
            }
        };
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        UsuariosLandingPage usuariosPage = new UsuariosLandingPage(getSharedData());
        this.setVisible(false);
        usuariosPage.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void textContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textContraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModificarAgg;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private javax.swing.JPanel panelTextFields;
    private java.awt.TextField textCargo;
    private javax.swing.JPasswordField textContra;
    private java.awt.TextField textDPI;
    private java.awt.TextField textDepar;
    private java.awt.TextField textEdad;
    private java.awt.TextField textEmail;
    private java.awt.TextField textNomUser;
    private java.awt.TextField textTelefono;
    private java.awt.TextField textUsuario;
    // End of variables declaration//GEN-END:variables
}
