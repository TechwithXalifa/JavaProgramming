public class Exercice8{
	public static void main(String[] args){
		int[] ages = {19, 18, 21, 22, 20, 18, 17, 23, 20, 21};
		System.out.println("Le tableau des âges : ");
		for(int age : ages){
			System.out.print(age+" ");
		}
		System.out.print("\nLa moyennes des âges est : "+moyenne(ages));
		System.out.print("\n");
	}
	public static float moyenne(int[] tableau){
		int somme = 0;
		float moyenne;
		for(int element : tableau){
			somme+= element;
		}
		moyenne = somme/tableau.length;
		return moyenne;
	}
}