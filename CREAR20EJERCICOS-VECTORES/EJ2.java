import java.util.Random;

public class EJ2 {



   
    public static void llenarNumeros(int[] numero) {
        Random rand = new Random();
        for (int i = 0; i < numero.length; i++) {
            numero[i] = rand.nextInt(20);
        }
    }

    public static void calcularCuadrados(int[] numero, int[] cuadrado) {
        for (int i = 0; i < numero.length; i++) {
            cuadrado[i] = numero[i] * numero[i];
        }
    }

 
    public static void calcularCubos(int[] numero, int[] cubo) {
        for (int i = 0; i < numero.length; i++) {
            cubo[i] = numero[i] * numero[i] * numero[i];
        }
    }

    public static void mostrarArreglos(int[] numero, int[] cuadrado, int[] cubo) {
        System.out.println("Índice\tNúmero\tCuadrado\tCubo");
        for (int i = 0; i < numero.length; i++) {
            System.out.println(i + "\t" + numero[i] + "\t" + cuadrado[i] + "\t\t" + cubo[i]);
        }
    }

    public static void main(String[] args) {
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        llenarNumeros(numero);
        calcularCuadrados(numero, cuadrado);
        calcularCubos(numero, cubo);
        mostrarArreglos(numero, cuadrado, cubo);
    }
 }