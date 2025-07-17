package EJERCICIOLIBRO;

import java.util.Scanner;

public class EJERCICIO73 {
    //Dada la edad de una persona, determine en qué etapa de su vida se encuentra, cree un 
   // procedimiento para realizar dicha tarea.

public EJERCICIO73(int edad){
    edad=edad;
}
//<
public void COMPROBAREDAD(int edad){
if (edad>=0 && edad <=2 ) {
    System.out.println("ETAPA ES BEBE");
} else  if (edad>2 && edad <=5 ) {
      System.out.println("ETAPA ES un niño");
} else if (edad>5 && edad <=12) {
     System.out.println("ETAPA ES LA PUBERTAD");
}else if (edad>12 && edad <=18) {
     System.out.println("ETAPA ES ADOLECENTE");
}else if (edad>18 && edad <=25) {
     System.out.println("ETAPA ES JOVEN");
}else if (edad>25 && edad <=60) {
     System.out.println("ETAPA ES ADULTO");
}else{
  System.out.println("ETAPA ES VIEJO");  
}

}

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("ingrese la edad");
    int edad=teclado.nextInt();

EJERCICIO73 datos= new EJERCICIO73(edad);
datos.COMPROBAREDAD(edad);

}

}
