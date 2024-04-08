package MesClasses;
//dfinir la classe Eleve  avec..... 
import java.sql.Date;
import  MesClasses.EnumSexe; 
//optionel si EnumSexe et Eleve se trouvent dans la m^me bibliothéque
public class Eleve {
	private  String nom;
	private  String prenom;
	private   EnumSexe sexe;
	private Date  datenaiss;
	private   String []  parents;

	public Eleve() {
		// TODO Auto-generated constructor stub
	}
	
	public Eleve(String nom,String prenom,EnumSexe  sexe, Date datenaiss) {
		// TODO Auto-generated constructor stub
		
	}
	//fonctions get
	public  String getNom () {return nom;}
	public  String getPrenom () {return prenom;}
	public  EnumSexe getSexe () {return sexe;}
	public  Date getDatenaiss () {return datenaiss;}
	public  String [] getParents () {return parents;}
	
	//fonctions set
	public  void setNom (String nom) {this.nom=nom;}
	public  void setPrenom (String prenom) {this.prenom=prenom;}
	public  void setSexe (EnumSexe  sexe) {this.sexe=sexe;}
	public  void setDatenaiss (Date datenaiss) {this.datenaiss=datenaiss;}
	public  void setParents (String [] parents) {this.parents=parents;}

}
