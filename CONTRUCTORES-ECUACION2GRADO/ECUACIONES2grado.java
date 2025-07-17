import java.util.Scanner;

public class ECUACIONES2grado {


public void Datos(){
double a,b,c;
Scanner tec = new Scanner(System.in);
System.out.println("ingrese el valor de a");
a=tec.nextDouble();
System.out.println("ingrese el valor de b");
b=tec.nextDouble();
System.out.println("ingrese el valor de c");
c=tec.nextDouble();
double discriminante1=DISCRIMINANTE(a, b, c);
if (a==0) {
    System.out.println("NO TIENE SOLUCION");
}else if (discriminante1>0 ) {
        System.out.println("tiene 2 soluciones");
        Calculox1(a, b, c);
        Calculox2(a, b, c);
    }else if (discriminante1==0) {
        System.out.println("tiene una solucion");
        Calculox1(a, b, c);
        
    
    }else if (discriminante1< 0){
        System.out.println("NO TIENE SOLUCION");
    }


    

}

public double DISCRIMINANTE(double a_ ,double b_,double c_){
    // (b² - 4ac)
double discriminante=0;
discriminante= (Math.pow(b_, 2)-4*a_*c_);

    return discriminante;
}


public double Calculox1(double a_ ,double b_,double c_){

    double raiz=  (Math.pow(b_, 2)-4*a_*c_);
    double x1=(-(b_)+Math.sqrt(raiz))/(2*a_)  ;
    System.out.println("el valor de x1 es: "+x1);
   

return x1 ;
}
public double Calculox2(double a_ ,double b_,double c_){

    double raiz=  (Math.pow(b_, 2)-4*a_*c_);
   
    double x2=(-(b_)-Math.sqrt(raiz))/(2*a_);
    System.out.println("el valor de x2 es: "+x2);

return x2 ;

}

    public static void main(String[] args) throws Exception {
ECUACIONES2grado PROGRA= new ECUACIONES2grado();
PROGRA.Datos();

    }
}
