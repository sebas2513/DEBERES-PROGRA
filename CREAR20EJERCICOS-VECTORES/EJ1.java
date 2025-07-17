import java.util.Scanner;

public class EJ1 {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner tec = new Scanner(System.in);

        
        System.out.println("Ingresa 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = tec.nextInt();
        }

        
        System.out.println("\nLos números en orden inverso son:");
        for (int i = 9; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

    }
}
