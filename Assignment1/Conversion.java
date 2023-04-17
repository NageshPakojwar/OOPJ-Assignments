//byte value into String

class Value{
    public static void main(String args[])
    {
        byte a =20;
        String str = String.valueOf(a);
        System.out.println(str);
    }
}

//byte value into Byte instance

class Value1{
    public static void main(String args[])
    {
        byte a = 25;
        byte b = new Byte(a);
        System.out.println(b);
    }
}

//String instance into Byte instance.

class Value2{
    public static void main(String args[])
    {
        String str = "10";
        String str1 = new String(str);
        byte b = new Byte(str1);
        System.out.println(b);
    }
}