package EJERCICIOSPLANTEADOSLIB;

import java.util.Scanner;

public class EJ2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        int mayor = encontrarMayor(numeros);
        int menor = encontrarMenor(numeros);
        int[] resultado = {mayor, menor};

        mostrarResultado(resultado);
    }

    public static int encontrarMayor(int[] n) {
        int mayor = n[0];
        for (int i = 1; i < n.length; i++) {
            if (n[i] > mayor) {
                mayor = n[i];
            }
        }
        return mayor;
    }

    public static int encontrarMenor(int[] n) {
        int menor = n[0];
        for (int i = 1; i < n.length; i++) {
            if (n[i] < menor) {
                menor = n[i];
            }
        }
        return menor;
    }

    public static void mostrarResultado(int[] resultado) {
    
        System.out.println("Mayor: " + resultado[0]);
        System.out.println("Menor: " + resultado[1]);
    }
}