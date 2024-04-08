import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner entree = new Scanner(System.in);
        String T;
        System.out.println("entrer un mot");
        T = entree.nextLine();
        T = T.toUpperCase();
        int i = 0, j = T.length() - 1;
        while (i < j && T.charAt(i) == T.charAt(j)) {
            i++;
            j--;
        }
        if (T.charAt(i) != T.charAt(j)) {
            System.out.println(T + " n'est pas un palindrome");
        } else {
            System.out.println(T + " est un palindrome");
        }
    }
}
