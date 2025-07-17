import java.util.Scanner;

public class DEB9 {
 public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int diaNac,mesnaci,añonaci,años,meses,dias,diactual,mesactual,añoactual;
        System.out.print("Ingrese la fecha de nacimiento (día / mes / año): ");
        System.out.println("INGRESE EL DIA DE NACIMIENTO");
        diaNac = teclado.nextInt();
        System.out.println("INGRESE EL MES DE NACIMIENTO");
        mesnaci = teclado.nextInt();
        System.out.println("INGRESE EL AÑO DE NACIMIENTO");
        añonaci = teclado.nextInt();

        System.out.print("Ingrese la fecha actual (día mes año): ");
        System.out.println("INGRESE EL DIA ACTUAL");
        diactual = teclado.nextInt();
        System.out.println("INGRESE EL MES ACTUAL");
        mesactual = teclado.nextInt();
        System.out.println("INGRESE EL AÑO ACTUAL");
        añoactual = teclado.nextInt();
        años = añoactual - añonaci;
        meses = mesactual - mesnaci;
        dias = diactual - diaNac;
        if (dias < 0) {
            dias += 30; 
            meses--;
        }
        if (meses < 0) {
            meses += 12;
            años--;
        }
       
        if (años <= 0) {
            System.out.println("Edad: " + meses + " meses y " + dias + " días.");
        } else {
            System.out.println("Edad: " + años + " años.");
        }
    }
}
