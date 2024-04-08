import java.util.*;
public class App9 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        //la partie susceptible de generer l'exeption on le met dans le try catch
        try
        {
            System.out.println("Veuillez saisir votre annee de naissance : ");
            int annee=sc.nextInt();
            System.out.println(annee);
        }
        catch(Exception e)
        {
           // System.out.println("Veuillez resaisir la date de naissance cest invalide : ");
            System.out.println(e.getMessage());
        }
        

    }
}
