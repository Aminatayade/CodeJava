public class Etudiant{
//definition des attributs contructeur est une methode qui a lE meme nom que la classe ca permet de creer l'objet a partir de la classe 
private String numeroINE;
private String nom;
private String prenom;
private char sexe;
//definition constructeur sans parametre qui nínitialise pas les donnees
public Etudiant() {}
public Etudiant(String numeroINE,String nom,String prenom,char sexe)//definition des parametres on cree l'objet en initialisans les donnees dóu la necessite des accessseurs
{
    this.numeroINE=numeroINE;
    this.nom=nom;
    this.prenom=prenom;
    this.sexe=sexe;
}
//defintion  des accesseurs nombre d'accesseurs =nombre d'attributs pour initialiser les objets 
public String getnumeroINE(){return numeroINE;}
public String getnom(){return nom;}
public String getprenom(){return prenom;}
public String getsexe(){return sexe;}
public void setnumeronINE(String numeroINE)
{this.numeroINE=numeroINE;}
public void setnom(String nom)
{this.nom=nom;}
public void setprenom(String prenom)
{this.prenom=prenom;}
public char setsexe(char sexe )
{this.sexe=sexe;}
}
//initialisation des objets en utilisant set statique
import java.util.scanner;
import ecole.Etudiant;
package ecole;

public class TesterEtudiant{
    public static void initialiserEtudiant(Etudiant E){
        E1.setnumeroINE("AXIT2022");
        E1.setnom("Fall");
        E1.setprenom("Moussa");
        E1.setsexe('M');}
        public static void Affichage(Etudiant E)
        {
            system.out.println("le numero INE est:" +E.getnumeroINE());
            system.out.println("le nom est:" +E.get("Fall"));
            system.out.println("le prenom est:" +E.get("Mousa"));
            system.out.println("le sexe est:" +E.get('M'));

        }
        public  static void main(String [] args){
            Etudiant E1=new Etudiant();
            initialiserEtudiant(E1);
            Affichage(E1):

        }
    }//FIN TesterEtudiant *fonction .attribut static on pas besoin de passer par l'objet pour y acceder on peut passer directement par les classes
//si un attribut est static il est directement stocke dans la classe 
//initialisation dynamique
//on met tjrs dans do while la negation de ce que l'oon ne veut pas et on doit declarer les variables avant le do while pas dans le do while
public static initialiserEtudiant(Etudiant E){
    scanner in=new scanner(system.in)
    char vsexe;
    system.out.println("saisir Le numero INE:");
    E.setnumeroINE(in.next());
    system.out.println("saisir Le nom:");
    E.setnom(in.next());
    system.out.println("saisir Le prenom:");
    E.setprenom(in.nextline());
do{
    system.out.println("saisir le sexe:");
    vsexe=in.next().charAt(0);

}while (vsexe !='M' && vsexe !='F');
E.setsexe(vsexe);

}

    
}











