package com.warriorminds.abstraccion;

/**
 * Clase Materia. Contiene el nombre de la materia así como la calificación 
 * obtenida.
 * @author warriorminds
 */
public class Materia {
    private double calificacion;
    private String nombre;
    
    public Materia(String nombre, double calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public double getCalificacion() {
        return calificacion;
    }
    
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
