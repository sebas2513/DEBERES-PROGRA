package EJERCICIOLIBRO;

import java.util.Scanner;

public class EJERCICIO78 {

    public static int invertirNumero(int numero) {
        int numeroInvertido = 0;

        while (numero != 0) {
            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero /= 10;
        }

        return numeroInvertido;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = teclado.nextInt();

        int invertido = invertirNumero(numero);
        System.out.println("Número invertido: " + invertido);
    }
}
