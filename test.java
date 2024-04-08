public class test {
    public static void main(String[] args) {
        long a =50, b=20;
        int s = a+b;
        System.out.println(s);//ca provoque une errreur car l'addition de deux variables de types long donne un long qui est stocke sur 64 bytes qui ne peut pas etre stocke dans un  variable de type int code sur 32 bytes 
        //saut en cas de transtypage du type long vers int
        byte a1 = 127,b1 =1;
        byte s1= a1+b1;
        byte s2=a1-b1; // de meme que la soustraction
        //erreur car la somme de deux bytes sera stocke dans un int c'est exige par l'operateur d'addition 
        byte a2=127, b2=1;
        byte s3= (byte)a2+b2;
    }
    
}
