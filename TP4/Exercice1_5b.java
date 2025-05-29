public class Exercice1_5a{
    public static void main(String[] args) {
        
        int[] tableau = {8, 2, 1, 10, 5, 19, 15, 7};

        System.out.println("Avant triage : ");
        for (int elem : tableau) {
            System.out.print(elem + " ");
        }
        System.out.println(" ");
        System.out.println("Après triage : ");
        Triage(tableau);
        for (int elem : tableau) {
            System.out.print(elem + " ");
        }
        System.out.println(" ");
    }
    public static void Triage(int[] tableau){
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
    }
}
