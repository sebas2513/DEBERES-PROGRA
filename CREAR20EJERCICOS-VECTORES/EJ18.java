import java.util.Random;

public class EJ18 {

    public static void main(String[] args) {
        int[] vector = new int[15];

        rellenarvector(vector);
        System.out.println("vector original:");
        mostrarvector(vector);

        cincuerizarvector(vector);
        System.out.println("\nvector cincuerizado:");
        mostrarvector(vector);
    }

    public static void rellenarvector(int[] vector) {
        Random rand = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(501);
        }
    }

    public static void mostrarvector(int[] vector) {
        for (int n : vector) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void cincuerizarvector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 5 != 0) {
                vector[i] = siguienteMultiploDeCinco(vector[i]);
            }
        }
    }

    public static int siguienteMultiploDeCinco(int n) {
        return ((n + 4) / 5) * 5;
    }
}
