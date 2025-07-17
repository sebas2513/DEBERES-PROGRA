package APE2;

import java.util.Scanner;

public class JAV4 {
public static void main(String[] args) {
    int num,base;
        Scanner tec = new Scanner(System.in);
        System.out.print("Ingrese un número entero en base 10: ");
         num = tec.nextInt();

        System.out.print("Ingrese la base destino (menor que 10): ");
        base = tec.nextInt();
        if (base < 2 || base >= 10) {
            System.out.println("La base debe ser mayor o igual a 2 y menor que 10.");
          
        }

        String resultado = "";
        
        if (num == 0) {
            resultado = "0";
        } else {
            while (num > 0) {
                int residuo = num % base;
                resultado = residuo + resultado; 
                num = num / base;
            }
        }

        System.out.println("El número en base " + base + " es: " + resultado);

    }
}
