// convert state of Byte instance into byte, short, int. long, float and double.

class Bytess{
    public static void main(String args[])
    {
        byte b = 110;
        byte c = new Byte(b);
        byte a = Byte.valueOf(c);
        short s = Short.valueOf(c);
        int i = Integer.valueOf(c);
        long l = Long.valueOf(c);
        float f = Float.valueOf(c);
        double d = Double.valueOf(c);
        System.out.println("Byte instance into byte "+a);  //byte
        System.out.println("Byte instance into short "+s); //short
        System.out.println("Byte instance into int "+i);  //integer
        System.out.println("Byte instance into long "+l);  //long
        System.out.println("Byte instance into float "+f);  //float
        System.out.println("Byte instance into double "+d);  //double

    }
}