package APE2;

import java.util.Scanner;

public class JAV11 {
 public static void main(String[] args) {
    int inicio,fin , contadorPrimos = 0,num;
        Scanner tec = new Scanner(System.in);

    
        System.out.print("Ingrese el número inicial del rango: ");
        inicio = tec.nextInt();

        System.out.print("Ingrese el número final del rango: ");
        fin = tec.nextInt();

       
        if (inicio > fin) {
            System.out.println("Error: el número inicial debe ser menor o igual al final.");
        } else {
            
             num = inicio;

           
            do {
                boolean esPrimo = true;
                int i = 2;

                if (num < 2) {
                    esPrimo = false;
                } else {
                  
                    do {
                        if (num % i == 0 && num != i) {
                            esPrimo = false;
                        }
                        i++;
                    } while (i < num && esPrimo);
                }

                if (esPrimo) {
                    contadorPrimos++;
                }

                num++;
            } while (num <= fin);

         
            System.out.println("LOS NUMEROS PRIMOS ENCONTRADOS SON: " + contadorPrimos);
        }

       
    }
}
