package model;

/**
 * Interface que define los métodos para jugadores que se desplazan con palo en la pista de hockey.
 */
public interface DesplazarseEnPistaConPalo {

    /**
     * Permite que el jugador se desplace con el palo.
     * @return Una cadena que describe cómo el jugador se desplaza con el palo.
     */
    String desplazarseConPalo();

    /**
     * Permite que el jugador pase el disco a otro jugador.
     * @param destinatario El jugador al que se pasa el disco.
     * @return Una cadena que describe el pase de disco.
     */
    String pasarDisco(JugadorHockey destinatario);
}
