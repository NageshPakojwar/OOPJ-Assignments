//program to find minimum and maximum number as well as to add two long numbers using methods of Long.

class Maxmin{
    public static void main(String args[])
    {
        long a = 500;
        long b = 400;
        long c = Long.max(a,b);
        long d = Long.min(a,b);
        long e = Long.sum(a,b);
        System.out.println("Maximum is "+c);
        System.out.println("Minimum is "+d);
        System.out.println("sum is "+e);
    }
}