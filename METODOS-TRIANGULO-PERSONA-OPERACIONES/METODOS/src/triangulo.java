

import java.util.Scanner;

public class triangulo  {
   private int lado1;
   private int lado2;
   private int lado3;
   private Scanner teclado;

   public void inicialzar() {
      this.teclado = new Scanner(System.in);
      System.out.println("deme el lado 1");
      this.lado1 = this.teclado.nextInt();
      System.out.println("deme el lado 2");
      this.lado2 = this.teclado.nextInt();
      System.out.println("deme el lado 3");
      this.lado3 = this.teclado.nextInt();
   }

   public void comprobacion() {
      if (this.lado1 + this.lado3 > this.lado2) {
         System.out.println("el triangulo es valido");
      } else if (this.lado2 + this.lado3 > this.lado1) {
         System.out.println("el triangulo es valido");
      }

      if (this.lado1 + this.lado2 > this.lado3) {
         System.out.println("el trinagulo es valido");
      } else {
         System.out.println("el triangulo es invalido");
      }

   }

   public void IMPRIMIRLADOS() {
      System.out.println("LADO 1  " + this.lado1);
      System.out.println("LADO 2  " + this.lado2);
      System.out.println("LADO 3  " + this.lado3);
   }

   public void IMPRIMRLADOGRANDE() {
      if (this.lado1 > this.lado2 && this.lado1 > this.lado3) {
         System.out.println("EL LADO MAS GRANDE ES " + this.lado1);
      } else if (this.lado2 > this.lado3 && this.lado2 > this.lado1) {
         System.out.println("EL LADO MAS GRANDE ES " + this.lado2);
      } else {
         System.out.println("EL LADO MAS GRANDE ES " + this.lado3);
      }

   }

   public void SIESEQUILATERO() {
      if (this.lado1 == this.lado2 && this.lado2 == this.lado3) {
         System.out.println("EL TRINAGULO ES EQUILATERO");
      } else {
         System.out.println("no es equilatero");
      }

   }

   public static void main(String[] args) {
      triangulo triangulo_1 = new triangulo();
      triangulo_1.inicialzar();
      triangulo_1.IMPRIMIRLADOS();
      triangulo_1.IMPRIMRLADOGRANDE();
      triangulo_1.SIESEQUILATERO();
   }
}
