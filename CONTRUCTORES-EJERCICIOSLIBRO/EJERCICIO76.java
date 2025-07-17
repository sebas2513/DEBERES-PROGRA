package EJERCICIOLIBRO;

import java.util.Scanner;

// Hallar el área de un rectángulo, cree una función para realizar dicha tarea.
public class EJERCICIO76 {


public void AREARECTANGULO(double base,double altura){
double area;

area=base*altura;
System.out.println("el area del rectangulo es "+area );


}


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
           System.out.println("ingrese la base");
double base=teclado.nextDouble();
     System.out.println("ingrese la altura");
double altura=teclado.nextDouble();
EJERCICIO76 DATOS = new EJERCICIO76();
DATOS.AREARECTANGULO(base, altura);


    }
}
