import java.util.*;
class std
{
    int rno,m1,m2,m3;
    String name;

    void s1()
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter roll no=");
        rno=sc.nextInt();

        System.out.print("enter name=");
        name=sc.next();

        System.out.print("enter mark1=");
        m1=sc.nextInt();

        System.out.print("enter mark2=");
        m2=sc.nextInt();

        System.out.print("enter mark3=");
        m3=sc.nextInt();

        System.out.println("roll no="+rno);
        System.out.println("name="+name);
        System.out.println("mark1="+m1);
        System.out.println("mark2="+m2);
        System.out.println("mark3="+m3);
    }
}
class result extends std
{
    int total;
    float per;

    void r1()
    {
        Scanner sc=new Scanner(System.in);

        total=m1+m2+m3;

        per=total/3;

        System.out.println("total="+total);
        System.out.println("per="+per);
    }
}
class p2
{
    public static void main(String arg[])
    {
        result r=new result();
         r.s1();
        r.r1();
    }
}