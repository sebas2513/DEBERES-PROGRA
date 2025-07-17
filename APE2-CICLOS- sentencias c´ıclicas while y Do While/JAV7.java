package APE2;

import java.util.Scanner;

public class JAV7 {
  public static void main(String[] args) {
    int n,cont=0,num=1;
        Scanner tec = new Scanner(System.in);


        System.out.print("Ingrese la cantidad de múltiplos de 5 que desea obtener: ");
         n = tec.nextInt();

        cont = 0;  
        num = 1;   

        System.out.println("Los primeros " + n + " múltiplos de 5 son:");

        do {
            if (num % 5 == 0) {
                System.out.println(num);
                cont++;
            }
            num++;
        } while (cont < n);

        System.out.println("Cantidad total de múltiplos encontrados: " + cont);

    }
}
