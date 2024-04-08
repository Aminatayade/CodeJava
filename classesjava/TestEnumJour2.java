package MesClasses;

import java.util.Scanner;

public class TestEnumJour2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new  Scanner(System.in);
		System.out.print("Saisir un jour de la semaine: ");
		String jour=in.next();
		jour=jour.toUpperCase();
		EnumJour j= EnumJour.valueOf(jour); //transformation d'une chaine en une valeur énuméréé
		switch (j)
		{
		case SAMEDI:  System.out.println("Week-end start"); break;
		case DIMANCHE:  System.out.println("JOUR DE REPOS"); break;
		 	default: System.out.println("JOUR DE  travail"); break;
		}

	}

}
