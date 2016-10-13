package com.warriorminds.encapsulamiento;

/**
 * Clase hija de Usuario (en el mismo paquete). Muestra el uso de variables protected y sin 
 * modificador de acceso.
 * @author warriorminds
 */
public class HijoDeUsuario extends Usuario {
    public HijoDeUsuario() {
        /**
         * Se puede tener acceso tanto a variables protected, como a variables
         * sin modificador de acceso.
         */
        direccion = "Si la puedo modificar!";
        apodos.add("El Warrior");
    }
}
