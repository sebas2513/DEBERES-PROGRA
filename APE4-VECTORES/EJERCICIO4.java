import java.util.Scanner;

public class EJERCICIO4 {
    private int repetidos = 0;
    private int[] num = new int[6];
    public void DATOS() {
        Scanner tec = new Scanner(System.in);

        System.out.println("INGRESE 6 NUMEROS:");
        for (int i = 0; i < 6; i++) {
            num[i] = tec.nextInt();
        }
    }

    public void IMPRIMIR() {
        System.out.println("CANTIDAD DE REPETIDOS: " + repetidos);
    }
    
    public void CONTARREPE() {
        boolean[] repe = new boolean[6];

        for (int i = 0; i < 6; i++) {
            if (repe[i]) continue;

            int cuenta = 1;
            for (int j = i + 1; j < 6; j++) {
                if (num[i] == num[j]) {
                    cuenta++;
                    repe[j] = true;
                }
            }

            if (cuenta > 1) {
                repetidos++;
            }
        }
    }

    public static void main(String[] args) {
        EJERCICIO4 obj = new EJERCICIO4();
        obj.DATOS();
        obj.CONTARREPE();
        obj.IMPRIMIR();
    }
}
