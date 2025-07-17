package EJERCICIOLIBRO;

import java.util.Scanner;

public class EJERCICIO79 {

    // Función que verifica si una palabra es palíndromo
    public static boolean esPalindromo(String palabra) {
        int inicio = 0;
        int fin = palabra.length() - 1;

        while (inicio < fin) {
            if (palabra.charAt(inicio) != palabra.charAt(fin)) {
                return false;
            }
            inicio++;
             fin--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

        if (esPalindromo(palabra)) {
            System.out.println("La palabra es un palíndromo.");
        } else {
            System.out.println("La palabra NO es un palíndromo.");
        }
    }
}
