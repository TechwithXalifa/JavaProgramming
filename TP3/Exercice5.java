import java.util.Scanner;
public class Exercice5{
	public static void main(String[] args){
		Scanner saisie = new Scanner(System.in);
		System.out.print("Entrez le nombre d'éléments à ajouter : ");
		int n = saisie.nextInt();

		int[] tableau = new int[n];

		for(int i = 0; i < n; i++){
			System.out.print("Entrez le "+(i+1)+"e élément : ");
			tableau[i] = saisie.nextInt();
		}
		int NombrePairs = 0;
		for(int i = 0; i < n; i++){
			if(tableau[i]%2 == 0){
				NombrePairs++;
			}
		}
		System.out.println("Le nombre d'éléments pairs dans le tableau est : "+NombrePairs);

	}
}