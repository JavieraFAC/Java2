
package com.mycompany.pelicula.view;

import com.mycompany.pelicula.view.model.Pelicula;
import com.mycompany.pelicula.view.model.controller.PeliculaController;
import com.mycompany.pelicula.view.model.controller.DataSourceSample;
import com.mycompany.pelicula.view.model.Pelicula;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class Listar extends javax.swing.JFrame {
    
        private TableRowSorter trsfiltro;


    public Listar(DataSourceSample conn)throws SQLException {
        initComponents();
        this.conector = conn;
        this.conector.setConn(conn.getConn());
        cargarTabla();
   
    }
    
    public void cargarTabla() throws SQLException{
        PeliculaController controller = new PeliculaController();
        
        ArrayList<Pelicula> listarPelicula = new ArrayList<Pelicula>();
        listarPelicula = controller.listarPeliculasController(this.conector.getConn());

        
        DefaultTableModel modelo = (DefaultTableModel) this.jTable1.getModel();

        for (int i=0; i < listarPelicula.size() ; i++){
            Object[] objeto = {
            listarPelicula.get(i).getId(),
            listarPelicula.get(i).getNombre(),
            listarPelicula.get(i).getDirector(),
            listarPelicula.get(i).getAnno(),
            listarPelicula.get(i).getDuracion(),
            listarPelicula.get(i).getGenero()
        };
            
            modelo.addRow(objeto);
        }
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TituloListar = new javax.swing.JLabel();
        jButtonVolverListar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        Genero = new javax.swing.JLabel();
        FiltrarPeliculas = new javax.swing.JLabel();
        jTextFieldFiltrarGenero = new javax.swing.JTextField();
        Genero1 = new javax.swing.JLabel();
        jTextFieldAnno1 = new javax.swing.JTextField();
        jTextFieldAnno2 = new javax.swing.JTextField();
        Genero2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(230, 250, 230));

        TituloListar.setFont(new java.awt.Font("AGRESSIVE", 0, 18)); // NOI18N
        TituloListar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloListar.setText("LISTAR PELICULAS");

        jButtonVolverListar.setBackground(new java.awt.Color(245, 245, 179));
        jButtonVolverListar.setText("VOLVER");
        jButtonVolverListar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonVolverListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverListarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "DIRECTOR", "AÑO", "DURACION", "GENERO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(220, 220, 237));

        Genero.setText("GENERO:");

        FiltrarPeliculas.setFont(new java.awt.Font("AGRESSIVE", 0, 13)); // NOI18N
        FiltrarPeliculas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FiltrarPeliculas.setText("FILTRAR PELICULAS");

        jTextFieldFiltrarGenero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldFiltrarGeneroKeyTyped(evt);
            }
        });

        Genero1.setText("AÑOS:");

        jTextFieldAnno1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAnno1KeyTyped(evt);
            }
        });

        jTextFieldAnno2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAnno2KeyTyped(evt);
            }
        });

        Genero2.setText("entre");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FiltrarPeliculas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Genero)
                    .addComponent(Genero1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextFieldAnno1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Genero2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldAnno2))
                    .addComponent(jTextFieldFiltrarGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FiltrarPeliculas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Genero)
                    .addComponent(jTextFieldFiltrarGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Genero1)
                    .addComponent(jTextFieldAnno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAnno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Genero2))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TituloListar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jButtonVolverListar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(TituloListar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVolverListar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void jTextFieldFiltrarGeneroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFiltrarGeneroKeyTyped
        jTextFieldFiltrarGenero.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = jTextFieldFiltrarGenero.getText();
                jTextFieldFiltrarGenero.setText(cadena);
                filtro();
            }
        });

        trsfiltro = new TableRowSorter(jTable1.getModel());
        jTable1.setRowSorter(trsfiltro);


    }//GEN-LAST:event_jTextFieldFiltrarGeneroKeyTyped

    private void jTextFieldAnno1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAnno1KeyTyped

        jTextFieldAnno1.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = jTextFieldAnno1.getText();
                jTextFieldAnno1.setText(cadena);
                filtroAnnos();
            }
        });

        trsfiltro = new TableRowSorter(jTable1.getModel());
        jTable1.setRowSorter(trsfiltro);    }//GEN-LAST:event_jTextFieldAnno1KeyTyped

    private void jTextFieldAnno2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAnno2KeyTyped
        jTextFieldAnno2.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = jTextFieldAnno2.getText();
                jTextFieldAnno2.setText(cadena);
                filtroAnnos2();
            }
        });

        trsfiltro = new TableRowSorter(jTable1.getModel());
        jTable1.setRowSorter(trsfiltro);
    }//GEN-LAST:event_jTextFieldAnno2KeyTyped

    
    public void filtro(){
       int columnaFiltro = 5; // Genero
        
        this.trsfiltro.setRowFilter(RowFilter.regexFilter(jTextFieldFiltrarGenero.getText(), columnaFiltro));
    
    }
    
    public void filtroAnnos() {


            int Anno1 = Integer.parseInt(jTextFieldAnno1.getText());
           /* int Anno2 = Integer.parseInt(jTextFieldAnno2.getText());*/

            int columnaFiltro = 3;
            this.trsfiltro.setRowFilter(RowFilter.numberFilter(RowFilter.ComparisonType.AFTER, Anno1, columnaFiltro));
    }
        public void filtroAnnos2() {

           int Anno2 = Integer.parseInt(jTextFieldAnno2.getText());

            int columnaFiltro = 3;
            this.trsfiltro.setRowFilter(RowFilter.numberFilter(RowFilter.ComparisonType.BEFORE, Anno2, columnaFiltro));
    }
    
        protected DataSourceSample conector;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FiltrarPeliculas;
    private javax.swing.JLabel Genero;
    private javax.swing.JLabel Genero1;
    private javax.swing.JLabel Genero2;
    private javax.swing.JLabel TituloListar;
    private javax.swing.JButton jButtonVolverListar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldAnno1;
    private javax.swing.JTextField jTextFieldAnno2;
    private javax.swing.JTextField jTextFieldFiltrarGenero;
    // End of variables declaration//GEN-END:variables
}
