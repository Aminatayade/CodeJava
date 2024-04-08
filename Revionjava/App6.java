public class App6 {
    
    public static void main(String[] args) {
        //instanciation dun objet de la classe String
        String s ="H ello";
        String s2="World";
        System.out.println(s.toString());
        //System.out.println(s+" "+s2);
        //System.out.println(s);
        //length rennvoie le nombre de caractere de la chaine
       /*  System.out.println(s.concat(" ").concat(s2));
        System.out.println(s.length());
        System.out.println(s2.toLowerCase());//minuscule
        System.out.println(s2.toUpperCase());//majuscule    
        System.out.println(s2.trim());//remplace les espaces
        System.out.println(s2.substring(0,2));//retourne le premier caractere
        System.out.println(s2.replace("o", "a"));//
        System.out.println(s.charAt(0));
        System.out.println(s.equals(s2));*/
        int a =5 , b=4;
        String v;
        v="7 6 "+a+b;
        System.out.println(v);
        v=" (53) "+(a+b);
        System.out.println(v);
        v=" "+'a'+b;
        System.out.println(v);
        v=a+b+" 3 2 1 ";
        System.out.println(v);
}
}