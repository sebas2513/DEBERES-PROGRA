import java.util.Scanner;

public class EJ10 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int[] numeros = new int[10];

        pedirNumeros(numeros, tec);
        mostrarvector(numeros);

        int inicial = pedirPosicion("inicial", tec);
        int fin = pedirPosicion("final", tec);

        while (inicial < 0 || inicial >= 10 || fin < 0 || fin >= 10 || inicial >= fin) {
            System.out.println("Error: Asegúrate de que 0 <= inicial < final <= 9");
            inicial = pedirPosicion("inicial", tec);
            fin = pedirPosicion("final", tec);
        }

        rotarvector(numeros, inicial, fin);

        System.out.println("\nvector después de rotar:");
        mostrarvector(numeros);

      
    }

    public static void pedirNumeros(int[] vector, Scanner scanner) {
        System.out.println("Ingresa 10 números:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Número " + i + ": ");
            vector[i] = scanner.nextInt();
        }
    }

    public static void mostrarvector(int[] vector) {
        System.out.println("\nÍndice : Valor");
        for (int i = 0; i < vector.length; i++) {
            System.out.printf("%6d : %d\n", i, vector[i]);
        }
    }

    public static int pedirPosicion(String nombre, Scanner scanner) {
        System.out.print("Introduce la posición " + nombre + " (0 a 9): ");
        return scanner.nextInt();
    }

   
    public static void rotarvector(int[] vector, int inicial, int fin) {
        int valor = vector[inicial];
        for (int i = inicial; i < fin; i++) {
            vector[i] = vector[i + 1];
        }
        vector[fin] = valor;
    }
}

