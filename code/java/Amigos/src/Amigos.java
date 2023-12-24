/**
 * Un pequeño ejemplo de qué es una clase y qué es un objeto
 * <a href="https://emiliodevesa.wordpress.com/2010/09/29/java-ejemplo-de-clase-objeto/">Blog
 * post</a>
 *
 * @author Emilio Devesa (http://emiliodevesa.wordpress.com)
 * @version 0.1
 */
public class Amigos {

    /**
     * Punto de entrada del programa
     *
     * @param args Argumentos introducidos en la consola al invocar el programa
     */
    public static void main(String[] args) {
        Persona p1 = new Persona("Pepe", 37, "Lugo", 611223344);
        Persona p2 = new Persona();

        System.out.println("P1:");
        System.out.println("Nombre: " + p1.consultarNombre());
        System.out.println("Edad: " + p1.consultarEdad());
        System.out.println("Ciudad: " + p1.consultarCiudad());
        System.out.println("Telefono: " + p1.consultarTelefono());

        System.out.println("P2:");
        System.out.println("Nombre: " + p2.consultarNombre());
        System.out.println("Edad: " + p2.consultarEdad());
        System.out.println("Ciudad: " + p2.consultarCiudad());
        System.out.println("Telefono: " + p2.consultarTelefono());

        p2.cambiarEdad(20);
        System.out.println("Edad P2: " + p2.consultarEdad());
    }

}

/**
 * Una clase que modela una persona y almacena nombre, edad, ciudad y teléfono
 *
 * @author Emilio Devesa (http://emiliodevesa.wordpress.com)
 * @version 0.1
 */
class Persona {

    private String nombre;
    private int edad;
    private String ciudad;
    private int telefono;

    /**
     * Constructor que recibe los datos de la persona por parámetros
     *
     * @param n Nombre
     * @param e Edad
     * @param c Ciudad
     * @param t Teléfono
     */
    public Persona(String n, int e, String c, int t) {
        this.nombre = n;
        this.edad = e;
        this.ciudad = c;
        this.telefono = t;
    }

    /**
     * Constructor sin parámetros
     */
    public Persona() {
        this.nombre = "";  // nombre vacio
        this.edad = 0;     // edad cero
        this.ciudad = "";  // ciudad vacia
        this.telefono = 0; // telefono cero
    }

    /**
     * Cambia la edad de la persona
     *
     * @param e El nuevo valor del dato edad
     */
    public void cambiarEdad(int e) {
        this.edad = e;
    }

    /**
     * Obtener el nombre de esta persona
     *
     * @return Un String que contiene el nombre de la persona
     */
    public String consultarNombre() {
        return nombre;
    }

    /**
     * Obtener la edad de esta persona
     *
     * @return La edad como int
     */
    public int consultarEdad() {
        return edad;
    }

    /**
     * Obtener la ciudad de esta persona
     *
     * @return Un String que contiene el nombre de la ciudad
     */
    public String consultarCiudad() {
        return ciudad;
    }

    /**
     * Obtener el teléfono de esta persona
     *
     * @return El teléfono como int
     */
    public int consultarTelefono() {
        return telefono;
    }

}