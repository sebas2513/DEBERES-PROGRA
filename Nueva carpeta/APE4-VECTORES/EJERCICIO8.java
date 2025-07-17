import java.util.Scanner;
public class EJERCICIO8 {
    private double[] notas = new double[5];
    private double suma = 0, promedio = 0, mayor, menor;

    public void CALCULO() {
        Scanner tec = new Scanner(System.in);

        System.out.println("Ingrese 5 notas del 0 al 10:");
        for (int i = 0; i < 5; i++) {
            double nota;
            do {
                System.out.print("Nota " + (i + 1) + ": ");
                nota = tec.nextDouble();
            } while (nota < 0 || nota > 10);  
            notas[i] = nota;
            suma += nota;
        }
        promedio = suma / 5;
        mayor = menor = notas[0];

        for (int i = 1; i < 5; i++) {
            if (notas[i] > mayor) mayor = notas[i];
            if (notas[i] < menor) menor = notas[i];
        }
    }

    public void IMPRIMIR() {
        System.out.println("NOTAS INGRESADAS:");
        for (int i = 0; i < notas.length; i++) {
              System.out.println(notas[i]);
        }
        System.out.printf("Promedio: "+ promedio);
        System.out.println(" ");
        System.out.println("Nota más baja: " + menor);
           System.out.println(" ");
          System.out.println("Nota más alta: " + mayor);
         
    }

    public static void main(String[] args) {
        EJERCICIO8 obj = new EJERCICIO8();
        obj.CALCULO();
        obj.IMPRIMIR();
    }
}

