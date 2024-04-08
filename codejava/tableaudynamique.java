import java.util.Scanner;
public class tableaudynamique{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int taille;
        do{
        System.out.println("Veuillez saisir la taille de votre tableau");
        taille=in.nextInt();
        }while(taille<=0);
}
//int m[][]=new int[4][3]; matrice de 4 elements et dans chaque elements on 3 positions 
// si on a une matrice non  carree
int m[][]=new int[4][];
m[0]=new int[3];
m[1]=new int[3];
m[2]=new int[3];
m[3]=new int[4];
//si on affiche un tableau on fait system.out.print  m[i].length taille de nímporte quel tableau de la matrice 