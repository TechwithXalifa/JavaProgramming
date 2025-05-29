public class Exercice7{
	public static void main(String[] args){
		int[] tableau1 = {8, 3, 1, 9, 2, 7};
		int[] tableau2 = {11, 4, 5, 10, 6};
		int[] TableauFinal = fusion(tableau1, tableau2);

		System.out.println("Affichage du premier tableau : ");
		for (int element1 : tableau1) {
			System.out.print(element1+" ");
		}

		System.out.println("\nAffichage du deuxième tableau : ");
		for (int element2 : tableau2) {
			System.out.print(element2+" ");
		}

		System.out.println("\nAffichage du tableau fusionné : ");
		for (int element : TableauFinal ) {
			System.out.print(element+" | ");
		}
		System.out.print("\n");
	}
	public static int[] fusion(int[] tableau1, int[] tableau2){
		int taille = tableau1.length + tableau2.length;
		int[] TableauFusionne = new int[taille];

		for (int i = 0; i < tableau1.length; i++){
			TableauFusionne[i] = tableau1[i];
		}
		for (int i = 0; i < tableau2.length; i++){
			TableauFusionne[tableau1.length + i] = tableau2[i];
		}
		return TableauFusionne;
	}
}