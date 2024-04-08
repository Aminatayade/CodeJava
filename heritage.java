public class heritage {
    public static void main(String[] args) {
        Voiture maVoiture=new Voiture();
        Bateau monBateau=new Bateau();
        monBateau.demarrer();
        maVoiture.demarrer();
    }
}
class Vehiclule{ //classe mere
    void demarrer(){
        System.out.println("VROOM");
    }
}
//les classes voiture et bateau heritent de vehicule car ils ont la fonction demarrer en commun 
class Voiture extends Vehiclule{
//si le comportement des methodes sont different on peut utikiser le polymorphisme
//surcharge de la classe mere on utilise overide
@Override
    void demarrer(){
        super.demarrer();//pour ne pas perdre la methode demarrer de notre voitue

        allumerFeux();
    }
    void allumerFeux(){
        System.out.println("allumage feux");
    }
}   
class Bateau extends Vehiclule{

}