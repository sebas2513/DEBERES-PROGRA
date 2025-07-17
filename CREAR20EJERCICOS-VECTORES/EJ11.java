import java.util.Random;
import java.util.Scanner;

public class EJ11 {

    public static void main(String[] args) {
        int[] numeros = new int[100];
        Scanner tec = new Scanner(System.in);

        llenarvector(numeros);
        System.out.println("vector generado:");
        mostrarvector(numeros, -1); 

        System.out.print("\n¿Deseas destacar el máximo o el mínimo? (escribe 'max' o 'min'): ");
        String opcion = tec.nextLine().toLowerCase();

        int valorDestacado = 0;
        if (opcion.equals("max")) {
            valorDestacado = encontrarMaximo(numeros);
        } else if (opcion.equals("min")) {
            valorDestacado = encontrarMinimo(numeros);
        } else {
            System.out.println("Opción no válida. Terminando programa.");
            return;
        }

        System.out.println("\nArray con el número destacado:");
        mostrarvector(numeros, valorDestacado);

       
    }
    public static void llenarvector(int[] vector) {
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(501); 
        }
    }

    public static void mostrarvector(int[] vector, int valorDestacado) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == valorDestacado) {
                System.out.print("**" + vector[i] + "** ");
            } else {
                System.out.print(vector[i] + " ");
            }

            if ((i + 1) % 10 == 0) System.out.println(); 
        }
    }

    public static int encontrarMaximo(int[] vector) {
        int max = vector[0];
        for (int n : vector) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public static int encontrarMinimo(int[] vector) {
        int min = vector[0];
        for (int n : vector) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }
}
