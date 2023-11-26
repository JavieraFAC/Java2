
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

public class AgregarPelicula extends javax.swing.JFrame {


    public AgregarPelicula(DataSourceSample conn) throws SQLException {
        initComponents();
        this.conector = conn;
        this.conector.setConn(conn.getConn());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AgregarPelicula = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jTextFieldDirector = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldAnno = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jLabelDirector = new javax.swing.JLabel();
        jLabelAnno = new javax.swing.JLabel();
        jTextFieldDuracion = new javax.swing.JTextField();
        jLabelDuracion = new javax.swing.JLabel();
        jTextFieldGenero = new javax.swing.JTextField();
        jLabelGenero = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButtonVolver = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 400));

        jPanel1.setBackground(new java.awt.Color(199, 227, 255));

        AgregarPelicula.setFont(new java.awt.Font("AGRESSIVE", 0, 18)); // NOI18N
        AgregarPelicula.setForeground(new java.awt.Color(153, 102, 255));
        AgregarPelicula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AgregarPelicula.setText("AGREGAR PELICULA");
        AgregarPelicula.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelID.setText("ID :");

        jTextFieldDirector.setColumns(10);
        jTextFieldDirector.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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

        jTextFieldNombre.setColumns(10);
        jTextFieldNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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

        jTextFieldAnno.setColumns(10);
        jTextFieldAnno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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

        jLabelNombre.setText("NOMBRE :");

        jLabelDirector.setText("DIRECTOR :");

        jLabelAnno.setText("AÑO :");

        jTextFieldDuracion.setColumns(10);
        jTextFieldDuracion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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

        jLabelDuracion.setText("DURACION :");

        jTextFieldGenero.setColumns(10);
        jTextFieldGenero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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

        jLabelGenero.setText("GENERO :");

        jPanel3.setBackground(new java.awt.Color(199, 227, 255));

        jButtonVolver.setBackground(new java.awt.Color(245, 245, 179));
        jButtonVolver.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButtonVolver.setText("VOLVER");
        jButtonVolver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButtonVolver.setOpaque(true);
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jButtonLimpiar.setBackground(new java.awt.Color(199, 223, 199));
        jButtonLimpiar.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButtonLimpiar.setText("LIMPIAR");
        jButtonLimpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButtonLimpiar.setOpaque(true);
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jButtonAgregar.setBackground(new java.awt.Color(153, 153, 255));
        jButtonAgregar.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButtonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgregar.setText("AGREGAR");
        jButtonAgregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonAgregar.setOpaque(true);
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AgregarPelicula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelID)
                    .addComponent(jLabelNombre)
                    .addComponent(jLabelDirector)
                    .addComponent(jLabelAnno)
                    .addComponent(jLabelDuracion)
                    .addComponent(jLabelGenero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAnno, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(AgregarPelicula)
                .addGap(20, 20, 20)
                .addComponent(jLabelID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDirector))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAnno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAnno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDuracion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelGenero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
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

    private void jTextFieldDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDirectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDirectorActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldAnnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAnnoActionPerformed

    private void jTextFieldDuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDuracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDuracionActionPerformed

    private void jTextFieldGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldGeneroActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
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


    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        Pantalla pantalla;
        try {
            pantalla = new Pantalla(this.conector);
            pantalla.setVisible(true);
            pantalla.setLocationRelativeTo(null);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(AgregarPelicula.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed

        jTextFieldNombre.setText("");
        jTextFieldDirector.setText("");
        jTextFieldAnno.setText("");
        jTextFieldDuracion.setText("");
        jTextFieldGenero.setText("");
        
    }//GEN-LAST:event_jButtonLimpiarActionPerformed
// -------------- VALIDACIONES DE INGRESO DE TEXTO ------------
    private void jTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyTyped
        Character c = evt.getKeyChar();
        if(!Character.isLetter(c) && c != KeyEvent.VK_SPACE  && !Character.isDigit(c))
       {evt.consume(); 

       }
                if (jTextFieldNombre.getText().length() == 250){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNombreKeyTyped

    private void jTextFieldGeneroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldGeneroKeyTyped
        Character c = evt.getKeyChar();
        if(!Character.isLetter(c) && c != KeyEvent.VK_SPACE  && !Character.isDigit(c))
       {evt.consume(); 
       }
                if (jTextFieldGenero.getText().length() == 100){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldGeneroKeyTyped

    private void jTextFieldDirectorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDirectorKeyTyped
        Character c = evt.getKeyChar();
        if(!Character.isLetter(c) && c != KeyEvent.VK_SPACE  && !Character.isDigit(c))
       {evt.consume(); 
       }
                if (jTextFieldDirector.getText().length() == 100){
            evt.consume();
        }

    }//GEN-LAST:event_jTextFieldDirectorKeyTyped

    private void jTextFieldAnnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAnnoKeyTyped
        Character c = evt.getKeyChar();
        if(!Character.isDigit(c))
       {
            evt.consume();
        }
        if (jTextFieldAnno.getText().length() == 4){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldAnnoKeyTyped

    private void jTextFieldDuracionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDuracionKeyTyped
        Character c = evt.getKeyChar();
        if(!Character.isDigit(c))
       {
            evt.consume();
        }
        if (jTextFieldDuracion.getText().length() == 3){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldDuracionKeyTyped

    /// VALIDACIONES
    
    protected Connection conexionOCI;
    protected DataSourceSample conector;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgregarPelicula;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabelAnno;
    private javax.swing.JLabel jLabelDirector;
    private javax.swing.JLabel jLabelDuracion;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldAnno;
    private javax.swing.JTextField jTextFieldDirector;
    private javax.swing.JTextField jTextFieldDuracion;
    private javax.swing.JTextField jTextFieldGenero;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
