package model;

/**
 * Representa un juez de línea en un partido de hockey sobre hielo.
 * Un juez de línea es un tipo específico de árbitro.
 */
public class JuezDeLinea extends Arbitro {

    /**
     * Constructor de la clase JuezDeLinea.
     * @param nombre El nombre del juez de línea.
     * @param edad La edad del juez de línea.
     */
    public JuezDeLinea(String nombre, int edad) {
        super(nombre, edad);
    }
}
