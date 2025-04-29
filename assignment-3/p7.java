import java.util.*;
class p7
{
    int x,y;
    
    p7(int x1,int y1)
    {
        x=x1;
        y=y1;
    }

    void area()
    {
        System.out.println(x*y);
    }

    void rectangle()
    {
        System.out.println(2*(x+y));
    }

    public static void main(String arg[])
    {
        p7 obj=new p7(10,10);
        obj.area();
        obj.rectangle();
    }
}