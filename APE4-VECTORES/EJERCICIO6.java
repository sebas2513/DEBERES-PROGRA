
import java.util.Scanner;
public class EJERCICIO6 {
    private String[] coches = new String[8];

    public void ORDENAR() {
        Scanner tec = new Scanner(System.in);

       coches[0] = "Alfa Romeo";
        coches[1] = "FORD";
        coches[2] = "Seat";
        coches[3] = "Lancia";
        coches[4] = "Renault";
        coches[5] = "Fiat";

        System.out.println("INGRESE 2 MARCAS NUEVAS DE VEHICULOS");
        for (int i = 6; i < 8; i++) {
            System.out.print("Marca nueva " + (i - 5) + ": ");
            coches[i] = tec.nextLine();
        }

        for (int i = 0; i < coches.length - 1; i++) {
            for (int j = 0; j < coches.length - i - 1; j++) {
                if (coches[j].compareToIgnoreCase(coches[j + 1]) > 0) {
                    String temp = coches[j];
                    coches[j] = coches[j + 1];
                    coches[j + 1] = temp;
                }
            }
        }
    }

    public void IMPRIMIR() {
        System.out.println("Marcas ordenadas alfabéticamente:");
        for (String marca : coches) {
            System.out.println(marca);
        }
    }

    public static void main(String[] args) {
        EJERCICIO6 obj = new EJERCICIO6();
        obj.ORDENAR();
        obj.IMPRIMIR();
    }
}


