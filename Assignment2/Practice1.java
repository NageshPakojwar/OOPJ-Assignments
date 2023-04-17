class Employee{
    private String name;
    private int empid;
    private float salary;

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
    public float getSalary()
    {
        return this.salary;
    }
    public void setSalary(float salary){
        this.salary = salary;
    }
}
class Program{
    public static void main(String args[])
    {
        Employee emp = new Employee();

        emp.setName("Aniket");
        emp.setEmpid(245);
        emp.setSalary(45000);

        String name = emp.getName();
        int empid = emp.getEmpid();
        float salary = emp.getSalary();

        System.out.print(name+"   "+empid+"   "+salary);

    }
}