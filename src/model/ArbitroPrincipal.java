package model;

/**
 * Representa a un árbitro principal en un partido de hockey sobre hielo.
 * Un árbitro principal es un tipo específico de árbitro.
 */
public class ArbitroPrincipal extends Arbitro {

    /**
     * Constructor de la clase ArbitroPrincipal.
     * @param nombre El nombre del árbitro principal.
     * @param edad La edad del árbitro principal.
     */
    public ArbitroPrincipal(String nombre, int edad) {
        super(nombre, edad);
    }
}
