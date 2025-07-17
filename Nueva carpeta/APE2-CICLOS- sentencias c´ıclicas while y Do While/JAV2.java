package APE2;

import java.util.Scanner;

public class JAV2 {
public static void main(String[] args) {
    int num,cont=0,digito;
        Scanner tec = new Scanner(System.in);

        System.out.print("INGRESE UN NUMERO ENTERO ");
         num = tec.nextInt();

    
        while (num > 0) {
            digito = num % 10; 
            if (digito % 2 == 0) { 
                cont++;
            }
            num = num / 10; 
        }

        System.out.println("La cantidad de dígitos pares es: " + cont);


    }
}
