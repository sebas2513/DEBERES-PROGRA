import java.util.Scanner;

public class DEB12 {
public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double lado1,lado2,lado3;
        System.out.print("Ingrese el valor del primer lado: ");
        lado1 = tec.nextDouble();

        System.out.print("Ingrese el valor del segundo lado: ");
        lado2 = tec.nextDouble();

        System.out.print("Ingrese el valor deltercer lado: ");
         lado3 = tec.nextDouble();
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
     
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("El triángulo es Equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("El triángulo es Isósceles.");
            } else {
                System.out.println("El triángulo es Escaleno.");
            }
        } else {
            System.out.println("Los lados no forman un triángulo válido.");
        }
    }
}
