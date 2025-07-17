import java.util.Scanner;

public class DEB5 {
 public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

       int num1,num2;
        System.out.print("INGRESE EL 1 VALOR: ");
         num1 = tec.nextInt();
        System.out.print("INGRESE EL 2 VALOR: ");
         num2 = tec.nextInt();
        if (num1 != 0 && num2 % num1 == 0) {
            System.out.println(num1 + " es divisor de " + num2);
        } else if (num2 != 0 && num1 % num2 == 0) {
            System.out.println(num2 + " es divisor de " + num1);
        } else {
            System.out.println("NINGUNO DE LOS DOS ES DIVISOR DEL OTRO.");
        }

      
    }
}
