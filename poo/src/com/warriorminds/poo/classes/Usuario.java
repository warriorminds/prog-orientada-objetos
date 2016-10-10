package com.warriorminds.poo.classes;

/**
 * En esta clase se demuestra la estructura básica que tiene una clase.
 * La sección de variables, los constructores y los métodos, así como los
 * tipos de variables (instancia y de clase) y los tipos de métodos (de instancia
 * y de clase).
 * 
 * @author warriorminds
 */
public class Usuario {
    /**
     * Sección de variables. En la sección superior de la clase, se acostumbra
     * declarar las variables globales, que estarán disponible para cualquier 
     * método dentro de la clase. Una variable se declara de la siguiente manera:
     * 
     * métodoDeAcceso tipoDeDato nombreDeVariable;
     * 
     * private String nombre;
     * 
     * Se acostumbra colocar primero las variables de clase, y debajo de ellas,
     * las variables de instancia.
     */
    
    /**
     * Variables de clase.
     * 
     * Todas las instancias de esta clase compartirán estas variables. Si alguna
     * instancia de la clase cambia este valor, TODAS las instancias observarán
     * este cambio.
     */
    public static int numeroDeUsuariosCreados = 0;
    
    /* Fin de sección variables de clase. */
    
    /**
     * Variables de instancia.
     * 
     * Cada instancia (o copia) de esta clase tendrá su propia copia de estas
     * variables, con sus propios datos.
     */
    private String nombre;
    private String apellido;
    private int edad;
    private String email;
    
    /* Fin de sección Variables de instancia. */
    
    /**
     * Constructores. Los constructores son métodos especiales que se utilizan
     * para la creación de los objetos. Por defecto, todas las clases tienen
     * un constructor sin parámetros, pero se pueden declarar los que sean necesarios,
     * cada uno con diferentes parámetros.
     * 
     * public NombreDeLaClase(TipoDeDato nombreParámetro, TipoDeDato nombreParametro) {
     * 
     * }
     * 
     */
    public Usuario() {
        Usuario.usuarioCreado();
    }
    
    public Usuario(String email, String nombre, String apellido, int edad) {
        Usuario.usuarioCreado();
        
        this.email = email;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    /* Fin de sección Constructores. */
    
    /**
     * Métodos. Todos los métodos que tendrá el objeto. Los métodos públicos 
     * pueden ser utilizados por otros objetos, los métodos privados solamente
     * se pueden utilizar dentro del objeto.
     * 
     * tipoDeAcceso tipoDatoDeRetorno nombreDelMétodo(TipoDeDato nombreParámetro...) {
     * 
     * }
     * 
     * public void setNombre(String nombre) {
     *  this.nombre = nombre;
     * }
     */
    
    /**
     * Métodos de clase. Estos métodos pertenecerán a la clase, Todas las instancias
     * del objeto tendrán acceso al mismo método.
     * 
     * Únicamente pueden modificar variables de clase. (static)
     */
    public static void usuarioCreado() {
        numeroDeUsuariosCreados++;
    }
    
    public static int cuantosUsuariosCreados() {
        return numeroDeUsuariosCreados;
    }
    
    /* Fin de sección Métodos de clase. */
    
    /**
     * Métodos de instancia. Estos métodos pertenecerán a cada instancia (o copia).
     * Podrán modificar tanto variables de instancia como variables de clase.
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
    
    /* Fin de sección Métodos de instancia */
}
