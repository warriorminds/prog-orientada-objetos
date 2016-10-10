package com.warriorminds.poo.classes;

/**
 * Ejemplo de clases estáticas. En Java, se puede crear una clase estática dentro de una clase padre.
 * La clase estática NO tiene referencia a la clase padre.
 * 
 * @author warriorminds
 */
public class ClasesEstaticas {
    private String nombre;
    private String email;
    private int edad;
    private Direccion direccion;
    
    /* Constructor con parámetros.
     * Se puede utilizar la clase Direccion como parámetro aquí.
     */
    public ClasesEstaticas(String nombre, String email, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
        this.direccion = direccion;
    }
    
    public String mostrarInfo() {
        return "Nombre: " + nombre + ", email: " + email + ", edad: " + edad 
                + "\n" + direccion.mostrarInfo();
    }
    
    /*
     * Esta clase estática se puede utilizar fuera de la clase padre. Para crear una instancia
     * de esta clase se debe de poner el nombre de la clase padre primero:
     * ClasesEstaticas.Direccion direccion = new Direccion(....);
     *
     */
    public static class Direccion {
        private String calle;
        private String colonia;
        private String codigoPostal;
        
        public Direccion(String calle, String colonia, String codigoPostal) {
            this.calle = calle;
            this.colonia = colonia;
            this.codigoPostal = codigoPostal;
        }
        
        /*
         * Método que muestra la información del objeto Dirección. Al ser una clase estática, no
         * tiene acceso a variables no estáticas de la clase padre.
         */
        public String mostrarInfo() {
            return "Dirección: " + calle + " " + colonia + " " + codigoPostal;
        }
    }
}
