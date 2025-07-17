package HECHOLIBRO;
import java.util.Scanner;

public class LIBRO2 {

    public static void main(String[] args) {
        int[] numeros = leerNumeros();
        int mayor = encontrarMayor(numeros);
        mostrarResultado(mayor);
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

    public static int encontrarMayor(int[] numeros) {
        int mayor = numeros[0]; 
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        return mayor;
    }


    public static void mostrarResultado(int mayor) {
        System.out.println();
        System.out.println("Mayor: " + mayor);
    }
}