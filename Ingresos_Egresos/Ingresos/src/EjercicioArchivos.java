import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;
import java.util.LinkedList;

public class EjercicioArchivos {


    public static void main(String[] args) {
    
        LinkedList<Cuenta>lista= new LinkedList<>();

String ruta="Ingresos/src/IngresosEgresos.csv";

lista=CargarArchivoCSV(ruta);

//Imprimirlista(lista);
System.out.println("pregunta 1");
PreguntaIngresosEgresos(lista);
System.out.println("Pregunta 2");
PreguntaIngresosEgresosCosta(lista);
System.out.println("pregunta3");
ResolverIngresosyEgresosporciudad(lista);
    }






private static void Imprimirlista( LinkedList<Cuenta>_lista){
    System.out.println("imprimiendo lista de cuentas");
for (Cuenta cuenta : _lista) {
    System.out.println(cuenta.toString());
}


}



    private static LinkedList<Cuenta> CargarArchivoCSV(String ruta){
  LinkedList<Cuenta>_lista= new LinkedList<>();
try (BufferedReader reader= new BufferedReader(new FileReader(ruta))    ) {
    String linea ;
    //VALIDAMOS SI TIENE CABECERA
    boolean tieneCabecera = true;
    while ((linea=reader.readLine())!=null) {

        if (tieneCabecera==true) {
            tieneCabecera=false;
            continue;
        
        }

String [] partes = linea.split(";");        
if (partes.length == 7) {
    int id=Integer.parseInt(partes[0]);
     String nombres = partes[1];
      String apellido = partes[2];
       String ciudaedes = partes[3];
      String genero = partes[4];
      double ingreso=Double.parseDouble(partes[5]);
          double egresos=Double.parseDouble(partes[6]); 
          Cuenta cuenta= new Cuenta(id, nombres, apellido, ciudaedes, genero, ingreso, egresos);
        _lista.add(cuenta);


}


    }



} catch (Exception e) {
    // TODO: handle exception
    System.out.println("error al cargar el archivo"+e.getMessage());
   
}
   return _lista;

    } 


private static void PreguntaIngresosEgresos(LinkedList<Cuenta>_lista ){

double sumatoriaEgresos=0;
double sumatoriaIngresos=0;
for (Cuenta cuenta : _lista) {
    
    sumatoriaIngresos=sumatoriaIngresos+cuenta.getIngresos();
    sumatoriaEgresos=sumatoriaEgresos+cuenta.getEgresos();
}
System.out.println("sumatoria ingresos = "+sumatoriaIngresos);
System.out.println("sumatoria egresos = "+sumatoriaEgresos);
}

private static void PreguntaIngresosEgresosCosta(LinkedList<Cuenta>_lista ){

    double sumatoriaEgresos=0;
double sumatoriaIngresos=0;
for (Cuenta cuenta : _lista) {
    
if (cuenta.getCiudad().equals("Guayaquil")||
    cuenta.getCiudad().equals("Portoviejo") ) {
   
        sumatoriaIngresos=sumatoriaIngresos+cuenta.getIngresos();
    sumatoriaEgresos=sumatoriaEgresos+cuenta.getEgresos();

}
}
System.out.println("sumatoria ingresos = "+sumatoriaIngresos);
System.out.println("sumatoria egresos = "+sumatoriaEgresos);
}



private static void ResolverIngresosyEgresosporciudad(LinkedList<Cuenta>_lista ){
double IngresosGuayaqui=0, EgresosGuayaqui=0;
double egresosPortoviejo=0,IngresosPortoviejo=0;

for (Cuenta cuenta : _lista) {
    
if (cuenta.getCiudad().equals("Guayaquil")) {
    IngresosGuayaqui=IngresosGuayaqui+cuenta.getIngresos();
    EgresosGuayaqui=EgresosGuayaqui+cuenta.getEgresos();
}

if (cuenta.getCiudad().equals("Portoviejo")) {
    IngresosPortoviejo=IngresosPortoviejo+cuenta.getIngresos();
    egresosPortoviejo=egresosPortoviejo+cuenta.getEgresos();
}




}

LinkedList<Pregunta3> listaPreguntas=new LinkedList<>();
listaPreguntas.add(new Pregunta3("Guayaquil", IngresosGuayaqui, EgresosGuayaqui));
listaPreguntas.add(new Pregunta3("Portoviejo",IngresosPortoviejo, egresosPortoviejo));

//imprimir resultados
for (Pregunta3 pregunta3 : listaPreguntas) {
    System.out.println(pregunta3.toString());
}

}




}
