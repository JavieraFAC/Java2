
package com.mycompany.pelicula.view;

import com.mycompany.pelicula.view.model.Pelicula;
import com.mycompany.pelicula.view.model.controller.PeliculaController;
import com.mycompany.pelicula.view.model.controller.DataSourceSample;
import com.mycompany.pelicula.view.model.Pelicula;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import javax.swing.JOptionPane;


public class Pantalla extends javax.swing.JFrame {

    public Pantalla() throws SQLException {
        initComponents();
        this.conector = new DataSourceSample();
        this.conector.crearConexion();

    }
    public Pantalla(DataSourceSample conn) throws SQLException {
        initComponents();
        this.conector = new DataSourceSample();
        this.conector.setConn(conn.getConn());


    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBienvenido = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuPelicula = new javax.swing.JMenu();
        jMenuItemAgregar = new javax.swing.JMenuItem();
        jMenuItemModificar = new javax.swing.JMenuItem();
        jMenuItemEliminar = new javax.swing.JMenuItem();
        jMenuItemListar = new javax.swing.JMenuItem();
        jMenuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelBienvenido.setBackground(new java.awt.Color(199, 227, 255));
        jPanelBienvenido.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("AGRESSIVE", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BIENVENIDO");

        jLabel2.setFont(new java.awt.Font("AGRESSIVE", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 102, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("al himalaya");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel3.setFont(new java.awt.Font("Muro", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CENTRO DE PELICULAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelBienvenidoLayout = new javax.swing.GroupLayout(jPanelBienvenido);
        jPanelBienvenido.setLayout(jPanelBienvenidoLayout);
        jPanelBienvenidoLayout.setHorizontalGroup(
            jPanelBienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBienvenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelBienvenidoLayout.setVerticalGroup(
            jPanelBienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBienvenidoLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));

        jMenuPelicula.setBackground(new java.awt.Color(204, 204, 255));
        jMenuPelicula.setText("Pelicula");
        jMenuPelicula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuPelicula.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuPelicula.setPreferredSize(new java.awt.Dimension(70, 20));

        jMenuItemAgregar.setBackground(new java.awt.Color(204, 204, 255));
        jMenuItemAgregar.setText("Agregar");
        jMenuItemAgregar.setOpaque(true);
        jMenuItemAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgregarActionPerformed(evt);
            }
        });
        jMenuPelicula.add(jMenuItemAgregar);

        jMenuItemModificar.setBackground(new java.awt.Color(204, 204, 255));
        jMenuItemModificar.setText("Modificar");
        jMenuItemModificar.setOpaque(true);
        jMenuItemModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemModificarActionPerformed(evt);
            }
        });
        jMenuPelicula.add(jMenuItemModificar);

        jMenuItemEliminar.setBackground(new java.awt.Color(204, 204, 255));
        jMenuItemEliminar.setText("Eliminar");
        jMenuItemEliminar.setOpaque(true);
        jMenuItemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEliminarActionPerformed(evt);
            }
        });
        jMenuPelicula.add(jMenuItemEliminar);

        jMenuItemListar.setBackground(new java.awt.Color(204, 204, 255));
        jMenuItemListar.setText("Listar");
        jMenuItemListar.setOpaque(true);
        jMenuItemListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListarActionPerformed(evt);
            }
        });
        jMenuPelicula.add(jMenuItemListar);

        jMenuBar1.add(jMenuPelicula);

        jMenuAyuda.setBorder(null);
        jMenuAyuda.setText("Ayuda");
        jMenuAyuda.setAlignmentX(1.0F);
        jMenuAyuda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuAyuda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuAyuda.setPreferredSize(new java.awt.Dimension(50, 20));
        jMenuBar1.add(jMenuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgregarActionPerformed
        
        AgregarPelicula agregarPeli;
        try {
            agregarPeli = new AgregarPelicula(this.conector);
            agregarPeli.setVisible(true);
            agregarPeli.setLocationRelativeTo(null);
            agregarPeli.setSize(400,500);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Pantalla.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jMenuItemAgregarActionPerformed

    private void jMenuItemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEliminarActionPerformed
        EliminarPelicula eliminarPeli;
        try{
            eliminarPeli = new EliminarPelicula(this.conector);
            eliminarPeli.setVisible(true);
            eliminarPeli.setSize(400,500);
            eliminarPeli.setLocationRelativeTo(null);
        this.setVisible(false);
        }catch(SQLException ex){
             Logger.getLogger(Pantalla.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jMenuItemEliminarActionPerformed

    private void jMenuItemModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemModificarActionPerformed
        Modificar modificarPeli;
        try{
            modificarPeli = new Modificar(this.conector);
            modificarPeli.setVisible(true);
            modificarPeli.setSize(400,500);
            modificarPeli.setLocationRelativeTo(null);
            this.setVisible(false);
        }catch(SQLException ex){
             Logger.getLogger(Pantalla.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jMenuItemModificarActionPerformed

    private void jMenuItemListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListarActionPerformed
        
        Listar listarPeli;
        try {
            listarPeli = new Listar(this.conector);
            listarPeli.setVisible(true);
            listarPeli.setSize(400,500);
            listarPeli.setLocationRelativeTo(null);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Pantalla.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItemListarActionPerformed

    protected Connection conexionOCI;
    protected DataSourceSample conector;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenuAyuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAgregar;
    private javax.swing.JMenuItem jMenuItemEliminar;
    private javax.swing.JMenuItem jMenuItemListar;
    private javax.swing.JMenuItem jMenuItemModificar;
    private javax.swing.JMenu jMenuPelicula;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBienvenido;
    // End of variables declaration//GEN-END:variables
}
