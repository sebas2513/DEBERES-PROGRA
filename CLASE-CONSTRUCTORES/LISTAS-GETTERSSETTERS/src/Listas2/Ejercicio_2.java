package Listas2;

import java.util.LinkedList;

public class Ejercicio_2 {


public static void Imprimir(LinkedList<Automovil> automovil_){
    for (Automovil automovil : automovil_) {
        System.out.println(automovil.getModelo()+" - "+
        automovil.getMarca()+"- "+
     automovil.getAño());
    }

}



public static void main(String[] args) {
    LinkedList<Automovil>listaAutomoviles = new LinkedList<>();
Automovil auto1 = new Automovil("Vw", "gold", 2011);
Automovil auto2= new Automovil("Kia", "cerato", 2015);
LinkedList<Automovil> listaAutomovilesExonerados = new LinkedList<>();
listaAutomoviles.add(auto1);
listaAutomoviles.add(auto2);
listaAutomoviles.add(new Automovil("Toyota", "RAV4", 2022));
listaAutomoviles.add(new Automovil("Nissan", "Sentra", 2010));
listaAutomoviles.add(new Automovil("Ford", "Focus", 2025));

//imprimir los automoviles
Imprimir(listaAutomoviles);
//Agragar un vehichulo al inicio
listaAutomoviles.addFirst(new Automovil("BMW", "SERIE13", 2024));
Imprimir(listaAutomoviles);
//agregar un vehclo al final
listaAutomoviles.add(new Automovil("Mercedes", "vens", 2025));
System.out.println(listaAutomoviles.getLast().toString());
//busquedas
System.out.println("--- busqueda automovil----");
String _marca="ToYota";
for (Automovil auto : listaAutomoviles) {
    if (_marca.toUpperCase().equals(auto.getMarca().toUpperCase())&& auto.getAño()>2020) {
        System.out.println("encontrado"+auto.getModelo());
    }
}
//crear nuevos vehiculos exonerados del 2023 al 2025

System.out.println("-crear nuevos vehiculos exonerados del 2023 al 2025");
for (Automovil auto : listaAutomoviles) {
    if (auto.getAño()>=2023) {
        listaAutomovilesExonerados.add(auto);
        
    }
}








}







}
