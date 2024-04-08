package MesClasses;
import java.sql.Date; //date format yyyy-mm-dd
//import java.util.Date;//datetime    
import java.util.Scanner;

public class TestDateSql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 2020-01-04
		Scanner in= new Scanner (System.in);
		
		System.out.print("Saisir une date de naissance selon ce format yyyy-mm-dd : "
		  ); 
		  String datenaissance=in.next(); //2020-01-04 Date
		Date  d=Date.valueOf(datenaissance);  //va transformer la date sous format Strig vers Date
		  System.out.println("Date  format sql :"+d);
		 
	
	}

}
