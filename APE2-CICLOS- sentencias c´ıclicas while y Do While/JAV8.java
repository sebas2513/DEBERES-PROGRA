package APE2;

import java.util.Scanner;

public class JAV8 {
public static void main(String[] args) {
    int num ,max=0,dig;
        Scanner tec = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        num = tec.nextInt();
    

     
        if (num == 0) {
            max = 0;
        } else {
            
            do {
                dig = num % 10; 
                if (dig > max) {
                    max = dig;
                }
                num = num / 10; 
            } while (num > 0);
        }

        System.out.println("El dígito mayor es: " + max);

     
    }
}
