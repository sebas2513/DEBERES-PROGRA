package GetterSetter;

import java.security.PrivateKey;

public class Estudiante {

//Encapsulacion atributos privados
// la plabra this = a todos los atributos
private String nombre;
private int edad;
private String correo;
private String cuentabancaria;






public Estudiante(String nombre, int edad, String correo) {
    this.nombre = nombre;
    this.edad = edad;
    this.correo = correo;
}

public Estudiante() {
    
}

//Getter para nombre
public String getNombre(){


return nombre;

}

//Setter para nombre

public void setnombre(String _nombre){

this.nombre=_nombre;

}




// getter edad
public int getedad(){

    return edad;
}



//SET EDAD;
public void setEdad(int  _edad){

this.edad=_edad;

}


//getter para correo
public String getcorreo(){


    return correo;
}

public void setCorreo(String correo) {
    if(correo.contains("@")){
          this.correo = correo;

    }else{
System.out.println("correo "+nombre+"correo no  valido");
    }
    
}


public void setcuentabancaria(String _numerodecuenta){


this.cuentabancaria=_numerodecuenta;
}


// impirmir ifo del estudainte


public void IMPRIMIRINFORMACION(){
System.out.println("...DATOS DEL ESTUDIANTE");

System.out.println("NOMBRE"+this.nombre+"\n"+"edad"+this.edad+"\n"+"correo"+this.correo);
System.out.println("---------------------------");

}

}