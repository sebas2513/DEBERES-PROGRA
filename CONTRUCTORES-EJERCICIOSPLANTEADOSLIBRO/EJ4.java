package EJERCICIOSPLANTEADOSLIB;

import java.util.Scanner;

public class EJ4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }
        System.out.print("Ingrese 'A' para ascendente o 'D' para descendente: ");
        char tipoOrden = teclado.next().toUpperCase().charAt(0);


        ordenar(numeros, tipoOrden);

    
        System.out.println("Numeros ordenados:");
        for (int num : numeros) {
            System.out.println(num);
        }
    }

    
    public static void ordenar(int[] numeros_, char tipo) {
        int tmp;
        for (int i = 0; i < numeros_.length - 1; i++) {
            for (int j = 0; j < numeros_.length - 1 - i; j++) {
                if ((tipo == 'A' && numeros_[j] > numeros_[j + 1]) || (tipo == 'D' && numeros_[j] < numeros_[j + 1])) {
                    tmp = numeros_[j];
                    numeros_[j] = numeros_[j + 1];
                    numeros_[j + 1] = tmp;
                }
            }
        }
    }
}
