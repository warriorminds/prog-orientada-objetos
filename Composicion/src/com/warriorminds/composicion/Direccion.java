package com.warriorminds.composicion;

/**
 * Clase Dirección. Representa una dirección.
 * @author warriorminds
 */
public class Direccion {
    private String calle;
    private String numero;
    private String colonia;
    private String codigoPostal;
    
    public Direccion(String calle, String numero, String colonia, String codigoPostal) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.codigoPostal = codigoPostal;
    }
    
    public void imprimirDireccion() {
        System.out.println(calle + " número " + numero + ", colonia: " + colonia + ", C.P. " + codigoPostal);
    }
}
