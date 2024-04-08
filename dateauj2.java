import java.util.Scanner;
import java.sql.Date;
public class dateauj2{
    public static void main(String[] args){
 Scanner in= new Scanner (System.in);
 System.out.print("Saisir une date de naissance selon ce format yyyy-mm-dd : "
 );
 String datenaissance=in.next();
 Date  d=Date.valueOf(datenaissance);
 System.out.println("Date  format sql :"+d);
}
}