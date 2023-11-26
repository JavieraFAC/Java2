
package com.mycompany.pelicula.view.model;

import java.sql.Connection;

public class Pelicula {
    
    private int id;
    private String nombre;
    private String director;
    private int anno;
    private int duracion;
    private String genero;
 
    
   //

    public Pelicula() {
    }

    public Pelicula(int id, String nombre, String director, int anno, int duracion, String genero) {
        this.id = id;
        this.nombre = nombre;
        this.director = director;
        this.anno = anno;
        this.duracion = duracion;
        this.genero = genero;
    }
    
   //// get y set

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean buscarPelicula(Pelicula peliculaBusqueda, Connection conexion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "PELICULA {"+ "ID: "+ id +" Director: "+ director +" Año: "+ anno + "Duracion: "+ duracion+"segundos"+ "Genero: " +genero + "}";
    }
    
}
