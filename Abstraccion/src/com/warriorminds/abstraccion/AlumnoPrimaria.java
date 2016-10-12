package com.warriorminds.abstraccion;

/**
 * AlumnoPrimaria. Esta clase representa a un alumno de primaria.
 * Extiende la clase abstracta alumno e implementa la interfas IAlumno.
 * @author warriorminds
 */
public class AlumnoPrimaria extends Alumno implements IAlumno {

    /**
     * Debido a que la clase abstracta tiene su constructor, esta clase debe
     * de llamar ese constructor. Eso se hace con super(nombre, grado);
     * 
     * @param nombre
     * @param grado 
     */
    public AlumnoPrimaria(String nombre, String grado) {
        super(nombre, grado);
    }

    /**
     * El promedio se calcula de la siguiente manera:
     * 80% el promedio de las materias
     * 10% calificación de conducta
     * 10% calificación de esfuerzo.
     * 
     * Esta implementación es específica de los alumnos de primaria.
     */
    @Override
    public void calcularCalificacionDelGrado() {
        double total = 0.0;
        double conducta = 0.0;
        double esfuerzo = 0.0;
        int materiasAcademicas = 0;
                
        for (int i = 0; i < materias.size(); i++) {
            Materia materia = materias.get(i);
            
            if (materia.getNombre().toLowerCase().equals("conducta")) {
                conducta += materia.getCalificacion();
            } else if (materia.getNombre().toLowerCase().equals("esfuerzo")) {
                esfuerzo += materia.getCalificacion();
            } else {
                total += materia.getCalificacion(); 
                materiasAcademicas++;
            }
        }
        
        promedio = ((total / materiasAcademicas) * 0.8) + (conducta * 0.1) + (esfuerzo * 0.1);
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
