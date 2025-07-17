package LISTAS;

import java.util.ArrayList;
import java.util.List;

public class EjemploListas {




public static void main(String[] args) {
    //crear listas
    List<String>nombres=new ArrayList<>();

    nombres.add("JUAN");
nombres.add("josue");
nombres.add("MARIA");

System.out.println(nombres);
System.out.println(nombres.size());


    List<Integer>numeros=new ArrayList<>();

    numeros.add(10);
    numeros.add(1,20);
        numeros.add(16);
    numeros.add(50);
    numeros.add(1,60);
      numeros.add(40);
    System.out.println(numeros);
    System.out.println(numeros.size());
    List<String>frutas=new ArrayList<>();
    //como agregamos elmentos ala lista
frutas.add("manzana");
frutas.add("BANANAS");
frutas.add("Naranja");
//opcion 1 para imprimir
System.out.println(frutas);
//opcion 2 para imprimir por un foe-each
System.out.println("imprimiendo frutas con for each");
for(String fruta : frutas){
    System.out.println(fruta);
}

System.out.println("imprimiendo numerps con for each");
for(int valor  : numeros){



    System.out.println(valor);
}

int contador=0;

  System.out.println("cuantos de estos elemetos son divisible para 8");
  for(int valor  : numeros){

if (valor%8==0){
contador++;
    System.out.println("el valor divisible para 8 es:"+valor);

}

    
}

    System.out.println(contador);



//opcion 3 para imprimir -lamnda

System.out.println("impricion con lamda");

numeros.forEach(numero-> System.out.println(numero));

System.out.println("lista orginal numeros"+numeros);


numeros.remove(0);
System.out.println("lista modificada orginal numeros"+numeros);
numeros.remove("20");
System.out.println("lista  mo dificada orginal numeros"+numeros);

System.out.println("lista orginal frutas"+frutas);


frutas.remove("manzana");
System.out.println("lista orginal frutas"+frutas);

//-----------------------------------------------------
 List<Double>notasG1=new ArrayList<>();
notasG1.add(4.0);
notasG1.add(9.0);
notasG1.add(3.0);
notasG1.add(5.0);

 List<Double>notasG2=new ArrayList<>();
notasG2.add(9.0);
notasG2.add(10.0);
notasG2.add(5.5);
notasG2.add(7.8);

//unir listas
//notasG1.addAll(notasG2);
System.out.println(notasG1);
//otra lista
 List<Double>notas=new ArrayList<>();
notas.addAll(notasG1);
notas.addAll(notasG2);
System.out.println(notas);

double sumatoria=0,promedio=0;
for (Double nota : notas) {
    sumatoria+=nota;
}
promedio=sumatoria/notas.size();
System.out.println("EL PROMEDIO DEL CURSO ES = "+promedio);

//SACAR EL PROMEDIO QUE TIENEN MENOS DE 7
sumatoria=0;
promedio=0;
int contador1=0;
for (Double nota : notas) {
  if (nota<7) {
    contador1++;
    sumatoria+=nota;
  }
}
promedio=sumatoria/contador1;
System.out.println("EL PROMEDIO DEL curso = "+promedio+"menos de 7    "+contador1);



}


}
