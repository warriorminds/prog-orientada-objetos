package com.warriorminds.poo.classes;

/**
 * Esta clase es un ejemplo de clases internas en Java.
 * @author warriorminds
 */
public class ClasesInternas {
    private String nombre;
    private String email;
    private int edad;
    private Direccion direccion;
    
    /* Constructor con parámetros.
     * La clase no puede recibir un objeto Direccion, ya que al ser una clase interna y privada,
     * no se tiene acceso a Direccion desde fuera de esta clase.
     */
    public ClasesInternas(String nombre, String email, int edad, String calle, String colonia, 
            String codigoPostal) {
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
        this.direccion = new Direccion(calle, colonia, codigoPostal);   // Se puede tener acceso a la clase Dirección desde aqui.
    }
    
    public String mostrarInfo() {
        return "Nombre: " + nombre + ", email: " + email + ", edad: " + edad 
                + "\n" + direccion.mostrarInfo();
    }
    
    /*
     * Clase interna. Esta clase interna puede tener acceso a las variables de la clase padre.
     * Al ser una clase privada, solamente la clase padre puede tener visibilidad y acceso a esta
     * clase. Se pueden utilizar este tipo de clases internas para crear objetos que solamente
     * la clase padre puede utilizar.
     */
    private class Direccion {
        private String calle;
        private String colonia;
        private String codigoPostal;
        
        public Direccion(String calle, String colonia, String codigoPostal) {
            this.calle = calle;
            this.colonia = colonia;
            this.codigoPostal = codigoPostal;
        }
        
        /*
         * Método que muestra la información del objeto Dirección. Tiene acceso a la variable
         * nombre que es de la clase padre.
         */
        public String mostrarInfo() {
            return nombre + " vive en " + calle + " " + colonia + " " + codigoPostal;
        }
    }
}
