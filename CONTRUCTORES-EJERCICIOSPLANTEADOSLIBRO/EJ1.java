package EJERCICIOSPLANTEADOSLIB;

import java.util.Scanner;

public class EJ1 {

    public static void main(String[] args) {
        int[] numeros = leerNumeros(4);
        int suma = calcularSuma(numeros);
        double promedio = calcularPromedio(suma, numeros.length);
        mostrarResultados(suma, promedio);
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
    public static int calcularSuma(int[] numeros) {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return suma;
    }


    public static double calcularPromedio(int suma, int cantidad) {
        return (double) suma / cantidad;
    }

    public static void mostrarResultados(int suma, double promedio) {
    
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}

