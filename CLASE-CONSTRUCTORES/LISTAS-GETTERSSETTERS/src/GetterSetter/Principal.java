package GetterSetter;

public class Principal {


public static void main(String[] args) {
    
    Estudiante estudainte_1 = new Estudiante();

estudainte_1.setnombre("juan");
estudainte_1.setEdad(20);
estudainte_1.setCorreo("JUAN@123.COM");
estudainte_1.setcuentabancaria("65745747");

System.out.println(estudainte_1.getNombre());
System.out.println(estudainte_1.getedad());
System.out.println(estudainte_1.getcorreo());
estudainte_1.IMPRIMIRINFORMACION();
 Estudiante estudainte_2 = new Estudiante("Lucia", 19, "lucia@.com");

 estudainte_2.setEdad(19);

estudainte_2.IMPRIMIRINFORMACION();
 estudainte_2.setCorreo("luci.123.com");
}














}
