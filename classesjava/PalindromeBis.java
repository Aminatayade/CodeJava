package MesClasses;

import java.util.Scanner;

public class PalindromeBis {

	   public  static boolean estPalindrome (String T)
	   {
		   T=T.toUpperCase();
			int i=0;
			int  j=T.length()-1;
			while ( i<j  &&  T.charAt(i)==T.charAt(j))
			{
				///incrémenter i et décrementer j
				i++;
				j--;
			}
			///
			if ( T.charAt(i)==T.charAt(j))
					return true;
			else
				
				return false;
	   }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entree=new Scanner (System.in);
		String chaine ;
		System.out.print("Saisir une chaine :  ");
		chaine=entree.next();
		if (estPalindrome (chaine))
			System.out.println(chaine+ " est un palindrome");
		else
			
			System.out.println(chaine+ " n' est pas un palindrome");

	}

}
