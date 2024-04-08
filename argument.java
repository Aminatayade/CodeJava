public class argument {
    public static void main(String[] args) {
        sayHelloTo("world");
        switch (args.length) {
            case 0:
                sayHelloTo("world");
                break;
            case 1:
                sayHelloTo(args[0]);
                break;
            case 2:
                sayHelloTo(args[0]+ "-" + args[1]);
                break;
            default:
            System.out.println( "desole je peux pas prendre en charge plus de 2 arguments");
                
        }
    }
   private static void sayHelloTo(String recipient){
    System.out.println( "hello"+ recipient);
   }
}
