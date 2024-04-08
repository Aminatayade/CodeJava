package etablissement;
import java.sql.Date;

public class GestionClasses {
    // Définition de la classe matière
    public class Matiere {
        private String code;
        private String nom;
        private double coefficient;
    
        // Constructeur sans paramètre
        public Matiere() {
        }
    
        // Accesseurs (getters et setters)
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
    
        public double getCoefficient() {
            return coefficient;
        }
        public void setCoefficient(double coefficient) {
            this.coefficient = coefficient;
        }
    }

    // Définition de la classe Classe
    public class Classe {
        private String nom;
        private int effectif;
        private Eleve[] eleves = new Eleve[effectif];
    
        // Constructeur sans paramètre
        public Classe() {
        }
    
        // Accesseurs (getters et setters)
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
            this.effectif = effectif;
        }
        public Eleve[] getEleves() {
            return eleves;
        }
        public void setEleves(Eleve[] eleves) {
            this.eleves = eleves;
        }
    }
    
    // Définition de la classe Eleve
    public class Eleve {
        private String nom;
        private String prenom;
        private Date dateNaissance;
        private String sexe;
        // private Classe classe;
        // private double noteComposition;
    
        // Constructeur sans paramètre
        public Eleve() {
        }
    
        // Accesseurs (getters et setters)
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
    
        public Date getDateNaissance() {
            return dateNaissance;
        }
    
        public void setDateNaissance(Date dateNaissance) {
            this.dateNaissance = dateNaissance;
        }
    
        public String getSexe() {
            return sexe;
        }
    
        public void setSexe(String sexe) {
            this.sexe = sexe;
        }
    
        // public Classe getClasse() {
        //     return classe;
        // }
    
        // public void setClasse(Classe classe) {
        //     this.classe = classe;
        // }
    
        // public double getNoteComposition() {
        //     return noteComposition;
        // }
    
        // public void setNoteComposition(double noteComposition) {
        //     this.noteComposition = noteComposition;
        // }
    }

    // Définition de la classe Composition
    public class Composition {
        private Matiere petitMatiere;
        private Eleve petitEleve;
        private float note;

        //Constructeur sans paramètre
        public Composition(){

        }

        //Accesseurs get et set
        public Eleve getEleve() {
            return petitEleve;
        }
        public void setEleve(Eleve petitEleve) {
            this.petitEleve = petitEleve;
        }
        public Matiere getMatiere() {
            return petitMatiere;
        }
        public void setMatiere(Matiere petitMatiere) {
            this.petitMatiere = petitMatiere;
        }
        public float getNote() {
            return note;
        }
        public void setNote(float note) {
            this.note = note;
        }
    }
}