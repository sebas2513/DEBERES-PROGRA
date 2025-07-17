import java.util.Scanner;

public class EJ19 {

    public static void main(String[] args) {
        int[] vector = {5, 12, 8, 20, 33, 7, 14};
        Scanner tec = new Scanner(System.in);

        System.out.print("Introduce el número a buscar: ");
        int numero = tec.nextInt();

        int posicion = buscarNumero(vector, numero);

        if (posicion == -1) {
            System.out.println("El número " + numero + " no se encontró en el array.");
        } else {
            System.out.println("El número " + numero + " se encontró en la posición " + posicion + ".");
        }

    
    }

    public static int buscarNumero(int[] vector, int numero) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == numero) {
                return i;
            }
        }
        return -1; 
    }
}
