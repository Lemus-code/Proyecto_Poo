/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hgrgroup;
import Clases.*;
import java.awt.BorderLayout;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Login extends javax.swing.JFrame {
    private SharedData shareData;
    /**
     * Creates new form Login
     */
    public Login(SharedData shareData) {
        initComponents();
        this.setSize(800,800);
        lbMensaje.setVisible(false);
        this.shareData = shareData;
    }

    public SharedData getShareData() {
        return shareData;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        panelDinamico = new javax.swing.JPanel();
        txtFieldUser = new javax.swing.JTextField();
        txtFieldContra = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bntIniciar = new javax.swing.JButton();
        lbMensaje = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        panelDinamico.setBackground(new java.awt.Color(255, 255, 255));

        txtFieldUser.setBackground(new java.awt.Color(204, 204, 204));
        txtFieldUser.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtFieldUser.setToolTipText("");
        txtFieldUser.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtFieldUser.setName(""); // NOI18N
        txtFieldUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldUserActionPerformed(evt);
            }
        });

        txtFieldContra.setBackground(new java.awt.Color(204, 204, 204));
        txtFieldContra.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtFieldContra.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtFieldContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldContraActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Usuario");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Contraseña");

        bntIniciar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        bntIniciar.setText("Iniciar Sesión");
        bntIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntIniciarActionPerformed(evt);
            }
        });

        lbMensaje.setForeground(new java.awt.Color(255, 51, 51));
        lbMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMensaje.setText("Verfifique usuario y contraseña");

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("L O G I N");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(375, 375, 375)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelDinamicoLayout = new javax.swing.GroupLayout(panelDinamico);
        panelDinamico.setLayout(panelDinamicoLayout);
        panelDinamicoLayout.setHorizontalGroup(
            panelDinamicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDinamicoLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(panelDinamicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDinamicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(txtFieldContra, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtFieldUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDinamicoLayout.createSequentialGroup()
                        .addComponent(lbMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDinamicoLayout.createSequentialGroup()
                        .addComponent(bntIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelDinamicoLayout.setVerticalGroup(
            panelDinamicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDinamicoLayout.createSequentialGroup()
                .addContainerGap(275, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldContra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bntIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(267, 267, 267))
        );

        getContentPane().add(panelDinamico, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntIniciarActionPerformed
        // TODO add your handling code here:
        MenuPrincipal menu = new MenuPrincipal(getShareData());
        String usuario, contrasena;
        usuario = txtFieldUser.getText();
        contrasena = txtFieldContra.getText();
        boolean verificacion = shareData.autenticarUsuario(usuario, contrasena);
        
        //Verificamos si la autenticación es válida o no
        if(verificacion == true){
            //Si es válida, cambiamos de vista al menú principal
            this.setVisible(false);
            menu.setVisible(true);
            
                    
        }else{
            //Mostramos mensaje de error y reiniciamos los valores del log in
            lbMensaje.setVisible(true);
            txtFieldContra.setText("");
            txtFieldUser.setText("");
        };
       
    }//GEN-LAST:event_bntIniciarActionPerformed

    private void txtFieldUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldUserActionPerformed

    private void txtFieldContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldContraActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtFieldContraActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                //Instancias Usuarios
                Usuarios user1 = new Usuarios("Admin", "1234", "Alberto González", 298877007, 40,"Administrador", 12345567,"Administración", "albertogonza@gmail.com" );
                Usuarios user2 = new Usuarios("EnriqueGonzales", "12345", "Enrique González", 12312317, 21,"Contador", 12345567,"Administración", "enriqueGonza@gmail.com" );
                Usuarios user3 = new Usuarios("diegof", "12345", "Diego Solis", 212412, 19,"Albañil", 12345567,"Construcción", "diegoSolis@gmail.com" );
                
                //Fechas
                LocalDate fechaEntrega = LocalDate.of(2023, 12, 31); // Año, mes, día
                
                 // Definir un formato personalizado
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
                // Formatear la fecha según el formato personalizado
                String fechaFormateada = fechaEntrega.format(formatter);
        
                // Imprimir la fecha formateada
                System.out.println(fechaFormateada);
                
                //Instancias de Casas
                List<Modificaciones> list = new ArrayList<>();
                List<Adons> adons = new ArrayList<>();
                
                
                Casas casa1 = new Casas("Roberto Gonzales", "MAR100100", "Segundo Nivel", 300000.0, 0.0, 0.0,300000.0, list, adons, fechaEntrega);
                
                //Instancias Clientes
                List<Casas> casasClient1 = new ArrayList<>();
                casasClient1.add(casa1);
                // Clientes client1 = new Clientes();
                //Añadimos a clase shareData
                SharedData data1 = new SharedData();
                data1.agregarUsuarios(user1);
                data1.agregarUsuarios(user2);
                data1.agregarUsuarios(user3);
                
                data1.agregarCasa(casa1);
                
                new Login(data1).setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntIniciar;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbMensaje;
    private javax.swing.JPanel panelDinamico;
    private javax.swing.JPasswordField txtFieldContra;
    private javax.swing.JTextField txtFieldUser;
    // End of variables declaration//GEN-END:variables
}
