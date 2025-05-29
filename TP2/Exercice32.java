import java.util.Scanner;
public class Exercice32{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une chaîne : ");
        String chaine = scanner.nextLine();
        boolean estPalindrome = true;
        String ChaineSansEspaces = chaine.replaceAll("\\s+", "").toLowerCase();
        for(int i = 0; i < ChaineSansEspaces.length()/2; i++){
            char debut = ChaineSansEspaces.charAt(i);
            char fin = ChaineSansEspaces.charAt(ChaineSansEspaces.length() -1 - i);
            if (debut != fin) {
                estPalindrome = false;
                break;                                  
            }
        }
        if (estPalindrome) {
            System.out.println("La chaîne \""+ chaine+"\" est un palindrome");                
        }
        else{
            System.out.println("La chaine \""+ chaine+"\" n'est pas un palindrome");
        }
        scanner.close();
    }
}