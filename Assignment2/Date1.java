import java.util.Scanner;
import java.text.SimpleDateFormat; 
import java.util.Date; 
import java.text.ParseException;

class DateFormat{
    public static void main(String args[])throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date in the format dd/mm/yyyy");
        String str = sc.nextLine();
        SimpleDateFormat sfd = new SimpleDateFormat("MM/dd/yyyy");
        Date date = sfd.parse(str);
        System.out.println(date);
        

        //SimpleDateFormat sfd1 = new SimpleDateFormat("yyyy/MM/dd");
        //String str1 = sfd1.format(date);
        //System.out.println(str1);

    }
}

/**import java.text.SimpleDateFormat;  
import java.util.Date;  
class SimpleDateFormatExample {  
public static void main(String[] args) {  
    Date date = new Date();  
    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
    String strDate= formatter.format(date);  
    System.out.println(strDate);  
}  
} */