package MesClasses;
public enum EnumJourBiParam {
LUNDI(8,"Journ�e"),MARDI(8,"Journ�e"),MERCREDI(4,"demi-Journ�e"),
JEUDI(8,"Journ�e"),VENDREDI(8, "Journ�e"),
SAMEDI(4, "Journ�e"),DIMANCHE(0,"repos");
	private int param1; //le paramt�re
	private String  param2;
	 private EnumJourBiParam (int vparam1, String vparam2) ///le constructeur de l'�num�ration
		{
		this.param1=vparam1;
		this.param2=vparam2;
		}
	public  int getParam1 () {return param1;}
	public   String      getParam2 (){return param2;}
	public  void  setParam1 (int vparam1) {param1=	vparam1;}
	public  void  setParam2 (String vparam2) {param2=	vparam2;}

}
