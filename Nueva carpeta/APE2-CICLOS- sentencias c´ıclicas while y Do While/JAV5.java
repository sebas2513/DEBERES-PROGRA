package APE2;

import java.util.Scanner;

public class JAV5 {
  public static void main(String[] args) {
     int num,digitoBuscar;
     boolean encontrado = false;
        Scanner tec = new Scanner(System.in);

        // Entradas
        System.out.print("INGRESE UN NUMERO ");
        num = tec.nextInt();

        System.out.print("INGRESE EL DIGITO QUE DESEA ENCONTRAR (0-9) ");
        digitoBuscar = tec.nextInt();


        if (digitoBuscar < 0 || digitoBuscar > 9) {
            System.out.println("VUELVA A INGRESAR UN DIGITO VALIDO (0-9).");
            return;
        }


       

        while (num > 0) {
            int digitoActual = num % 10;
            if (digitoActual == digitoBuscar) {
                encontrado = true;
                break; 
            }
            num /= 10;
        }

        if (encontrado) {
            System.out.println("El dígito " + digitoBuscar + " SÍ está en el número.");
        } else {
            System.out.println("El dígito " + digitoBuscar + " NO está en el número.");
        }

        
    }
}
