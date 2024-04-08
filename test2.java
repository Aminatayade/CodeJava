public class test2 {
    public static void main(String[] args) {
        
    }
}//1
package ecole;
public class Eleve {
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String sexe;
    private List<Matiere> matieres;

    public Eleve() {
        this.nom = "";
        this.prenom = "";
        this.dateNaissance = new Date();
        this.sexe = "";
        this.matieres = new ArrayList<Matiere>();
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return this.dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getSexe() {
        return this.sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public List<Matiere> getMatieres() {
        return this.matieres;
    }

    public void setMatieres(List<Matiere> matieres) {
        this.matieres = matieres;
    }
}
//2
public class Matiere {
    private String code;
    private String nom;
    private float coefficient;
    private int note;
    public Matiere(){
        
    }
    public Matiere() {
        this.code = "";
        this.nom = "";
        this.coefficient = 0;
        this.note = 0;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCoefficient() {
        return this.coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public int getNote() {
        return this.note;
    }

    public void setNote(int note) {
        this.note = note;
    }
}
//3
public class Classe {
    private String nom;
    private int effectif;
    private List<Eleve> eleves;

    public Classe() {
        this.nom = "";
        this.effectif = 0;
        this.eleves = new ArrayList<Eleve>();
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEffectif() {
        return this.effectif;
    }

    public void setEffectif(int effectif) {
        this.effectif = effectif;
    }

    public List<Eleve> getEleves() {
        return this.eleves;
    }

    public void setEleves(List<Eleve> eleves) {
        this.eleves = eleves;
    }
}
//M
public static void initialiseEleve(Eleve E) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Entrez le nom de l'élève: ");
    E.setNom(sc.nextLine());
    System.out.println("Entrez le prénom de l'élève: ");
    E.setPrenom(sc.nextLine());
    System.out.println("Entrez la date de naissance de l'élève (jj/mm/aaaa): ");
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    try {
        E.setDateNaissance(formatter.parse(sc.nextLine()));
    } catch (ParseException e) {
        e.printStackTrace();
    }
    System.out.println("Entrez le sexe de l'élève (Masculin/Féminin): ");
    E.setSexe(sc.nextLine());
}
//4
public static void afficherMatiere(Matiere M) {
    System.out.println("Code: " + M.getCode());
    System.out.println("Nom: " + M.getNom());
    System.out.println("Coefficient: " + M.getCoefficient());
    System.out.println("Note: " + M.getNote());
}
//afficher eleves
public static void afficherEleves(Classe C) {
    List<Eleve> eleves = C.getEleves();
    for (Eleve eleve : eleves) {
        System.out.println("Nom: " + eleve.getNom());
        System.out.println("Prénom: " + eleve.getPrenom());
        System.out.println("Date de naissance: " + eleve.getDateNaissance());
        System.out.println("Sexe: " + eleve.getSexe());
        System.out.println("Matières:");
        List<Matiere> matieres = eleve.getMatieres();
        for (Matiere matiere : matieres) {
            System.out.println("Code: " + matiere.getCode());
            System.out.println("Nom: " + matiere.getNom());
            System.out.println("Coefficient: " + matiere.getCoefficient());
            System.out.println("Note: " + matiere.getNote());
        }
    }
}

