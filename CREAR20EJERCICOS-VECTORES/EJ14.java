import java.util.Random;
import java.util.Scanner;

public class EJ14 {

    public static void main(String[] args) {
        int[] vector = new int[10];
        Scanner tec = new Scanner(System.in);

        llenarvector(vector);
        System.out.println("vector generado:");
        mostrarvector(vector);

        int numero = pedirNumeroEnvector(vector, tec);

        rotarDerechaHastaNumero(vector, numero);
        System.out.println("\nvector rotado hasta que " + numero + " esté en la posición 0:");
        mostrarvector(vector);

      
    }

    public static void llenarvector(int[] vector) {
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(101);
        }
    }

    public static void mostrarvector(int[] vector) {
        for (int n : vector) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static int pedirNumeroEnvector(int[] vector, Scanner scanner) {
        int num;
        boolean encontrado;
        do {
            System.out.print("Introduce un número que esté en el vector: ");
            num = scanner.nextInt();
            encontrado = false;
            for (int n : vector) {
                if (n == num) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("El número no está en el vector, inténtalo de nuevo.");
            }
        } while (!encontrado);
        return num;
    }

    public static void rotarDerechaHastaNumero(int[] vector, int num) {
        while (vector[0] != num) {
            rotarDerecha(vector);
        }
    }

    public static void rotarDerecha(int[] vector) {
        int ultimo = vector[vector.length - 1];
        for (int i = vector.length - 1; i > 0; i--) {
            vector[i] = vector[i - 1];
        }
        vector[0] = ultimo;
    }
}

