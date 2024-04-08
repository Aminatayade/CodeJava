package MesClasses;

public class TestMatriceExpliciteNonCarre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m [][] = {{4,5,2},{10,12,13,19, 20}, {16,17,18,17}};
		//m[0]= {4,5,2}  m[1]= {10,12,13}   m[2]={16,17,18}
		
		System.out.println("Affichage  horizontale matrice carré ");
	
		for (int i=0; i<m.length; i++)
		{
			for (int j=0;j<m[i].length; j++)
				System.out.print (m [i][j] +" ");
			System.out.println(); 
		}
		
System.out.println("Affichage  verticale matrice carré ");
	
       for (int j=0;j<max(m); j++)
		{
	  for (int i=0; i<m.length; i++)
		  if (j<m[i].length) //verifier le dépassement d'indice
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
