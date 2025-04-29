import java.util.*;
class p15
{
    int id;
    String name;
    String city;
    p15(int i, String n, String c)
    {
        id=i;
        name=n;
        city=c;
    }
    void dish()
    {
        System.out.println(id+" "+name+" "+city);
    }

    public static void main(String arg[])
    {
        p15 obj=new p15(1,"manasvi","surat");
        obj.dish();
        p15 obj1=new p15(2,"Pankti","surat");
        obj1.dish();
    }
}