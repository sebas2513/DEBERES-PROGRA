import java.util.Scanner;

public class EJERCICIO11 {
    static double x1, y1, x2, y2, x3, y3;
    public  void pedirCoordenadas() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese x1: ");
        x1 = teclado.nextDouble();
        System.out.print("Ingrese y1: ");
        y1 = teclado.nextDouble();

        System.out.print("Ingrese x2: ");
        x2 = teclado.nextDouble();
        System.out.print("Ingrese y2: ");
        y2 = teclado.nextDouble();

        System.out.print("Ingrese x3: ");
        x3 = teclado.nextDouble();
        System.out.print("Ingrese y3: ");
        y3 = teclado.nextDouble();
    }
    public double calcularArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        return 0.5 * Math.abs( x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
    }

    public void imprimirResultado(double area) {
        System.out.printf("El área del triángulo es:" +Math.round(area*100)/100);
    }
    
    public static void main(String[] args) {
           EJERCICIO11 datos = new EJERCICIO11();
        datos.pedirCoordenadas();

        double area = datos.calcularArea(x1, y1, x2, y2, x3, y3);

        datos.imprimirResultado(area);
    }
}


