import java.util.Scanner;

public class EJ7 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int[] numeros = new int[8];

     
        System.out.println("Ingresa 8 números enteros:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = tec.nextInt();
        }

        System.out.println("\nResultado:");
        for (int i = 0; i < 8; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i] + " - par");
            } else {
                System.out.println(numeros[i] + " - impar");
            }
        }

      
    }
}
