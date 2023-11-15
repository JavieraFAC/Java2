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


public class EliminarPelicula extends javax.swing.JFrame {

    private int id;
    public EliminarPelicula(DataSourceSample conn) throws SQLException {
        initComponents();
        this.conector = conn;
        this.conector.setConn(conn.getConn());
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelEliminarPelicula = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelIDEliminar = new javax.swing.JLabel();
        jButtonEliminar = new javax.swing.JButton();
        jButtonVolver2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        jTextFieldDirector = new javax.swing.JTextField();
        jTextFieldAnno = new javax.swing.JTextField();
        jTextFieldDuracion = new javax.swing.JTextField();
        jTextFieldGenero = new javax.swing.JTextField();
        jLabelIDEliminar1 = new javax.swing.JLabel();
        jLabelIDEliminar2 = new javax.swing.JLabel();
        jLabelIDEliminar3 = new javax.swing.JLabel();
        jLabelIDEliminar4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(199, 227, 255));

        jLabelEliminarPelicula.setFont(new java.awt.Font("AGRESSIVE", 0, 18)); // NOI18N
        jLabelEliminarPelicula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEliminarPelicula.setText("ELIMINAR PELICULA");
        jLabelEliminarPelicula.setLocation(new java.awt.Point(-32627, -32741));

        jTextFieldNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNombre.setMaximumSize(new java.awt.Dimension(64, 23));

        jLabelIDEliminar.setText("NOMBRE :");

        jButtonEliminar.setBackground(new java.awt.Color(156, 235, 255));
        jButtonEliminar.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButtonEliminar.setText("ELIMINAR");
        jButtonEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 204)));
        jButtonEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonEliminar.setMaximumSize(new java.awt.Dimension(150, 23));
        jButtonEliminar.setMinimumSize(new java.awt.Dimension(150, 150));
        jButtonEliminar.setOpaque(true);
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonVolver2.setBackground(new java.awt.Color(245, 245, 179));
        jButtonVolver2.setText("VOLVER");
        jButtonVolver2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButtonVolver2.setOpaque(true);
        jButtonVolver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolver2ActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingresa el Nombre de la pelicula que quieres eliminar");

        jButtonBuscar.setBackground(new java.awt.Color(153, 153, 255));
        jButtonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscar.setText("BUSCAR");
        jButtonBuscar.setOpaque(true);
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jTextFieldDirector.setBackground(new java.awt.Color(234, 234, 234));
        jTextFieldDirector.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldDirector.setMaximumSize(new java.awt.Dimension(64, 23));

        jTextFieldAnno.setBackground(new java.awt.Color(234, 234, 234));
        jTextFieldAnno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldAnno.setMaximumSize(new java.awt.Dimension(64, 23));

        jTextFieldDuracion.setBackground(new java.awt.Color(234, 234, 234));
        jTextFieldDuracion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldDuracion.setMaximumSize(new java.awt.Dimension(64, 23));

        jTextFieldGenero.setBackground(new java.awt.Color(234, 234, 234));
        jTextFieldGenero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldGenero.setMaximumSize(new java.awt.Dimension(64, 23));

        jLabelIDEliminar1.setText("AÑO :");

        jLabelIDEliminar2.setText("DIRECTOR :");

        jLabelIDEliminar3.setText("DURACION :");

        jLabelIDEliminar4.setText("GENERO :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelEliminarPelicula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelIDEliminar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelIDEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelIDEliminar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAnno, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelIDEliminar3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelIDEliminar4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBuscar)
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jButtonVolver2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabelEliminarPelicula)
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar)
                    .addComponent(jLabelIDEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIDEliminar2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAnno, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIDEliminar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIDEliminar3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIDEliminar4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonVolver2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

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

    private void jButtonVolver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolver2ActionPerformed
        Pantalla pantalla;
        try {
            pantalla = new Pantalla(this.conector);
            pantalla.setVisible(true);
            pantalla.setLocationRelativeTo(null);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(AgregarPelicula.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonVolver2ActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        Pelicula peliculaEliminar = new Pelicula();
        System.out.println(id);
        peliculaEliminar.setId(id); 
        peliculaEliminar.setNombre(null);
        peliculaEliminar.setDirector(null);
        peliculaEliminar.setAnno(Integer.valueOf(null));
        peliculaEliminar.setDuracion(Integer.valueOf(null));
        peliculaEliminar.setGenero(null);
        
        PeliculaController controlador = new PeliculaController();
        JOptionPane.showMessageDialog(null, "SE ElIMINÓ LA PELICULA : " + peliculaEliminar.getNombre());
        try{
            controlador.modificarPeliculaController(peliculaEliminar,this.conector.getConn());       
        }  catch (SQLException ex) {
            Logger.getLogger(AgregarPelicula.class.getName()).log(Level.SEVERE, null, ex);
        }    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        Pelicula pelicula = new Pelicula();
        pelicula.setNombre(jTextFieldNombre.getText());
        
        PeliculaController controlador = new PeliculaController();
        try{
            boolean flag = controlador.buscarPeliculaController(pelicula, this.conector.getConn());
            if (flag== true){
                id = pelicula.getId(); 
                System.out.println(id);
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

    protected Connection conexionOCI;
    protected DataSourceSample conector;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonVolver2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEliminarPelicula;
    private javax.swing.JLabel jLabelIDEliminar;
    private javax.swing.JLabel jLabelIDEliminar1;
    private javax.swing.JLabel jLabelIDEliminar2;
    private javax.swing.JLabel jLabelIDEliminar3;
    private javax.swing.JLabel jLabelIDEliminar4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAnno;
    private javax.swing.JTextField jTextFieldDirector;
    private javax.swing.JTextField jTextFieldDuracion;
    private javax.swing.JTextField jTextFieldGenero;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
