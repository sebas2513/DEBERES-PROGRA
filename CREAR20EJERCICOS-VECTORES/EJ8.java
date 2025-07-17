import java.util.Random;

public class EJ8 {

    public static void main(String[] args) {
        int[] numeros = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];
        int contadorPares = 0;
        int contadorImpares = 0;
        Random rand = new Random();

        System.out.println("Números generados:");
        for (int i = 0; i < 20; i++) {
            numeros[i] = rand.nextInt(101); 
            System.out.print(numeros[i] + " ");
        }

        for (int i = 0; i < 20; i++) {
            if (numeros[i] % 2 == 0) {
                pares[contadorPares++] = numeros[i];
            } else {
                impares[contadorImpares++] = numeros[i];
            }
        }

     
        int indice = 0;

        for (int i = 0; i < contadorPares; i++) {
            numeros[indice++] = pares[i];
        }
        for (int i = 0; i < contadorImpares; i++) {
            numeros[indice++] = impares[i];
        }

   
        System.out.println("\n\nvector reorganizado (pares primero, luego impares):");
        for (int i = 0; i < 20; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
