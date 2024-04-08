import java.util.Scanner;
public class Testenumeration {
    public static void main(String[] args)  {
        for(Enumsexe sexe : Enumsexe.values()) {
            System.out.println(sexe+" \t"+sexe.ordinal());
        }
        Scanner in =new Scanner(System.in);
        System.out.println("Donner le sexe ");
        String vsexe=in.next();
        Enumsexe sexe=Enumsexe.valueOf(vsexe);
        //F=F.toUpperCase();
        //M=M.toUpperCase();
        if(sexe==Enumsexe.F ){
            System.out.println("feminin");
        }
        else if(sexe==Enumsexe.M){
            System.out.println("masculin");
        }
        else{
            System.out.println("inconnu");
        }
    }
}
