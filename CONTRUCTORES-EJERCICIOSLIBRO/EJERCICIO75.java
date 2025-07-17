package EJERCICIOLIBRO;

import java.util.Scanner;

public class EJERCICIO75 {


    public  void VERSIESVOCAL(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            System.out.println(c + " es una vocal.");
        }
    }

    public void VERSIESMayuscula(char c) {
        if (c >= 'A' && c <= 'Z') {
            System.out.println(c + " es una letra mayúscula.");
        }
    }

    public  void VERSIESMinuscula(char c) {
        if (c >= 'a' && c <= 'z') {
            System.out.println(c + " es una letra minúscula.");

        }
    }

    public  void SIESNumero(char c) {
        if (c >= '0' && c <= '9') {
            System.out.println(c + " es un número.");
        }
    }

    public  void SIESSimbolo(char c) {
        if (!Character.isLetterOrDigit(c)) {
            System.out.println(c + " es un símbolo.");
        }
    }

      public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa un carácter: ");
        char caracter = teclado.next().charAt(0);
EJERCICIO75 DATOS=new EJERCICIO75();
DATOS.SIESNumero(caracter);
DATOS.SIESSimbolo(caracter);
DATOS.VERSIESMayuscula(caracter);
DATOS.VERSIESMinuscula(caracter);
DATOS.VERSIESVOCAL(caracter);
    }
}