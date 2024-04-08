import java.util.Scanner;
public class App5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int taille;
        do
        {
            System.out.println("combient de tableau voullez vous dans le matrice");
            taille=sc.nextInt();

        }while(taille<0);
       
       //initialisation de la matrice
       int Matrice[][]=new int [taille][];
       //demande la taille de chaque tableau avec un bloucle
       for(int i=0;i<Matrice.length;i++){
        int taille_tab;
        do
        {
            System.out.println("taille du tableau numero  "+(i+1)+" ");
            taille_tab=sc.nextInt();
        }while(taille_tab<0);

        Matrice[i]=new int[taille_tab];//instanciation de chaque tableau de la matrice

        for(int j=0;j<Matrice[i].length;j++)
         {
            System.out.println("valeur du tableau numero  "+(i+1)+" a la position  "+(j+1)+" ");
            Matrice[i][j]=sc.nextInt();
        }
       }


        System.out.println("affichage horizontale");
        for(int i=0;i<Matrice.length;i++){
            for(int j=0;j<Matrice[i].length;j++){
                System.out.print(Matrice[i][j]+" ");
            }
            System.out.println();
        }
        //trouvons les maximums pour l'affichge verticale
        
        //affichage verticale
        System.out.println("affichage verticale");
        for(int j=0;j<Max(Matrice);j++){
            for(int i=0;i<Matrice.length;i++)
                if(j<Matrice[i].length)
                    System.out.print(Matrice[i][j]+"\t");
                    else
                        System.out.print("\t");
                    System.out.println();

        
        }

}
private static int Max(int m[][]){
    int ValeurMax=m[0].length;
    for(int i=0;i<m.length;i++){
        if(m[i].length>ValeurMax){
            ValeurMax=m[i].length;
    }
}
return ValeurMax;
}
class Eleve{
    private int nom;

    private int prenom;
}
}