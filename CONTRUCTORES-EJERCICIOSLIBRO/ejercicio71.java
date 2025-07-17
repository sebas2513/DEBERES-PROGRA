package EJERCICIOLIBRO;

import java.util.Scanner;

//: Hallar el área y el perímetro de un de un cuadrado, cree un procedimiento para realizar dicha tarea.
public class ejercicio71 {


public ejercicio71(int lado){
lado=lado;

}
public void calculoarea(int lado_){

int area=lado_*lado_;
System.out.println("el area es: "+area);
}


public void calculoperimetro(int lado_){

    int perimetro=lado_+lado_+lado_+lado_;
    System.out.println("el perimetro es: "+perimetro);
    }



public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    int lado;
System.out.println("INGRESE EL VALOR DEL LADO ");
lado=teclado.nextInt();
ejercicio71 datos=new ejercicio71(lado);
datos.calculoarea(lado);
datos.calculoperimetro(lado);
}


}
