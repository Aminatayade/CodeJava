public class Boutique {
    public static void main(String[] args) {
        Article A = new Article();
        Article.afficherDetails(A); // Appel de la méthode afficherDetails en utilisant le nom de classe Article
        Article.vendre(A,2);
        Article.approvisionner(A, 4);


    }
}
