package APE2;

import java.util.Scanner;

public class JAV10 {
public static void main(String[] args) {
    int num,base,dig,copia;
        Scanner tec = new Scanner(System.in);

     
        System.out.print("Ingrese un número entero: ");
         num = tec.nextInt();

        System.out.print("Ingrese la base (mayor que 1): ");
         base = tec.nextInt();

        boolean pertenece = true;
      
        copia = num;

        
        if (num == 0) {
            pertenece = (0 < base);
        } else {
            
            do {
                dig = num % 10;
                if (dig >= base) {
                    pertenece = false;
                    break;
                }
                num /= 10;
            } while (num > 0);
        }

        
        if (pertenece) {
            System.out.println("El número " + copia + " pertenece a la base " + base + ".");
        } else {
            System.out.println("El número " + copia + " NO pertenece a la base " + base + ".");
        }

    }
}
