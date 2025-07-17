import java.util.Scanner;

public class DEB11 {
  public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
          double monto,descuento,montof;
        System.out.print("Introduce el monto de la compra: $");
         monto = tec.nextDouble();
         descuento = 0.0;
        if (monto >= 500) {
            descuento = 0.20;
        } else if (monto >= 100) {
            descuento = 0.10;
        }

        montof = monto - (monto * descuento);

    
        if (descuento > 0) {
            System.out.println("Se aplicó un descuento del " + (int)(descuento * 100) + "%.");
        } else {
            System.out.println("No se aplicó descuento.");
        }

        System.out.printf("Monto final a pagar: $%.2f\n", montof);
    }
}
