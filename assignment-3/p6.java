import java.util.*;
class p6
{
    public static void main(String arg[])
    {
        adder a=new adder();
        a.add(10,20);
    }
}
class adder
{
     void add(int a,int b)
    {
        System.out.print(a+b);
    }
}
