/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pelicula.view;

import com.mycompany.pelicula.view.model.Pelicula;
import com.mycompany.pelicula.view.model.controller.PeliculaController;
import com.mycompany.pelicula.view.model.controller.DataSourceSample;
import com.mycompany.pelicula.view.model.PeliculaDTO;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;


public class Modificar extends javax.swing.JFrame {

    public Modificar(DataSourceSample conn) throws SQLException {
        initComponents();
        this.conector = conn;
        this.conector.setConn(conn.getConn());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelModificar = new javax.swing.JLabel();
        jButtonVolverMod = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelIDEliminar = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        jTextFieldDirector = new javax.swing.JTextField();
        jTextFieldAnno = new javax.swing.JTextField();
        jTextFieldDuracion = new javax.swing.JTextField();
        jLabelIDEliminar1 = new javax.swing.JLabel();
        jLabelIDEliminar2 = new javax.swing.JLabel();
        jLabelIDEliminar3 = new javax.swing.JLabel();
        jTextFieldGenero = new javax.swing.JTextField();
        jLabelIDEliminar4 = new javax.swing.JLabel();
        jButtonModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelModificar.setFont(new java.awt.Font("AGRESSIVE", 0, 13)); // NOI18N
        jLabelModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelModificar.setText("MODIFICAR PELICULA");
        jLabelModificar.setLocation(new java.awt.Point(-32627, -32741));

        jButtonVolverMod.setText("VOLVER");
        jButtonVolverMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverModActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingresa el Nombre de la pelicula que deseas modificar");

        jTextFieldNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNombre.setLocation(new java.awt.Point(-32613, -32655));
        jTextFieldNombre.setMaximumSize(new java.awt.Dimension(64, 23));
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });

        jLabelIDEliminar.setText("Nombre:");

        jButtonBuscar.setText("BUSCAR");
        jButtonBuscar.setActionCommand("BUSCAR");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jTextFieldDirector.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldDirector.setLocation(new java.awt.Point(-32613, -32655));
        jTextFieldDirector.setMaximumSize(new java.awt.Dimension(64, 23));
        jTextFieldDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDirectorActionPerformed(evt);
            }
        });

        jTextFieldAnno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldAnno.setLocation(new java.awt.Point(-32613, -32655));
        jTextFieldAnno.setMaximumSize(new java.awt.Dimension(64, 23));
        jTextFieldAnno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAnnoActionPerformed(evt);
            }
        });

        jTextFieldDuracion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldDuracion.setLocation(new java.awt.Point(-32613, -32655));
        jTextFieldDuracion.setMaximumSize(new java.awt.Dimension(64, 23));
        jTextFieldDuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDuracionActionPerformed(evt);
            }
        });

        jLabelIDEliminar1.setText("Director:");

        jLabelIDEliminar2.setText("Año:");

        jLabelIDEliminar3.setText("Duracion:");

        jTextFieldGenero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldGenero.setLocation(new java.awt.Point(-32613, -32655));
        jTextFieldGenero.setMaximumSize(new java.awt.Dimension(64, 23));
        jTextFieldGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGeneroActionPerformed(evt);
            }
        });

        jLabelIDEliminar4.setText("Genero:");

        jButtonModificar.setText("MODIFICAR");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIDEliminar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelIDEliminar1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelIDEliminar2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelIDEliminar3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelIDEliminar4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAnno, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBuscar)))
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jButtonVolverMod))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jButtonModificar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelModificar)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIDEliminar)
                    .addComponent(jButtonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIDEliminar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAnno, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIDEliminar2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIDEliminar3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIDEliminar4))
                .addGap(32, 32, 32)
                .addComponent(jButtonModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jButtonVolverMod)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverModActionPerformed
        Pantalla pantalla;
        try {
            pantalla = new Pantalla();
            pantalla.setVisible(true);
            pantalla.setLocationRelativeTo(null);
        this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Modificar.class.getName()).log(Level.SEVERE, null, ex);
        }

       }//GEN-LAST:event_jButtonVolverModActionPerformed

    
    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        
        
        Pelicula pelicula = new Pelicula();
        pelicula.setNombre(jTextFieldNombre.getText());
        
        PeliculaController controlador = new PeliculaController();
        try{
            boolean flag = controlador.buscarPeliculaController(pelicula, this.conector.getConn());
            if (flag== true){
                
                jTextFieldDirector.setText(pelicula.getDirector());
                jTextFieldAnno.setText(Integer.toString(pelicula.getAnno()));
                jTextFieldDuracion.setText(Integer.toString(pelicula.getDuracion()));
                jTextFieldGenero.setText(pelicula.getGenero());
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro la pelicula "+pelicula.getNombre());
            }
            }catch (SQLException ex) {
            Logger.getLogger(AgregarPelicula.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(pelicula.toString());
        
        

    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jTextFieldDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDirectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDirectorActionPerformed

    private void jTextFieldAnnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAnnoActionPerformed

    private void jTextFieldDuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDuracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDuracionActionPerformed

    private void jTextFieldGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldGeneroActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        Pelicula peliculaNueva = new Pelicula();
        peliculaNueva.setDirector(jTextFieldDirector.getText());
        peliculaNueva.setAnno(Integer.valueOf(jTextFieldAnno.getText()));
        peliculaNueva.setDuracion(Integer.valueOf(jTextFieldDuracion.getText()));
        peliculaNueva.setGenero(jTextFieldGenero.getText());
        
        PeliculaController controlador = new PeliculaController();
        try{
            controlador.modificarPeliculaController(peliculaNueva,this.conector.getConn());       
        }  catch (SQLException ex) {
            Logger.getLogger(AgregarPelicula.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed

    /// VALIDACIONES
    
    protected Connection conexionOCI;
    protected DataSourceSample conector;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonVolverMod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelIDEliminar;
    private javax.swing.JLabel jLabelIDEliminar1;
    private javax.swing.JLabel jLabelIDEliminar2;
    private javax.swing.JLabel jLabelIDEliminar3;
    private javax.swing.JLabel jLabelIDEliminar4;
    private javax.swing.JLabel jLabelModificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAnno;
    private javax.swing.JTextField jTextFieldDirector;
    private javax.swing.JTextField jTextFieldDuracion;
    private javax.swing.JTextField jTextFieldGenero;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
