package model;

/**
 * Representa un equipo de hockey con jugadores.
 * Un equipo tiene un nombre y una lista de jugadores.
 */
public class Equipo {

    private final int CANTIDAD_JUGADORES = 6;
    protected String nombreEquipo;
    private JugadorHockey[] jugadores = new JugadorHockey[CANTIDAD_JUGADORES];

    /**
     * Agrega un jugador al equipo en una posición específica.
     * @param jugador El jugador que se agregará.
     * @param posicion La posición del jugador en el equipo.
     */
    public void agregarJugador(JugadorHockey jugador, int posicion) {
        if (posicion >= 0 && posicion < jugadores.length) {
            jugadores[posicion] = jugador;
        }
    }

    /**
     * Obtiene la lista de jugadores del equipo.
     * @return Un arreglo de jugadores del equipo.
     */
    public JugadorHockey[] getJugadores() {
        return jugadores;
    }
}
