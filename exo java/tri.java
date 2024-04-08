import java.util.Scanner;
public class tri{
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int[] tableau=new int[3];
        int i;
        for( i=0;i<=2;i++){
        System.out.println("saisir le nombre" );
        tableau[i]=sc.nextInt();

        }
        int j;
        int temporaire;
        for( i=0;i<tableau.length-1;i++){
            for(j=0;j<tableau.length-1;j++){
                if(tableau[j]>tableau[j+1]){
                    temporaire=tableau[j];
                    tableau[j]=tableau[j+1];
                    tableau[j+1]=temporaire;

                }
            }
        }
        System.out.println("le resulat du tableau trie par ordre croissant:");
        for( i=0;i<=2;i++){
            System.out.println(tableau[i] );
        }
    }
}