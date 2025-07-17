import java.util.Scanner;

public class EJERCICIO12 {

    public int MAX = 100;
    public String[] nombres = new String[MAX];
    public int[] edades = new int[MAX];
    public int cantidad = 0;

    // Método para leer nombres y edades
    public  void leerAlumnos() {
        Scanner tec = new Scanner(System.in);

        while (cantidad < MAX) {
            System.out.print("Ingrese el nombre del alumno (* para terminar): ");
            String nombre = tec.nextLine();

            if (nombre.equals("*")) {
                break;
            }

            System.out.print("Ingrese la edad de " + nombre + ": ");
            int edad = Integer.parseInt(tec.nextLine());

            nombres[cantidad] = nombre;
            edades[cantidad] = edad;
            cantidad++;
        }
    }

    public  void mostrarMayoresEdad() {
        System.out.println("Alumnos mayores de edad:");
        boolean hayMayores = false;

        for (int i = 0; i < cantidad; i++) {
            if (edades[i] >= 18) {
                System.out.println("- " + nombres[i] + " (" + edades[i] + " años)");
                hayMayores = true;
            }
        }

        if (!hayMayores) {
            System.out.println("No hay alumnos mayores de edad.");
        }
    }

    public static void main(String[] args) {
                EJERCICIO12 OBJ=new EJERCICIO12();
        OBJ.leerAlumnos();
        OBJ.mostrarMayoresEdad();
    }
}
