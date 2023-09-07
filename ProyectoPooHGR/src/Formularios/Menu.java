/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import java.awt.BorderLayout;
import Clases.*;
import java.awt.Color;
import static java.awt.SystemColor.menu;
import javax.swing.border.LineBorder;

/**
 *
 * @author uriel
 */
public class Menu extends javax.swing.JFrame {

    private AgregarUser agUser;
    private ModificarUserr modiUser;
    private SharedData  sharedData;
    /*
     * Creates new form Menu
     */
    public Menu(SharedData sharedData) {
        initComponents();
        this.agUser = new AgregarUser(sharedData);
        this.modiUser = new ModificarUserr(sharedData);
        this.sharedData = sharedData;
        
    }

    public AgregarUser getAgUser() {
        return agUser;
    }

    public SharedData getSharedData() {
        return sharedData;
    }
    
    

    public void setAgUser(AgregarUser agUser) {
        this.agUser = agUser;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        panelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuPrincipal = new javax.swing.JMenu();
        menuCasas = new javax.swing.JMenu();
        menuUsuarios = new javax.swing.JMenu();
        menuAgregar = new javax.swing.JRadioButtonMenuItem();
        menuModificar = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        menuMostrar = new javax.swing.JRadioButtonMenuItem();
        menuClientes = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMenu.setBackground(new java.awt.Color(255, 255, 255));

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 100)); // NOI18N
        jLabel1.setText("HGR");

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cerrar Sesión");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(537, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelPrincipalLayout.createSequentialGroup()
                    .addGap(230, 230, 230)
                    .addComponent(jLabel1)
                    .addContainerGap(231, Short.MAX_VALUE)))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(386, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelPrincipalLayout.createSequentialGroup()
                    .addGap(153, 153, 153)
                    .addComponent(jLabel1)
                    .addContainerGap(154, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 430));

        jMenuBar1.setToolTipText("");
        jMenuBar1.setBorderPainted(false);
        jMenuBar1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        menuPrincipal.setText("Menu Principal");
        menuPrincipal.setBorderPainted(false);
        menuPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuPrincipalMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuPrincipal);

        menuCasas.setText("Casas");
        jMenuBar1.add(menuCasas);

        menuUsuarios.setText("Usuarios");

        menuAgregar.setBackground(new java.awt.Color(0, 51, 102));
        menuAgregar.setSelected(true);
        menuAgregar.setText("Agregar");
        menuAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgregarActionPerformed(evt);
            }
        });
        menuUsuarios.add(menuAgregar);

        menuModificar.setBackground(new java.awt.Color(0, 51, 102));
        menuModificar.setSelected(true);
        menuModificar.setText("Modificar");
        menuModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuModificarActionPerformed(evt);
            }
        });
        menuUsuarios.add(menuModificar);

        jRadioButtonMenuItem3.setBackground(new java.awt.Color(0, 51, 102));
        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("Eliminar");
        menuUsuarios.add(jRadioButtonMenuItem3);

        menuMostrar.setBackground(new java.awt.Color(0, 51, 102));
        menuMostrar.setSelected(true);
        menuMostrar.setText("Mostrar");
        menuUsuarios.add(menuMostrar);

        jMenuBar1.add(menuUsuarios);

        menuClientes.setText("Clientes");
        jMenuBar1.add(menuClientes);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgregarActionPerformed
       agUser.setSize(671, 430);
        
       panelMenu.removeAll();
       panelMenu.add(agUser,BorderLayout.CENTER);
       panelMenu.revalidate();
       panelMenu.repaint(); 
    }//GEN-LAST:event_menuAgregarActionPerformed

    private void menuModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuModificarActionPerformed
        // TODO add your handling code here:
        modiUser.setSize(671, 430);
        
        panelMenu.removeAll();
        panelMenu.add(modiUser,BorderLayout.CENTER);
        panelMenu.revalidate();
        panelMenu.repaint();   
    }//GEN-LAST:event_menuModificarActionPerformed

    private void menuPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPrincipalMouseClicked
        // TODO add your handling code here:
      
        
       panelMenu.removeAll();
       panelMenu.add(panelPrincipal,BorderLayout.CENTER);
       panelMenu.revalidate();
       panelMenu.repaint(); 
    }//GEN-LAST:event_menuPrincipalMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Login login = new Login(getSharedData());
        this.setVisible(false);
        login.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JRadioButtonMenuItem menuAgregar;
    private javax.swing.JMenu menuCasas;
    private javax.swing.JMenu menuClientes;
    private javax.swing.JRadioButtonMenuItem menuModificar;
    private javax.swing.JRadioButtonMenuItem menuMostrar;
    private javax.swing.JMenu menuPrincipal;
    private javax.swing.JMenu menuUsuarios;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}