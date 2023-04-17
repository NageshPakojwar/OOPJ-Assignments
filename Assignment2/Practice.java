import java.time.LocalDate;
import java.util.Scanner;

class Date{
    int day;
    int month;
    int year;
    Date()
    {
        LocalDate ld = LocalDate.now();
        this.day = ld.getDayOfMonth();
        this.month = ld.getMonthValue();
        this.year = ld.getYear();
        System.out.print(day+" "+month+" "+year);
    }

    


    
}

class Program{
    public static void main(String args[])
    {
        Date dt1 = new Date();
        
    }
}