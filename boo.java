public class boo{
    public static void main(String[] args) {
        int nombre=1;
        if(nombre==1){
            console("if 1");
        }
        else if (nombre==2) {
            console("if 2");
        }
         switch(nombre){
             case 1:
                console("switch 1");
             break;
             default:
                 console("default"); }
    }
    static void console(String text){
        System.out.println(text);
    }
   
}