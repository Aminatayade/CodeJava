package MesClasses;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestDateUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 2020-01-04
		
		
		  Date ajourdhui = new Date();  //renvoie le date  et l'heure aujourd'hui
		  System.out.println( "Numéro d'ordre Jour :"+ajourdhui.getDay()
		  +" \nNuméro d'odre Mois: "+(ajourdhui.getMonth()+1)+
		  " \nAnnée: "+(ajourdhui.getYear()+1900)+
		  " \nHeure: "+ajourdhui.getHours()+ " \nMinutes "+ ajourdhui.getMinutes()+
		  "  \nSeondes: "+ajourdhui.getSeconds());
		 
		
		  Date aujourdhui = new Date (); SimpleDateFormat formatter=null; formatter=
		  new SimpleDateFormat("dd MMMMM yyyy  GGG,hh:mm:ss  aaa");
		  System.out.println("La date d'aujourd'hui est : "+formatter.format(aujourdhui
		  ))
		 ;
              
	}

}
