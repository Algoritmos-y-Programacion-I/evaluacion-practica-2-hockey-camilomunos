package model;

/**
 * Representa a una persona, que tiene un nombre y una edad.
 */
public abstract class Persona {

    protected String nombre;
    protected int edad;

    /**
     * Constructor de la clase Persona.
     * @param nombre El nombre de la persona.
     * @param edad La edad de la persona.
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}
