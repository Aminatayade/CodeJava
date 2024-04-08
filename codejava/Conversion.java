//package MesClasses;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberFormat f =new DecimalFormat("#.##");
		Scanner in= new Scanner (System.in);
		System.out.print("Saisir un nmbre reel avec  virgule: ");
		float x=in.nextFloat();
				String ch=f.format(x);  
		System.out.println("apres arrondi "+ch);
//Transformation chaine vers r��le
		 ch=ch.replace(',', '.'); 
		  float z=Float.parseFloat(ch);
		  System.out.println("Tranformation chaine vers reel "+ z);
		 

	}

}
