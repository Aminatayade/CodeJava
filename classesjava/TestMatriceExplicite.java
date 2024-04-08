package MesClasses;

public class TestMatriceExplicite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m [][] = {{4,5,2},{10,12,13}, {16,17,18}};
		//m[0]= {4,5,2}  m[1]= {10,12,13}   m[2]={16,17,18}
		
		System.out.println("Affichage  horizontale matrice carré ");
	
		for (int i=0; i<m.length; i++)
		{
			for (int j=0;j<m[i].length; j++)
				System.out.print (m [i][j] +" ");
			System.out.println(); 
		}
		
System.out.println("Affichage  verticale matrice carré ");
	
       for (int j=0;j<m.length; j++)
		{
	  for (int i=0; i<m.length; i++)
				System.out.print (m [i][j] +" ");
			System.out.println();
				
		}
				

	}

}
