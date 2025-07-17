package EJERCICIOSPLANTEADOSLIB;

import java.util.Scanner;

public class EJ3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        System.out.print("Ingrese el número n: ");
        int n = teclado.nextInt();

        int cantidadMultiplos = contarMultiplos(numeros, n);

        System.out.println("Cantidad de múltiplos de " + n + ": " + cantidadMultiplos);
    }

    
    public static int contarMultiplos(int[] numero, int n) {
        int contador = 0;
      for (int i = 0; i < numero.length; i++) {
         if (numero[i] % n == 0) {
                contador++;
            }
      }
      return contador;
}
}