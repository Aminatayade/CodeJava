package MesClasses;

import java.util.Scanner;

public class TestVecteurImplicite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int T1 [] ={4,5,2,1};
		Scanner in=new Scanner (System.in);
		int taille;
		do
		{
		   System.out.print("Donner la taille du tableau (n positif) :");
			taille=in.nextInt();
		} while(taille<=0);
		int T1 []= new int[taille];   //déclaration et allocation 
		for  (int i=0; i<T1.length; i++)
		{
			System.out.print("Saisir l'élément du tableau à la position: "+i+" ");
			T1[i]=in.nextInt();
			///affichage pas de sens
		}
		
		System.out.println ("Affichage verticale");
		for (int i=0; i<T1.length;i++)
		System.out.println(T1[i]);
		
		System.out.println ("Affichage  horizontale");
		for (int i=0; i<T1.length;i++)
		System.out.print(T1[i]+"\t");
		

	}

}
