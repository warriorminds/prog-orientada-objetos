package com.warriorminds.encapsulamiento;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 
 * @author warriorminds
 */
public class Usuario {
    
    /**
     * Variables privadas. Solamente pueden ser modificadas y accesadas dentro
     * de esta clase. Lo mismo aplica para los métodos privados.
     */
    private String nombre;
    private String apellido;
    private int edad;
    private String email;
    
    /**
     * Los métodos y variables protected pueden ser usados dentro de la clase donde
     * están declarados, dentro del mismo paquete y en clases hijas.
     */
    protected String direccion;
    
    /**
     * Al no declarar un nivel de acceso, solamente se podrá tener acceso a estas variables
     * y métodos dentro de la clase y dentro del paquete. NO podrán tener acceso las 
     * clases hijas que estén en otro paquete.          
     */
    List<String> apodos = new ArrayList<>();
    
    public Usuario() {
    
    }
    
    public Usuario(String email, String nombre, String apellido, int edad) {       
        this.email = email;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    /**
     * Los métodos públicos pueden ser accesados desde cualquier parte del código.
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return email;
    }
}
