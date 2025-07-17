import java.util.Scanner;

public class DEB4 {
public static void main(String[] args) {
    Scanner tec=new Scanner(System.in);
    int dia,dia1=0,mes,mes1=0,año,año1=0;
    System.out.println("INGRESE EL AÑO");
    año=tec.nextInt();
    System.out.println("INGRESE EL MES");
    mes=tec.nextInt();
    System.out.println("Ingrese el DÍA");
    dia=tec.nextInt();
    switch (mes) {
        case 4,6,9,11:
            mes1=30;
            break;
        case 1,3,5,7,8,10,12:
            mes1=31;
            break;
        case 2:
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            mes1=29;
        } else {
            mes1=28;
        } 
        System.out.println("MES ingresado incorrectamente");
            break;
    }
    if (dia<mes1) {
        dia1=dia+1;
        System.out.println("La fecha del día siguiente es: "+dia1+" / "+mes+" / "+año);
    }
     else
     if (dia==mes1) {
        dia=dia1+1;
        mes1=mes+1;
        if (mes1==13) {
            año1=año+1;
            mes1=1;
            System.out.println("La fecha del día siguiente es: "+dia+" / "+mes1+" / "+año1);
        }
        else
        System.out.println("La fecha del día siguiente es: "+dia+" / "+mes1+" / "+año);
     }
}
}
