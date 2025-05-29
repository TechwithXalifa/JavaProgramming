public class Exercice1_3{
	public static void main(String[] args){
		int[] tableau = {4, 1, 18, 7, 5, 14, 2};
		System.out.println("Les éléments du tableau sont : ");
		for(int element : tableau){
			System.out.print(element+ " | ");
		}
		System.out.println("\nLe minimum du tableau est à l'indice: "+(minimum(tableau)+1));
	}
	public static int minimum(int[] tableau){
		int minimum = tableau[0];
		int indice = 0;
		for (int i = 1; i < tableau.length; i++) {
			if (tableau[i] < minimum) {
				minimum = tableau[i];
				indice = i;
			}
		}
		return indice;
	}
}