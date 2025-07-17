import java.util.Scanner;

public class EJ6 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double[] temperaturas = new double[12];
        String[] meses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        for (int i = 0; i < 12; i++) {
            System.out.print("Temperatura media en " + meses[i] + ": ");
            temperaturas[i] = tec.nextDouble();
        }

        System.out.println("\nDiagrama de barras de temperaturas medias:");
        for (int i = 0; i < 12; i++) {
            System.out.printf("%-10s: ", meses[i]);
            int barras = (int) Math.round(temperaturas[i]);
            for (int j = 0; j < barras; j++) {
                System.out.print("*");
            }
            System.out.println(" (" + temperaturas[i] + "°C)");
        }

    }
}
