public class OC {
    public static void main(String[] args) {
        //creation du premier marque de telephone on cree  l'objet marque
        // new permet de creer une nouvelle instance 
        Marque  apple= new Marque("apple");
        Telelphone iphone= new Telelphone(23000,"iphone",apple);
       
        System.out.println(iphone.nom);

        
    }
}
class Telelphone{//classe telephone
    int pixels;
    String nom;
    Marque marque;
    //definition des constructeurs
    public  Telelphone(int pixels,String nom,Marque marque) //<=arguments 
    {
        //mise a jour des arguments
        this.pixels=pixels;
        this.nom=nom;
        this.marque=marque;
    }
}

class Marque{ //classe marque
    String nom;
    //contructeurs pour acceder a l'objets
    public Marque(String nom){
        this.nom=nom;
    }
}