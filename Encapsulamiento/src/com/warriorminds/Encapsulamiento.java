package com.warriorminds;

import com.warriorminds.encapsulamiento.Usuario;

/**
 *
 * @author warriorminds
 */
public class Encapsulamiento {

    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        /**
         * Acceder a una variable o método privado no está permitido.
         */
        // usuario.nombre = "Warrior Minds"; 
        
        /**
         * Se puede tener acceso a los métodos y variables públicos de la clase desde
         * cualquier lado del código.
         */
        usuario.setNombre("Warrior Minds");
        System.out.println(usuario.getNombre());
        
        /**
         * No podemos usar la variable direccion, ya que está declarada como protected
         * y esta clase Encapsulamiento está localizada en un paquete diferente que
         * la clase usuario.
         */
        //usuario.direccion = "Calle central";
        
        /**
         * Tampoco se puede usar una variable o método que no tenga un nivel de acceso definido.
         */
        //usuario.apodos.add("Otro más");        
    }    
}
