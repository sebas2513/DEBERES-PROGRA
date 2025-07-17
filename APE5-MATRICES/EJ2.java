

public class EJ2 {

   
    public static void cargarDiagonal(int[][] matriz) {
        for (int f= 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                if (f == c) {
                    matriz[f][c] = 1;
                } else {
                    matriz[f][c] = 0;
                }
            }
        }
    }

    public static void IMPRIMIRMatriz(int[][] matriz) {
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[f][c] );
                    System.out.print("\t");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int[][] diagonal = new int[5][5];
        cargarDiagonal(diagonal);
        System.out.println("MATRIZ IMPRESA:");
        IMPRIMIRMatriz(diagonal);
    }
}



