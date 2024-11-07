package model;

/**
 * Representa a un jugador de hockey sobre hielo.
 * Un jugador tiene un número, una posición en el campo y puede desplazarse con el palo.
 */
public class JugadorHockey extends Persona implements DesplazarseEnPistaConPalo {
    protected int numero;
    protected Posicion posicion;

    /**
     * Constructor de la clase JugadorHockey.
     * @param nombre El nombre del jugador.
     * @param edad La edad del jugador.
     * @param numero El número del jugador.
     * @param posicion La posición del jugador.
     */
    public JugadorHockey(String nombre, int edad, int numero, Posicion posicion) {
        super(nombre, edad);
        this.numero = numero;
        this.posicion = posicion;
    }

    /**
     * Método para desplazarse con el palo.
     * @return Una cadena que describe cómo el jugador se desplaza con el palo.
     */
    @Override
    public String desplazarseConPalo() {
        return nombre + " se desplaza con el palo.";
    }

    /**
     * Método para pasar el disco a otro jugador.
     * @param destinatario El jugador que recibirá el disco.
     * @return Una cadena que describe el pase.
     */
    @Override
    public String pasarDisco(JugadorHockey destinatario) {
        return nombre + " pasa el disco a " + destinatario.nombre + ".";
    }

    /**
     * Método para anotar un gol.
     * @return Una cadena que describe el gol anotado.
     */
    public String anotarGol() {
        return nombre + " anota un gol.";
    }
}
