//package MesClasses;
import java.sql.Date;
//import java.util.Date;
import java.util.Scanner;

public class TestDateSql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 2020-01-04
		Scanner in= new Scanner (System.in);
		
		  System.out.print("Saisir une date de naissance selon ce format yyyy-mm-dd : "
		  ); String datenaissance=in.next(); //2020-01-04 Date
		Date  d=Date.valueOf(datenaissance); 
		  System.out.println("Date  format sql :"+d);
		 
	
	}

}
