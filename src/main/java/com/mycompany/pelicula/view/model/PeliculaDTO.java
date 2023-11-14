
package com.mycompany.pelicula.view.model;

import java.sql.Connection;
import java.sql.SQLException;
import com.mycompany.pelicula.view.model.controller.DataSourceSample;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class PeliculaDTO {
    
    // se pueden crear lista de peliculas . 
    
    public boolean agregarPelicula(Pelicula peliculaNueva, Connection conexion) throws SQLException{
        
        String queryStatement = "INSERT INTO PELICULA (NOMBRE,DIRECTOR,ANNO,DURACION,GENERO) VALUES(?,?,?,?,?)";
    
        System.out.println("\n Query is " + queryStatement);   
        
        PreparedStatement ps = conexion.prepareStatement(queryStatement);
        
        ps.setString(1, peliculaNueva.getNombre());
        ps.setString(2, peliculaNueva.getDirector());
        ps.setInt(3, peliculaNueva.getAnno());
        ps.setInt(4,peliculaNueva.getDuracion());
        ps.setString(5, peliculaNueva.getGenero());
        
        int result = ps.executeUpdate();
        
        System.out.println("Pelicula agregada: "+result);

        
        return true;
    }

    
    public boolean buscarPelicula(Pelicula peliculaBusqueda, Connection conexion)throws SQLException{
        
        String query ="SELECT ID, NOMBRE, DIRECTOR , ANNO, DURACION, GENERO FROM "+conexion.getSchema() +".PELICULA WHERE NOMBRE=?";
        System.out.println("Query is"+query);
        
        PreparedStatement ps = conexion.prepareStatement(query);
        
        ps.setString(1, peliculaBusqueda.getNombre());
        ResultSet rs = ps.executeQuery();
        
        if(rs.next()){
            peliculaBusqueda.setId(rs.getInt(1));
            peliculaBusqueda.setDirector(rs.getString(3));
            peliculaBusqueda.setAnno(rs.getInt(4));
            peliculaBusqueda.setDuracion(rs.getInt(5));
            peliculaBusqueda.setGenero(rs.getString(6));
            return true;
            
        }else{
            return false;
        }
        
    }
    
    
   public boolean peliculaModificada(Pelicula peliculaNueva, Connection conexion) throws SQLException{
        String queryStatement ="UPDATE "+conexion.getSchema()+".PELICULA SET NOMBRE=?, DIRECTOR=?, ANNO=?, DURACION=?, GENERO=? WHERE ID=?";
        System.out.println("Query is"+queryStatement);
        PreparedStatement ps = conexion.prepareStatement(queryStatement);
        
        ps.setString(1, peliculaNueva.getNombre());
        ps.setString(2, peliculaNueva.getDirector());
        ps.setInt(3, peliculaNueva.getAnno());
        ps.setInt(4,peliculaNueva.getDuracion());
        ps.setString(5, peliculaNueva.getGenero());
        ps.setInt(6,peliculaNueva.getId());
        
        System.out.println("Pelicula modificada: ");
        return true;

        
    }



}
