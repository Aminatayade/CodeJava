package MesClasses;

public class TestEnumSexe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ///afficher les valeurs de l'�num�ration EnumJour en indiquat la position de chaque valer 
		//�num�r�e
		 for (EnumSexe s: EnumSexe.values() )
		 {
			 System.out.println (s+ " position : "+ s.ordinal());
		 }
	}

}
