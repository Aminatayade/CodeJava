package MesClasses;

import java.util.Scanner;

public class TestException3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soldeinitial=100000; 
		Scanner  input =new  Scanner (System.in);
		System.out.print ("Saisir le montant à retirer: ");
		 int montant=input.nextInt();
     int newsolde;
	try {
		newsolde = debit (soldeinitial,montant);
		   System.out.println("Le nouveau solde est  :"+ newsolde);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
  //System.out.println("Merci");
	}

	private static  int debit(int solde, int montant) throws SoldeException  {
		// TODO Auto-generated method stub
		if (montant>solde) throw  new  SoldeException ("Attention Solde insuffisant");
		solde=solde-montant;
		return solde;
	}

}
