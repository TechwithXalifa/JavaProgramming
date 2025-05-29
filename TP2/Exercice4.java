// package TP2;
import java.util.Scanner;
public class Exercice4{
    public static void main(String[] argss){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entrez un entier : ");
            int nombre = scanner.nextInt();
            while (nombre <= 0) {
                System.out.println("Veuillez entrer un nombre positif");
                nombre = scanner.nextInt();
            }
            for(int i = 1; i <= nombre; i++){
                System.out.println("La table de mutliplication de "+i+" est : ");
                for(int j = 1; j <= 10; j++){
                    System.out.println(i+" x "+j+" = "+i*j);
                }
            }
        }
        
    }
}