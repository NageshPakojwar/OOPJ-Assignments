//The number of bits used to represent a byte value

class Size{
    public static void main(String args[])
    {
        System.out.println("bits in Byte "+Byte.SIZE);
    }
}

//The number of bytes used to represent a byte value

class Size1{
    public static void main(String args[])
    {
        System.out.println("The number of bytes in byte is "+Byte.BYTES);
    }
}

//The minimum value a byte
class Size2{
    public static void main(String args[])
    {
        int a=Byte.MIN_VALUE;
        System.out.println("The minimum value a byte is "+a);
    }
}

//The maximum value a byte
class Size3{
    public static void main(String args[])
    {
        int a = Byte.MAX_VALUE;
        System.out.println("The maximum value a byte is "+a);
    }
}