import java.util.Scanner;

public class DEB3 {
public static void main(String[] args) {
    Scanner tec=new Scanner(System.in);
    int num ;
    System.out.println("INGRESE UN NÚMERO");
    num=tec.nextInt();
    if (num == 0) {
        System.out.println("es par");
    } 
    else
     if (num % 2 == 0) {
        System.out.println(num + " es par");
    } 
    else {
        System.out.println(num + " es impar");
    }
}
}
