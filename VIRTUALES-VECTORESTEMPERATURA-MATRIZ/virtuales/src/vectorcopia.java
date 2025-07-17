import java.util.Random;
import java.util.Scanner;

public class vectorcopia {

public static void main(String[] args) {
    double [] Tmax= new double[5];
    double [] Tmin= new double[5];
   // double [] Tmax= {18,20,24,17,26};
 // double [] Tmin= {7,9,8,5,11};
 double [] Tmedia=new double[5];
 //cargar valores
//CargaManualdeTemperaturas(Tmax);
//CargaManualdeTemperaturas(Tmin);

CargaAleatoria(Tmax, 18, 27);
CargaAleatoria(Tmin, 4, 12);
 //calcular le promedio
 CalcularPromedio(Tmax, Tmin, Tmedia);

 System.out.println("PREGUNTA 1");
 System.out.println("Tempereatura max "+"Temperatura min"+"Temperatura media");
for (int i = 0; i < Tmedia.length; i++) {
    System.out.println(Tmax[i]+" \t "+Tmin[i] +" \t  " +Tmedia[i]);
}

//pregunta 2
double valormenor=Tmedia[0];
int posicion=0;
for (int i = 0; i < Tmedia.length; i++) {
    if (valormenor>Tmedia[i]) {
        valormenor=Tmedia[i];
        posicion=i;
    }

}

System.out.println("El valor menor es "+valormenor+" en la dia "+(posicion+1));


//pregunta 3
double valorMayor=Tmedia[0];
 posicion=0;
int dia=0;
for (int i = 0; i < Tmedia.length; i++) {
    if (valorMayor<Tmedia[i]) {
        valorMayor=Tmedia[i];
        posicion=i;
    }
}
dia=posicion+1;
System.out.println("El VALOR MENOR ES: "+valorMayor+" EN EL DIA: "+dia );

}

private static void CalcularPromedio(double[] Tmax, double[] Tmin, double[] Tmedia) {
    for (int i = 0; i < Tmedia.length; i++) {
        Tmedia[i]=(Tmax[i]+Tmin[i])/2;
    
     }
}

private static void CargaManualdeTemperaturas(double [] vector){
Scanner tec = new Scanner(System.in);
System.out.println("carga manual de temperaturas");
    for (int i = 0; i < vector.length; i++) {
        System.out.println("ingrese LA TEMPERATURA:");
        vector[i]=tec.nextDouble();
    }
}


private static void CargaAleatoria(double [] vector,double limiteinferior,double limitesuperior){

Random random= new Random();
System.out.println("carga manual de temperaturas");
    for (int i = 0; i < vector.length; i++) {
    
        vector[i]=random.nextDouble(limiteinferior,limitesuperior);
    }
}


}
