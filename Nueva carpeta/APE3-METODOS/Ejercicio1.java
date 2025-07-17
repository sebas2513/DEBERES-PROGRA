
   import java.util.Scanner;

public class Ejercicio1 {
    
    public static void calcularFactorial(int n) {
        int resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        System.out.println("El factorial de " + n + " es: " + resultado);
    }
    public void Datos(){
 Scanner tec = new Scanner(System.in);

    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Ejercicio1 datos= new Ejercicio1();

        System.out.print("Introduce un número entero no negativo: ");
        int numero = tec.nextInt();

        if (numero < 0) {
            System.out.println("Error: El número debe ser no negativo.");
        } else {
            Ejercicio1.calcularFactorial(numero); //LLAMAMOS AL METODO
        }

       
    }
}

