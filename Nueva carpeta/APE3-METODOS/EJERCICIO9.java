import java.util.Scanner;

public class EJERCICIO9 {

    static double radio; 

    public static void main(String[] args) {
        EJERCICIO9 datos = new EJERCICIO9();
        datos.pedirRadio(); 

        double area = datos.calcularArea(radio);
        double volumen = datos.calcularVolumen(radio);

        datos.imprimirResultados(area, volumen);
    }

    public  void pedirRadio() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el radio de la esfera: ");
        radio = teclado.nextDouble();
    }

    public double calcularArea(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public  double calcularVolumen(double r) {
        return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
    }


    public  void imprimirResultados(double area, double volumen) {
        System.out.println("== Resultados ==");
        System.out.printf("Área de la esfera: "+ Math.round(area*100)/100);
        System.out.printf("Volumen de la esfera: "+Math.round(volumen*100)/100);
    }
}