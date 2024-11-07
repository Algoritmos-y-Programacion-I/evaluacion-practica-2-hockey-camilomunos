package ui;

import java.util.Scanner;
import model.Controller;

/**
 * Clase principal que ejecuta la interfaz de usuario para interactuar con la simulación de partidos de hockey sobre hielo.
 * Esta clase proporciona un menú de opciones para el usuario y gestiona la interacción con el controlador del partido.
 */
public class Executable {

    private Scanner escaner;
    private Controller controladora;
    private boolean flag;

    /**
     * Constructor de la clase Executable.
     * Inicializa el escáner para la entrada del usuario y el controlador para gestionar la simulación del partido.
     */
    public Executable() {
        escaner = new Scanner(System.in);
        controladora = new Controller();
    }

    /**
     * Método que ejecuta el menú principal y gestiona la interacción del usuario.
     * El programa continuará en un ciclo hasta que el usuario decida salir.
     */
    public void run() {
        flag = false;

        while (!flag) {
            System.out.println("\nBienvenido al menú:\n");
            System.out.println("Opciones:\n" 
                + "1. Mostrar fixture de los partidos\n"
                + "2. Precargar información\n"
                + "3. Realizar partido entre 2 equipos\n"
                + "4. Simular jugada de gol\n"
                + "5. Salir del programa\n");

            int option = escaner.nextInt();
            escaner.nextLine();

            switch (option) {
                case 1:
                    // Muestra el fixture de los partidos disponibles.
                    System.out.println(controladora.fixture());
                    break;
                case 2:
                    // Simula la precarga de la información (información ficticia en este caso).
                    System.out.println("Información precargada correctamente.");
                    break;
                case 3:
                    // Simula un partido entre dos equipos.
                    simularPartido();
                    break;
                case 4:
                    // Simula una jugada de gol.
                    System.out.println(controladora.simularJugadaDeGol());
                    break;
                case 5:
                    // Finaliza la ejecución del programa.
                    flag = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    // Solicita una opción válida si el usuario ingresa una opción incorrecta.
                    System.out.print("Por favor ingrese una opción válida.\n");
            }
        }
    }

    /**
     * Método que simula un partido entre dos equipos.
     * Imprime un mensaje de simulación del partido.
     */
    private void simularPartido() {
        System.out.println("Simulando partido entre dos equipos...");
        System.out.println("Partido simulado entre Equipo 1 y Equipo 2.");
    }

    /**
     * Método principal que inicializa la clase Executable y ejecuta el menú.
     * @param args Argumentos de línea de comando (no utilizados en este caso).
     */
    public static void main(String[] args) {
        Executable mainApp = new Executable();
        mainApp.run();
    }
}
