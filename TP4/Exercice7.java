import java.time.LocalDateTime;
import java.time.format.DataTimeFormatter;
class CompteBancaire{
	private String titulaire;
	private double solde;
	private String numCompte;
	private static final double PLAFOND = 100000;

	public CompteBancaire(String titulaire, double solde, String numCompte){
		this.titulaire = titulaire;
		this.solde = solde;
		this.numCompte = numCompte;
	}

	public double crediter(double montant){
		if(montant <= 0){
			System.out.println("Erreur ! Montant négatif");
		} else {
			solde += montant;
		}
		return solde;
	}
	public double debiter(double montant){
		if (montant <= 0) {
			System.out.println("Erreur au niveau du montant : ");
		} else if (montant >= PLAFOND || montant >= solde) {
				System.out.println("Montant supérieur PLAFOND ou au solde ");
		} else {
			solde -= montant;
		}
		return solde;	
	}

	public void afficherSolde(){
		System.out.println("Solde du compte : "+solde);
	}
	 public void afficherDetails(){
	 	System.out.println("Détails du comptes : \n Titulaire : "+titulaire+ "\n Solde : "+solde+"\n Plafond : "+PLAFOND+"\n Numéro de compte : "+numCompte);
	 }
	 public void hi
}
	
public class Exercice7{
	public static void main(String[] args){
		CompteBancaire client1 = new CompteBancaire("Mamadou NDIAYE", 123000.00, "2939JD");
		client1.afficherSolde();
        client1.crediter(5000);
        client1.afficherSolde();
        client1.debiter(2000);
        client1.afficherSolde();
        client1.afficherDetails();
	}
}