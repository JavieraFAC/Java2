
package com.mycompany.pelicula;
import com.mycompany.pelicula.view.Pantalla;
import java.sql.SQLException;


public class Pelicula {

    public static void main(String[] args) throws SQLException {
        Pantalla pantalla = new Pantalla();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
    }
 
    
}
