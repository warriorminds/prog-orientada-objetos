package com.warriorminds.abstraccion;

/**
 * AlumnoUniversidad. Esta clase representa a un alumno de universidad.
 * Extiende la clase abstracta alumno e implementa la interfas IAlumno.
 * @author warriorminds
 */
public class AlumnoUniversidad extends Alumno implements IAlumno {

    /**
     * Debido a que la clase abstracta tiene su constructor, esta clase debe
     * de llamar ese constructor. Eso se hace con super(nombre, grado);
     * 
     * @param nombre
     * @param grado 
     */
    public AlumnoUniversidad(String nombre, String grado) {
        super(nombre, grado);
    }

    /**
     * El promedio se calcula de la siguiente manera:
     * 100% el promedio de las materias
     * 
     * Esta implementación es específica de los alumnos de universidad.
     */
    @Override
    public void calcularCalificacionDelGrado() {
        double total = 0.0;
        for (int i = 0; i < materias.size(); i++) {
            Materia materia = materias.get(i);
            total += materia.getCalificacion();            
        }
        promedio = total / materias.size();
    }    

    /*
     * Métodos de la interfas IAlumno donde se obtiene la información del alumno
     * y se imprimen las materias con sus calificaciones.
     */
    @Override
    public String obtenerInformacion() {
        return "Nombre: " + nombre + ", Grado: " + grado;
    }

    @Override
    public void imprimirMaterias() {
        for (int i = 0; i < materias.size(); i++) {
            Materia materia = materias.get(i);
            System.out.println(materia.getNombre() + " - " + materia.getCalificacion());
        }
    }
}
