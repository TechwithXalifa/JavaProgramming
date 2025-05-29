package TP3;
import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une phrase : ");
        String phrase = scanner.nextLine();
        System.out.print("Entrez un mot : ");
        String mot = scanner.nextLine();

        if (phrase.contains(mot)) {
            System.out.println("Le mot \"" + mot + "\" est présent dans la phrase.");
        } else {
            System.out.println("Le mot \"" + mot + "\" n'est pas présent dans la phrase.");
        }

        scanner.close();
    }
}