package MesClasses;
public enum EnumJourBiParam {
LUNDI(8,"Journée"),MARDI(8,"Journée"),MERCREDI(4,"demi-Journée"),
JEUDI(8,"Journée"),VENDREDI(8, "Journée"),
SAMEDI(4, "Journée"),DIMANCHE(0,"repos");
	private int param1; //le paramtére
	private String  param2;
	 private EnumJourBiParam (int vparam1, String vparam2) ///le constructeur de l'énumération
		{
		this.param1=vparam1;
		this.param2=vparam2;
		}
	public  int getParam1 () {return param1;}
	public   String      getParam2 (){return param2;}
	public  void  setParam1 (int vparam1) {param1=	vparam1;}
	public  void  setParam2 (String vparam2) {param2=	vparam2;}

}
