import java.util.Scanner;

public class EJERCICIO10 {
    public int[] vec1 = new int[5];
    public int[] vec2 = new int[5];
    public int[] vec3 = new int[5];

    public void CALCULO() {
        Scanner tec = new Scanner(System.in);

        System.out.println("INGRESE 5 NUMEROS PARA EL VECTOR 1:");
        for (int i = 0; i < 5; i++) {
            System.out.print("vec1[" + i + "]: ");
            vec1[i] = tec.nextInt();
        }

        System.out.println("INGRESE 5 NUMEROS PARA EL VECTOR 2:");
        for (int i = 0; i < 5; i++) {
            System.out.print("vec2[" + i + "]: ");
            vec2[i] = tec.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            vec3[i] = vec1[i] + vec2[i];
        }
    }

    public void IMPRIMIR() {
        System.out.println("vec3 = vec1 + vec2:");
        System.out.println(" ");
        for (int i = 0; i < 5; i++) {
            System.out.println("vec3[" + i + "] = " + vec3[i]);
        }
    }

    public static void main(String[] args) {
        EJERCICIO10 OBJ = new EJERCICIO10();
        OBJ.CALCULO();
        OBJ.IMPRIMIR();
    }
}