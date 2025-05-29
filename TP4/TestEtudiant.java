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
public class TestEtudiant{
	public static void main(String[] args){

		String NomEtudiant = args[0];
		Etudiant UnEtudiant = new Etudiant(NomEtudiant);
		
		UnEtudiant.travailler();
		UnEtudiant.seReposer();
	}
}