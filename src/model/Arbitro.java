package model;

/**
 * Representa un árbitro en un partido de hockey sobre hielo.
 * Un árbitro es una persona que tiene la capacidad de desplazarse en la pista sin palo.
 */
public class Arbitro extends Persona implements IDesplazarseEnPistaSinPalo {

    /**
     * Constructor de la clase Arbitro.
     * @param nombre El nombre del árbitro.
     * @param edad La edad del árbitro.
     */
    public Arbitro(String nombre, int edad) {
        super(nombre, edad);
    }

    /**
     * Método que permite al árbitro desplazarse sobre el hielo.
     * @return Una cadena que describe cómo el árbitro se desplaza sobre el hielo.
     */
    @Override
    public String desplazarse() {
        return nombre + " se desplaza sobre el hielo como árbitro.";
    }
}
