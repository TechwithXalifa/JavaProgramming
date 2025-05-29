import java.util.Scanner;
public class Exercice9{
	public static void main(String[] args){
		Scanner saisie = new Scanner(System.in);
		int[] leTableau = {9, 1, 4, 2, 4, 12, 98, 15, 4, 13};
		System.out.print("Entrez un élément pour vérifier s'il se trouve dans mon tableau : ");
		int ElementRecherche = saisie.nextInt();
		if (chercheur(leTableau, ElementRecherche)) {
		 	System.out.println("L'élément "+ElementRecherche+" se trouve dans le tableau.");
		}
		else{
		 	System.out.println("L'élément "+ElementRecherche+" ne se trouve pas dans le tableau.\n Le tableau est : ");	
			for (int valeur : leTableau) {
				System.out.print(valeur+" | ");
			}
		}
		System.out.print("\n");
	}
	public static boolean chercheur(int[] tableau, int n){
		for (int valeur : tableau) {
			if(n == valeur){
				return true;
			}
		}
		return false;
	}
}