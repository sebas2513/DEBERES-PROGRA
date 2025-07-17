package APE2;

import java.util.Scanner;

public class JAV6 {
 public static void main(String[] args) {
    int a,b,residuo;
        Scanner tec = new Scanner(System.in);

        // Entradas
        System.out.print("Ingrese el primer número: ");
         a = tec.nextInt();

        System.out.print("Ingrese el segundo número: ");
         b = tec.nextInt();


        while (b != 0) {
          residuo = a % b;
            a = b;
            b = residuo;
        }

        System.out.println("El MCD es: " + a);

    }
}
