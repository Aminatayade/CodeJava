package MesClasses;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String ch="Bonjour";
String s=ch.replace('o', 'a');
System.out.println(s.charAt(s.length()-1));
System.out.println(ch.toUpperCase());
String full=ch.concat(" Moussa");
System.out.println (full);
float  pi=3.14f;
String r=String.valueOf(pi);
System.out.println (r);
//Attention: transformer la chaine en nombre
int  x=Integer.parseInt("314")*4;
System.out.println (x);
	}

}
