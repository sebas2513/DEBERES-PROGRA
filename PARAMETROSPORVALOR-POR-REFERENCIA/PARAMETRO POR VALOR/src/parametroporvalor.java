public class parametroporvalor {

    public static void main(String[] a)
    {
    int num = 11;
    System.out.println("Antes de añadir el parametro por valor , n = " + num);
    porvalor(num);
    System.out.println("Después de llamr el parametro , n = " + num); 
 }
 static void porvalor(int valor)
 {
 System.out.println("Dentro del parametro porvalor, valor = " + valor);
 valor = 2025;
 System.out.println("Dentro del parametro porvalor, valor = " + valor);
 }

}

