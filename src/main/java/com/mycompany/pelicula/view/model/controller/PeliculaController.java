
package com.mycompany.pelicula.view.model.controller;

import java.sql.Connection;
import java.sql.SQLException;
import com.mycompany.pelicula.view.model.PeliculaDTO;
import com.mycompany.pelicula.view.model.Pelicula;
import java.util.logging.Logger;
import com.mycompany.pelicula.view.Modificar;
import java.util.ArrayList;
import java.util.List;



public class PeliculaController {
    
    
    public boolean agregarPeliculaController (Pelicula peliculaNueva, Connection conexion) throws SQLException{
        PeliculaDTO pelicula = new PeliculaDTO();
        pelicula.agregarPelicula(peliculaNueva, conexion);
        
        return true;
    }
    
    
    public boolean buscarPeliculaController (Pelicula peliculaBusqueda, Connection conexion) throws SQLException{
        PeliculaDTO pelicula = new PeliculaDTO();
        
        return pelicula.buscarPelicula(peliculaBusqueda,conexion);
    }
    
    public boolean modificarPeliculaController (Pelicula peliculaNueva, Connection conexion)throws SQLException{
        PeliculaDTO pelicula = new PeliculaDTO();
        pelicula.peliculaModificada(peliculaNueva, conexion);
        return true;
    }
    
    public boolean eliminarPeliculaController (Pelicula peliculaEliminar, Connection conexion) throws SQLException{
        PeliculaDTO pelicula = new PeliculaDTO();
        pelicula.eliminarPelicula(peliculaEliminar, conexion);
        return true;
    }
    
    
    public ArrayList<Pelicula> listarPeliculasController(Connection conexion) throws SQLException{
        PeliculaDTO pelicula = new PeliculaDTO();
        
        return pelicula.listarPelicula((Connection) conexion);
    }
   
}
