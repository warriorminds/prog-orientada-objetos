package com.warriorminds;

import com.warriorminds.composicion.Direccion;
import com.warriorminds.composicion.Trabajo;
import com.warriorminds.composicion.Usuario;

/**
 *
 * @author warriorminds
 */
public class Composicion {

    public static void main(String[] args) {
        /**
         * Usando la composición.
         * Creación del objeto dirección. Se le asigna este objeto al objeto trabajo.
         */
        Direccion direccionTrabajo = new Direccion("Calle trabajo", "32", "Colonia trabajo", "123456");
        Trabajo trabajo = new Trabajo("Software Developer", 5, direccionTrabajo);
        
        /**
         * Usando la composición.
         * Creación del objeto dirección. Se crea el objeto usuario y se le agregan los
         * objetos trabajo y dirección de casa.
         */
        Direccion direccionCasa = new Direccion("Calle casa", "18", "Colonia casa", "654321");
        Usuario usuario = new Usuario("Warrior Minds", "email@gmail.com", 25);
        usuario.setDireccion(direccionCasa);
        usuario.setTrabajo(trabajo);
        
        usuario.imprimirDireccion();
        usuario.imprimirTrabajo();
    }
    
}
