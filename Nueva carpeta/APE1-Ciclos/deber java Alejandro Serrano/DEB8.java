import java.util.Scanner;

public class DEB8 {
public static void main(String[] args) {
    int n1,n2,n3;
    Scanner tec=new Scanner(System.in);
    System.out.println("INGRESE EL PRIMER NÚMERO");
    n1=tec.nextInt();
    System.out.println("INGRESE EL SEGUNDO NÚMERO");
    n2=tec.nextInt();
    System.out.println("INGRESE EL TERCER NÚMERO");
    n3=tec.nextInt();
    if(n1<=n2 & n2<=n3){
        System.out.println("LOS NÚMEROS ESTAN EN ORDEN NÚMERICO ");
    }else{
  System.out.println("LOS NÚMEROS NO ESTAN EN ORDEN NÚMERICO");
        }
    }
}
