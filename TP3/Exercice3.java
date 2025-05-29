import java.util.Scanner;
public class Exercice3{
	public static void main(String[] args){
		Scanner saisie = new Scanner(System.in);
		System.out.print("Entrez un nombre : ");
		int nombre = saisie.nextInt();
		for(int i = 1; i <= 100; i++){
			if(i % nombre ==0){
				System.out.println(i+" est un multiple de "+nombre);
			}
		}
		saisie.close();
	}
}
