public class EJ20 {

    public static void main(String[] args) {
        int[] vector1 = {1, 3, 5, 7, 9};
        int[] vector2 = {3, 7, 8, 9, 10};

        System.out.print("Elementos comunes: ");
        for (int i = 0; i < vector1.length; i++) {
            for (int j = 0; j < vector2.length; j++) {
                if (vector1[i] == vector2[j]) {
                    System.out.print(vector1[i] + " ");
                    break; 
                }
            }
        }
    }
}
