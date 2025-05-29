public class Exercice1_2{
    public static void main(String[] args) {
        int[] tableau = {8, 2, 9, 11, 7, 2, 10, 3};
        
        affichage(tableau);
    }

    public static void affichage(int[] tableau) {
        System.out.print("Les éléments du tableau : ");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " | ");
        }
        System.out.println(); 
    }
}
