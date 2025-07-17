import java.util.Scanner;

public class EJERCICIO7 {
    private String[] orig = new String[5];
    private String[] invertida = new String[5];

    public void REVERTIR() {
        Scanner tec = new Scanner(System.in);

        System.out.println("INGRESE 5 PALABRAS:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            orig[i] = tec.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            invertida[i] = orig[4 - i];
        }
    }

    public void IMPRIMIR() {
        System.out.println("VECTOR EN ORDEN INVERSO:");
        for (String palabra : invertida) {
            System.out.println(palabra);
        }
    }

    public static void main(String[] args) {
        EJERCICIO7 obj = new EJERCICIO7();
        obj.REVERTIR();
        obj.IMPRIMIR();
    }
}