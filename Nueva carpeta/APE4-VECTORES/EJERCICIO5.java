import java.util.Scanner;

public class EJERCICIO5 {
  private int[] primos = new int[10];
    private int suma = 0;
    private double promedio = 0;

 public void IMPRIMIR() {
        System.out.println("LOS NUMEROS SUBSECUENTEES DE n son:");
        for (int primo : primos) {
            System.out.print(primo + " ");
        }
        System.out.println(" ");
        System.out.println("LA SUMA DE LOS PRIMOS ES: " + suma);
        System.out.println("PROMEDIO DE LOS PIRMOS ES " + promedio);
    }


     private boolean esPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    public void CALCULO() {
        Scanner tec = new Scanner(System.in);
        System.out.print("Ingrese un número n: ");
        int n = tec.nextInt();

        int contador = 0;
        int numero = n + 1;

        while (contador < 10) {
            if (esPrimo(numero)) {
                primos[contador] = numero;
                suma += numero;
                contador++;
            }
            numero++;
        }

        promedio = (double) suma / 10;
    }


    public static void main(String[] args) {
        EJERCICIO5 obj = new EJERCICIO5();
        obj.CALCULO();
        obj.IMPRIMIR();
    }
}
