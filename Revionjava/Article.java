public class Article {
    private String nom;
    private double prix;
    private int quantite;

    public Article() {
        this.nom = "aminata";
        this.prix = 10000;
        this.quantite = 1;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public static void afficherDetails(Article A) {
        System.out.println("le nom du client "+A.getNom());
        System.out.println("le prix  "+A.getPrix());
        System.out.println("la qunatite  "+A.getQuantite());
    }

    public static void vendre(Article A, int quantite) {
        if (quantite < A.getQuantite()) {
            System.out.println("desole l quantite est insuffisant");
        } else {
            A.setQuantite(A.getQuantite() - quantite);
        }
        System.out.println("vente effectue nouvelle quantite en stock" + A.getQuantite());
    }

    public static void approvisionner(Article A, int quantite) {
        if (quantite > A.getQuantite()) {
            System.out.println("quantite insuffisant");
        }
        A.setQuantite(A.getQuantite() + quantite);
        System.out.println("approvisionnement effectue nouvelle quantite en stock" + A.getQuantite());
    }
}
