
package com.mycompany.pelicula.view.model.controller;

import java.sql.Connection;
import java.sql.SQLException;
import com.mycompany.pelicula.view.model.PeliculaDTO;
import com.mycompany.pelicula.view.model.Pelicula;
import java.util.logging.Logger;
import com.mycompany.pelicula.view.Modificar;



public class PeliculaController {
    
    
    public boolean agregarPeliculaController (Pelicula peliculaNueva, Connection conexion) throws SQLException{
        PeliculaDTO pelicula = new PeliculaDTO();
        pelicula.agregarPelicula(peliculaNueva, conexion);
        
        return true;
    }
    
    
    public boolean buscarPeliculaController (Pelicula peliculaBusqueda, Connection conexion) throws SQLException{
        Pelicula pelicula = new Pelicula();
        
        return pelicula.buscarPelicula(peliculaBusqueda,conexion);
    }
    
    public boolean modificarPeliculaController (Pelicula peliculaModificada, Connection conexion)throws SQLException{
        PeliculaDTO pelicula = new PeliculaDTO();
        pelicula.peliculaModificada(peliculaModificada, conexion);
        return true;
    }
        

    
}
