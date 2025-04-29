import java.util.*;
class p1
{
    int id;
    String name,city;

    p1(int i,String n,String c)
    {
        id=i;
        name=n;
        city=c;
    }
    void display()
    {
        System.out.print(id+" "+name+" "+city);
    }
    public static void main(String arg[])
    {
        p1 s1=new p1(111,"manasvi","gadhada");
        s1.display();
    }
}