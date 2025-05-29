// package TP2;
import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une chaîne : ");
        String chaine = scanner.nextLine();

        String ChaineRenverse = new StringBuilder(chaine).reverse().toString();
        System.out.println("Chaîne inversée : " + ChaineRenverse);
        if (chaine.equalsIgnoreCase(ChaineRenverse)) {
            System.out.println("La chaîne est un palindrome.");
        } else {
            System.out.println("La chaîne n'est pas un palindrome.");
        }
    }
}
