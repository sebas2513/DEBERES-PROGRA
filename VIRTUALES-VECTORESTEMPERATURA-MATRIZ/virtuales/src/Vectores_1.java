public class Vectores_1 {

public static void main(String[] args) {
    double [] Tmax= {18,20,24,17,26};
  double [] Tmin= {7,9,8,5,11};
 double [] Tmedia=new double[5];


 //calcular le promedio
 for (int i = 0; i < Tmedia.length; i++) {
    Tmedia[i]=(Tmax[i]+Tmin[i])/2;

 }

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



}
