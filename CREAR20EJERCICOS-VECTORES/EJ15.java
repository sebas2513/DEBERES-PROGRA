import java.util.Random;

public class EJ15 {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        generarNumeros(numeros);

        System.out.println("vector original con índices:");
        mostrarvectorConIndices(numeros);

        int[] resultado = reordenarAlternando(numeros);

        System.out.println("\nvector reordenado alternando ≤100 y >100:");
        mostrarvectorConIndices(resultado);
    }

    public static void generarNumeros(int[] vector) {
        Random rand = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(201);
        }
    }

    public static void mostrarvectorConIndices(int[] vector) {
        System.out.print("Índices: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        System.out.print("Valores: ");
        for (int n : vector) {
            System.out.printf("%4d", n);
        }
        System.out.println();
    }

    public static int[] reordenarAlternando(int[] vector) {
        int[] menores = new int[vector.length];
        int[] mayores = new int[vector.length];
        int cMenores = 0, cMayores = 0;

        for (int n : vector) {
            if (n <= 100) {
                menores[cMenores++] = n;
            } else {
                mayores[cMayores++] = n;
            }
        }

        int[] resultado = new int[vector.length];
        int iMenores = 0, iMayores = 0, iRes = 0;

        while (iMenores < cMenores && iMayores < cMayores) {
            resultado[iRes++] = menores[iMenores++];
            resultado[iRes++] = mayores[iMayores++];
        }

        while (iMenores < cMenores) {
            resultado[iRes++] = menores[iMenores++];
        }
        while (iMayores < cMayores) {
            resultado[iRes++] = mayores[iMayores++];
        }

        return resultado;
    }
}
