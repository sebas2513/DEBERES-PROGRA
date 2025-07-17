package HECHOLIBRO;
import java.util.Scanner;

public class LIBRO1 {

    public static void main(String[] args) {
        int[] numeros = leerNumeros();
        int suma = calcularSuma(numeros);
        mostrarResultado(suma);
    }

    
    public static int[] leerNumeros() {
        Scanner teclado = new Scanner(System.in);
        int[] n = new int[5];
        for (int i = 0; i < n.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            n[i] = teclado.nextInt();
        }
        return n;
    }

    public static int calcularSuma(int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma;
    }

    public static void mostrarResultado(int suma) {
        System.out.println();
        System.out.println("Suma: " + suma);
    }
}
