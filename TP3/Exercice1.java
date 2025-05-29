package TP3;
import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier nombre : ");
        int nombre1 = scanner.nextInt();
        System.out.print("Entrez le deuxième nombre : ");
        int nombre2 = scanner.nextInt();
        System.out.print("Entrez le troisième nombre : ");
        int nombre3 = scanner.nextInt();

        int min, mil, max;

        if (nombre1 <= nombre2 && nombre1 <= nombre3) {
            min = nombre1;
            if (nombre2 <= nombre3) {
                mil = nombre2;
                max = nombre3;
            } else {
                mil = nombre3;
                max = nombre2;
            }
        } else if (nombre2 <= nombre1 && nombre2 <= nombre3) {
            min = nombre2;
            if (nombre1 <= nombre3) {
                mil = nombre1;
                max = nombre3;
            } else {
                mil = nombre3;
                max = nombre1;
            }
        } else {
            min = nombre3;
            if (nombre1 <= nombre2) {
                mil = nombre1;
                max = nombre2;
            } else {
                mil = nombre2;
                max = nombre1;
            }
        }

        System.out.println("Les nombres par ordre croissant sont : " + min + ", " + mil + ", " + max);

        scanner.close();
    }
}
