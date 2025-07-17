import java.util.Scanner;

public class DEB7 {
 public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int seleccionOp;
        double num1,num2;
        // Pedimos los dos números
        System.out.print("Introduce el primer valor: ");
        num1 = tec.nextDouble();

        System.out.print("Introduce el segundo valor: ");
         num2 = tec.nextDouble();

        // Menú de operaciones
        System.out.println("Selecciona la operación que desea realizar:");
        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplicación");
        System.out.println("4 - División");
        System.out.print("Introduce tu selección (1-4): ");
         seleccionOp = tec.nextInt();

        switch (seleccionOp) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        
    }

}
