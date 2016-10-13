package com.warriorminds.encapsulamiento;

/**
 * Clase donde podemos tener acceso a las variables protected
 * de la clase Usuario.
 * 
 * Es una clase dentro del mismo paquete que Usuario, y que no hereda de él.
 * 
 * @author warriorminds
 */
public class Prueba {
   
    public Prueba() {
        Usuario usuario = new Usuario();
        /**
         * Se puede tener acceso a variables protected y sin modificador de acceso.
         */
        usuario.direccion = "Calle central 123";
        usuario.apodos.add("El Warrior");
    }
}
