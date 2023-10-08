/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Formularios;
import Clases.*;
import java.util.List;
import java.util.ArrayList;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


/**
 *
 * @author uriel
 */
public class MenuPrincipal extends javax.swing.JFrame {

    private SharedData sharedData;
    /**
     * Creates new form AgregarUsuario
     */
    public MenuPrincipal(SharedData sharedData) {
        initComponents();
        this.setSize(800,520);
        transparenciaBtn();
        this.sharedData = sharedData;
        
        
        setImageSesion();
        setImageCliente();
        setImageUsuario();
        setImageCasa();
        setImageMenu();
        
        
        
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
        jPanel2 = new javax.swing.JPanel();
        jPanelCasas = new javax.swing.JPanel();
        btnCasas = new javax.swing.JButton();
        jLabelCasas = new javax.swing.JLabel();
        jPanelClientes = new javax.swing.JPanel();
        btnClientes = new javax.swing.JButton();
        jLabelClientes = new javax.swing.JLabel();
        jPanelUsuarios = new javax.swing.JPanel();
        btnUsuarios = new javax.swing.JButton();
        jLabelUsers = new javax.swing.JLabel();
        jPanelSesion = new javax.swing.JPanel();
        btnSesion = new javax.swing.JButton();
        jLabelSesion = new javax.swing.JLabel();
        jPanelMenu = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();
        jLabelMenu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        jPanelCasas.setBackground(new java.awt.Color(0, 51, 102));
        jPanelCasas.setPreferredSize(new java.awt.Dimension(109, 30));

        btnCasas.setBackground(new java.awt.Color(0, 51, 102));
        btnCasas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnCasas.setForeground(new java.awt.Color(255, 255, 255));
        btnCasas.setText("Casas");
        btnCasas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCasas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCasasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCasasMouseExited(evt);
            }
        });
        btnCasas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasasActionPerformed(evt);
            }
        });

        jLabelCasas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelCasasLayout = new javax.swing.GroupLayout(jPanelCasas);
        jPanelCasas.setLayout(jPanelCasasLayout);
        jPanelCasasLayout.setHorizontalGroup(
            jPanelCasasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCasasLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabelCasas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCasas, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelCasasLayout.setVerticalGroup(
            jPanelCasasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCasasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCasas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelCasasLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelCasas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelClientes.setBackground(new java.awt.Color(0, 51, 102));
        jPanelClientes.setPreferredSize(new java.awt.Dimension(109, 30));

        btnClientes.setBackground(new java.awt.Color(0, 51, 102));
        btnClientes.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setText("Clientes");
        btnClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClientesMouseExited(evt);
            }
        });
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        jLabelClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelClientesLayout = new javax.swing.GroupLayout(jPanelClientes);
        jPanelClientes.setLayout(jPanelClientesLayout);
        jPanelClientesLayout.setHorizontalGroup(
            jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClientesLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelClientesLayout.setVerticalGroup(
            jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClientesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jPanelUsuarios.setBackground(new java.awt.Color(0, 51, 102));
        jPanelUsuarios.setPreferredSize(new java.awt.Dimension(109, 30));

        btnUsuarios.setBackground(new java.awt.Color(0, 51, 102));
        btnUsuarios.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseExited(evt);
            }
        });
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        jLabelUsers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelUsuariosLayout = new javax.swing.GroupLayout(jPanelUsuarios);
        jPanelUsuarios.setLayout(jPanelUsuariosLayout);
        jPanelUsuariosLayout.setHorizontalGroup(
            jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUsuariosLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabelUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelUsuariosLayout.setVerticalGroup(
            jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsuariosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelUsuariosLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabelUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(31, Short.MAX_VALUE))))
        );

        jPanelSesion.setBackground(new java.awt.Color(0, 51, 102));
        jPanelSesion.setPreferredSize(new java.awt.Dimension(109, 30));

        btnSesion.setBackground(new java.awt.Color(0, 51, 102));
        btnSesion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnSesion.setText("Cerrar Sesión");
        btnSesion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSesionMouseExited(evt);
            }
        });
        btnSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSesionActionPerformed(evt);
            }
        });

        jLabelSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelSesionLayout = new javax.swing.GroupLayout(jPanelSesion);
        jPanelSesion.setLayout(jPanelSesionLayout);
        jPanelSesionLayout.setHorizontalGroup(
            jPanelSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSesionLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabelSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSesionLayout.setVerticalGroup(
            jPanelSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSesionLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabelSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(btnSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanelMenu.setBackground(new java.awt.Color(0, 51, 102));
        jPanelMenu.setPreferredSize(new java.awt.Dimension(109, 30));

        btnMenu.setBackground(new java.awt.Color(0, 51, 102));
        btnMenu.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenu.setLabel("Menú Principal");
        btnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenuMouseExited(evt);
            }
        });
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        jLabelMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCasas, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanelSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanelUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelCasas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 100)); // NOI18N
        jLabel1.setText("HGR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171)
                .addComponent(jLabel1)
                .addContainerGap(173, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(187, 187, 187))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseExited
        // TODO add your handling code here:
        Color colorRgb= new Color(0,51,102);
        jPanelMenu.setBackground(colorRgb);
    }//GEN-LAST:event_btnMenuMouseExited

    private void btnMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseEntered
        // TODO add your handling code here:
        Color colorRgb= new Color(0, 102, 204);
        jPanelMenu.setBackground(colorRgb);
    }//GEN-LAST:event_btnMenuMouseEntered

    private void btnSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSesionActionPerformed

    private void btnSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSesionMouseExited
        // TODO add your handling code here:
        Color colorRgb= new Color(0,51,102);
        jPanelSesion.setBackground(colorRgb);
    }//GEN-LAST:event_btnSesionMouseExited

    private void btnSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSesionMouseEntered
        // TODO add your handling code here:
        Color colorRgb= new Color(0, 102, 204);
        jPanelSesion.setBackground(colorRgb);
    }//GEN-LAST:event_btnSesionMouseEntered

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseExited
        // TODO add your handling code here:
        Color colorRgb= new Color(0,51,102);
        jPanelUsuarios.setBackground(colorRgb);
    }//GEN-LAST:event_btnUsuariosMouseExited

    private void btnUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseEntered
        // TODO add your handling code here:
        Color colorRgb= new Color(0, 102, 204);
        jPanelUsuarios.setBackground(colorRgb);
    }//GEN-LAST:event_btnUsuariosMouseEntered

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseExited
        // TODO add your handling code here:
        Color colorRgb= new Color(0,51,102);
        jPanelClientes.setBackground(colorRgb);
    }//GEN-LAST:event_btnClientesMouseExited

    private void btnClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseEntered
        // TODO add your handling code here:
        Color colorRgb= new Color(0, 102, 204);
        jPanelClientes.setBackground(colorRgb);
    }//GEN-LAST:event_btnClientesMouseEntered

    private void btnCasasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCasasActionPerformed

    private void btnCasasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCasasMouseExited
        // TODO add your handling code here:
        Color colorRgb= new Color(0,51,102);
        jPanelCasas.setBackground(colorRgb);
    }//GEN-LAST:event_btnCasasMouseExited

    private void btnCasasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCasasMouseEntered
        // TODO add your handling code here:
        Color colorRgb= new Color(0, 102, 204);
        jPanelCasas.setBackground(colorRgb);

    }//GEN-LAST:event_btnCasasMouseEntered
    //Método para colocar imagen, da error los jLabel, por eso se tuvo que hacer cada uno manual
    private void setImageSesion(){
        Icon iconoImagen = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/Logout.png")).getImage().getScaledInstance(40,40, 0));
        jLabelSesion.setIcon(iconoImagen);
    };
    
    
    private void setImageCliente(){
        Icon iconoImagen = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/cliente.png")).getImage().getScaledInstance(40,40, 0));
        jLabelClientes.setIcon(iconoImagen);  
    };
     
    
    private void setImageUsuario(){
        Icon iconoImagen = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/gestion.png")).getImage().getScaledInstance(40,40, 0));
        jLabelUsers.setIcon(iconoImagen);
    };
    
    private void setImageCasa(){
        Icon iconoImagen = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/casa.png")).getImage().getScaledInstance(40,40, 0));
        jLabelCasas.setIcon(iconoImagen);
    };
    
    
    private void setImageMenu(){
        Icon iconoImagen = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/menu.png")).getImage().getScaledInstance(40,40, 0));
        jLabelMenu.setIcon(iconoImagen);
    };
    
    
    
    public void transparenciaBtn(){
        
        btnMenu.setOpaque(false);
        btnMenu.setContentAreaFilled(false);
        btnMenu.setBorderPainted(false);
        
        btnCasas.setOpaque(false);
        btnCasas.setContentAreaFilled(false);
        btnCasas.setBorderPainted(false);
        
        btnClientes.setOpaque(false);
        btnClientes.setContentAreaFilled(false);
        btnClientes.setBorderPainted(false);
        
        btnUsuarios.setOpaque(false);
        btnUsuarios.setContentAreaFilled(false);
        btnUsuarios.setBorderPainted(false);
        
        btnSesion.setOpaque(false);
        btnSesion.setContentAreaFilled(false);
        btnSesion.setBorderPainted(false);
    };

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCasas;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnSesion;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCasas;
    private javax.swing.JLabel jLabelClientes;
    private javax.swing.JLabel jLabelMenu;
    private javax.swing.JLabel jLabelSesion;
    private javax.swing.JLabel jLabelUsers;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelCasas;
    private javax.swing.JPanel jPanelClientes;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelSesion;
    private javax.swing.JPanel jPanelUsuarios;
    // End of variables declaration//GEN-END:variables
}
