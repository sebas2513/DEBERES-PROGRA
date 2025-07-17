package Listas2;

public class Automovil {
private String marca;
private String modelo;
private int año;
public Automovil(String marca, String modelo, int año) {
    this.marca = marca;
    this.modelo = modelo;
    this.año = año;
}
public String getMarca() {
    return marca;
}
public String getModelo() {
    return modelo;
}
public int getAño() {
    return año;
}
public void setMarca(String marca) {
    this.marca = marca;
}
public void setAño(int año) {
    this.año = año;
}

@Override
public String toString(){
    //todo AUTO.generate

    String cadena = "datos del vehiculo"+"\n" + 
    "MARCA = "+ modelo + "\n"+
    "Modelo = "+ marca + "\n"+
     "año = "+ año + "\n";
return cadena;
}








}
