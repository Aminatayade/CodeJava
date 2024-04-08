package MesClasses;

import java.util.Scanner;

public class TestNumSexeBis2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner in= new Scanner (System.in);
      System.out.print ("Saisir le sexe d'une personne  : ");
      String vsexe=in.next();
      boolean trouve=false;
      //EnumSexe sexe=EnumSexe.valueOf(vsexe);   
      ///transformer la chaine en une valeur enumérée
      for (EnumSexe s: EnumSexe.values() )
    	  if (s.toString().equals(vsexe))
    	  {
    		trouve=true;  
    		  break;
            }
    	  if (trouve)
      System.out.println (vsexe+ "  est une valeur de l'énumération ");
    	  else
    		  System.out.println (vsexe+ "  n'est  pas une valeur de l'énumération ");
	}

}
