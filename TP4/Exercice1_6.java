public class Exercice6{
	public static void main(String[] args){
		double[] tableau = {8, 1, 12, 5, 3, 10, 4, 18, 6};
		System.out.println("Le tableau est : ");
		for (double element : tableau) {
			System.out.print(element+"| ");
		}
		System.out.println("\nLe plus grand élément du tableau est : "+PlusGrand(tableau));

	}
	public static double PlusGrand(double[] tableau){
		double maximum = tableau[0];
		for (double element : tableau) {
			if (element > maximum) {
				maximum = element;
			}
		}
		return maximum;
	}
}