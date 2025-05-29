class Etudiant{
	private String nom;
	public Etudiant(String nom){
		this.nom = nom;
	}
	public void travailler(){
		System.out.println(nom+" se met au travail");
	}
	public void seReposer(){
		System.out.println(nom+" se repose");
	}
}
public class Exercice3{
	public static void main(String[] args){
		Etudiant UnEtudiant = new Etudiant("Ismaila");
		
		UnEtudiant.travailler();
	}
}