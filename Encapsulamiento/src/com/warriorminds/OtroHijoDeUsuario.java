package com.warriorminds;

import com.warriorminds.encapsulamiento.Usuario;

/**
 * Clase que hereda de usuario pero está en otro paquete.
 * 
 * @author warriorminds
 */
public class OtroHijoDeUsuario extends Usuario {
    public OtroHijoDeUsuario() {
        /**
         * Se puede tener acceso a variables protected.
         */
        direccion = "Mi nueva dirección";
        /**
         * NO se puede tener acceso a variables sin modificador de acceso.
         */
        //apodos.add("Esto no es posible!");
    }
}
