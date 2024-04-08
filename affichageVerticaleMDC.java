import java.util.Scanner;
public class affichageVerticaleMDC{
    public static void main(String[] args) {
        Scanner in= new Scanner (System.in);
		int taille; //taille de la matrice (nombre de tableaux de la matrice)
		do
		{
			System.out.print("Saisir la taille de la matrice (nombre de tableaux): ");
			taille=in.nextInt();
		} while (taille<=0);
		  int m[][]= new int [taille][taille]; //matrice carr�e
	for  (int i=0; i<m.length; i++)
		for (int j=0; j<m[i].length; j++)
		{
			System.out.print("Saisir l'�lement � la position ("+i+","+j+")");
			m[i][j]=in.nextInt();
		}
		
		System.out.println("Affichage  horizontale matrice carr� ");
		for (int i=0; i<m.length; i++)
		{
			for (int j=0;j<m[i].length; j++)
				System.out.print (m [i][j] +"\t");
			System.out.println(); ///retour de ligne
				
		}
			
	System.out.println("Affichage  verticale matrice carr� ");
	
       for (int j=0;j<m[0].length; j++)
		{
	  for (int i=0; i<m.length; i++)
				System.out.print (m [i][j] +"\t");
			System.out.println();
				
		}
				

	}

}

    

