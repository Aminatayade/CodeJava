

class CuisinerUnPlat{
    private String NomDuPlat;
    private String[] Ingredients;
    private int TempsCuisson;

public CuisinerUnPlat(String NomDuPlat, String[] Ingredients,int TempsCuisson) {
    this.NomDuPlat=NomDuPlat;
    this.Ingredients=Ingredients;
    this.TempsCuisson=TempsCuisson;
}
public String getNomDuPlat(){
    return NomDuPlat;
}
public void setNomDuPlat(String NomDuPlat){
    this.NomDuPlat=NomDuPlat;
}
public int getTempsCuisson(){
    return TempsCuisson;
}
public void setTempsCuisson(int TempsCuisson){
    this.TempsCuisson=TempsCuisson;
}
public String getIngredients(){
    return Ingredients;
}
public void setIngredients(String[] Ingredients){
    this.Ingredients=Ingredients;
}
public void Cuisiner(){
    System.out.println("On va cuisiner "+NomDuPlat);
    System.out.println("les ingredients necessires");
    for(int i=0;i<Ingredients.length;i++){
        System.out.println("-"+Ingredients[i]);
    }
System.out.println("le temps de cuisson "+TempsCuisson+"minutes");
System.out.println("les etapes de cuisson pour le maccaroni ");
System.out.println("on met fait bouillir de l'eau dans le bocal puis on n'y met les pates ...");
System.out.println("votre"+NomDuPlat+"est pre");
}
}
public class Cuisine{
    public static void main(String[] args) {
        String[] ingredientsMaccaroni = {"Pâtes", "Viande ", "Sauce tomate", "Fromage","oignons"};
        CuisinerUnPlat Maccaroni = new CuisinerUnPlat("Maccaroni", ingredientsMaccaroni, 30);

        Maccaroni.Cuisiner();
    }
}
