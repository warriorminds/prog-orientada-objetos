package com.warriorminds;

import com.warriorminds.abstraccion.Alumno;
import com.warriorminds.abstraccion.AlumnoPrimaria;
import com.warriorminds.abstraccion.AlumnoUniversidad;
import com.warriorminds.abstraccion.IAlumno;
import com.warriorminds.abstraccion.Materia;
import java.util.ArrayList;
import java.util.List;

/**
 * Abstracción. En este programa se utilizan clases y métodos abstractos para
 * simular un sistema de alumnos y calificaciones.
 * @author warriorminds
 */
public class Abstraccion {

    public static void main(String[] args) {
        // Lista para guardar alumnos. La lista es de tipo Alumno.
        List<Alumno> alumnos = new ArrayList<>();
        
        // Nuestro alumno de primaria con sus materias y calificaciones.
        Alumno alumnoPrimaria = new AlumnoPrimaria("Juan", "Primero");
        alumnoPrimaria.agregarMateria(new Materia("Matemáticas", 10));
        alumnoPrimaria.agregarMateria(new Materia("Español", 8));
        alumnoPrimaria.agregarMateria(new Materia("Conducta", 9));
        alumnoPrimaria.agregarMateria(new Materia("Esfuerzo", 10));
        
        // Nuestro alumno de universidad con sus materias y calificaciones.
        Alumno alumnoUniversidad = new AlumnoUniversidad("Pablo", "Sexto Semestre");
        alumnoUniversidad.agregarMateria(new Materia("Matemáticas Aplicadas", 7));
        alumnoUniversidad.agregarMateria(new Materia("Diseño de Software", 8));
        alumnoUniversidad.agregarMateria(new Materia("Sistemas Operativos", 8));
        alumnoUniversidad.agregarMateria(new Materia("Física Avanzada", 9));
        
        // Agregamos ambos alumnos a la lista.
        alumnos.add(alumnoPrimaria);
        alumnos.add(alumnoUniversidad);
        
        /**
         * Obtenemos cada alumno de la lista. Como podemos ver, no importa si el alumno
         * es AlumnoPrimaria o AlumnoUniversidad, ya que ambos son Alumno también.
         */
        for (int i = 0; i < alumnos.size(); i++) {
            Alumno alumno = alumnos.get(i);
            alumno.calcularCalificacionDelGrado();
            System.out.println(alumno.getNombre() + ": " + alumno.getPromedio());
        }
        
        /**
         * Al igual que con Alumno, nuestros AlumnoPrimaria y AlumnoUniversidad también
         * son IAlumno, por lo que el cast es válido.
         */
        System.out.println("=============== RESULTADOS DE LA INTERFAS IALUMNO ===============");
        for (int i = 0; i < alumnos.size(); i++) {
            IAlumno alumno = (IAlumno) alumnos.get(i);
            System.out.println(alumno.obtenerInformacion());
            alumno.imprimirMaterias();
            System.out.println();
        }
    }    
}
