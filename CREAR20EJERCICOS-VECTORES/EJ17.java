import java.util.HashMap;
import java.util.Scanner;

public class EJ17 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int cantidad = pedirCantidadReyes(tec);
        String[] reyes = leerNombresReyes(cantidad, tec);

        mostrarReyesConOrdinales(reyes);
    }

    public static int pedirCantidadReyes(Scanner tec) {
        int cantidad;
        do {
            System.out.print("Introduce la cantidad de reyes: ");
            cantidad = tec.nextInt();
            tec.nextLine(); 
            if (cantidad <= 0) {
                System.out.println("Por favor, introduce un número positivo.");
            }
        } while (cantidad <= 0);
        return cantidad;
    }
    public static String[] leerNombresReyes(int cantidad, Scanner tec) {
        String[] reyes = new String[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Nombre del rey " + (i + 1) + ": ");
            reyes[i] = tec.nextLine().trim();
        }
        return reyes;
    }


    public static void mostrarReyesConOrdinales(String[] reyes) {
        HashMap<String, Integer> contador = new HashMap<>();

        System.out.println("\nReyes con denominación ordinal:");
        for (String rey : reyes) {
            int numero = contador.getOrDefault(rey, 0) + 1;
            contador.put(rey, numero);

            System.out.println(rey + " " + numero + "º");
        }
    }
}
