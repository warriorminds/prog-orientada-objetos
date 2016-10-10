package com.warriorminds.poo.classes;

/**
 * Clase que muestra el uso de la palabra this.
 * this hace referencia al objeto actual.
 * 
 * @author warriorminds
 */
public class UsandoThis {
    private String nombre;
    
    public UsandoThis() {
        this("sin nombre");     // this("valor") ejecuta el constructor con un String como parámetro.
                                // this hace referencia a la instancia actual del objeto.
    }
    
    public UsandoThis(String nombre) {  // Método recibe un parámetro llamado "nombre"
        this.nombre = nombre;           // El objeto tiene una variable llamada "nombre" también.
                                        // this.nombre hace referencia a la variable de instancia, NO a la variable local del método.
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
