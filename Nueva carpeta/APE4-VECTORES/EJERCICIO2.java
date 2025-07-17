import java.util.Scanner;

public class EJERCICIO2 {
   private int div;   
    private int cantidadMultiplos;
private int[] datos;
    public void Datos() {
        Scanner tec = new Scanner(System.in);

        System.out.println("INGRESE 6 NUMEROS:");
        for (int i = 0; i < datos.length; i++) {
            datos[i] = tec.nextInt();
        }

        System.out.print("INGRESE EL NUMERO DEL DVISOR ");
        div = tec.nextInt();
    }
     

    public EJERCICIO2() {
        datos = new int[6];
        div = 0;
        cantidadMultiplos = 0;
    }

    public void Multiplos() {
     for (int i = 0; i < datos.length; i++) {
         if (datos[i] % div == 0) {
                cantidadMultiplos++;
            }
     }
    }
    public void IMPRIMIR() {
        System.out.println("LA CANTIDAD DE NUMEROS MULTIPLOS DE  " + div + ": " + cantidadMultiplos);
    }
    public static void main(String[] args) {
        EJERCICIO2 OBJ = new EJERCICIO2();
        OBJ.Datos();
        OBJ.Multiplos();
        OBJ.IMPRIMIR();
    }
}
