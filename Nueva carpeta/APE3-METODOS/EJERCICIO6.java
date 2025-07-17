import java.util.Scanner;

public class EJERCICIO6 {
    public  int sumarDigitosPares(int numero) {
        int suma = 0;
        numero = Math.abs(numero); 
        while (numero > 0) {
            int digito = numero % 10;
            if (digito % 2 == 0) {
                suma += digito;
            }
            numero /= 10;
        }
        return suma;
    }
    public  int sumarDigitosImpares(int numero) {
        int suma = 0;

        while (numero > 0) {
            int digito = numero % 10;
            if (digito % 2 != 0) {
                suma += digito;
            }
            numero /= 10;
        }
        return suma;
    }

        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
EJERCICIO6 metodos = new EJERCICIO6();
        System.out.print("Ingrese un número entero: ");
        System.out.println("SOLO NUMEROS POSITIVOS");
        int num = teclado.nextInt();

        int sumaPares = metodos.sumarDigitosPares(num);
        int sumaImpares = metodos.sumarDigitosImpares(num);

        System.out.println("Suma de dígitos pares: " + sumaPares);
        System.out.println("Suma de dígitos impares: " + sumaImpares);


    }
}
