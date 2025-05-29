import java.util.Scanner;
import java.util.ArrayList;

class Eleve {
    private String nom;
    private String prenom;
    private char sexe;
    private double noteInformatique;
    private double noteMaths;
    private double noteAnglais;

    public Eleve() {
        this.nom = "";
        this.prenom = "";
        this.sexe = ' ';
        this.noteInformatique = 0.0;
        this.noteMaths = 0.0;
        this.noteAnglais = 0.0;
    }

    public Eleve(String nom, String prenom, char sexe, double noteInformatique, double noteMaths, double noteAnglais) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.noteInformatique = noteInformatique;
        this.noteMaths = noteMaths;
        this.noteAnglais = noteAnglais;
    }

    public String getNom() { 
    	return nom; 

    }
    public void setNom(String nom) { 
    	this.nom = nom; 
	}

    public String getPrenom() { 
    	return prenom; 
	}
    public void setPrenom(String prenom) { 
   		this.prenom = prenom; 
	}

    public char getSexe() { 
    	return sexe; 
	}
    public void setSexe(char sexe) { 
    	this.sexe = sexe; 
    }

    public double getNoteInformatique() { 
    	return noteInformatique; 
    }
    public void setNoteInformatique(double noteInformatique) { 
    	this.noteInformatique = noteInformatique; 
    }

    public double getNoteMaths() { 
    	return noteMaths; 
    }
    public void setNoteMaths(double noteMaths) { 
    	this.noteMaths = noteMaths; 
    }

    public double getNoteAnglais() { 
    	return noteAnglais; 
    }
    public void setNoteAnglais(double noteAnglais) { 
    	this.noteAnglais = noteAnglais; 
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", Sexe: " + sexe +
                ", Note Informatique: " + noteInformatique +
                ", Note Maths: " + noteMaths + ", Note Anglais: " + noteAnglais;
    }
}

class Classe {
    private String nomClasse;
    private int nombreEleves;
    private int promotion;
    private ArrayList<Eleve> listeEleves;

    public Classe() {
        this.nomClasse = "";
        this.nombreEleves = 0;
        this.promotion = 0;
        this.listeEleves = new ArrayList<>();
    }

    public Classe(String nomClasse, int nombreEleves, int promotion) {
        this.nomClasse = nomClasse;
        this.nombreEleves = nombreEleves;
        this.promotion = promotion;
        this.listeEleves = new ArrayList<>();
    }

    public String getNomClasse() { 
    	return nomClasse; 
    }
    public void setNomClasse(String nomClasse) { 
    	this.nomClasse = nomClasse; 
    }

    public int getNombreEleves() { 
    	return nombreEleves; 
    }
    public void setNombreEleves(int nombreEleves) { 
    	this.nombreEleves = nombreEleves; 
    }

    public int getPromotion() { 
    	return promotion; }
    public void setPromotion(int promotion) { 
    	this.promotion = promotion; 
    }

    public ArrayList<Eleve> getListeEleves() { 
    	return listeEleves; 
    }
    public void setListeEleves(ArrayList<Eleve> listeEleves) { 
    	this.listeEleves = listeEleves; 
    }

    public void ajouterEleve(Eleve e) {
        listeEleves.add(e);
    }

    public void afficherEleves() {
        for (Eleve e : listeEleves) {
            System.out.println(e.toString());
        }
    }
}

