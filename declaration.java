public class declaration{
    public static void main(String[] args) {
        book mybook =new book("Une si longue lettre", "Mariama Ba", 200);
        System.out.println(mybook.auteur);
    }
}
//declaration d'une classe en java
class book {
    //les attributs de la classe
    String titre;
    String  auteur;
    int numeroDePages;
    String editeur="OC";    

      //Constructeur de la classe Book principale
      book(String titre, String auteur, int numeroDePages, String editeur) {
            //Initialise l’attribut title avec la valeur de l’argument title
            this.titre = titre;
            this.auteur = auteur;
            this.numeroDePages = numeroDePages;
            this.editeur = editeur;
      }
     // constructeur secondaire
     //un constructeur peu aller un autre constructeurs on peut aussi avoir plusieur constructeur pour une meme class
     book(String titre, String auteur, int numeroDePages){
        this( titre, auteur,  numeroDePages, "OC");
     }
}