
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
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class Modificar extends javax.swing.JFrame {
    private int id;
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

        jPanel1.setBackground(new java.awt.Color(225, 225, 246));

        jLabelModificar.setFont(new java.awt.Font("AGRESSIVE", 0, 18)); // NOI18N
        jLabelModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelModificar.setText("MODIFICAR PELICULA");
        jLabelModificar.setLocation(new java.awt.Point(-32627, -32741));

        jButtonVolverMod.setBackground(new java.awt.Color(245, 245, 179));
        jButtonVolverMod.setText("VOLVER");
        jButtonVolverMod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButtonVolverMod.setOpaque(true);
        jButtonVolverMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverModActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingresa el Nombre de la pelicula que deseas modificar");

        jTextFieldNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 204)));
        jTextFieldNombre.setCaretColor(new java.awt.Color(102, 51, 255));
        jTextFieldNombre.setLocation(new java.awt.Point(-32613, -32655));
        jTextFieldNombre.setMaximumSize(new java.awt.Dimension(64, 23));
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyTyped(evt);
            }
        });

        jLabelIDEliminar.setText("NOMBRE :");

        jButtonBuscar.setBackground(new java.awt.Color(153, 153, 255));
        jButtonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscar.setText("BUSCAR");
        jButtonBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonBuscar.setOpaque(true);
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jTextFieldDirector.setBackground(new java.awt.Color(234, 234, 234));
        jTextFieldDirector.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldDirector.setLocation(new java.awt.Point(-32613, -32655));
        jTextFieldDirector.setMaximumSize(new java.awt.Dimension(64, 23));
        jTextFieldDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDirectorActionPerformed(evt);
            }
        });
        jTextFieldDirector.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDirectorKeyTyped(evt);
            }
        });

        jTextFieldAnno.setBackground(new java.awt.Color(234, 234, 234));
        jTextFieldAnno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldAnno.setLocation(new java.awt.Point(-32613, -32655));
        jTextFieldAnno.setMaximumSize(new java.awt.Dimension(64, 23));
        jTextFieldAnno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAnnoActionPerformed(evt);
            }
        });
        jTextFieldAnno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAnnoKeyTyped(evt);
            }
        });

        jTextFieldDuracion.setBackground(new java.awt.Color(234, 234, 234));
        jTextFieldDuracion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldDuracion.setLocation(new java.awt.Point(-32613, -32655));
        jTextFieldDuracion.setMaximumSize(new java.awt.Dimension(64, 23));
        jTextFieldDuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDuracionActionPerformed(evt);
            }
        });
        jTextFieldDuracion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDuracionKeyTyped(evt);
            }
        });

        jLabelIDEliminar1.setText("DIRECTOR :");

        jLabelIDEliminar2.setText("AÑO :");

        jLabelIDEliminar3.setText("DURACION :");

        jTextFieldGenero.setBackground(new java.awt.Color(234, 234, 234));
        jTextFieldGenero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldGenero.setLocation(new java.awt.Point(-32613, -32655));
        jTextFieldGenero.setMaximumSize(new java.awt.Dimension(64, 23));
        jTextFieldGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGeneroActionPerformed(evt);
            }
        });
        jTextFieldGenero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldGeneroKeyTyped(evt);
            }
        });

        jLabelIDEliminar4.setText("GENERO :");

        jButtonModificar.setBackground(new java.awt.Color(156, 235, 255));
        jButtonModificar.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButtonModificar.setText("MODIFICAR");
        jButtonModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 204)));
        jButtonModificar.setOpaque(true);
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
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIDEliminar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelIDEliminar1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelIDEliminar2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelIDEliminar3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelIDEliminar4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAnno, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jButtonVolverMod, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelModificar)
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelIDEliminar)))
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
                .addGap(18, 18, 18)
                .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButtonVolverMod, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
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

    private void jButtonVolverModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverModActionPerformed
        Pantalla pantalla;
        try {
            pantalla = new Pantalla(this.conector);
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
            Logger.getLogger(Modificar.class.getName()).log(Level.SEVERE, null, ex);
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
             if ((Integer.parseInt(this.jTextFieldAnno.getText()) < 1900)) {
            JOptionPane.showMessageDialog(null, "El año debe ser mayor a 1900", "error", JOptionPane.ERROR_MESSAGE);
        } else {

            // validar datos vacios
            if (jTextFieldNombre.getText().isEmpty()
                    || jTextFieldDirector.getText().isEmpty()
                    || jTextFieldAnno.getText().isEmpty()
                    || jTextFieldDuracion.getText().isEmpty()
                    || jTextFieldGenero.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Se deben rellenar todos los campos", "error", JOptionPane.ERROR_MESSAGE);
            } else {

                Pelicula peliculaNueva = new Pelicula();
                System.out.println(id);
                peliculaNueva.setId(id);
                peliculaNueva.setNombre(jTextFieldNombre.getText());
                peliculaNueva.setDirector(jTextFieldDirector.getText());
                peliculaNueva.setAnno(Integer.valueOf(jTextFieldAnno.getText()));
                peliculaNueva.setDuracion(Integer.valueOf(jTextFieldDuracion.getText()));
                peliculaNueva.setGenero(jTextFieldGenero.getText());

                PeliculaController controlador = new PeliculaController();
                JOptionPane.showMessageDialog(null, "Se modifico la pelicula:  " + peliculaNueva.getNombre());
                        jTextFieldNombre.setText("");
                        jTextFieldDirector.setText("");
                        jTextFieldAnno.setText("");
                        jTextFieldDuracion.setText("");
                        jTextFieldGenero.setText("");
                
                try {
                    controlador.modificarPeliculaController(peliculaNueva, this.conector.getConn());
                } catch (SQLException ex) {
                    Logger.getLogger(AgregarPelicula.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed

    
    // -------------VALIDACIONES ---------------
    private void jTextFieldDirectorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDirectorKeyTyped
        Character c = evt.getKeyChar();
        if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE && !Character.isDigit(c)) {
            evt.consume();
        }
        if (jTextFieldDirector.getText().length() == 100) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldDirectorKeyTyped

    private void jTextFieldAnnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAnnoKeyTyped
        Character c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
        if (jTextFieldAnno.getText().length() == 4) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldAnnoKeyTyped

    private void jTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyTyped
        Character c = evt.getKeyChar();
        if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE && !Character.isDigit(c)) {
            evt.consume();

        }
        if (jTextFieldNombre.getText().length() == 250) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNombreKeyTyped

    private void jTextFieldDuracionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDuracionKeyTyped
        Character c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
        if (jTextFieldDuracion.getText().length() == 3) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldDuracionKeyTyped

    private void jTextFieldGeneroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldGeneroKeyTyped
        Character c = evt.getKeyChar();
        if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE && !Character.isDigit(c)) {
            evt.consume();
        }
        if (jTextFieldGenero.getText().length() == 100) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldGeneroKeyTyped

    // -------------------BOTONES -------------
    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // tirar por pantalla 
        System.out.println("Nombre pelicula :" + jTextFieldNombre.getText());
        System.out.println("Director: " + jTextFieldDirector.getText());
        System.out.println("Año: " + jTextFieldAnno.getText());
        System.out.println("Duracion: " + jTextFieldDuracion.getText());
        System.out.println("Genero: " + jTextFieldGenero.getText());

        // AGREGAR a lista peliculas
        // validar año mayor a 1900
        if ((Integer.parseInt(this.jTextFieldAnno.getText()) < 1900)) {
            JOptionPane.showMessageDialog(null, "El año debe ser mayor a 1900", "error", JOptionPane.ERROR_MESSAGE);
        } else {

            // validar datos vacios
            if (jTextFieldNombre.getText().isEmpty()
                    || jTextFieldDirector.getText().isEmpty()
                    || jTextFieldAnno.getText().isEmpty()
                    || jTextFieldDuracion.getText().isEmpty()
                    || jTextFieldGenero.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Se deben rellenar todos los campos", "error", JOptionPane.ERROR_MESSAGE);
            } else {
                Pelicula peliculaNueva = new Pelicula();
                peliculaNueva.setNombre(jTextFieldNombre.getText());
                peliculaNueva.setDirector(jTextFieldDirector.getText());
                peliculaNueva.setAnno(Integer.valueOf(jTextFieldAnno.getText()));
                peliculaNueva.setDuracion(Integer.valueOf(jTextFieldDuracion.getText()));
                peliculaNueva.setGenero(jTextFieldGenero.getText());

                PeliculaController controlador = new PeliculaController();
                JOptionPane.showMessageDialog(null, "Se agrego la pelicula:  " + peliculaNueva.getNombre());
                // limpiar campos
                jTextFieldNombre.setText("");
                jTextFieldDirector.setText("");
                jTextFieldAnno.setText("");
                jTextFieldDuracion.setText("");
                jTextFieldGenero.setText("");

                try {
                    controlador.agregarPeliculaController(peliculaNueva, this.conector.getConn());

                } catch (SQLException ex) {
                    Logger.getLogger(AgregarPelicula.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }


    }                                              

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {                                              
        Pantalla pantalla;
        try {
            pantalla = new Pantalla(this.conector);
            pantalla.setVisible(true);
            pantalla.setLocationRelativeTo(null);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(AgregarPelicula.class.getName()).log(Level.SEVERE, null, ex);
        }

    }                                             
                                             

    
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
