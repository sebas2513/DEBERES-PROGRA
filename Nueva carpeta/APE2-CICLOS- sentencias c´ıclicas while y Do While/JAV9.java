package APE2;

import java.util.Scanner;

public class JAV9 {
 public static void main(String[] args) {
    int num1,num2,i=1,sumDiv1 = 0, sumDiv2 = 0;
        Scanner tec = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        num1 = tec.nextInt();

        System.out.print("Ingrese el segundo número: ");
        num2 = tec.nextInt();
        
        do {
            if (num1 % i == 0) {
                sumDiv1 += i;
            }
            i++;
        } while (i <= num1 / 2);

        i = 1; 

        do {
            if (num2 % i == 0) {
                sumDiv2 += i;
            }
            i++;
        } while (i <= num2 / 2);

    
        if (sumDiv1 == num2 && sumDiv2 == num1) {
            System.out.println(num1 + " y " + num2 + " son números amigos.");
        } else {
            System.out.println(num1 + " y " + num2 + " NO son números amigos.");
        }

     
    }
}
