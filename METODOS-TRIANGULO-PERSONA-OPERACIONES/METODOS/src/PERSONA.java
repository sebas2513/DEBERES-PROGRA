

import java.util.Scanner;

public class PERSONA {
   private String nombre;
   private int edad;
   private Scanner teclado;

   public void INICIALIZARVARIABLES() {
      System.out.println("INGRESE EL NOMBRE");
      this.nombre = this.teclado.next();
      System.out.println("INGRESE la edad");
      this.edad = this.teclado.nextInt();
   }

   public void LEERMASDATOS() {
      this.teclado = new Scanner(System.in);
   }

   public void Imprimirinformacion() {
      System.out.println("nombre" + this.nombre);
      System.out.println("edad" + this.edad);
   }

   public void IMPRIMIRSIESMAYORDEEDAD() {
      if (this.edad >= 18) {
         System.out.println(this.nombre + "es mayor de edad");
      }

   }

   public static void main(String[] args) {
      PERSONA persona_1 = new PERSONA();
      persona_1.INICIALIZARVARIABLES();
      persona_1.Imprimirinformacion();
      persona_1.IMPRIMIRSIESMAYORDEEDAD();
   }
}
