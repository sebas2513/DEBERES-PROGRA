import java.util.Scanner;

public class EJERCICIO5 {

    public double nota1, nota2, nota3; 
    public  void Datos() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la primera nota: ");
        nota1 = teclado.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
          nota2 = teclado.nextDouble();

        System.out.print("Ingrese la tercera nota: ");
          nota3 = teclado.nextDouble();
    }

    public  double notaMenor() {
        double menor = nota1;

        if (nota2 < menor) {
            menor = nota2;
        }

        if (nota3 < menor) {
            menor = nota3;
        }

        return menor;
    }

    public  void calcularPromedioDosMayores() {
        double sumaTotal = nota1 + nota2 + nota3;
        double menor = notaMenor();
        double promedio = (sumaTotal - menor) / 2;

        System.out.println("El promedio de las dos notas mayores es: " + promedio);
    }


      public static void main(String[] args) {
        EJERCICIO5 datos= new EJERCICIO5();
        datos.Datos(); //PARA PEDIR LAS 3 NOTAS
        datos.calcularPromedioDosMayores(); // METODO DE CALCULOS Y PROMEDIOS
    }
}

