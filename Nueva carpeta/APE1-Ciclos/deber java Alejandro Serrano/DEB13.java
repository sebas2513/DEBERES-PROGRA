import java.util.Random;
import java.util.Scanner;

public class DEB13 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int usuarioGana = 0 , computadoraGana = 0;
       int eleccionUsuario, eleccionComputadora;

        System.out.println("¡Bienvenido al juego Piedra, Papel o Tijeras!");
        System.out.println("Juega al mejor de 3 rondas. Gana quien llegue primero a 2.");
        System.out.println("Opciones:");
        System.out.println("1 - Piedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tijeras");

        while (usuarioGana < 2 && computadoraGana < 2) {
            System.out.print("\nElige una opción (1, 2 o 3): ");
            eleccionUsuario = scanner.nextInt();

            if (eleccionUsuario < 1 || eleccionUsuario > 3) {
                System.out.println("Entrada inválida. Intenta con 1, 2 o 3.");
                continue;
            }

            eleccionComputadora = random.nextInt(3) + 1;

            String[] opciones = {"Piedra", "Papel", "Tijeras"};
            System.out.println("Tú elegiste: " + opciones[eleccionUsuario - 1]);
            System.out.println("Computadora eligió: " + opciones[eleccionComputadora - 1]);

            // Determinar ganador de la ronda
            if (eleccionUsuario == eleccionComputadora) {
                System.out.println("Empate.");
            } else if (
                (eleccionUsuario == 1 && eleccionComputadora == 3) ||
                (eleccionUsuario == 2 && eleccionComputadora == 1) ||
                (eleccionUsuario == 3 && eleccionComputadora == 2)
            ) {
                System.out.println("¡Ganaste esta ronda!");
                usuarioGana++;
            } else {
                System.out.println("La computadora gana esta ronda.");
                computadoraGana++;
            }

            // Mostrar marcador actual
            System.out.println("Marcador - Tú: " + usuarioGana + " | Computadora: " + computadoraGana);
        }

        // Resultado final
        if (usuarioGana == 2) {
            System.out.println("\n🎉 ¡Felicidades! Ganaste el juego.");
        } else {
            System.out.println("\n💻 La computadora ganó el juego. ¡Inténtalo de nuevo!");
        }
    }
}
