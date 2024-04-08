package MesClasses;

public class TestEnumJour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (EnumJour j: EnumJour.values())
			System.out.println("Jour : "+j+ " Position "+j.ordinal());

	}

}
