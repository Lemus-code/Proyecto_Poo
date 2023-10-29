/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hgrgroup;
import Clases.*;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Familia
 */
public class CasasLandingPage extends javax.swing.JFrame {
    private SharedData shareData;
    private DefaultTableModel modelo;
    /**
     * Creates new form CasasLandingPage
     */
    public CasasLandingPage(SharedData data) {
        initComponents();
        this.shareData = data;
        this.modelo = new DefaultTableModel();
        transparencia(btnRegresar);
        this.setSize(1520, 480);
        
         // Habilitar selección de celdas y filas
        jTablaCasas.setCellSelectionEnabled(true);
        jTablaCasas.setColumnSelectionAllowed(false);
        jTablaCasas.setRowSelectionAllowed(true);

        //Calculamos costo total
        calcularCostoTotal();
        //Columnas
        modelo.addColumn("Cliente");
        modelo.addColumn("Código");
        modelo.addColumn("Fase Construcción");
        modelo.addColumn("Costo Base");
        modelo.addColumn("Modificaciones");
        modelo.addColumn("Costo Modificaciones");
        modelo.addColumn("Adons");
        modelo.addColumn("Costo Adons");
        modelo.addColumn("Costo Final");
        modelo.addColumn("Fecha Entrega");
        mostrarCasas();
        
        jTablaCasas.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            int row = jTablaCasas.rowAtPoint(e.getPoint());
            int column = jTablaCasas.columnAtPoint(e.getPoint());
            if (e.getClickCount() == 2 && column == getColumnIndex("Modificaciones") && row != -1) {
                jTablaCasas.clearSelection();
                // Selecciona solo la celda específica
                jTablaCasas.setColumnSelectionAllowed(true);
                jTablaCasas.setRowSelectionAllowed(true);
                jTablaCasas.changeSelection(row, column, false, false);
                mostrarModificiones();

            }else if(e.getClickCount() == 2 && column == getColumnIndex("Adons") && row != -1){ 
                jTablaCasas.clearSelection();
                // Selecciona solo la celda específica
                jTablaCasas.setColumnSelectionAllowed(true);
                jTablaCasas.setRowSelectionAllowed(true);
                jTablaCasas.changeSelection(row, column, false, false);
                mostrarAddons();
                
            }else {
                 jTablaCasas.clearSelection();
                 jTablaCasas.addRowSelectionInterval(row, row);
            }
            }
        });
        jTablaCasas.setModel(modelo);
        //Desactivar edición
        desactivarCeldas();
        
    }

    public SharedData getSharedData() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaCasas = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        label3 = new java.awt.Label();
        jPanelRegresar = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();
        jLabelRegresar = new javax.swing.JLabel();
        txtFieldBuscar = new java.awt.TextField();
        btnBuscar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTablaCasas.setBackground(new java.awt.Color(255, 255, 255));
        jTablaCasas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTablaCasas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Código Casa", "Fax", "Costo", "Modificaciones ", "Fecha Entrega"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablaCasas);
        if (jTablaCasas.getColumnModel().getColumnCount() > 0) {
            jTablaCasas.getColumnModel().getColumn(1).setPreferredWidth(10);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 1360, 260));

        jPanel4.setBackground(new java.awt.Color(0, 51, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("CASAS");
        jPanel4.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, 20));

        jPanelRegresar.setBackground(new java.awt.Color(0, 51, 102));

        btnRegresar.setBackground(new java.awt.Color(0, 51, 102));
        btnRegresar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Regresar");
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegresarMouseExited(evt);
            }
        });
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabelRegresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N

        javax.swing.GroupLayout jPanelRegresarLayout = new javax.swing.GroupLayout(jPanelRegresar);
        jPanelRegresar.setLayout(jPanelRegresarLayout);
        jPanelRegresarLayout.setHorizontalGroup(
            jPanelRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegresarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelRegresar)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelRegresarLayout.setVerticalGroup(
            jPanelRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegresarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelRegresarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelRegresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanelRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 60));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 460));

        txtFieldBuscar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPanel1.add(txtFieldBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 126, 250, 23));

        btnBuscar.setBackground(new java.awt.Color(0, 51, 102));
        btnBuscar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 126, -1, -1));

        btnModificar.setBackground(new java.awt.Color(0, 51, 102));
        btnModificar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 90, 32));

        btnEliminar.setBackground(new java.awt.Color(0, 51, 102));
        btnEliminar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 90, 32));

        btnMostrar.setBackground(new java.awt.Color(0, 51, 102));
        btnMostrar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnMostrar.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrar.setText("Mostrar Todo");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 85, -1, 31));

        btnAgregar.setBackground(new java.awt.Color(0, 51, 102));
        btnAgregar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 90, 31));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void mostrarModificiones(){
           int fila = jTablaCasas.getSelectedRow();
           Object valor = jTablaCasas.getValueAt(fila,0);
            ModificacionesLandingPage pageModi = new ModificacionesLandingPage(getSharedData(), (String) valor);
            this.setVisible(false);
            pageModi.setVisible(true);
    }
    
     private void mostrarAddons(){
           int fila = jTablaCasas.getSelectedRow();
           Object valor = jTablaCasas.getValueAt(fila,0);
           AddonsLandingPage pageModi = new AddonsLandingPage(getSharedData(), (String) valor);
           this.setVisible(false);
           pageModi.setVisible(true);
    }
    
    
    private int getColumnIndex(String columnName) {
        return jTablaCasas.getColumnModel().getColumnIndex(columnName);
    }
    
    
    private void transparencia(JButton btn){
        btn.setOpaque(false);
        btn.setContentAreaFilled(false);
        btn.setBorderPainted(false);
    };
    
    private void desactivarCeldas(){
        for (int i = 0; i < modelo.getColumnCount(); i++) {
            Class<?> colClass = modelo.getColumnClass(i); //Toma el tipo de dato que tiene una columna, por eso el genérico
            this.jTablaCasas.setDefaultEditor(colClass, null); // Esto deshabilita la edición
        }
    };
    private void calcularCostoTotal(){
        for(int i = 0; i < shareData.getCasas().size(); i++){
            shareData.getCasas().get(i).calcularCostoFinal();
        };
    }
    private void mostrarCasas(){   
        modelo.setRowCount(0);
        for(int i = 0; i < shareData.getCasas().size(); i++){
            String [] row = new String[10];
            row[0] = shareData.getCasas().get(i).getNombreCliente();
            row[1] = shareData.getCasas().get(i).getCodigo();
            row[2] = shareData.getCasas().get(i).getFaseConstru();
            row[3] = String.valueOf(shareData.getCasas().get(i).getCostoBase());
            row[5] = String.valueOf(shareData.getCasas().get(i).getCostoModificaciones());
            row[4] = String.valueOf(shareData.getCasas().get(i).getModificaciones().size());
            row[7] = String.valueOf(shareData.getCasas().get(i).getCostoAdons());
            row[6] = String.valueOf(shareData.getCasas().get(i).getAddons().size());
            row[8] = String.valueOf(shareData.getCasas().get(i).getCostoFinal());
            row[9] = String.valueOf(shareData.getCasas().get(i).getFechaEntrega());
            modelo.addRow(row);
        };
    } 
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        boolean encontrado = false;
        for(int i = 0; i < shareData.getUsuarios().size(); i++){
            if(txtFieldBuscar.getText().equals(shareData.getCasas().get(i).getNombreCliente())){
                modelo.setRowCount(0);
                String [] row = new String[10];
                row[0] = shareData.getCasas().get(i).getNombreCliente();
                row[1] = shareData.getCasas().get(i).getCodigo();
                row[2] = shareData.getCasas().get(i).getFaseConstru();
                row[3] = String.valueOf(shareData.getCasas().get(i).getCostoBase());
                row[5] = String.valueOf(shareData.getCasas().get(i).getCostoModificaciones());
                row[4] = String.valueOf(shareData.getCasas().get(i).getModificaciones().size());
                row[7] = String.valueOf(shareData.getCasas().get(i).getCostoAdons());
                row[6] = String.valueOf(shareData.getCasas().get(i).getAddons().size());
                row[8] = String.valueOf(shareData.getCasas().get(i).getCostoFinal());
                row[9] = String.valueOf(shareData.getCasas().get(i).getFechaEntrega());
                modelo.addRow(row);
                encontrado = true;
            }
        };
        
        if(encontrado != true){
            JOptionPane.showMessageDialog(null, "Usuario Inexistente", "Error",JOptionPane.ERROR_MESSAGE);  
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseEntered
        Color colorRgb= new Color(0, 102, 204);
        jPanelRegresar.setBackground(colorRgb);
    }//GEN-LAST:event_btnRegresarMouseEntered

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        MenuPrincipal menu = new MenuPrincipal(getSharedData());
        this.setVisible(false);
        menu.setVisible(true);
        
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseExited
        // TODO add your handling code here:
        Color colorRgb= new Color(0,51,102);
        jPanelRegresar.setBackground(colorRgb);
    }//GEN-LAST:event_btnRegresarMouseExited

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        int fila = jTablaCasas.getSelectedRow();
        try{
            Object valor = jTablaCasas.getValueAt(fila,0);
            ModificarCasa modiPage = new ModificarCasa(getSharedData(), (String) valor); //Convierto valor a String
            modiPage.setVisible(true);
            this.setVisible(false);
            
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Seleccione una fila para modificar", "Error",JOptionPane.ERROR_MESSAGE);
        };
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int fila = jTablaCasas.getSelectedRow();
        if(fila >= 0){
            modelo.removeRow(fila);
             // Eliminar el elemento de la lista shareData.getCasas
            if (fila < shareData.getCasas().size()) {
                shareData.getCasas().remove(fila);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar", "Error",JOptionPane.ERROR_MESSAGE);
        };
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        // TODO add your handling code here:
        mostrarCasas();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        AgregarCasa pageCasa = new AgregarCasa(getSharedData());
        this.setVisible(false);
        pageCasa.setVisible(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabelRegresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaCasas;
    private java.awt.Label label3;
    private java.awt.TextField txtFieldBuscar;
    // End of variables declaration//GEN-END:variables
}
