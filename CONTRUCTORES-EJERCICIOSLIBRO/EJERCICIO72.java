package EJERCICIOLIBRO;

import java.util.Scanner;

//Dadas tres notas, obtenga el promedio de las dos notas mayores, cree un procedimiento para 
//realizar dicha tarea.
public class EJERCICIO72 {

    public void datos(){
Scanner teclado=new Scanner(System.in);
System.out.println("INGRESE LA NOTA 1");
double nota1=teclado.nextDouble();
System.out.println("INGRESE LA NOTA 2");
double nota2=teclado.nextDouble();
System.out.println("INGRESE LA NOTA 3");
double nota3=teclado.nextDouble();
double promedio=NOTAMAYOR(nota1, nota2, nota3)/3;
System.out.println("el promedio es "+promedio);
    }

    public double NOTAMAYOR(double nota1_,double nota2_,double nota3_){
double notamenor=0;
double suma=0;
    if (nota1_<nota2_ && nota1_<nota3_) {
        notamenor=nota1_;
    }else if(nota2_>nota1_ && nota2_>nota3_){
        notamenor=nota2_;
    }else{
        notamenor=nota3_;
    }
suma=((nota1_+nota2_+nota3_)-notamenor);

    return suma;
  }


  public static void main(String[] args) {
    EJERCICIO72 METO = new EJERCICIO72();
    METO.datos();
  }
    }




