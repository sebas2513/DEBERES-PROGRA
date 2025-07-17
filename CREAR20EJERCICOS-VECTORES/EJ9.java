import java.util.Scanner;

public class EJ9 {

    public static boolean esPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int[] numeros = new int[10];
        int[] primos = new int[10];
        int[] noPrimos = new int[10];
        int contadorPrimos = 0;
        int contadorNoPrimos = 0;

        System.out.println("Ingresa 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = tec.nextInt();
        }

  
        System.out.println("\nÍndice : Valor");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%6d : %d\n", i, numeros[i]);
        }


        for (int i = 0; i < 10; i++) {
            if (esPrimo(numeros[i])) {
                primos[contadorPrimos++] = numeros[i];
            } else {
                noPrimos[contadorNoPrimos++] = numeros[i];
            }
        }

        int[] resultado = new int[10];
        int index = 0;
        for (int i = 0; i < contadorPrimos; i++) {
            resultado[index++] = primos[i];
        }
        for (int i = 0; i < contadorNoPrimos; i++) {
            resultado[index++] = noPrimos[i];
        }


        System.out.println("\nvector con primos al principio:");
        System.out.println("Índice : Valor");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%6d : %d\n", i, resultado[i]);
        }

    }
}
