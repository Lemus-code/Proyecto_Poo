/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Formularios;

/**
 *
 * @author uriel
 */
public class InformacionClientes extends javax.swing.JPanel {

    /**
     * Creates new form UsuariosLandingPage
     */
    public InformacionClientes() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        textField1 = new java.awt.TextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setText("Regresar");
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 40));

        label2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("CLIENTES");
        jPanel3.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        label3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("INFORMACIÓN");
        jPanel3.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        label4.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("DE LOS");
        jPanel3.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 450));

        jButton2.setBackground(new java.awt.Color(0, 51, 102));
        jButton2.setText("Mostrar Todo");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 85, -1, 31));

        jButton3.setBackground(new java.awt.Color(0, 51, 102));
        jButton3.setText("Agregar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 85, 81, 31));

        jButton4.setBackground(new java.awt.Color(0, 51, 102));
        jButton4.setText("Modificar");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 122, -1, 32));

        jButton5.setBackground(new java.awt.Color(0, 51, 102));
        jButton5.setText("Eliminar");
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 160, 81, 32));

        jButton6.setBackground(new java.awt.Color(0, 51, 102));
        jButton6.setText("Buscar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 126, -1, -1));
        jPanel1.add(textField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 126, 250, 23));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Email", "Teléfono", "Casas Asociadas", "Saldo Pendiente", "Pago Realizado", "Total "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 540, 190));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
