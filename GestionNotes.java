import java.util.ArrayList;
import java.util.List;

class Note {
    private double valeur;

    public Note(double valeur) {
        setValeur(valeur);
    }

    public double getValeur() {
        return valeur;
    }

    public void setValeur(double valeur) {
        if (valeur >= 0 && valeur <= 20) {
            this.valeur = valeur;
        } else {
            throw new IllegalArgumentException("La note doit être comprise entre 0 et 20.");
        }
    }
}

class Matiere {
    private String code;
    private String nom;
    private int coefficient;

    public Matiere(String code, String nom, int coefficient) {
        setCode(code);
        setNom(nom);
        setCoefficient(coefficient);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }
}

class Eleve {
    private String nom;
    private String prenom;
    private String dateNaissance;
    private String sexe;
    private List<Note> notes;

    public Eleve(String nom, String prenom, String dateNaissance, String sexe) {
        setNom(nom);
        setPrenom(prenom);
        setDateNaissance(dateNaissance);
        setSexe(sexe);
        this.notes = new ArrayList<>();
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

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        if (sexe.equalsIgnoreCase("Masculin") || sexe.equalsIgnoreCase("Féminin")) {
            this.sexe = sexe;
        } else {
            throw new IllegalArgumentException("Le sexe doit être 'Masculin' ou 'Féminin'.");
        }
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void ajouterNote(Note note) {
        notes.add(note);
    }
}

class Classe {
    private String nom;
    private int effectif;
    private List<Eleve> eleves;

    public Classe(String nom, int effectif) {
        setNom(nom);
        setEffectif(effectif);
        this.eleves = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEffectif() {
        return effectif;
    }

    public void setEffectif(int effectif) {
        if (effectif > 0) {
            this.effectif = effectif;
        } else {
            throw new IllegalArgumentException("L'effectif doit être supérieur à zéro.");
        }
    }

    public List<Eleve> getEleves() {
        return eleves;
    }

    public void ajouterEleve(Eleve eleve) {
        eleves.add(eleve);
    }
}

public class GestionNotes {
    public static void main(String[] args) {
        // Exemple d'utilisation

        // Création de quelques matières
        Matiere math = new Matiere("M001", "Mathématiques", 3);
        Matiere francais = new Matiere("F001", "Français", 2);
        Matiere physique = new Matiere("P001", "Physique", 4);

        // Création d'une classe
        Classe classeA = new Classe("ClasseA", 30);

        // Création de quelques élèves
        Eleve eleve1 = new Eleve("Doe", "John", "01/01/2000", "Masculin");
        Eleve eleve2 = new Eleve("Smith", "Jane", "02/02/2001", "Féminin");

        // Ajout des élèves à la classe
        classeA.ajouterEleve(eleve1);
        classeA.ajouterEleve(eleve2);

        // Initialisation des notes des élèves pour certaines matières
        initialiserNote(eleve1, math, 15.5);
        initialiserNote(eleve1, francais, 12.0);
        initialiserNote(eleve2, math, 18.0);
        initialiserNote(eleve2, physique, 14.5);

        // Affichage des matières
        afficherMatiere(math);
        afficherMatiere(francais);
        afficherMatiere(physique);

        // Affichage des élèves de la classe
        afficherEleves(classeA);
    }

    public static void initialiserNote(Eleve eleve, Matiere matiere, double valeur) {
        Note nouvelleNote = new Note(valeur);
        eleve.ajouterNote(nouvelleNote);
        System.out.println("Note de " + eleve.getPrenom() + " " + eleve.getNom() +
                " en " + matiere.getNom() + ": " + nouvelleNote.getValeur());
   
