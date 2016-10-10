package com.warriorminds.herencia;

/**
 *
 * @author warriorminds
 */
public class Avion extends Vehiculo {

    private String modelo;
       
    public Avion(int capacidad, String marca, String modelo) {
        super(marca, capacidad);
        this.modelo = modelo;
    }
    
    @Override
    public void arrancar() {
        System.out.println("AVION:");
        super.arrancar();
    }
    
    @Override
    public void apagar() {
        System.out.println("AVION:");
        super.apagar();
    }
    
    @Override
    public void avanzar() {
        System.out.println("AVION:");
        super.avanzar();
    }
    
    public void despegar() {
        System.out.println("Despegando.");
    }
    
    public void aterrizar() {
        System.out.println("Aterrizando.");
    }
    
    public String getModelo() {
        return modelo;
    }
}
