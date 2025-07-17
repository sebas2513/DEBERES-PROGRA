package EJERCICIOLIBRO;

import java.util.Scanner;

public class EJERCICIO74 {
//Enunciado: Dado un número obtener la suma de sus dígitos pares e impares


public EJERCICIO74(int num){
num=num;

}
public void DIGITOPAR(int num){
    int digito;
    int contpares=0;

while (num>0) {
    digito=num%10;

    if (digito%2==0) {
        contpares+=digito;
    }
num=num/10;

}

System.out.println("LA SUMA DE LOS NUMEROS PARES SON "+contpares);
}

public void DIGITOIMPAR(int num){
    int digito;
    int contIMPARES=0;

while (num>0) {
    digito=num%10;

    if (digito%2!=0) {
        contIMPARES+=digito;
    }
num=num/10;

}

System.out.println("LA SUMA DE LOS NUMEROS IMPARES SON "+contIMPARES);
}


public static void main(String[] args) {

 Scanner teclado = new Scanner(System.in);
    
    System.out.println("ingrese EL NUMERO");
    int num=teclado.nextInt();
    EJERCICIO74 METO = new EJERCICIO74(num);

    METO.DIGITOIMPAR(num);
    METO.DIGITOPAR(num);
}




}
