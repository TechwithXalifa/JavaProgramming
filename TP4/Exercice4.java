import java.util.ArrayList;

class Livre {
    private String titre;
    private String auteur;
    private int anneePublication;

    // Constructeur
    public Livre(String titre, String auteur, int anneePublication) {
        this.titre = titre;
        this.auteur = auteur;
        this.anneePublication = anneePublication;
    }

    // Getters
    // public String getTitre() {
    //     return titre;
    // }

    // public String getAuteur() {
    //     return auteur;
    // }

    // public int getAnnePubli() {
    //     return anneePublication;
    // }

    @Override
    public String toString() {
        return "Titre: " + titre + ", Auteur: " + auteur + ", Année: " + anneePublication;
    }
}

class Bibliotheque {
    private ArrayList<Livre> livres = new ArrayList<>();

    public void AjoutLivre(Livre livre) {
        livres.add(livre);
    }

    public void AffichageLivre() {
        System.out.println("Les livres de la Bibliothèque : ");
        for (Livre livre : livres) {
            System.out.println(livre.toString());
        }
    }
}

public class Exercice4 {
    public static void main(String[] args) {
        Bibliotheque bibliotheque = new Bibliotheque();

        Livre usll = new Livre("Une si longue lettre", "Mariama BA", 1943);

        bibliotheque.AjoutLivre(usll);

        bibliotheque.AffichageLivre();
    }
}
