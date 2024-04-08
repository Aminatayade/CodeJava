public class App7 {
    public static void main(String[] args) {
        StringBuilder sBuilder=new StringBuilder("Bonjour tout le monde");
        System.out.println(sBuilder.length());
        System.out.println(sBuilder.capacity());
        sBuilder.append("Bonjour");
        System.out.println(sBuilder);
        sBuilder.append("tout le monde ");
        System.out.println(sBuilder);
    }
    
}
