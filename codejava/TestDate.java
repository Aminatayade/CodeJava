//package MesClasses;
import java.util.Date;
import java.text.SimpleDateFormat;
public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	SimpleDateFormat formatter=null;
	Date aujourdhui=new Date();
	formatter= new   SimpleDateFormat (" 'le' dd/MM/yyyy '�' hh:mm:ss aaa");
	System.out.println ("La date  d'aujourd'hui esst : "+ formatter.format(aujourdhui));
	}

}
