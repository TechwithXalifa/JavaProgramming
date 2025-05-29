import java.util.Scanner;
public class Exercice7{
	public static void main(String[] args){
		Scanner saisie = new Scanner(System.in);
		
		System.out.print("Veuillez entrez le premier nombre : ");
		int nombre1 = saisie.nextInt();
		System.out.print("Veuillez entrez second nombre : ");
		int nombre2 = saisie.nextInt();
		
		int minimum = (nombre1 < nombre2) ? nombre1 : nombre2;

		for(int i = minimum; i >= 1; i--){
			if((nombre1 % i == 0) && (nombre2 % i == 0)) {
				System.out.println("Le PGCD entre "+ nombre1+" et "+nombre2+" est :"+i );
				break;
			}
		}
		saisie.close();	
	}
}