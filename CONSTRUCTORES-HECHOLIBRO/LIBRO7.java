package HECHOLIBRO;

import java.util.Scanner;

public class LIBRO7 {

    public static void main(String[] args) {
        int[] numeros = leerNumeros(4);
        ordenarNumeros(numeros);
        mostrarNumerosOrdenados(numeros);
    }

    public static int[] leerNumeros(int cantidad) {
        Scanner teclado = new Scanner(System.in);
        int[] n = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            n[i] = teclado.nextInt();
        }
        return n;
    }

    public static void ordenarNumeros(int[] n) {
        int tmp;
        for (int i = 0; i < n.length - 1; i++) {
            for (int j = 0; j < n.length - 1 - i; j++) {
                if (n[j] > n[j + 1]) {
                    tmp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = tmp;
                }
            }
        }
    }

    public static void mostrarNumerosOrdenados(int[] n) {
    
        System.out.println("Ordenado:");
        for (int i = 0; i < n.length; i++) {
            System.out.println("Numero " + (i + 1) + ": " + n[i]);
        }
    }
}
