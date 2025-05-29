import java.util.Scanner;

public class Exercice5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre d'éléments du tableau : ");
        int n = scanner.nextInt();

        // Initialisation du tableau
        float[] tableau = new float[n];

        // Lecture
        System.out.println("Entrez les " + n + " valeurs flottantes : ");
        for (int i = 0; i < n; i++) {
            tableau[i] = scanner.nextFloat();
        }

        // Affichage
        System.out.println("Les éléments du tableau sont : ");
        for (float valeur : tableau) {
            System.out.print(valeur + " ");
        }
        System.out.println();

        // Calcul de la somme et la moyenne
        float somme = 0;
        for (float valeur : tableau) {
            somme += valeur;
        }
        float moyenne = somme / n;

        // Plus grande et plus petite valeur
        float max = tableau[0];
        float min = tableau[0];
        for (float valeur : tableau) {
            if (valeur > max) {
                max = valeur;
            }
            if (valeur < min) {
                min = valeur;
            }
        }

        // Affichage les résultats
        System.out.println("La Somme des éléments est : " + somme);
        System.out.println("La Moyenne des éléments est : " + moyenne);
        System.out.println("La Valeur maximale est : " + max);
        System.out.println("La Valeur minimale est : " + min);

        scanner.close(); 
    }
}
