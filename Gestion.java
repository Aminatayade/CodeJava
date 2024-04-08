import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class  Gestion {
    public static void main(String[] args) {
        Ecole ecole =new Ecole("mon ecole");
        Etudiant etudiant1=new Etudiant("Aminata",19,"Licence2");
        Etudiant etudiant2=new Etudiant("Daouda",20,"Licence2");
        Cours cours1 =new Cours("Mathematiques","M. Fall");
        Cours cours2 =new Cours("Anglais","M.Ndour ");
        ecole.ajouterEtudiant(etudiant1);
        ecole.ajouterEtudiant(etudiant2);
        ecole.ajouterCours(cours1);
        ecole.ajouterCours(cours2);
         // Afficher les étudiants
         System.out.println("Liste des étudiants:");
         ecole.afficherEtudiant();
         System.out.println("son age "+etudiant1.getAge()+" ans, niveau :"+etudiant1.getNiveau());

 
         // Afficher les cours
         System.out.println("\nListe des cours:");
         ecole.afficherCours();
         System.out.println("son age "+etudiant2.getAge()+" ans, niveau :"+etudiant2.getNiveau());

        
    }
}
class Etudiant{
    private String nom;
    private int age;
    private String niveau;
    public Etudiant(String nom, int age, String niveau){
        this.nom = nom;
        this.age = age;
        this.niveau = niveau;
    }
    public String getNom(){
        return nom;

    }
    public int getAge(){
        return age;
    }
    public String getNiveau(){
        return niveau;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setNiveau(String niveau){
        this.niveau = niveau;
    }

}
class Cours{
    private String nom;
    private String professeur;
    public Cours(String nom, String professeur){
        this.nom = nom;
        this.professeur = professeur;
    }
    public String getNom(){
        return nom;
    }
    public String getProfesseur(){
        return professeur;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public void setProfesseur(String professeur){
        this.professeur = professeur;
    }   

}
class Ecole{
    private String nom;
    //private Etudiant etudiants
    private List<Etudiant> etudiants;
    private List<Cours> cours;
    public Ecole( String nom){
        this.nom=nom;
        this.etudiants=new ArrayList<>();
        this.cours=new ArrayList<>();

    }
    public String getNom(){
        return nom;
    }
    public List<Etudiant> getEtudiants(){
        return etudiants;
    }
    public List<Cours> getCours(){
        return cours;
    }
    public void setNom(String nom){
        this.nom=nom;
    }
    public void setEtudiants(List<Etudiant> etudiants){
        this.etudiants=etudiants;
    }
    public void setCours(List<Cours> cours){
        this.cours=cours;
    }
    public  void ajouterEtudiant(Etudiant etudiant){
        etudiants.add(etudiant);
    }
    public void ajouterCours( Cours cours){
        this.cours.add(cours);
    }
    public void afficherEtudiant(){
        for(Etudiant etudiant: etudiants ){
            System.out.println(etudiant.getNom());
        }
    }
    public void afficherCours(){
        for(Cours cours:cours){
            System.out.println(cours.getNom());
        }
    }
}