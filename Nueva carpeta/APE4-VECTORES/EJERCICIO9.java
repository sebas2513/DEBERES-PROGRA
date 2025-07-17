import java.util.Random;

public class EJERCICIO9 {
Random random;


public static void retornarvalores(int valores[]){
Random random=new Random();

    for (int i = 0; i < valores.length; i++) {
        
        valores[i]=random.nextInt(1,101);

    }

}

public static void Imprimirvector(int valores[]){

 for (int i = valores.length-1; i>=0; i--) {
        
     System.out.println("VALOR "+valores[i]);

    }
}

public static void ORDENAR(int valores[]){

int valorauxiliar=0;
    for (int i = 0; i < valores.length-1; i++) {
        
     for (int j = 0; j < valores.length-1; j++) {
        
        if (valores[j]>valores[j+1]) {
            valorauxiliar=valores[j];
            valores[j]=valores[j+1];
            valores[j+1]=valorauxiliar;
            
        }


     }

    }

}
public static void main(String[] args) {
EJERCICIO9 DATOS = new EJERCICIO9();
   int [] valores = new int[10]; 
 DATOS.retornarvalores(valores);
DATOS.ORDENAR(valores);
DATOS.Imprimirvector(valores);
}
}
