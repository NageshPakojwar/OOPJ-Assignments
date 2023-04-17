import java.util.Scanner;
class Tollbill{
    String VehicalType;
    int NumberOfAxles;
    String DistanceInformation;


    static Scanner sc = new Scanner(System.in);
    public Static vehicletype()
    {
        System.out.println("Enter the Vehicle type (Cars, vans or buses)");
        this.VehicalType = sc.nextLine();
        System.out.println("Enter the  Number of axles");
        this.NumberOfAxles = sc.nextInt();
        System.out.println("Enter the  Distance Information");
        this.DistanceInformation = sc.nextLine();
    }

    public static int menulist(){
        System.out.println("1. Enter vehicle type (car, van, bus, or truck)");
        System.out.println("2.  Enter number of axles");
        System.out.println("3. Enter distance travelled");
        System.out.println("4. Calculate toll fee");
        System.out.println("5. Generate bill");
        System.out.println("6. Exit");
        return sc.nextInt();
    }

}
class TollBooth{
    public static void main(String args[])
    {
        int choice;
        Tollbill tb = new Tollbill();
        while((choice = Tollbill.menulist())!=0){
        switch(choice){
            case 1:
                Tollbill.vehicletype();
            case 2:
                


                


        }
        }


    }


/**import java.util.Scanner;
class Employee{
    private String name;
    private int empid;
    private float salary;

Employee(){
    this.name = " ";
    this.empid = 0;
    this.salary = 0;
}
public String getName(){
     return this.name;
}
public void setName(String name){
    this.name = name;
}
public int getEmpid(){
    return this.empid;
}
public void setEmpid(int empid){
    this.empid = empid;
}
public float getSalary(){
    return this.salary;
}
public void setMarks(float salary){
    this.salary = salary;
}
}
class EmployeeTest{
    private static Scanner sc = new Scanner(System.in);
    int a;
    private Employee emp = new Employee();
    public void acceptRecord(){
        System.out.println("Enter name : ");
        sc.nextLine();
        emp.setName (sc.nextLine());
        System.out.println("Enter the Empid : ");
        emp.setEmpid(sc.nextInt());
        System.out.println("Enter the salary : ");
        emp.setMarks(sc.nextFloat());
    }   
    public void printRecord(){
        System.out.println(emp.getName() + "  " + emp.getEmpid() + "  " + emp.getSalary());
    
    }
    public static int menulist(){
        System.out.println("0.Exit");
        System.out.println("1.Accept Record.");
        System.out.println("2.Print Record");
        System.out.print("Enter choice  : ");
        return sc.nextInt();
    }
}
class Program2{
    public static void main(String [] args){
      int choice;
      EmployeeTest test = new EmployeeTest();
      while((choice = EmployeeTest.menulist())!=0){
        switch(choice){
        case 1:
            test.acceptRecord();
            break;
        case 2:
            test.printRecord();
            break;
        }
      }
      
    }
}*/