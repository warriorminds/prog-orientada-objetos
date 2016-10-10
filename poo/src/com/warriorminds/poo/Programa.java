package com.warriorminds.poo;

import com.warriorminds.poo.classes.ClasesInternas;
import com.warriorminds.poo.classes.Usuario;

public class Programa {
    
    /* Método main se ejecuta cuando inicia el programa.
     * Cada método dentro del main muestra un concepto independiente.
     * Cada sección que se ve en la consola está delimitada por renglones
     * con esta cadena: "======================================".
     */
    public static void main(String[] args) {
        seccionUsoDeMetodos();        
        parametrosPorValor();
        parametrosPorReferencia();
        constructores();
        clasesInternas();
    }
    
    private static void seccionUsoDeMetodos() {
        System.out.println("===========================================");
        System.out.println("USO DE MÉTODOS");
        /* Uso de métodos */
        Usuario usuario = new Usuario();    // Creación de objeto usuario.
        usuario.setNombre("WarriorMinds");  // Uso del método para asignar un valor al objeto.
        
        System.out.println("Nombre de usuario: " + usuario.getNombre()); // Uso del método para obtener un valor del objeto.
        System.out.println("===========================================");
    }
    
    private static void parametrosPorValor() {
        System.out.println("===========================================");
        System.out.println("PASO DE PARAMETROS POR VALOR");
        int edad = 25;                          // Creación de variable (solamente visible dentro de este método).
        Usuario otroUsuario = new Usuario();    // Creación de un objeto usuario.
        otroUsuario.setEdad(edad);              // Asignación de edad. Paso de parámetro por valor.
        edad = 50;                              // Cambio de valor de variable local.
        System.out.println("Valor de edad del " // Valor de la variable del objeto sigue siendo 25.
                + "objeto otroUsuario: " 
                + otroUsuario.getEdad());
        System.out.println("Valor de edad de "  // Valor de la variable local es 50.
                + "la variable edad: "
                +  edad);
        System.out.println("===========================================");
    }
    
    private static void parametrosPorReferencia() {
        System.out.println("===========================================");
        System.out.println("PASO DE PARAMETROS POR REFERENCIA");
        Usuario usuario = new Usuario();                                    // Crear usuario.
        modificarUsuario(usuario, "Mi nombre es Warrior Minds.");           // Pasar usuario y asignarle un nombre. Dentro de este método
                                                                            // se asigna a usuario un nuevo objeto y a éste último se le
                                                                            // modifica el valor del nombre. El objeto original NO se modifica.
        System.out.println(usuario.getNombre());
        System.out.println("===========================================");
    }
    
    private static void modificarUsuario(Usuario usuario, String nombre) {
        usuario.setNombre(nombre);
        usuario = new Usuario();            // Se crea un nuevo usuario.
        usuario.setNombre("Otro nombre");   // Se modifica el nombre, pero el usuario original no cambia su valor.
    }

    private static void constructores() {
        System.out.println("===========================================");
        System.out.println("CONSTRUCTORES");
        Usuario usuario1 = new Usuario();                                               // Creación de usuario con constructor sin parámetros.
        Usuario usuario2 = new Usuario("warrior.software.minds@gmail.com",              // Creación de usuario con constructor con parámetros.
                                        "Warrior", "Minds", 25);
        System.out.println("Usuario 1: " + usuario1.getNombre());                       // Usuario1 no tiene valores.
        System.out.println("Usuario 2: " + usuario2.getNombre());                       // Usuario2 tiene el nombre de "Warrior".
        System.out.println("Usuarios creados: " + Usuario.cuantosUsuariosCreados());    // Se han creado 6 usuarios hasta ahora.
        System.out.println("===========================================");
    }
    
    private static void clasesInternas() {
        System.out.println("===========================================");
        System.out.println("CLASES INTERNAS");
        
        ClasesInternas usuario = new ClasesInternas("WarriorMinds", "warrior.software.minds@gmail.com", 
                25, "Calle Central", "Colonia Central", "12345");
        System.out.println(usuario.mostrarInfo());
        System.out.println("===========================================");
    }
}
