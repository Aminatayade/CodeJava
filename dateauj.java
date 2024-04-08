import java.util.Date;
import java.text.SimpleDateFormat;
public class dateauj{
    public static void main(String[] args){
        SimpleDateFormat formatter=null;
        Date aujourdhui=new Date();
        formatter= new   SimpleDateFormat (" 'le' dd/MM/yyyy '�' hh:mm:ss aaa");
        System.out.println ("La date  d'aujourd'hui esst : "+ formatter.format(aujourdhui));
    }

} 