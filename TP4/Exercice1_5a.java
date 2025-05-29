public class Exercice1_5a{
    public static void main(String[] args) {
        
        int[] tableau = {8, 2, 1, 10, 5, 19, 15, 7};

        for (int i = 0; i < tableau.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < tableau.length; j++) {
                if (tableau[j] < tableau[min]) {
                    min = j;
                }
            }

            int temp = tableau[i];
            tableau[i] = tableau[min];
            tableau[min] = temp;
        }

        System.out.println("Tableau trié :");
        for (int element : tableau) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }
}
