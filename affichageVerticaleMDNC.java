import java.util.Scanner;
public class affichageVerticaleMDNC{
    public static void main(String[] args){
        Scanner in= new Scanner (System.in);
		int taille; //nombre de tableaux ou taille de la matrice
		do
		{
			System.out.print("Saisir la taille de la matrice: ");
			taille=in.nextInt();
		} while (taille<=0);
		  int m[][]= new int [taille][]; //matrice non carr�e
	for  (int i=0; i<m.length; i++)
	{
		int v; //taille de chacun des tableaux
		do
		{
			System.out.print("Saisir la taille du tableau num�ro : "+(i+1)+ " ");
			 v=in.nextInt();
		} while (v<=0);
		m[i]=new  int[v]; //alocation du tableau num�ro i+1
		for (int j=0; j<v; j++)
		{
			System.out.print("Saisir l'�lement � la position ("+i+","+j+")");
			m[i][j]=in.nextInt();
		}
	}
		System.out.println("Affichage  horizontale matrice carr� ");
		for (int i=0; i<m.length; i++)
		{
			for (int j=0;j<m[i].length; j++)
				System.out.print (m [i][j] +"\t");
			System.out.println(); ///retour de ligne
				
		}
			
		
		  System.out.println("Affichage  verticale matrice carr� ");
		  
		  for (int j=0;j<max(m); j++)  //max (m) renvoie la taille du plus grand tableau
		  { for (int i=0; i<m.length; i++)
			  if (j<m[i].length)
		  System.out.print (m [i][j] +"\t"); 
			  else
				  System.out.print ("\t"); 
		  System.out.println();
		  
		  }
		 
				

	}
	private static int max(int[][] m) {
		// TODO Auto-generated method stub
		int vmax=m[0].length;
		 for  (int i=1; i<m.length; i++)
			 if (m[i].length>vmax)
				 vmax=m[i].length;
		return vmax;
	}

}

    
