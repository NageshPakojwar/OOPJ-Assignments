//boolean value to boolean instance

class Bool{
    public static void main(String args[])
    {
        Boolean a= false;
        Boolean b = new Boolean(a);
        System.out.println(b);
    }
}

//String value into Boolean instance.

class Bool1{
    public static void main(String args[])
    {
        String str = "false";
        Boolean b = new Boolean(str);
        System.out.print(b);
    }
}

// string instance to byte instatnce

class Bytess{
    public static void main(String args[])
    {
        String str = "123";
        String b = new String(str);
        byte a = new Byte(b);
        System.out.println(a);
    }
}