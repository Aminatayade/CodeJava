import java.sql.Date;
import java.util.Scanner;
public class ClasseA {
    private String nom;
    private int nombreEleve[];
    private Date promotion;
    private int liste[];
    Scanner sc=new Scanner(System.in);
    public ClasseA(){};
    public ClasseA(String nom,int nombreEleve[],Date promotion,int liste[]){
        this.nom=nom;
        this.nombreEleve=nombreEleve;
        this.promotion=promotion;
        this.liste=liste;
    }
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom=nom;
    }
    public int[] getNombreEleve(){
        return nombreEleve;
    }
    public void setNombreEleve(int[] nombreEleve){
        this.nombreEleve=nombreEleve;
    }
    public Date getPromotion(){
        return promotion;
    }
    public void setPromotion(Date promotion){
        this.promotion=promotion;
    }
    public int[] getListe(){
        return liste;
    }
    public void setListe(int[] liste){
        this.liste=liste;
    }
    
}
