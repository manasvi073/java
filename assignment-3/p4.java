import java.util.*;
class p4
{
    int id,phone;
    String name,course;
    p4(int i,String n,int p,String c)
    {
        id=i;
        name=n;
        phone=p;
        course=c;
    }
    void display()
    {
        System.out.print(id+" "+name+" "+phone+" "+course);
    }
    public static void main(String arg[])
    {
        p4 obj=new p4(11,"manu",1234567890,"BCA");
        obj.display();
    }
}