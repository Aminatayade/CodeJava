//package MesClasses;

public class TabEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tab1 []= {4,5,2,-5, 10};
		int tab2[]= {4,5,2,5};
		boolean eq=( tab1.length==tab2.length);
		
		for (int i=0; eq&&i<tab1.length; i++)
			eq= (tab1[i]==tab2[i]);
		if (eq)
			System.out.println("Les deux tableaux sont identiques");
		else
			System.out.println("Les deux tableaux  ne sont  pas identiques");

	}

}
