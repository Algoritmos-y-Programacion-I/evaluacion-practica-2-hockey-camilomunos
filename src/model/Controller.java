package model;

import java.util.Random;

/**
 * Controlador de la simulación de un partido de hockey sobre hielo.
 * Gestiona los equipos, árbitros y simula jugadas en el partido.
 */
public class Controller {

    private Equipo[] equipos;
    private Arbitro[] arbitros;

    private final int CANTIDAD_EQUIPOS = 4;
    private final int CANTIDAD_ARBITROS = 2;
    private final int PASES_NECESARIOS = 5;

    /**
     * Constructor de la clase Controller.
     * Inicializa los equipos y árbitros y configura los equipos para el partido.
     */
    public Controller() {
        equipos = new Equipo[CANTIDAD_EQUIPOS];
        arbitros = new Arbitro[] {
            new Arbitro("Árbitro Principal", 45),
            new Arbitro("Juez de Línea", 39)
        };

        inicializarEquipos();
    }

    /**
     * Inicializa los equipos con jugadores y asigna posiciones.
     */
    private void inicializarEquipos() {
        for (int i = 0; i < CANTIDAD_EQUIPOS; i++) {
            equipos[i] = new Equipo();
            equipos[i].agregarJugador(new JugadorHockey("Jugador " + (i * 6 + 1), 22, i * 6 + 1, Posicion.DEFENSA), 0);
            equipos[i].agregarJugador(new JugadorHockey("Jugador " + (i * 6 + 2), 24, i * 6 + 2, Posicion.CENTRO), 1);
            equipos[i].agregarJugador(new JugadorHockey("Jugador " + (i * 6 + 3), 27, i * 6 + 3, Posicion.ALA), 2);
            equipos[i].agregarJugador(new JugadorHockey("Jugador " + (i * 6 + 4), 26, i * 6 + 4, Posicion.DEFENSA), 3);
            equipos[i].agregarJugador(new JugadorHockey("Jugador " + (i * 6 + 5), 28, i * 6 + 5, Posicion.ALA), 4);
            equipos[i].agregarJugador(new JugadorHockey("Portero", 30, i * 6 + 6, Posicion.PORTERO), 5);
        }
    }

    /**
     * Simula una jugada de gol entre los jugadores de un equipo.
     * @return Una cadena que describe los pases realizados por los jugadores y el gol anotado.
     */
    public String simularJugadaDeGol() {
        JugadorHockey[] jugadores = equipos[0].getJugadores();
        StringBuilder jugada = new StringBuilder();
        Random random = new Random();

        int pasesRealizados = 0;
        JugadorHockey jugadorActual = jugadores[random.nextInt(jugadores.length)];

        while (pasesRealizados < PASES_NECESARIOS) {
            JugadorHockey siguienteJugador;
            do {
                siguienteJugador = jugadores[random.nextInt(jugadores.length)];
            } while (siguienteJugador == jugadorActual);

            jugada.append(jugadorActual.pasarDisco(siguienteJugador)).append("\n");

            Arbitro arbitro = arbitros[random.nextInt(arbitros.length)];
            jugada.append(arbitro.desplazarse()).append("\n");

            pasesRealizados++;
            jugadorActual = siguienteJugador;
        }

        jugada.append(jugadorActual.anotarGol());

        return jugada.toString();
    }

    /**
     * Genera el fixture de los partidos entre los equipos.
     * @return Una cadena que contiene los partidos entre los equipos.
     */
    public String fixture() {
        StringBuilder fixture = new StringBuilder();
        Random random = new Random();

        for (int i = 1; i <= 2; i++) {
            int equipo1 = random.nextInt(CANTIDAD_EQUIPOS);
            int equipo2;
            do {
                equipo2 = random.nextInt(CANTIDAD_EQUIPOS);
            } while (equipo2 == equipo1);

            fixture.append("Partido ").append(i).append(": Equipo ").append(equipo1)
                    .append(" vs Equipo ").append(equipo2).append("\n");
        }

        return fixture.toString();
    }
}
