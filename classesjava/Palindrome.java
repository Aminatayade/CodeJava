package MesClasses;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entree=new Scanner (System.in);
		String mot ;
		System.out.print("Saisir un mot :  ");
		mot=entree.next();
		mot=mot.toUpperCase();
		int i=0;
		int  j=mot.length()-1;
		while ( i<j  &&  mot.charAt(i)==mot.charAt(j))
		{
			///incrémenter i et décrementer j
			i++;
			j--;
		}
		///
		if ( mot.charAt(i)==mot.charAt(j))
				System.out.println(mot+ " est un palindrome");
		else
			
			System.out.println(mot+ " n' est pas un palindrome");
	}

}
