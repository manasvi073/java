import java.util.*;
class first
{
    String cname,model;

    void getdata()
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter car name=");
        cname=sc.next();

        System.out.print("enter car model=");
        model=sc.next();

        System.out.println("car_name="+cname);
        System.out.println("car_model="+model);

    }
}
class second extends first
{
    int cno,year;

    void putdata()
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter car_no=");
        cno=sc.nextInt();

        System.out.print("enter year=");
        year=sc.nextInt();

        System.out.println("car_no="+cno);
        System.out.println("year="+year);
    }
}
class p4 extends second
{
    public static void main(String arg[])
    {
        p4 p=new p4();
        p.getdata();
        p.putdata();
    }
}
