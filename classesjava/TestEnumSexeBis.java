package MesClasses;

import java.util.Scanner;

public class TestEnumSexeBis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner in= new Scanner (System.in);
      String vsexe;
     // do {
    	  System.out.print ("Saisir le sexe d'une personne  : ");
         vsexe=in.next();
         ///vsexe!="M" && vsexe!="F"
     // }  while (!vsexe.equals("M") && !vsexe.equals("F"));
      boolean trouve=false;
      EnumSexe sexe=EnumSexe.valueOf(vsexe);   ///transformer la chaine en une valeur enumérée
      for (EnumSexe s: EnumSexe.values() )
    	  if (s==sexe)
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
