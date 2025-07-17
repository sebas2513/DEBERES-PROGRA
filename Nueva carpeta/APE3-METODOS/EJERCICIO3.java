import java.util.Scanner;
public class EJERCICIO3 {

    public int rangi, rangf; 


    public  void pedirRango(Scanner tec_) {//METODO PARA INGRESAR LOS RANGOS
        System.out.print("INGRESE EL RANGO INICIAL");
        rangi = tec_.nextInt();

        System.out.print("INGRESE EL RANGO FINAL ");
        rangf= tec_.nextInt();

        
    }

    
    public  void promedioTotal() {
        int suma = 0, contador = 0;
        for (int i = rangi; i <= rangf; i++) {
            suma += i;
            contador++;
        }
        System.out.println("Promedio total: " + (contador == 0 ? 0 : (double) suma / contador));
    }

    public void promedioPares() {
        int suma = 0, contador = 0;
        for (int i = rangi; i <= rangf; i++) {
            if (i % 2 == 0) {
                suma += i;
                contador++;
            }
        }
        System.out.println("Promedio de pares: " + (contador == 0 ? 0 : (double) suma / contador));
    }

    
    public void promedioImpares() {
        int suma = 0, contador = 0;
        for (int i = rangi; i <= rangf; i++) {
            if (i % 2 != 0) {
                suma += i;
                contador++;
            }
        }
        System.out.println("Promedio de impares: " + (contador == 0 ? 0 : (double) suma / contador));
    }

    public void promedioPrimos() {
        int suma = 0, contador = 0;
        for (int i = rangi; i <= rangf; i++) {
            if (esPrimo(i)) {
                suma += i;
                contador++;
            }
        }
        System.out.println("Promedio de primos: " + (contador == 0 ? 0 : (double) suma / contador));
    }


    public  boolean esPrimo(int numero) {
        if (numero < 2) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    public char deseaRepetir(Scanner tec_) {
        System.out.print("¿Desea repetir el proceso? (s/n): ");
        return tec_.next().toLowerCase().charAt(0);
    
    }
  public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        EJERCICIO3 metodos = new EJERCICIO3();
        char repetir;

        do {
            metodos.pedirRango(teclado);
            metodos.promedioTotal();
            metodos.promedioPares();
            metodos.promedioImpares();
            metodos.promedioPrimos();
            repetir = metodos.deseaRepetir(teclado);
        } while (repetir == 's');        
    }


}
