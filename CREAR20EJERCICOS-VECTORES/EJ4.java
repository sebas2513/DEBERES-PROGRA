import java.util.Scanner;

public class EJ4 {

    public static void main(String[] args) {
        int[] numeros = new int[15];
        Scanner tec = new Scanner(System.in);

    
        System.out.println("Ingresa 15 números:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = tec.nextInt();
        }

      
        int ultimo = numeros[14];
        for (int i = 14; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[0] = ultimo;

        System.out.println("\nvectorrotado una posición a la derecha:");
        for (int i = 0; i < 15; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }

    
    }
}
