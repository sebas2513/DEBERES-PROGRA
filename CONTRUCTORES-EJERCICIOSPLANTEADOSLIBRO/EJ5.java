package EJERCICIOSPLANTEADOSLIB;

import java.util.Scanner;

public class EJ5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        int cantidad = contarRepetidos(numeros);
        System.out.println("\nCantidad de números repetidos: " + cantidad);
    }

    public static int contarRepetidos(int[] numero_) {
        int repes = 0;
        boolean[] revisado = new boolean[numero_.length];

        for (int i = 0; i < numero_.length; i++) {
            if (revisado[i]) continue;

            boolean repetido = false;
            for (int j = i + 1; j < numero_.length; j++) {
                if (numero_[i] == numero_[j]) {
                    repetido = true;
                    revisado[j] = true; 
                }
            }

            if (repetido) {
                repes++;
            }

            revisado[i] = true;
        }

        return repes;
    }
}
