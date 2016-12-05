package com.warriorminds.composicion;

/**
 * Clase usuario. En esta clase se utiliza la composición.
 * @author warriorminds
 */
public class Usuario {
    private String nombre;
    private String email;
    private int edad;
    
    /**
     * Relaciones "tiene un".
     * 
     * La clase usuario Tiene un objeto dirección.
     * La clase usuario Tiene un objeto trabajo.
     */
    private Direccion direccion;
    private Trabajo trabajo;
    
    public Usuario(String nombre, String email, int edad) {
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
    }
    
    public void setTrabajo(Trabajo trabajo) {
        this.trabajo = trabajo;
    }
    
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getEmail() {
        return email;
    }
    
    public int getEdad() {
        return edad;
    }
    
    /**
     * Ejemplo de uso de composición.
     * Al imprimir la dirección del usuario, la clase Usuario utiliza
     * la clase Dirección y manda llamar su método para imprimir la dirección.
     * 
     */
    public void imprimirDireccion() {
        System.out.println("========= DIRECCION USUARIO ========");
        if (direccion != null) {
            direccion.imprimirDireccion();
        } else {
            System.out.println("No hay dirección agregada.");
        }
    }
    
    /**
     * Ejemplo de uso de composición.
     * Al imprimir la dirección del trabajo, la clase Usuario utiliza
     * la clase Trabajo y manda llamar su método para imprimir la dirección.
     * 
     */
    public void imprimirTrabajo() {
        System.out.println("========= TRABAJO USUARIO ========");
        if (trabajo != null) {
            System.out.println("Trabajo: " + trabajo.getPuesto());
            System.out.println("Direccion de trabajo: ");
            trabajo.imprimirDireccion();
        } else {
            System.out.println("No tiene trabajo");
        }
    }
}
