import java.util.Scanner;

public class EJERCICIO2 {
    public int n1, n2, n3, n4, n5;    
    public void pedirNumeros() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("INGRESE EL VALOR 1:  ");
        n1 = teclado.nextInt();

        System.out.print("INGRESE EL VALOR 2:   ");
            n2 = teclado.nextInt();

        System.out.print("INGRESE EL VALOR 3:  ");
            n3 = teclado.nextInt();

        System.out.print("INGRESE EL VALOR 4:  ");
        n4 = teclado.nextInt();

        System.out.print("INGRESE EL VALOR 5: ");
            n5 = teclado.nextInt();

    }

    public void sumarNumeros() {
        int suma = n1 + n2 + n3 + n4 + n5;
        System.out.println("LA SUMA DE LOS NUMEROS ES " + suma);
    }

    public static void main(String[] args) {
        EJERCICIO2 datos = new EJERCICIO2();
        datos.pedirNumeros();   
        datos.sumarNumeros();  
    }
}

