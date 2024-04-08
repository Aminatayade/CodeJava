import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Matrice[][] = new int[2][2];
        for (int i = 0; i < Matrice.length; i++) {
            for (int j = 0; j < Matrice[i].length; j++) {
                System.out.println("Enter the value of Matrice[" + i + "][" + j + "]");
                Matrice[i][j] = sc.nextInt();
            }
        }
        System.out.println("affichage de la matrice horizontale ");
        for (int i = 0; i < Matrice.length; i++) {
            for (int j = 0; j < Matrice[i].length; j++) {
                System.out.print(Matrice[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("affichage de la matrice verticale ");
        for(int j=0;j < Matrice[0].length;j++){

            for(int i=0;i<Matrice.length;i++){
                System.out.print(Matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}