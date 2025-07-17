import java.util.Random;
import java.util.Scanner;

public class Matrizes {

    public static void main(String[] args) {
        double[][] temperaturas=new double[5][3];
        // double[][] temperaturas = {
            //{18, 7, 0},  
            //{20, 9, 0},
            //{24, 8, 0},
           // {17, 5, 0},
         //   {26, 11, 0}
       // };
       //CargaManualdeTemperaturaMax(temperaturas);
    //CargaManualdeTemperaturaMin(temperaturas);
    CargaAleatoria(temperaturas, 17, 26, 0);
  CargaAleatoria(temperaturas, 5, 12, 1);

        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i][2] = (temperaturas[i][0] + temperaturas[i][1]) / 2;
        }

    
        System.out.println("PREGUNTA 1");
        System.out.println(" Temperatura max "+"\t" +"Temperatura min "+"\t" +" Temperatura media");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("DIA: "+(i+1)+"\t"+ temperaturas[i][0] + " \t\t " + temperaturas[i][1] + " \t\t " + temperaturas[i][2]);
        }

        // Pregunta 2: Encontrar el valor menor de la temperatura media
        double valormenor = temperaturas[0][2];
        int posicion = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            if (valormenor > temperaturas[i][2]) {
                valormenor = temperaturas[i][2];
                posicion = i;
            }
        }

        System.out.println("El valor menor es " + valormenor + " en el día " + (posicion + 1));

        // Pregunta 3: Encontrar el valor mayor de la temperatura media
        double valorMayor = temperaturas[0][2];
        posicion = 0;
        int dia = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            if (valorMayor < temperaturas[i][2]) {
                valorMayor = temperaturas[i][2];
                posicion = i;
            }
        }
        dia = posicion + 1;
        System.out.println("El valor mayor es " + valorMayor + " en el día " + dia);
    }


private static void CargaManualdeTemperaturaMax(double [][] matriz){
    Scanner tec = new Scanner(System.in);
System.out.println("carga manual de temperaturas");
    for (int i = 0; i < matriz.length; i++) {
        System.out.println("ingrese LA TEMPERATURA: max ");
        matriz[i][0]=tec.nextDouble();

    }
}
private static void CargaManualdeTemperaturaMin(double [][] matriz){
    Scanner tec = new Scanner(System.in);
System.out.println("carga manual de temperaturas");
    for (int i = 0; i < matriz.length; i++) {
        System.out.println("ingrese LA TEMPERATURA: min ");
        matriz[i][1]=tec.nextDouble();

    }
}

private static void CargaAleatoria(double [][] matriz,double limiteinferior,double limitesuperior,int columna){

Random random= new Random();
    for (int i = 0; i < matriz.length; i++) {
    
        matriz[i][columna]=random.nextDouble(limiteinferior,limitesuperior);
    }
}


}
