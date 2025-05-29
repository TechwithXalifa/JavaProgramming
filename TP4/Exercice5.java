class Point{
	private int abcisseAbsolue;

	private static int origine = 0;

	public Point(int abcisse){
		this.abcisseAbsolue = abcisse;
	}

	public void affiche(){
		int abcisseRelative = this.abcisseAbsolue - origine;
		System.out.println("Abcisse de l'origine courante : "+origine+", abcisse du point par rapport à l'origine : "+abcisseRelative);
	}

	public static void setOrigine(int nouvelleOrigine){
		origine = nouvelleOrigine;
	}

	public static int getOrigine(){
		return origine;
	}
}
public class Exercice5{
	public static void main(String[] agrs){
		Point a = new Point(3);
		Point b = new Point(12);

		System.out.println("L'abcisse de l'origine courante : "+Point.getOrigine());
		a.affiche();
		b.affiche();

		//On place l'origine à 3
		Point.setOrigine(3);
		System.out.println("L'abcisse de l'origine est donc : "+Point.getOrigine());
		a.affiche();
		b.affiche();
	}
}

