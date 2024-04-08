import java.util.Scanner;
public class matrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("veuillez entrer la taille de la matrice(nombre de tableaux)");
        int taille = sc.nextInt();
        int Matrice[][] = new int[taille][taille];
       
        for (int i = 0; i < Matrice.length; i++) {
            for (int j = 0; j < Matrice[i].length; j++) {
                System.out.println("donner l'element  " +i+ "," +j);
                Matrice[i][j] = sc.nextInt();
            }
        }
        System.out.println("les elements de la matrice sont");
        for (int i = 0; i < Matrice.length; i++) {
            for (int j = 0; j < Matrice[i].length; j++) {
                System.out.print(Matrice[i][j] + " ");
            }
            System.out.println();
        }
       //ScannerClose(sc);
    }
}
