

import java.util.Scanner;

public class EJERCICIO3 {
    private int[] numeros = new int[5];
    private char orden;

    public void Datos() {
        Scanner tec = new Scanner(System.in);

        System.out.println("Ingrese 5 números:");
        for (int i = 0; i < 5; i++) {
            numeros[i] = tec.nextInt();
        }

        System.out.print("Ingrese 'A' para ascendente o 'D' para descendente: ");
        orden = tec.next().toUpperCase().charAt(0);
    }

    public void ordenarYMostrar() {
        int auxiliar;
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if ((orden == 'A' && numeros[j] > numeros[j + 1]) ||
                    (orden == 'D' && numeros[j] < numeros[j + 1])) {
                     auxiliar = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = auxiliar;
                }
            }
        }

        if (orden == 'A') {
            System.out.println("NUMEROS ASCENDENTES:");
        } else if (orden == 'D') {
            System.out.println("NUMEROS DESCENDENTES:");
        } else {
            System.out.println("OPCION NO VALIDA USE  'A' o 'D'.");
        }

        for (int i = 0; i < numeros.length; i++) {
               System.out.print(numeros[i] + " ");
        }

        System.out.println(" ");
    }

    public static void main(String[] args) {
        EJERCICIO3 obj = new EJERCICIO3();
        obj.Datos();
        obj.ordenarYMostrar();
    }
}


