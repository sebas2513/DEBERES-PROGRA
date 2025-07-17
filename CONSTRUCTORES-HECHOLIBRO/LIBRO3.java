package HECHOLIBRO;
import java.util.Scanner;

public class LIBRO3 {
//problema73

    
    public static int[] leerNumeros() {
        Scanner teclado = new Scanner(System.in);
        int[] n = new int[5];
        for (int i = 0; i < n.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            n[i] = teclado.nextInt();
        }
        return n;
    }

    public static int leerDivisor() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Divisor: ");
        return teclado.nextInt();
    }


    public static int contarDivisibles(int[] numeros, int divisor) {
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % divisor == 0) {
                contador++;
            }
        }
        return contador;
    }

    public static void mostrarResultado(int cantidad) {
        System.out.println();
        System.out.println("Cantidad: " + cantidad);
    }
        public static void main(String[] args) {
        int[] numeros = leerNumeros();
        int d = leerDivisor();
        int cantidadDivisibles = contarDivisibles(numeros, d);
        mostrarResultado(cantidadDivisibles);
    }

}
