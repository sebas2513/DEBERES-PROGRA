public class EJ4 {

    public static void main(String[] args) {
        int[] cantidadesporArticulo = new int[5];
        double[] precioarticulos = new double[]{10, 20, 30, 40, 50};

    
        int[][] cantidades = {
            {5, 4, 10, 8},
            {6, 5, 4, 3},
            {3, 4, 4, 6},
            {5, 6, 10, 5},
            {7, 10, 2, 3}
        };

        double recaudacion[][] = new double[5][4];
        int sumatoriacantidades = 0;

        double[] Recaudacionsucursal = new double[4];

        // 1) LA CANTIDADES TOTALES DE CADA ARTICULO
        System.out.println("pregunta # 1");
        System.out.println("LA CANTIDADES TOTALES DE CADA ARTICULO");

        for (int f = 0; f < cantidades.length; f++) {
            sumatoriacantidades = 0;
            for (int c = 0; c < cantidades[0].length; c++) {
                sumatoriacantidades += cantidades[f][c];
            }
            cantidadesporArticulo[f] = sumatoriacantidades;
        }

        for (int i = 0; i < cantidadesporArticulo.length; i++) {
            System.out.println("ARTICULO " + (i + 1) + " = " + cantidadesporArticulo[i]);
        }

        // 2) la cantidades de articulos en la sucursal 2
        System.out.println("pregunta # 2");
        System.out.println("la cantidades de articulos en la sucursal 2");
        sumatoriacantidades = 0;
        for (int f = 0; f < cantidades.length; f++) {
            sumatoriacantidades += cantidades[f][1]; // columna 1: sucursal 2
        }
        System.out.println("ARTICULOS  de la surcursal 2 = " + sumatoriacantidades);

        // 3) La cantidad del articulo 3 en la sucursal 1.
        System.out.println("pregunta # 3");
        System.out.println("La cantidad del articulo 3 en la sucursal 1.");
        System.out.println("LA CANTIDAD = " + cantidades[2][0]); // fila 2, columna 0

        // 4) La recaudación total de cada sucursal.
        System.out.println("pregunta # 4");
        System.out.println("La recaudación total de cada sucursal.");

        for (int f = 0; f < recaudacion.length; f++) {
            for (int c = 0; c < recaudacion[0].length; c++) {
                recaudacion[f][c] = cantidades[f][c] * precioarticulos[f];
            }
        }

        for (int c = 0; c < recaudacion[0].length; c++) {
            double totalSucursal = 0;
            for (int f = 0; f < recaudacion.length; f++) {
                totalSucursal += recaudacion[f][c];
            }
            Recaudacionsucursal[c] = totalSucursal;
            System.out.println("Sucursal " + (c + 1) + " = " + totalSucursal);
        }

        // 5) La recaudación total.
        System.out.println("pregunta # 5");
        System.out.println("La recaudación total.");
        double totalRecaudacion = 0;
        for (int c = 0; c < recaudacion[0].length; c++) {
            for (int f = 0; f < recaudacion.length; f++) {
                totalRecaudacion += recaudacion[f][c];
            }
        }
        System.out.println("RECAUDACION TOTAL = " + totalRecaudacion);

        // 6) La sucursal de mayor recaudación.
        System.out.println("pregunta # 6");
        System.out.println("La sucursal de mayor recaudación.");
        double mayor = Recaudacionsucursal[0];
        int posicion = 0;
        for (int f = 1; f < Recaudacionsucursal.length; f++) {
            if (Recaudacionsucursal[f] > mayor) {
                mayor = Recaudacionsucursal[f];
                posicion = f;
            }
        }
        System.out.println("LA SUCURSAL EN LA POSICIÓN " + (posicion + 1) + " TIENE LA MAYOR RECAUDACIÓN: " + mayor);
    }
}

