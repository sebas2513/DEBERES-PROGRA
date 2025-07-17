package APE2;

import java.util.Scanner;

public class JAV1 {
public static void main(String[] args) {
    int in,fin,cont=0,numActual
    ;
        Scanner tec = new Scanner(System.in);
        
    
        System.out.print("INGRESE EL RANGO INICIAL");
        in = tec.nextInt();
        
        System.out.print("INGRESE EL RANGO FINAL");
         fin = tec.nextInt();
        
        cont = 0;
        numActual = in+1;
        while (numActual < fin) {
            cont++;
            numActual++;
        }
        
        System.out.println("LOS NUMEROS ENTEROS EN EL RANGO SON:" + cont);
        
        
    }
}
