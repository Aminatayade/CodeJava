import java.util.Scanner;
public class App3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Tableau[] = new int[3];

        for(int i=0;i<3;i++) {
            System.out.println("Veuillez saisir un nombre : ");
            Tableau[i] = sc.nextInt();
    
    }
    System.out.println("la liste des elements du tableau verticalement sont ");
    for(int i=0;i<3;i++) {
        System.out.println(Tableau[i]);
    }
    System.out.println("la liste des elements du tableau horizontalement  sont ");
    for (int i = 0; i < Tableau.length; i++) {
        System.out.print(Tableau[i] + " ");
    }
    System.out.println(); // Pour passer à la ligne suivante après l'affichage du tableau
}
}
