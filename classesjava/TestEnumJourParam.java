package MesClasses;

public class TestEnumJourParam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 for (EnumJourParam j: EnumJourParam.values())
	 System.out.println("Jour : "+j+ " Nombre d'heures de travail: "+j.getParam());
	}

}
