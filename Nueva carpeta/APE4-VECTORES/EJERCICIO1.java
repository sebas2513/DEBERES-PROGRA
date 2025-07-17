import java.util.Scanner;

public class EJERCICIO1 {

    public static double SUMA(double[] valores) {
        double suma = 0;
        for (int i = 0; i < valores.length; i++) { 
            suma += valores[i];
        }
        return suma;
    }

    public static double promedio(double suma, int cantidad) {
        return suma / cantidad;
    }

    public static void main(String[] args) {
        double[] valores = new double[4];  
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + ": ");
            valores[i] = teclado.nextDouble();
        }

        double suma = SUMA(valores);
        double prom = promedio(suma, valores.length);

        System.out.println("La suma de los valores es: " + suma);
        System.out.println("El promedio es: " + prom);


    }
}

