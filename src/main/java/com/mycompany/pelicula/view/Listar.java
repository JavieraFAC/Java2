
package com.mycompany.pelicula.view;

import com.mycompany.pelicula.view.model.Pelicula;
import com.mycompany.pelicula.view.model.controller.PeliculaController;
import com.mycompany.pelicula.view.model.controller.DataSourceSample;
import com.mycompany.pelicula.view.model.Pelicula;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import javax.swing.JOptionPane;


public class Listar extends javax.swing.JFrame {

    public Listar(DataSourceSample conn)throws SQLException {
        initComponents();
        this.conector = conn;
        this.conector.setConn(conn.getConn());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelListar = new javax.swing.JLabel();
        jButtonVolverListar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelListar.setFont(new java.awt.Font("AGRESSIVE", 0, 18)); // NOI18N
        jLabelListar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelListar.setText("LISTAR PELICULAS");

        jButtonVolverListar.setText("VOLVER");
        jButtonVolverListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelListar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jButtonVolverListar)
                .addContainerGap(160, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelListar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                .addComponent(jButtonVolverListar)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverListarActionPerformed
        Pantalla pantalla;
        try {
            pantalla = new Pantalla(this.conector);
            pantalla.setVisible(true);
            pantalla.setLocationRelativeTo(null);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(AgregarPelicula.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonVolverListarActionPerformed

    protected Connection conexionOCI;
    protected DataSourceSample conector;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVolverListar;
    private javax.swing.JLabel jLabelListar;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
