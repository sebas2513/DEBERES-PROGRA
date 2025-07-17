package APE2;

import java.util.Scanner;

public class JAV3 {
public static void main(String[] args) {
    int num,inverso=0,dig;
        Scanner tec = new Scanner(System.in);

        
        System.out.print("INGRESE UN NUMERO ENTERO (SOLO POSITIVO)");
        num = tec.nextInt();
 
        while (num > 0) {
            dig = num % 10;        
            inverso = inverso * 10 + dig; 
            num = num / 10;         
        }

        System.out.println("EL NUMERO INVERTIDO ES: " + inverso);

    }
}
