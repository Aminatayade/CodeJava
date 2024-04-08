package MesClasses;
public enum EnumJourParam {
LUNDI(8),MARDI(8),MERCREDI(4),JEUDI(8),VENDREDI(8),
SAMEDI(4),DIMANCHE(0);
	private int param; //le paramtére
	 private EnumJourParam (int vparam) ///le constructeur de l'énumération
		{
		this.param=	vparam;
		}
	public  int getParam () {return this.param;}
	public  void  setParam (int vparam) {this.param=	vparam;}

}
