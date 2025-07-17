package HECHOLIBRO;

import java.util.Scanner;

public class LIBRO6 {

    public static void main(String[] args) {
        int[] arregloA = leerArreglo(4, "A");
        int[] arregloB = leerArreglo(4, "B");
        int cantidadCoincidencias = contarCoincidencias(arregloA, arregloB);
        mostrarResultado(cantidadCoincidencias);
    }

    public static int[] leerArreglo(int tamaño, String nombre) {
        Scanner teclado = new Scanner(System.in);
        int[] arreglo = new int[tamaño];
        System.out.println("Arreglo " + nombre + ":");

        for (int i = 0; i < tamaño; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            arreglo[i] = teclado.nextInt();
        }
        return arreglo;
    }

    public static int contarCoincidencias(int[] a, int[] b) {
        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    contador++;
                }
            }
        }
        return contador;
    }


    public static void mostrarResultado(int cantidad) {
        System.out.println("Cantidad: " + cantidad);
    }
}
