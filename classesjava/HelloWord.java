package MesClasses;

public class HelloWord {
int k; //variable de portée classe sont des attributs de classe
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0; //portée méthode
       while (i<5)
       {
    	   int s; //portée bloc
    	   System.out.println("helo Word++");
    	   i++;
    	   s=20;
       }//fin bloc
   
	}//fin main

	///methode 2
	public  int somme (int a, int b)
	{
		k=a+b;
		return k;
	}
}
