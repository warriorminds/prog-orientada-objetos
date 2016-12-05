package com.warriorminds.composicion;

/**
 * Clase Trabajo. Ejemplo de composición.
 * @author warriorminds
 */
public class Trabajo {
    private String puesto;
    private int antiguedad;
    /**
     * Relaciónes tipo "tiene un".
     * La clase Trabajo tiene un objeto de tipo Dirección.
     */
    private Direccion direccion;
    
    public Trabajo(String puesto, int antiguedad, Direccion direccion) {
        this.puesto = puesto;
        this.antiguedad = antiguedad;
        this.direccion = direccion;
    }
    
    /**
     * Uso de composición.
     * La clase Trabajo utiliza la clase Dirección para imprimir la dirección.
     */
    public void imprimirDireccion() {
        direccion.imprimirDireccion();
    }
    
    public String getPuesto() {
        return puesto;
    }
    
    public int getAntiguedad() {
        return antiguedad;
    }
}
