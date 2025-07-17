
import java.util.Scanner;

public class EJERCICIO12 {

    static double perimetro, apotema, altura;

    public  void pedirDatos() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el perímetro de la base: ");
        perimetro = teclado.nextDouble();

        System.out.print("Ingrese el apotema del pentágono: ");
        apotema = teclado.nextDouble();

        System.out.print("Ingrese la altura del prisma: ");
        altura = teclado.nextDouble();
    }

    public double calcularAreaBase(double p, double a) {
        return (p * a) / 2;
    }

    public double calcularAreaLateral(double p, double h) {
        return p * h;
    }


    public double calcularAreaTotal(double areaBase, double areaLateral) {
        return 2 * areaBase + areaLateral;
    }
    public  void imprimirResultados(double areaBase, double areaLateral, double areaTotal) {
        System.out.println("\n--- Resultados ---");
        System.out.printf("Área de la base: %.2f\n", areaBase);
        System.out.printf("Área lateral: %.2f\n", areaLateral);
        System.out.printf("Área total: %.2f\n", areaTotal);
    }
      public static void main(String[] args) {
        EJERCICIO12 datos = new EJERCICIO12();
        datos.pedirDatos();

        double areaBase = datos.calcularAreaBase(perimetro, apotema);
        double areaLateral = datos.calcularAreaLateral(perimetro, altura);
        double areaTotal = datos.calcularAreaTotal(areaBase, areaLateral);

        datos.imprimirResultados(areaBase, areaLateral, areaTotal);
    }
}
