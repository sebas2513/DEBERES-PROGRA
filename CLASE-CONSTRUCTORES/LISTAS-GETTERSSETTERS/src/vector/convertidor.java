public class convertidor {


public static void main(String[] args) {
    

//convertir una cadena en array
String cadena="hola,fundamentos,de,programacion";

String delimitador=",";

//dividir la cadena utilizando el delimitador
String [] vector=cadena.split(delimitador);


for (String elemento : vector) {
    System.out.println(elemento);
}
System.out.println(vector.length);

// "convertir de un array a una cadena"
System.out.println("convertir de un array a una cadena");
String [] estudiantes = new String[]{"JUANA","ANDRES","Santiago","Judas"};
String cadenaEstudiantes = String.join(delimitador, estudiantes);
System.out.println(cadenaEstudiantes);
//hacer con vocales

}







}
