import java.util.Scanner;

public class EJ3 {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner tec = new Scanner(System.in);

        System.out.println("Ingresa 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = tec.nextInt();
        }

        int max = numeros[0];
        int min = numeros[0];

        for (int i = 1; i < 10; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }

        System.out.println("\nNúmeros ingresados:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i]);
            if (numeros[i] == max) {
                System.out.print(" (máximo)");
            }
            if (numeros[i] == min) {
                System.out.print(" (mínimo)");
            }
            System.out.println();
        }


    }
}
