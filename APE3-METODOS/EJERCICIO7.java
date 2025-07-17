import java.util.Scanner;

public class EJERCICIO7 {


    public  boolean esPalindromo(String palabra) {
        palabra = palabra.toLowerCase(); 
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
        Scanner teclado = new Scanner(System.in);
EJERCICIO7 datos=new EJERCICIO7();
        System.out.print("INGRESE UNA PALABRA: ");
        String palabra = teclado.nextLine();

        if (datos.esPalindromo(palabra)) {
            System.out.println("La palabra \"" + palabra + "\" es un palíndromo.");
        } else {
            System.out.println("La palabra \"" + palabra + "\" no es un palíndromo.");
        }


    }
}
