import java.util.Scanner;

public class tab1 {
    public static void main(String[] args) {
        int taille;
        Scanner input = new Scanner(System.in);
        System.out.println("entrez la taille du tableau");
        taille = input.nextInt();
        int tab[] = new int[taille];
        for (int i = 0; i < taille; i++) {
            System.out.println("entrez le " +i+ " element du tableau");
            tab[i] = input.nextInt();

        }
        System.out.println();
        for (int i = 0; i <tab.length; i++) {
            System.out.println(tab[i]);
        }
        System.out.println();
        for (int i = 0; i <tab.length; i++) {
            System.out.println( "\t" +tab[i]);
            System.out.println();
        }

    }
}