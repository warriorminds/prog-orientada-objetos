package com.warriorminds.abstraccion;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase abstracta alumno.
 * Esta clase contiene la información de un alumno así como sus métodos para obtener y modificar
 * su información. Así mismo, contiene el método abstracto calcularCalificacionDelGrado();
 * @author warriorminds
 */
public abstract class Alumno {
    protected String nombre;
    protected List<Materia> materias;
    protected double promedio;
    protected String grado;
    
    /**
     * Constructor que las clases específicas deben llamar.
     * @param nombre
     * @param grado 
     */
    public Alumno(String nombre, String grado) {
        this.nombre = nombre;
        this.grado = grado;
        this.materias = new ArrayList<>();
    }
    
    /**
     * Método abstracto para calcular la calificación (promedio) del grado.
     */
    public abstract void calcularCalificacionDelGrado();
    
    public String getNombre() {
        return nombre;
    }
    
    public List<Materia> getMaterias() {
        return materias;
    }
    
    public void agregarMateria(Materia materia) {
        this.materias.add(materia);
    }
    
    public String getGrado() {
        return grado;
    }
    
    public double getPromedio() {
        return promedio;
    }
}
