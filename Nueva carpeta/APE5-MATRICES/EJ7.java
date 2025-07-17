import java.util.Random;
import java.util.Scanner;

public class EJ7 {

    public static int[][] generarMatrizAleatoria(int n, String nombre) {
        Random rand = new Random();
        int[][] matriz = new int[n][n];
        System.out.println("Matriz generada " + nombre + ":");
        for (int f = 0; f < n; f++) {
            for (int c = 0; c < n; c++) {
                matriz[f][c] = rand.nextInt(1,21) ; 
                System.out.print(matriz[f][c] + "\t");
            }
            System.out.println();
        }
        return matriz;
    }

    public static int[][] sumarMatrices(int[][] A, int[][] B) {
        int n = A.length;
        int[][] suma = new int[n][n];
        for (int f = 0; f < n; f++) {
            for (int j = 0; j < B[0].length; j++) {
                suma[f][j] = A[f][j] + B[f][j];
            }
        }
        return suma;
    }

    public static double calcularPromedio(int[][] A, int[][] B) {
        int n = A.length;
        int total = 0;
        for (int f = 0; f < n; f++) {
            for (int j = 0; j < n; j++) {
                total += A[f][j] + B[f][j];
            }
        }
        return (double) total / (2 * n * n);
    }
    public static int[][] multiplicarMatrices(int[][] A, int[][] B) {
        int n = A.length;
        int[][] producto = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                producto[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    producto[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return producto;
    }

    public static int encontrarMayor(int[][] matriz) {
    int mayor = matriz[0][0];
    for (int f = 0; f < matriz.length; f++) {
        for (int c = 0; c < matriz[f].length; c++) {
            if (matriz[f][c] > mayor) {
                mayor = matriz[f][c];
            }
        }
    }
    return mayor;
}
public static void imprimirMatriz(int[][] matriz, String nombre) {
    System.out.println("Matriz " + nombre + ":");
    for (int f = 0; f < matriz.length; f++) {
        for (int c = 0; c < matriz[f].length; c++) {
            System.out.print(matriz[f][c] + "\t");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Ingrese el tamaño n de las matrices (nxn): ");
        int n = tec.nextInt();

        
        int[][] matrizA = generarMatrizAleatoria(n, "A");
        int[][] matrizB = generarMatrizAleatoria(n, "B");

    
        int[][] suma = sumarMatrices(matrizA, matrizB);
        double promedio = calcularPromedio(matrizA, matrizB);
        int[][] producto = multiplicarMatrices(matrizA, matrizB);
        int mayor = encontrarMayor(suma);


        imprimirMatriz(suma, "Suma");
        imprimirMatriz(producto, "Producto");
        System.out.println("Promedio de todos los elementos de ambas matrices: " + promedio);
        System.out.println("Elemento mayor en la matriz suma: " + mayor);

    
    }
}
