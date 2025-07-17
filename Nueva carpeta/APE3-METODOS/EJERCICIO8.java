import java.util.Scanner;

public class EJERCICIO8 {

 

    public  double calcularAreaBase(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public  double calcularAreaLateral(double r, double g) {
        return Math.PI * r * g;
    }

    public double calcularAreaTotal(double areaBase, double areaLateral) {
        return areaBase + areaLateral;
    }

    public  double calcularVolumen(double r, double h) {
        return (Math.PI * Math.pow(r, 2) * h) / 3;
    }
       public static void main(String[] args) {
        EJERCICIO8 datos = new EJERCICIO8();
        Scanner teclado = new Scanner(System.in);
        System.out.print("INGRESE EL RADIO DEL CONO ");
        double radio = teclado.nextDouble();

        System.out.print("INGRESE LA GENERATRIZ DEL CONO: ");
        double generatriz = teclado.nextDouble();

        System.out.print("INGRESE LA ALTURA DE CONO ");
        double altura = teclado.nextDouble();

        double areaBase = datos.calcularAreaBase(radio);
        double areaLateral = datos.calcularAreaLateral(radio, generatriz);
        double areaTotal = datos.calcularAreaTotal(areaBase, areaLateral);
        double volumen = datos.calcularVolumen(radio, altura);
        System.out.println(" =====Resultados====== ");
        System.out.println("ÁREA DE LA BASE:   " + areaBase);
        System.out.println("ÁREA LATERAL:   " + areaLateral);
        System.out.println("ÁREA TOTAL:   " + areaTotal);
        System.out.println("VOLUMEN:  " + volumen);    
    }
}
