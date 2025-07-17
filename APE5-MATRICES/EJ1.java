import java.util.Random;

public class EJ1 {

    public static void cargarvaloresmatriz(int matriz[][]) {
        Random random = new Random();
        int fila = matriz.length;
        int columna = matriz[0].length;

        for (int f = 0; f < fila; f++) {
            for (int c = 0; c < columna; c++) {
                matriz[f][c] = random.nextInt(1, 21);
            }
        }
    }

    public static void IMPRIMIRMATRIZ(int matriz[][]) {
        int fila = matriz.length;
        int columna = matriz[0].length;
        int sumaFila = 0;

        for (int f = 0; f < fila; f++) {
            for (int c = 0; c < columna; c++) {
                sumaFila += matriz[f][c];
                System.out.print("MATRIZ [" + f + "][" + c + "] = ");
                System.out.print(matriz[f][c]);
                System.out.print("\t");
            }
            System.out.print("= la suma es " + sumaFila);
            System.out.print("\n");
            sumaFila = 0;
        }

        int[] sumaColumnas = new int[columna];
        for (int c = 0; c < columna; c++) {
            for (int f = 0; f < fila; f++) {
                sumaColumnas[c] += matriz[f][c];
            }
        }

        System.out.println();
        for (int c = 0; c < columna; c++) {
            System.out.print("Suma Col[" + c + "] = " + sumaColumnas[c] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matriz[][] = new int[5][5];
        cargarvaloresmatriz(matriz);
        IMPRIMIRMATRIZ(matriz);
    }
}






    

   