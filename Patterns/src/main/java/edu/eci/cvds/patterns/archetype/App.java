package edu.eci.cvds.patterns.archetype;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        String nombre;
        String apellido;

        if (args.length >= 2) {
            nombre = args[0];
            apellido = args[1];
        } else {
            nombre = "usuario";
            apellido = "";
        }

        System.out.println("Hola, " + nombre + " " + apellido + "!");
    }
}
