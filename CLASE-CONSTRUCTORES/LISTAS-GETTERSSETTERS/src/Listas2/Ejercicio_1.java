package Listas2;

import java.util.LinkedList;

public class Ejercicio_1 {


public static void Imprimirlista(LinkedList<String>lista_){
for (String elemento : lista_) {
    System.out.println(elemento);
}

}








public static void main(String[] args) {
    
    LinkedList<String>lista1=new LinkedList<String>();
    lista1.add("juan");
    lista1.add("Andres");
    lista1.add("Pablo");
    lista1.add("Camilo");

    System.out.println("--------------");
 Imprimirlista(lista1);
 System.out.println("-----------------------------");
  lista1.add(1,"Ana");
  Imprimirlista(lista1);
  System.out.println("-----------------------------");

  lista1.remove(0);
  Imprimirlista(lista1);
  System.out.println("-----------------------------");
  lista1.remove("Pablo");
  Imprimirlista(lista1);
  System.out.println("-longitud de la litas "+lista1.size());

if (lista1.contains("Ana")) {
    System.out.println("si existe");
}else{
    System.out.println("no existe");
}

System.out.println(lista1.get(1));
//limpiar la lista
lista1.clear();
if (lista1.isEmpty()) {
    System.out.println("lista sin elementos");
    

}                

}












}
