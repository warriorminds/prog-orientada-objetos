package com.warriorminds.herencia;

/**
 *
 * @author warriorminds
 */
public class NaveEspacial extends Vehiculo {
    
    private String nombre;
    private String pais;
       
    public NaveEspacial(int capacidad, String nombre, String pais) {
        super("", capacidad);
        this.nombre = nombre;
        this.pais = pais;
    }
    
    public void despegar() {
        System.out.println("Despegando la nave espacial.");
    }
    
    public void aterrizar() {
        System.out.println("Aterrizando la nave espacial.");
    }
    
    public void colocarSatelite() {
        System.out.println("Colocando satélite en órbita.");
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getPais() {
        return pais;
    }
}
