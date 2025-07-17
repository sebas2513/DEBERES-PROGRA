package mertodos;

import java.util.Scanner;

public class SobrecargaS1 {
    public int sumar(int valor1,int valor2){
int resultado=valor1+valor2;

return resultado;
    }

public double sumar(double valor1,double valor2){
    double resultado=0;
    resultado=valor1+valor2;
    return resultado;
}

public double sumar(double valor1,double valor2,double valor3){
    double resultado=0;
    resultado=valor1+valor2+valor3;
    return resultado;
}


public static void main(String[] args) {

SobrecargaS1 obj = new SobrecargaS1();
int suma = obj.sumar(10, 20);
System.out.println(suma);
double suma2=obj.sumar(4.587, 3.14159);
System.out.println(suma2);



}



}
