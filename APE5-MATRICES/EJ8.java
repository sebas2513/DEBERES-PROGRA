public class EJ8 {


    public static int determinante2x2(int[][] matriz) {
        return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
    }
    public static int[][] reemplazarColumna(int[][] original, int[] columnaNueva, int columnaReemplazo) {
        int[][] nueva = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == columnaReemplazo) {
                    nueva[i][j] = columnaNueva[i];
                } else {
                    nueva[i][j] = original[i][j];
                }
            }
        }
        return nueva;
    }
    public static void main(String[] args) {
       // 7𝑥 + 4𝑦 = 13
        //5𝑥 − 2𝑦 = 19
        int[][] A = {
            {7, 4},
            {5, -2}
        };
        int[] B = {13, 19};

        int D = determinante2x2(A);

        if (D != 0) {
            int[][] Ax = reemplazarColumna(A, B, 0);
            int Dx = determinante2x2(Ax);

            int[][] Ay = reemplazarColumna(A, B, 1);
            int Dy = determinante2x2(Ay);

            double x = (double) Dx / D;
            double y = (double) Dy / D;

            System.out.println("Solución del sistema:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        } else {
            System.out.println("El sistema no tiene solución única (determinante = 0).");
        }
    }
}

