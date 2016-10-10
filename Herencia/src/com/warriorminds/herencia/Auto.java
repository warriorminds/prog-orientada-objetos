package com.warriorminds.herencia;

/**
 *
 * @author warriorminds
 */
public class Auto extends Vehiculo {
    
    private String color;
    
    public Auto(String marca, String color, int capacidad) {
        super(marca, capacidad);
        this.color = color;
    }
    
    public void cambiarVelocidades() {
        System.out.println("Cambiando de velocidad.");
    }
    
    @Override
    public void arrancar() {
        System.out.println("Arrancando el auto.");
    }
    
    @Override
    public void apagar() {
        System.out.println("Apagando el auto.");
    }
    
    @Override
    public void avanzar() {
        System.out.println("Avanzando el auto.");
    }
    
    public String getColor() {
        return color;
    }
}
