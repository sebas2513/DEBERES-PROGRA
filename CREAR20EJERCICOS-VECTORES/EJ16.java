import java.util.Random;
import java.util.Scanner;

public class EJ16 {

    public static void main(String[] args) {
        int[] vector = new int[12];
        Scanner tec = new Scanner(System.in);

        generarvector(vector);
        System.out.println("vector generado:");
        mostrarvectorConIndices(vector);

        System.out.print("\nNúmero a insertar: ");
        int numero = tec.nextInt();

        int posicion;
        do {
            System.out.print("Posición donde insertar (0-11): ");
            posicion = tec.nextInt();
            if (posicion < 0 || posicion > 11) {
                System.out.println("Posición no válida. Intenta de nuevo.");
            }
        } while (posicion < 0 || posicion > 11);

        insertarNumero(vector, numero, posicion);

        System.out.println("\nvector después de insertar el número:");
        mostrarvectorConIndices(vector);

   
    }

    public static void generarvector(int[] vector) {
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(201);
        }
    }

    public static void mostrarvectorConIndices(int[] vector) {
        System.out.print("Índices: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        System.out.print("Valores: ");
        for (int num : vector) {
            System.out.printf("%4d", num);
        }
        System.out.println();
    }

    public static void insertarNumero(int[] vector, int numero, int posicion) {
        for (int i = vector.length - 1; i > posicion; i--) {
            vector[i] = vector[i - 1];
        }
        vector[posicion] = numero;
    }
}
