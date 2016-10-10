package com.warriorminds.herencia;

/**
 *
 * @author warriorminds
 */
public class Vehiculo {
    private float cantidadCombustible;
    private String marca;
    private int capacidad;
    
    public Vehiculo(String marca, int capacidad) {
        this.marca = marca;
        this.capacidad = capacidad;
    }
    
    public void arrancar() {
        System.out.println("Arrancando.");
    }
    
    public void apagar() {
        System.out.println("Apagando.");
    }
    
    public void avanzar() {
        System.out.println("Avanzando.");
    }
    
    public void ponerCombustible(float cantidad) {
        cantidadCombustible += cantidad;
    }
        
    public float getCombustible() {
        return cantidadCombustible;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public int getCapacidad() {
        return capacidad;
    }
}
