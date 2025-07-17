import java.util.Scanner;

public class DEB6 {
public static void main(String[] args) {
    Scanner tec=new Scanner(System.in);
double nota;
System.out.println("INGRESE SU CALIFICACION");
System.out.println("0--100");
nota= tec.nextDouble();
if (nota>=90){
    System.out.println("SU CALIFICACIÓN ES "+nota+" Y EN LETRAS ES UNA A");
}else{
    if (nota>=80 & nota<90){
System.out.println("SU CALIFICACIÓN ES "+nota+" Y EN LETRAS ES UNA B");
        }else{
    if (nota>80 & nota>=70) {
        System.out.println("SU CALIFICACIÓN ES "+nota+" Y EN LETRAS ES UNA C");
    }else {
            if (nota<70 & nota>=69){
                System.out.println("SU CALIFICACIÓN ES "+nota+" Y EN LETRAS ES UNA D");
            }else{
                System.out.println("SU CALIFICACIÓN ES "+nota+" Y EN LETRAS ES UNA F");
            }
        }
    }
}
}
}