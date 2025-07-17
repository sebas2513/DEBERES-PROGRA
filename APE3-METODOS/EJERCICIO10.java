  import java.util.Scanner;

public class EJERCICIO10 {
    static double lado; 
    public void pedirLado() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("INGRESE EL LADO DEL HEXAEDRO: ");
        lado = teclado.nextDouble();
    }
    public double calcularAreaBase(double l) {
        return l * l;
    }


    public  double calcularAreaLateral(double l) {
        return 4 * l * l;
    }

    public double calcularAreaTotal(double l) {
        return 6 * l * l;
    }
    public double calcularVolumen(double l) {
        return l * l * l;
    }


    public  void imprimirResultados(double areaBase, double areaLateral, double areaTotal, double volumen) {
        System.out.println("--- Resultados ---");
        System.out.printf("  Área de la base:"+  Math.round(areaBase*100)/100);
        System.out.printf("  Área lateral: "+ Math.round(areaLateral*100)/100);
        System.out.printf("  Área total: "+Math.round(areaTotal*100)/100);
        System.out.printf("  Volumen: "+ Math.round(volumen*100)/100);
    }
       public static void main(String[] args) {

        EJERCICIO10 datos = new EJERCICIO10();
        datos.pedirLado();

        double areaBase = datos.calcularAreaBase(lado);
        double areaLateral = datos.calcularAreaLateral(lado);
        double areaTotal = datos.calcularAreaTotal(lado);
        double volumen = datos.calcularVolumen(lado);

        datos.imprimirResultados(areaBase ,  areaLateral , areaTotal, volumen);
    }
}

