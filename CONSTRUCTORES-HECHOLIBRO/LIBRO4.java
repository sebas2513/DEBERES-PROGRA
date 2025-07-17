package HECHOLIBRO;

import java.util.Scanner;

import java.util.Scanner;

public class LIBRO4 {

    public boolean esPrimo(int numero) {
        if (numero <= 1) return false;

        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) return false;
        }

        return true;
    }
    public void mostrarPrimos(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            if (esPrimo(numeros[i])) {
                System.out.println("Es primo: " + numeros[i]);
            } else {
                System.out.println("No es primo: " + numeros[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        LIBRO4 datos = new LIBRO4();
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }
        datos.mostrarPrimos(numeros);
    }
}
