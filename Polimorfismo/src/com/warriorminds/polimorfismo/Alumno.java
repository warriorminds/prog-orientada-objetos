package com.warriorminds.polimorfismo;

/**
 * Clase Alumno. Implementa IPersona y hereda Persona.
 * @author warriorminds
 */
public class Alumno extends Persona implements IPersona {

    public Alumno(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void decirMiNombre() {
        System.out.println("Mi nombre es " + nombre);
    }    
}
