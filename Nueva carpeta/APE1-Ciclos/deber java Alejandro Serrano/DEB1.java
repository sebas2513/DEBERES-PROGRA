import java.util.Scanner;

public class DEB1 {
public static void main(String[] args){
    double n1,n2,n3;
        Scanner tec = new Scanner(System.in);
        System.out.println("INGRESA EL PRIMER VALOR");
        n1=tec.nextDouble();
        System.out.println("INGRESE EL SEGUNDO VALOR");
        n2=tec.nextDouble();
        System.out.println("INGRESE EL TECERCER VALOR");
        n3=tec.nextDouble();
        if (n1>n2 && n1>n3) {
            if (n2>n3) {
                System.out.println("EL VALOR DEL MEDIO ES:"+n2);
            }
            else{
                System.out.println("EL VALOR DEL MEDIO ES:"+n3);
            }
        }
        else{
            if (n2>n1 && n2>n3) {
                if (n1>n3) {
                    System.out.println("EL VALOR DEL MEDIO ES:"+n1);
                }
                else{
                    System.out.println("EL VALOR DEL MEDIO ES:"+n3);
                }
            }
            else{
                if (n1>n2) {
                    System.out.println("EL VALOR DEL MEDIO ES:"+n1);
                }
                else{
                    System.out.println("EL VALOR DEL MEDIO ES:"+n2);
                }
            }
        }
}
}
