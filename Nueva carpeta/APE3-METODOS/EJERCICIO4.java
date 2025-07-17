import java.util.Scanner;

public class EJERCICIO4 {
    

    public String pedirFrase(Scanner scanner) {
        String frase;
        
        do {
            System.out.println("=== ANALIZADOR DE FRASES ===");
            System.out.print("Ingrese una frase: ");
            frase = scanner.nextLine();
            
            if (frase.trim().isEmpty()) {
                System.out.println("Error: La frase no puede estar vacía.\n");
            }
            
        } while (frase.trim().isEmpty());
        
        return frase;
    }
    

    public  void mostrarResultados(String frase) {
        System.out.println("Frase ingresada: \"" + frase + "\"");
        System.out.println("Cantidad de palabras: " + contarPalabras(frase));
        System.out.println("Cantidad de letras: " + contarLetras(frase));
        System.out.println("Cantidad de vocales: " + contarVocales(frase));
    }
    
    
    public static int contarPalabras(String frase) {
    
        String fraseLimpia = frase.trim();
        
        if (fraseLimpia.isEmpty()) {
            return 0;
        }
    
        String[] palabras = fraseLimpia.split("\\s+");
        return palabras.length;
    }

    public int contarLetras(String frase) {
        int contador = 0;
        
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);

            if (Character.isLetter(caracter)) {
                contador++;
            }
        }
        
        return contador;
    }
    
    public int contarVocales(String frase) {
        int contador = 0;
        String vocales = "aeiouAEIOU";
        
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (vocales.indexOf(caracter) != -1) {
                contador++;
            }
        }
        
        return contador;
    }
    public void mostrarDetalleVocales(String frase) {
        String vocales = "aeiouAEIOU";
        int[] conteoVocales = new int[5]; // a, e, i, o, u
        String[] nombresVocales = {"a/A", "e/E", "i/I", "o/O", "u/U"};
        
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            switch (Character.toLowerCase(caracter)) {
                case 'a': conteoVocales[0]++; break;
                case 'e': conteoVocales[1]++; break;
                case 'i': conteoVocales[2]++; break;
                case 'o': conteoVocales[3]++; break;
                case 'u': conteoVocales[4]++; break;
            }
        }
        
        System.out.println("\nDetalle de vocales:");
        for (int i = 0; i < 5; i++) {
            if (conteoVocales[i] > 0) {
                System.out.println("- " + nombresVocales[i] + ": " + conteoVocales[i]);
            }
        }
    }
    public  void mostrarEstadisticasCompletas(String frase) {
        System.out.println("\n=== ESTADÍSTICAS COMPLETAS ===");
        System.out.println("Longitud total: " + frase.length() + " caracteres");
        System.out.println("Caracteres sin espacios: " + frase.replace(" ", "").length());
        System.out.println("Cantidad de espacios: " + (frase.length() - frase.replace(" ", "").length()));
        System.out.println("Consonantes: " + (contarLetras(frase) - contarVocales(frase)));
        mostrarDetalleVocales(frase);
    }
       public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String respuesta;
        EJERCICIO4 datos = new EJERCICIO4();
        do {
            String frase = datos.pedirFrase(tec);
           datos.mostrarResultados(frase);
            
            System.out.print("\n¿Desea analizar otra frase? (s/n): ");
            respuesta = tec.nextLine().toLowerCase();
            System.out.println();
            
        } while (respuesta.equals("s") || respuesta.equals("si"));
    }
}