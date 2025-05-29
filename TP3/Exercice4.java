import java.util.Scanner;
public class Exercice4{
	public static void main(String[] args){
		Scanner saisie = new Scanner(System.in);
		System.out.print("Entrez les mots séparés par des virgules : ");
		String mots = saisie.nextLine(); 
		
		String[] MotsSansvirgule = mots.split(",");
		for(String UnMot: MotsSansvirgule){
			UnMot = UnMot.trim();
			if (EstPalindrome(UnMot)) {
				System.out.println(UnMot+" est un palindrome.");
			}
		}
	}
	
	public static boolean EstPalindrome(String mot){
		for(int i = 0; i < mot.length()/2; i++){
            char debut = mot.charAt(i);
            char fin = mot.charAt(mot.length() -1 -i);
            if (debut != fin) {
                return false;
            }
        }
        return true;
	}
}