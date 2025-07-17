package LISTAS;

import java.util.ArrayList;
import java.util.List;

public class ConcursoProgramacion {
//crear
public static void main(String[] args) {
  List<persona>listaPersonas=new ArrayList<>();

//crear objetos
persona persona_1= new persona("ana", "f", 18);  
persona persona_2= new persona("luis", "m", 19);  
persona persona_3= new persona("jose", "m", 20);  
persona persona_4= new persona("andrea", "femenino", 123);  
//agregar objetos de la lista
listaPersonas.add(persona_1);
listaPersonas.add(persona_2);
listaPersonas.add(persona_3);
listaPersonas.add(persona_4);

for (persona persona : listaPersonas) {
    if(persona.getEntero()>20)
    System.out.println(persona.getNombre());
}











}










}
