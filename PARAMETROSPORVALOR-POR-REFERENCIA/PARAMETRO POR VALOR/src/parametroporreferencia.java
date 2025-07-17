class Persona {
    String nombre;
    int edad;
}

public class parametroporreferencia {

    public static void modificarPersona(Persona p) {
        p.nombre = "PEDRO";
        p.edad = 65;
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Ana";
        persona1.edad = 18;

        modificarPersona(persona1);

        System.out.println("Nombre: " + persona1.nombre); // Juan
        System.out.println("Edad: " + persona1.edad);     // 25
    }
}