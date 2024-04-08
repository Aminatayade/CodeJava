import java.util.Scanner;
public class mat1{
    public static void main(String[] args) {
    int taille;
    Scanner input = new Scanner(System.in);
    System.out.println("entrez le nombre de tableau de la matrice :");
    taille = input.nextInt();

    int matrice[][]=new int[taille][taille];
    for(int i=0;i<matrice.length;i++){
        for(int j=0;j<matrice[i].length;j++){
            System.out.println("entrez le " +i+ " a la position "+j+" du tableau");
            matrice[i][j]=input.nextInt();

    
    }
}
System.out.println();
    for (int i=0;i<matrice.length;i++){
        for(int j=0;j<matrice[i].length;j++){
            System.out.println(matrice[i][j] +"\t");
              System.out.println();
        }
      
    }
}
}
