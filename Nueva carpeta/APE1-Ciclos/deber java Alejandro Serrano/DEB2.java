import java.util.Scanner;

public class DEB2 {
public static void main(String[] args) {
    double res,n1;
    Scanner tec =new Scanner(System.in);
System.out.println("INGRESE UN VALOR");//INGRESA UN VALOR PARA CALCULAR LA RAIZ
n1=tec.nextDouble();
if (n1>=0) {
    res=(double)Math.sqrt(n1);
    System.out.println("LA RAIZ "+n1+"  ES  "+res);
}
else{
    System.out.println("No vale raiz de numeros negativos");

}
}
}