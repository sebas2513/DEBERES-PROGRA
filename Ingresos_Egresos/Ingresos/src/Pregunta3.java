public class Pregunta3 {


private String ciudad;
private double ingresos;
private double egresos;
public Pregunta3(String ciudad, double ingresos, double egresos) {
    this.ciudad = ciudad;
    this.ingresos = ingresos;
    this.egresos = egresos;
}
public String getCiudad() {
    return ciudad;
}
public double getIngresos() {
    return ingresos;
}
public double getEgresos() {
    return egresos;
}
@Override
public String toString() {
String resultado="Ciudad: "+this.ciudad+" \t"+
                "Ingresos: "+this.ingresos+" \t"+
                "Egresos: "+this.egresos;

    return resultado;


}
}