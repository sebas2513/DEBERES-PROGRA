package METODOSSTRING;








public class MetodosCadenas {


    public void CharAt(){

//CharAt
//retorno el primer elemneto de un string
String cadena="HOLA MUNDO";
char resultado= cadena.charAt(3);
System.out.println(resultado);
//LONGITUD CADENA 
int LONGITUD= cadena.length();
System.out.println(LONGITUD);
for (int i = 0; i <= LONGITUD; i++) {
    System.out.println(cadena.charAt(i));
}


    }

    public void MetodoCompare(){

String cadena1="HOLA ";
String cadena2="HoLA ";


System.out.println(cadena1.compareTo(cadena2));
}


public void MetodoCoompareIGNORANDOMAYUSCULASYMINUSCULAS(){

    String cadena1="HOLA ";
    String cadena2="HoLA ";
    
    
    System.out.println(cadena1.compareToIgnoreCase(cadena2));
    
    
        }
        
public void CONCATENARCADENAS(){

    String nombre="JUAN";
    String APELIDDO="ESPIN";
    String APELIDDO2="flores";
    System.out.println(nombre.concat(APELIDDO).concat(APELIDDO2));
    
    }



public void VALIDARSUBCADENA(){
String cadena="Camilo Lopez Ramirez";
System.out.println(cadena.contains("Andrea"));

System.out.println(cadena.contains("pez"));


}

public void TERMINADOEN(){

    String CADENA= "Ambato";
    System.out.println(CADENA.endsWith("Amb"));

    System.out.println(CADENA.endsWith("to"));
    System.out.println(CADENA.endsWith("o"));
}

public void CadenasIGUALES(){

    String cadena1="HOLA ";
    String cadena2="HoLA ";
    
    String cadena3="Hellow";
    System.out.println(cadena1.equals((cadena2)));

      System.out.println(cadena1.equals((cadena3))); 


}


public static void main(String[] args) {
MetodosCadenas OBJ = new MetodosCadenas();
//OBJ.MetodoCompare();
//OBJ.MetodoCoompareIGNORANDOMAYUSCULASYMINUSCULAS();
OBJ.CONCATENARCADENAS();
OBJ.VALIDARSUBCADENA();
//OBJ.TERMINADOEN();
//OBJ.CharAt();
}


}