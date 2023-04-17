import java.util.Scanner;
class Employee{
    String name;
    int empid;
    float salary;
    
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
    public void setSalary(float salary){
        this.salary = salary;
    }


}
class Program2{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        System.out.println("enter Name :");
        emp.setName(sc.nextLine());
        System.out.println("enter Empid :");
        emp.setEmpid(sc.nextInt());
        System.out.println("enter Salary :");
        emp.setSalary(sc.nextFloat());

        String name = emp.getName();
        int empid = emp.getEmpid();
        float salary = emp.getSalary();

        System.out.println(name+"  "+empid+"   "+salary);


    }
}