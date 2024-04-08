public class MainApp{
    public static void main(String[] args) {
        System.out.println("bonjour" );
        final int NUMBER=20;
        System.out.println(NUMBER);
        int nb1=1;
        int nb2=nb1++;//nb2<-nb1 nb1<-(1+1)
        int nb3=++nb1;//nb3<-(1+1)
        System.out.println(nb1);
        System.out.println(nb2);
        System.out.println(nb3);
    
    }

}