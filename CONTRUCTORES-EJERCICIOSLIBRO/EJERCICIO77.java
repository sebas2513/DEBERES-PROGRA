package EJERCICIOLIBRO;

import java.util.Scanner;

public class EJERCICIO77 {

public char TIPODEPAGO(){
 Scanner teclado = new Scanner(System.in);
char tipo;
System.out.println("DESEA PAGAR AL CONTADO (C)");
System.out.println("DESEA PAGAR A PLAZOS (P)");
tipo=teclado.next().charAt(0);
return tipo;

}

public double GENECONT(double monto){
 
    double des=0.15*monto;

    return des;
}


public double GENEPLAZ(double monto){
 
    double des=0.10*monto;

    return des;
}
public double AFICONT(double monto){
 
    double des=0.20*monto;

    return des;
}
public double AFIPLAZ(double monto){
 
    double des=0.5*monto;

    return des;
}









    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double total;
        char tipo;
EJERCICIO77 DATOS= new EJERCICIO77();
        System.out.println("INGRESE EL MONTO DE LA COMPRA");
double monto=teclado.nextDouble();

        System.out.println("INGRESE LA LETRA SEGUN EL CLIENTE QUE PERTENECE");
        System.out.println("(G)PUBLICO GENERAL");
         System.out.println("(A)CLIENTE AFILIADO");
        char cliente=teclado.next().charAt(0);

        switch (cliente) {
            case 'G' :
                  System.out.println("DESEA PAGAR AL CONTADO (C)");
                  System.out.println("DESEA PAGAR A PLAZOS (P)");
                         tipo=teclado.next().charAt(0);
                     switch (tipo) {
                        case 'C':
                        System.out.println("SU DESCUENTO ES DE "+DATOS.GENECONT(monto));
                            total=monto-DATOS.GENECONT(monto);
                            System.out.println("EL TOTAL A PAGAR ES "+total );
                            break;
                      case 'P' :
                        System.out.println("SU DESCUENTO ES DE "+DATOS.GENEPLAZ(monto));
                            total=monto-DATOS.GENEPLAZ(monto);
                            System.out.println("EL TOTAL A PAGAR ES "+total );


                    break;
                        
                     }

                
                break;
         case 'A' :
                       System.out.println("DESEA PAGAR AL CONTADO (C)");
                  System.out.println("DESEA PAGAR A PLAZOS (P)");
                         tipo=teclado.next().charAt(0);
                     switch (tipo) {
                        case 'C':
                             System.out.println("SU DESCUENTO ES DE "+DATOS.AFICONT(monto));
                            total=monto-DATOS.AFICONT(monto);
                            System.out.println("EL TOTAL A PAGAR ES "+total );
                            break;
                      case 'P' :
                            System.out.println("SU DESCUENTO ES DE "+DATOS.AFIPLAZ(monto));
                            total=monto-DATOS.AFIPLAZ(monto);
                            System.out.println("EL TOTAL A PAGAR ES "+total );


                    break;
                        
                     }


         break;
            default:
                System.out.println("INGRESE NUEVAMENTE LA LETRA EN MAYUSCULA");
        }
    }
}
