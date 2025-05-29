import java.util.Random;
public class Exercice1{
	public static void main(String[] args){
		Random aleatoire = new Random();
		int n = aleatoire.nextInt(8);

		int tableau[] = new int[n];
		for(int i = 0; i < n; i++){
			// System.out.print("Elément "+(i+1)+" : ");
			tableau[i] = aleatoire.nextInt(10);
		}	
		System.out.println("Affichage du tableau : ");
		for (int i = 0; i < n; i++) {
			System.out.print(tableau[i]+"|");	
		}
		System.out.println("");
	}
}