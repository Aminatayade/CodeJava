package MesClasses;

import java.util.Scanner;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soldeinitial=100000; 
		Scanner  input =new  Scanner (System.in);
		System.out.print ("Saisir le montant à retirer: ");
		 int montant=input.nextInt();
     int newsolde=debit (soldeinitial,montant);
     System.out.println("Le nouveau solde est  :"+ newsolde);
	}

	private static  int debit(int solde, int montant) {
		// TODO Auto-generated method stub
		solde=solde-montant;
		return solde;
	}

}
