package HECHOLIBRO;

import java.util.Scanner;

public class LIBRO5 {

    public static void main(String[] args) {
        int[] numeros = leerNumeros(7);
        int numeroBuscado = leerNumeroBuscado();
        int posicion = buscarNumero(numeros, numeroBuscado);
        mostrarResultado(posicion);
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


    public static int leerNumeroBuscado() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero a buscar: ");
        return teclado.nextInt();
    }

    
    public static int buscarNumero(int[] numeros, int buscado) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                return i; 
            }
        }
        return -1; 
    }

    public static void mostrarResultado(int posicion) {
    
        if (posicion != -1) {
            System.out.println("Respuesta: EXISTE");
            System.out.println("Posicion: " + posicion);
        } else {
            System.out.println("Respuesta: NO EXISTE");
            System.out.println("Posicion: -1");
        }
    }
}