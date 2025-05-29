import java.util.Scanner;
public class Exercice1{
	public static void main(String[] args){
		Scanner saisie = new Scanner(System.in);
		System.out.print("La taille du tableau : ");
		int n = saisie.nextInt();
		int tableau[] = new int[n];
		for(int i = 0; i < n; i++){
			System.out.print("Elément "+(i+1)+" : ");
			tableau[i] = saisie.nextInt();
		}	
	}
}