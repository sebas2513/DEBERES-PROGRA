import java.util.Random;

public class EJ6 {

    
    public static int[][] generarAsistencia(int facultades, int materias) {
        Random rand = new Random();
        int[][] asistencia = new int[facultades][materias];

        System.out.println("Asistencia registrada por facultad y materia:");
        for (int f = 0; f < facultades; f++) {
            for (int c = 0; c < materias; c++) {
                asistencia[f][c] = rand.nextInt(1,11);
                System.out.print(asistencia[f][c] + "\t");
            }
            System.out.println();
        }
        return asistencia;
    }

    public static void asistenciaPorMateria(int[][] asistencia) {
        int materias = asistencia[0].length;
        int facultades = asistencia.length;
        System.out.println("\nAsistencia total por materia:");
        for (int c = 0; c < materias; c++) {
            int total = 0;
            for (int f = 0; f < facultades; f++) {
                total += asistencia[f][c];
            }
            System.out.println("Materia " + (c + 1) + ": " + total);
        }
    }

    public static void asistenciaFacultad3(int[][] asistencia) {
        int total = 0;
        int facultad = 2; 
        for (int j = 0; j < asistencia[0].length; j++) {
            total += asistencia[facultad][j];
        }
        System.out.println("\nAsistencia total en la facultad 3: " + total);
    }


    public static void asistenciaMateria2Facultad1(int[][] asistencia) {
        int valor = asistencia[0][1];
        System.out.println("\nAsistencia en la materia 2 de la facultad 1: " + valor);
    }

    public static void porcentajePorFacultad(int[][] asistencia) {
        int totalGeneral = 0;
        int[] totales = new int[asistencia.length];

        for (int f = 0; f < asistencia.length; f++) {
            for (int c = 0; c < asistencia[f].length; c++) {
                totales[f] += asistencia[f][c];
            }
            totalGeneral += totales[f];
        }

        System.out.println("\nPorcentaje de asistencia por facultad:");
        for (int i = 0; i < totales.length; i++) {
            double porcentaje = (double) totales[i] * 100 / totalGeneral;
            System.out.printf("Facultad %d: %.2f\n", i + 1, porcentaje);
        }
    }


    public static void facultadMayorAsistencia(int[][] asistencia) {
        int mayor = 0;
        int facultad = 0;

        for (int i = 0; i < asistencia.length; i++) {
            int total = 0;
            for (int j = 0; j < asistencia[i].length; j++) {
                total += asistencia[i][j];
            }
            if (total > mayor) {
                mayor = total;
                facultad = i;
            }
        }

        System.out.println("\nLa facultad con mayor asistencia es la facultad " + (facultad + 1) +
                " con " + mayor + " asistencias.");
    }

    public static void main(String[] args) {
        int facultades = 4;
        int materias = 5;

        int[][] asistencia = generarAsistencia(facultades, materias);

        asistenciaPorMateria(asistencia);
        asistenciaFacultad3(asistencia);
        asistenciaMateria2Facultad1(asistencia);
        porcentajePorFacultad(asistencia);
        facultadMayorAsistencia(asistencia);
    }
}
