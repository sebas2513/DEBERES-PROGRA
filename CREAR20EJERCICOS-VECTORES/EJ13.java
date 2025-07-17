import java.util.Random;
import java.util.Scanner;
//16
public class EJ13 {

    public static void main(String[] args) {
        int[] numeros = new int[20];
        Scanner tec = new Scanner(System.in);

        llenarvector(numeros);
        System.out.println("vector generado:");
        mostrarvector(numeros, -1);

        System.out.print("\n¿Quieres resaltar múltiplos de 5 o de 7? (escribe 5 o 7): ");
        int opcion = tec.nextInt();

        while (opcion != 5 && opcion != 7) {
            System.out.print("Opción no válida. Escribe 5 o 7: ");
            opcion = tec.nextInt();
        }

        System.out.println("\nArray con los múltiplos resaltados:");
        mostrarvectorMultiplos(numeros, opcion);

     
    }

    public static void llenarvector(int[] vector) {
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(401); 
        }
    }

    public static void mostrarvector(int[] vector, int resaltado) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
            if ((i + 1) % 10 == 0) System.out.println();
        }
    }

    public static void mostrarvectorMultiplos(int[] vector, int divisor) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % divisor == 0) {
                System.out.print("[" + vector[i] + "] ");
            } else {
                System.out.print(vector[i] + " ");
            }
            if ((i + 1) % 10 == 0) System.out.println();
        }
    }
}

