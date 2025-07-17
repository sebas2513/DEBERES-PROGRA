import java.util.Scanner;

public class EJERCICIO13 {

    public int DIAS = 5;
    public double[] tempMin = new double[DIAS];
    public double[] tempMax = new double[DIAS];
    public double[] tempMedia = new double[DIAS];


    public void leerTemperaturas() {
        Scanner tec = new Scanner(System.in);

        for (int i = 0; i < DIAS; i++) {
            System.out.println("Día " + (i + 1) + ":");
            System.out.print("Temperatura mínima: ");
            tempMin[i] = tec.nextDouble();
            System.out.print("Temperatura máxima: ");
            tempMax[i] = tec.nextDouble();

            tempMedia[i] = (tempMin[i] + tempMax[i]) / 2.0;  
        }
    }


    public void mostrarPromedios() {
        System.out.println("Temperatura media de cada día:");
        for (int i = 0; i < DIAS; i++) {
            System.out.println("Día " + (i + 1) + ": " + tempMedia[i] + " °C");
        }
    }


    public void mostrarExtremos() {
        int diaMin = 0;
        int diaMax = 0;

        for (int i = 1; i < DIAS; i++) {
            if (tempMedia[i] < tempMedia[diaMin]) {
                diaMin = i;
            }
            if (tempMedia[i] > tempMedia[diaMax]) {
                diaMax = i;
            }
        }

        System.out.println("Día con temperatura media más baja: Día " + (diaMin + 1) + " (" + tempMedia[diaMin] + " °C)");
        System.out.println("");
        System.out.println("Día con temperatura media más alta: Día " + (diaMax + 1) + " (" + tempMedia[diaMax] + " °C)");
    }

    public static void main(String[] args) {
         EJERCICIO13 OBJ=new EJERCICIO13();
        OBJ.leerTemperaturas();
        OBJ.mostrarPromedios();
        OBJ.mostrarExtremos();
    }
}
