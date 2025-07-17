
public class EJ3 {

    public static void cargarMarco(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                if (f == 0 || f == filas - 1 || c == 0 || c == columnas - 1) {
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
        int[][] marco = new int[5][15];
        cargarMarco(marco);
        System.out.println("Contenido de la matriz marco:");
        IMPRIMIRMatriz(marco);
    }
}

