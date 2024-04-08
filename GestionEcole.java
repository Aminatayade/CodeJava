import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class GestionEcole {
    public static void main(String[] args) {
         
    }
}
class Eleve{
    private String nom;
    private String prenom;
    private String sexe;
    private String dateNaissance;
    private Classe classe;
    private List<Note> notes;
public Eleve(){}//constructeur sans parametre
public String getNom(){
    return nom;
}
public void setNom(String nom){
    this.nom=nom;
}
public String getPrenom(){
    return prenom;
}
public void setPrenom(String prenom){
    this.prenom=prenom;
}
public String getDateNaissance(){
    return dateNaissance;
}
public void setDateNaissance(String dateNaissance){
    this.dateNaissance=dateNaissance;}
public Classe getClasse(){
    return classe;
}
public void setClasse(Classe classe ){
    this.classe=classe;
}
public String getSexe(){
    return sexe;
}
public void setSexe(String sexe){
    this.sexe=sexe;
}
 

    // Constructeur, autres champs, méthodes...

    // Méthode pour obtenir la liste des notes
public List<Note> getNotes() {
        if (notes == null) {
            notes = new ArrayList<>();
        }
        return notes;
    }

}
class Matiere {     //definition classe
    private String code;
    private String nom;
    private double coefficient;

public Matiere (){ //constructeur sans parametre

}

public String getCode(){//accces aux variables accesseurs
    return code;
}
public void setCode(String code ){//modifiation var
    this.code=code;
}
public String getNom (){
    return nom;
}
public void setNom(String nom){
    this.nom=nom;
}
public double getCoefficient(){
    return coefficient;
}
public void setCoefficient(double coefficient){
    this.coefficient=coefficient;
}
}


class Classe {
    private String nom;
    private int effectif;
    private List<Eleve> eleves;
public Classe(){
    this.eleves =new ArrayList<>();
}
//on definit les accesseurs
public String getNom(){
    return nom;
}
public void setNom(String nom){
    this.nom=nom;
}
public int getEffectif(){
    return effectif;
}
public void setEffectif(int effectif){
    this.effectif=effectif;
}
public List<Eleve> getEleves() {
        return eleves;
    }

public void setEleves(List<Eleve> eleves) {
        this.eleves = eleves;
    }
}
class Note {
    private  Eleve  eleves;
    private  Matiere matiere;
    private double valeur;
public Note(){}
public Eleve getEleve(){
    return eleves;
}
public void setEleve(Eleve eleves){
    this.eleves=eleves;
}
public Matiere getMatiere(){
    return matiere;

    
}
public void setMatiere(Matiere matiere){
    this.matiere=matiere;
}
public double getValeur(){
    return valeur;
}
public void setValeur(double valeur){
    this.valeur=valeur;
}

}
class GestionDesClasse{
public static void initialiseEleve( Eleve E) {  //initialisation dynamique de l'eleve E
    Scanner scanner =new Scanner(System.in);
    System.out.println("Entrez le nom de l'eleve");
    E.setNom(scanner.nextLine());
    System.out.println("Entrez le prenom de l'eleve");
    E.setPrenom(scanner.nextLine());
    System.out.println("Entrez le prenom de la date de naissance sous le format jj//mm//aa");
    E.setDateNaissance(scanner.nextLine());
    String sexe;
    do {
        System.out.println("Entrez le sexe de l'élève (Masculin/Féminin):");
        sexe = scanner.nextLine();

        if (!sexe.equalsIgnoreCase("Masculin") && !sexe.equalsIgnoreCase("Féminin")) {
            System.out.println("Erreur: Le sexe doit être Masculin (M) ou Féminin (F). Réessayez.");
        }
    } while (!sexe.equalsIgnoreCase("Masculin") && !sexe.equalsIgnoreCase("Féminin"));

    E.setSexe(sexe);
          scanner.close();


}
public static void initialiserNote(Eleve E, Matiere M) {
    Scanner scanner = new Scanner(System.in);

    double note;
    do {
        System.out.println("Entrez la note de " + E.getNom() + " " + E.getPrenom() + " en " + M.getNom() + ":");
        note = scanner.nextDouble();

        if (note < 0 || note > 20) {
            System.out.println("Erreur: La note doit être comprise entre 0 et 20. Réessayez.");
        }
    } while (note < 0 || note > 20);

    // Créer une nouvelle note et l'associer à l'élève et à la matière
    Note nouvelleNote = new Note();
    nouvelleNote.setEleve(E);
    nouvelleNote.setMatiere(M);
    nouvelleNote.setValeur(note);

    // Ajouter la note à la liste des notes de l'élève
    E.getNotes().add(nouvelleNote);
}



      //scanner.close();
public static void afficherMatiere(Matiere M){
    System.out.println("le code de la matiere est" +M.getCode());
    System.out.println("le nom de la matiere" +M.getNom());
    System.out.println("le coefficien de la matiere" +M.getCoefficient());
}

public static void afficherEleves(Classe C) {
        System.out.println("Classe: " + C.getNom());
        System.out.println("Effectif: " + C.getEffectif());

        System.out.println("Liste des élèves:");
        for (Eleve eleve : C.getEleves()) {
            System.out.println("Nom: " + eleve.getNom());
            System.out.println("Prénom: " + eleve.getPrenom());
            System.out.println("Date de naissance: " + eleve.getDateNaissance());
            System.out.println("Sexe: " + eleve.getSexe());
            
            // Afficher les notes de l'élève
            System.out.println("Notes:");
            for (Note note : eleve.getNotes()) {
                System.out.println("   Matière: " + note.getMatiere().getNom());
                System.out.println("   Note: " + note.getValeur());
            }
        }
    }


}

//import java.sql.date