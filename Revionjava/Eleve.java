import java.util.Scanner;
public class Eleve {
    private String nom;
    private String prenom;
    private String sexe;
    private int note[];
    public Eleve(){};
    public Eleve(String nom, String prenom, String sexe, int note[]) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.note = note;
    }
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public String getSexe(){
        return sexe;
    }
    public void setSexe(String sexe){
        this.sexe = sexe;
    }
    public int[] getNote(){
        return note;
    }
    public void setNote(int note[]){
        this.note = note;
    }
    public static void initialiserEleve(Eleve E){
        Scanner sc=new Scanner(System.in);
        System.out.println("Donner le nom de l'eleve");
        E.setNom(sc.next());
        System.out.println("Donner le prenom de l'eleve");
        E.setPrenom(sc.next());
        String sexe;
        do{
            System.out.println("Donner le sexe de l'eleve feminin/masculin");
            sexe=sc.nextLine().toLowerCase();
            System.out.println("ressaisissez svp");

          }while(!sexe.equals("feminin") && !sexe.equals( "masculin"));
        E.setSexe(sexe);
        System.out.println("vous stockez combien de note");
        int nombreNote;
        nombreNote =sc.nextInt();
        int notes[]=new  int [nombreNote];
        int i;
        do{ 
           
            for( i=0;i<notes.length;i++)
            {
                System.out.println("Donner la note numero "+(i+1));
                notes[i]=sc.nextInt();
            }

        }while(notes[i]<0);
        
        E.setNote(notes);
    }
}
