import java.util.Scanner;

public class EJ12 {
//14
    public static void main(String[] args) {
        String[] palabras = new String[8];
        String[] coloresConocidos = {
            "verde", "rojo", "azul", "amarillo", "naranja",
            "rosa", "negro", "blanco", "morado"
        };

        pedirPalabras(palabras);
        String[] resultado = reordenarColoresPrimero(palabras, coloresConocidos);

        System.out.println("\nPalabras con los colores al principio:");
        mostrarvector(resultado);
    }

    public static void pedirPalabras(String[] vector) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Ingresa 8 palabras:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            vector[i] = tec.nextLine().toLowerCase();
        }
    }



    public static void mostrarvector(String[] vector) {
        for (String palabra : vector) {
            System.out.print(palabra + " ");
        }
        System.out.println();
    }

    public static String[] reordenarColoresPrimero(String[] palabras, String[] colores) {
        String[] resultado = new String[palabras.length];
        int index = 0;

        for (String palabra : palabras) {
            if (esColor(palabra, colores)) {
                resultado[index++] = palabra;
            }
        }

        for (String palabra : palabras) {
            if (!esColor(palabra, colores)) {
                resultado[index++] = palabra;
            }
        }

        return resultado;
    }

    public static boolean esColor(String palabra, String[] colores) {
        for (String color : colores) {
            if (palabra.equals(color)) {
                return true;
            }
        }
        return false;
    }
}
