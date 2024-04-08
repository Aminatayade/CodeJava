package MesClasses;

import java.sql.Date;
import java.util.Scanner;

public class TestEleve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in= new Scanner (System.in);
		Eleve e=new  Eleve();
		e.setNom("FALL");
		e.setPrenom("Pape Moussa");
		e.setSexe (EnumSexe.valueOf("M"));
		String  sexe;
		//sexe.equals("M")  ----- sexe="M"
		do {
			System.out.print("Saisir le sexe  (M ou F) :" );
			sexe=in.next();
		}   while (! (sexe.equals("M") || sexe.equals("F")) );
		e.setSexe (EnumSexe.valueOf(sexe));
		e.setDatenaiss(Date.valueOf("1980-12-01"));
		
		String  date;
		System.out.print("Saisir la  date de naissance sous format AAAA-MM-JJ :" );
		date=in.next(); 
		e.setDatenaiss(Date.valueOf(date));
		String [] parents= {"Mamadou SALL", "Fatou BA"};
		e.setParents(parents);
		String [] vparents = new String [2];
		System.out.print("Saisir le prénom et nom du père :" );
		in.nextLine(); //retour chario dans Scanner
		 vparents[0]=in.nextLine();
		 System.out.print("Saisir le prénom et nom de la mére:" );
		 vparents[1]=in.nextLine();
			e.setParents(vparents);
		String []  mesparents=e.getParents();
		for (int i=0; i<mesparents.length; i++)
			System.out.println (mesparents[i]);
		

	}

}
