import java.util.Random;
import java.util.Scanner;

public class EJ5 {

    public static void main(String[] args) {
        int[] numeros = new int[100];
        Random rand = new Random();
        Scanner tec = new Scanner(System.in);

    
        System.out.println("Números generados:");
        for (int i = 0; i < 100; i++) {
            numeros[i] = rand.nextInt(21); 
            System.out.print(numeros[i] + " ");
        }


        System.out.print("\n\nIngrese el número a reemplazar: ");
        int valorBuscado = tec.nextInt();

        System.out.print("Ingrese el nuevo valor: ");
        int nuevoValor = tec.nextInt();
        System.out.println("\nResultado con reemplazos:");
        for (int i = 0; i < 100; i++) {
            if (numeros[i] == valorBuscado) {
                numeros[i] = nuevoValor;
                System.out.print("\"" + numeros[i] + "\" ");
            } else {
                System.out.print(numeros[i] + " ");
            }
        }

    }
}

