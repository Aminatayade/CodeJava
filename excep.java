import java.util.Scanner;
public class excep{
    public static void main(String[] args) {
        int soldeinitial=100000;
        Scanner  input =new  Scanner (System.in);
        System.out.println("veuillez entrer le montant a retirer");
        int montant=input.nextInt();
        int newsolde;
        try{
           newsolde= debit(soldeinitial, montant);
           System.out.println("votre nouveau solde est "+newsolde); 
           }catch(Exception e){
               System.out.println(e.getMessage());
        }
    }
    public static int debit(int solde, int montant) throws Exception{
        if(montant>solde) throw new Exception("Attention Solde insuffisant");
        solde=solde-montant;
        return solde;

    }
}