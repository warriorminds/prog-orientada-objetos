package com.warriorminds;

import com.warriorminds.polimorfismo.Alumno;
import com.warriorminds.polimorfismo.IPersona;
import com.warriorminds.polimorfismo.Persona;

/**
 *
 * @author warriorminds
 */
public class Polimorfismo {

    public static void main(String[] args) {
        Persona persona = new Persona("Jorge", 33);
        Alumno alumno = new Alumno("Ricardo", 33);
        
        /**
         * Podemos ver que nuestro objeto persona, solamente es del tipo persona, y 
         * por default, también es del tipo Objeto.
         */
        if (persona instanceof Persona) {
            System.out.println("persona es del tipo Persona");
        } else {
            System.out.println("persona NO es del tipo Persona");
        }
        
        if (persona instanceof IPersona) {
            System.out.println("persona es del tipo IPersona");
        } else {
            System.out.println("persona NO es del tipo IPersona");
        }
        
        if (persona instanceof Alumno) {
            System.out.println("persona es del tipo Alumno");
        } else {
            System.out.println("persona NO es del tipo Alumno");
        }
        
        if (persona instanceof Object) {
            System.out.println("persona es del tipo Object");
        } else {
            System.out.println("persona NO es del tipo Object");
        }
        
        System.out.println("================= ALUMNO =================");
        
        /**
         * En cambio, nuestro objeto alumno es del tipo Persona, IPersona, Alumno
         * y, por default, Object.
         */
        if (alumno instanceof Persona) {
            System.out.println("alumno es del tipo Persona");
        } else {
            System.out.println("alumno NO es del tipo Persona");
        }
        
        if (alumno instanceof IPersona) {
            System.out.println("alumno es del tipo IPersona");
        } else {
            System.out.println("alumno NO es del tipo IPersona");
        }
        
        if (alumno instanceof Alumno) {
            System.out.println("alumno es del tipo Alumno");
        } else {
            System.out.println("alumno NO es del tipo Alumno");
        }
        
        if (alumno instanceof Object) {
            System.out.println("alumno es del tipo Object");
        } else {
            System.out.println("alumno NO es del tipo Object");
        }
    }
    
}
