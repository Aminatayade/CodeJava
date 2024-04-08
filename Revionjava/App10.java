import java.util.Scanner;
public class App10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nombre1,nombre2;
        try
        {

            System.out.println("donner le premier nombre ");
            nombre1=sc.nextInt();
            System.out.println("donner le deuxieme nombre ");
            nombre2=sc.nextInt();
            int division=nombre1/nombre2;
            System.out.println("la division est "+division);
        }
        catch(Exception e){
            System.out.println("attention divion par zero");
        }
        

        

    }
    
}
