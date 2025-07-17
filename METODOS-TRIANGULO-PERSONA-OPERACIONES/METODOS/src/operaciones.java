

import java.util.Scanner;

public class operaciones {
   private int num1;
   private int num2;
   private double sum;
   private double div;
   private double res;
   private double mult;
   private double residuo;
   private Scanner teclado;

   public void ingresodedatos() {
      this.teclado = new Scanner(System.in);
      System.out.println("ingrese el numero 1");
      this.num1 = this.teclado.nextInt();
      System.out.println("ingrese el numero 2");
      this.num2 = this.teclado.nextInt();
   }

   public void suma() {
      this.sum = (double)(this.num1 + this.num2);
      System.out.println("LA SUMA ES " + this.sum);
   }

   public void resta() {
      this.res = (double)(this.num1 - this.num2);
      System.out.println("la rewsta es " + this.res);
   }

   public void multiplicacion() {
      this.mult = (double)(this.num1 * this.num2);
      System.out.println("la multiplicacion es " + this.mult);
   }

   public void division() {
      this.div = (double)(this.num1 / this.num2);
      System.out.println("la division es " + this.div);
   }

   public void residuo() {
      this.res = (double)(this.num1 % this.num2);
      System.out.println("la division es " + this.res);
   }

   public static void main(String[] args) {
      operaciones operaciones_1 = new operaciones();
      operaciones_1.ingresodedatos();
      operaciones_1.suma();
      operaciones_1.resta();
      operaciones_1.multiplicacion();
      operaciones_1.division();
      operaciones_1.residuo();
   }
}
