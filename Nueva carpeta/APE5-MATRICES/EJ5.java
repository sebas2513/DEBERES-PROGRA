import java.util.Random;

public class EJ5 {

    
    public static void crearInventarioAleatorio(int[][] stock) {
        Random rand = new Random();
        System.out.println("Matriz generada (productos x almacenes):");

        for (int f = 0; f < stock.length; f++) {
            for (int c = 0; c < stock[f].length; c++) {
                stock[f][c] = rand.nextInt(1,11) ;
                System.out.print(stock[f][c] + "\t");
            }
            System.out.println();
        }
    }

    public static void mostrarInventarioPorProducto(int[][] stock) {
        System.out.println("Inventario total por producto:");
        for (int f = 0; f < stock.length; f++) {
            int total = 0;
            for (int c = 0; c < stock[f].length; c++) {
                total += stock[f][c];
            }
            System.out.println("Producto " + (f + 1) + ": " + total + " unidades");
        }
    }

    public static int inventarioAlmacen1(int[][] stock) {
        int total = 0;
        for (int i = 0; i < stock.length; i++) {
            total += stock[i][0];
        }
        return total;
    }

    public static void mostrarStockProducto4Almacen2(int[][] stock) {
        System.out.println("Stock del producto 4 en almacén 2: " + stock[3][1] + " unidades");
    }

    public static int calcularValorTotalInventario(int[][] stock, int[] precios) {
        int total = 0;
        for (int f = 0; f < stock.length; f++) {
            int totalPorProducto = 0;
            for (int c = 0; c < stock[f].length; c++) {
                totalPorProducto += stock[f][c];
            }
            total += totalPorProducto * precios[f];
        }
        return total;
    }

    public static int almacenConMayorCantidad(int[][] stock) {
        int[] totales = new int[3];

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < stock.length; i++) {
                totales[j] += stock[i][j];
            }
        }

        int max = totales[0];
        int indiceMax = 0;

        for (int i = 1; i < 3; i++) {
            if (totales[i] > max) {
                max = totales[i];
                indiceMax = i;
            }
        }

        return indiceMax + 1;
    }

    public static void main(String[] args) {
        int[][] inventario = new int[8][3]; 
        int[] precios = {100, 200, 50, 40, 80, 100, 60, 50};

        crearInventarioAleatorio(inventario); 
        mostrarInventarioPorProducto(inventario);

        System.out.println("\nInventario total del almacén 1: " + inventarioAlmacen1(inventario) + " unidades");
        mostrarStockProducto4Almacen2(inventario);

        int valorTotal = calcularValorTotalInventario(inventario, precios);
        System.out.println(" \nValor total del inventario: $" + valorTotal);

        int almacenMayor = almacenConMayorCantidad(inventario);
        System.out.println("El almacén con mayor cantidad de productos es el almacén " + almacenMayor);
    }
}
