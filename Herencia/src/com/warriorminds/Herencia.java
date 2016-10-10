package com.warriorminds;

import com.warriorminds.herencia.Auto;
import com.warriorminds.herencia.Avion;
import com.warriorminds.herencia.NaveEspacial;

/**
 *
 * @author warriorminds
 */
public class Herencia {

    public static void main(String[] args) {
        Auto auto = new Auto("Audi", "Rojo", 2);
        Avion avion = new Avion(700, "Boeing", "787");
        NaveEspacial naveEspacial = new NaveEspacial(8, "Orion", "EUA");
        
        auto.ponerCombustible(30);
        avion.ponerCombustible(250);
        naveEspacial.ponerCombustible(25000);
        
        auto.arrancar();
        auto.avanzar();
        auto.cambiarVelocidades();
        auto.apagar();
        
        avion.arrancar();
        avion.despegar();
        avion.avanzar();
        avion.aterrizar();
        
        naveEspacial.arrancar();
        naveEspacial.despegar();
        naveEspacial.colocarSatelite();
        naveEspacial.aterrizar();
   }    
}
