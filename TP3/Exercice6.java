import java.util.Scanner;
public class Exercice6{
	public static void main(String[] args){
		Scanner entree = new Scanner(System.in);
		System.out.print("Entrez une phrase : ");
		String phrase = entree.nextLine();

		phrase = phrase.toLowerCase();

		int frequences[] = new int[26];

		for(int i = 0; i < phrase.length(); i++){
			char caractere = phrase.charAt(i);
			
			if (caractere >= 'a' && caractere <= 'z') {
				int indice = caractere - 'a';
				frequences[indice]++; // frequences[indice] = frequences[indice] + 1
			}
		}
		System.out.println("Fréquence des lettres dans la phrase : ");
			for(int i = 0; i < frequences.length; i++){
				if (frequences[i] > 0) {
					char lettre = (char) (i+ 'a');
					System.out.println(lettre+" : "+ frequences[i]);
				}
			}
		entree.close();
	}
}