import java.util.Scanner;
public class tableau {
    public static void main(String[] args) {
        int[] tab= new int[5];
        int i;
        Scanner scanner =new Scanner(System.in);
        for(i=0;i<tab.length;i++){
            System.out.println("donner la valeur de l'element " +tab[i]);
            tab[i]=scanner.nextInt();
           
        }
        System.out.println("les elements du tableau sont");
       
        for(i=0;i<tab.length;i++)
        {
            System.out.println(tab[i]);
        }
       // scanner.close;
    }
} 
