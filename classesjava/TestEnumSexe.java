package MesClasses;

public class TestEnumSexe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ///afficher les valeurs de l'énumération EnumJour en indiquat la position de chaque valer 
		//énumérée
		 for (EnumSexe s: EnumSexe.values() )
		 {
			 System.out.println (s+ " position : "+ s.ordinal());
		 }
	}

}
