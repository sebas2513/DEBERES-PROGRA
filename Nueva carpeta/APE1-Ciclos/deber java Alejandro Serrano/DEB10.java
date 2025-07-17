import java.util.Scanner;

public class DEB10 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
double num1,num2;
       
        System.out.print("Introduce el primer número: ");
        num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        num2 = scanner.nextDouble();

        // Pedir la operación
        System.out.print("Introduce la operación (+, -, *, /): ");
        char operacion = scanner.next().charAt(0);

        // Realizar la operación
        switch (operacion) {
            case '+':
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Error: Operación no válida.");
                break;
        }

        scanner.close();
    }
}
