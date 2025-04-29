import java.util.*;
class emp
{
    void e1()
    {
        Scanner sc=new Scanner(System.in);
        int eno,sal;
        String ename;

        System.out.print("enter eno=");
        eno=sc.nextInt();

        System.out.print("enter ename=");
        ename=sc.next();

        System.out.print("enter salary=");
        sal=sc.nextInt();

        System.out.println("eno="+eno);
        System.out.println("ename="+ename);
        System.out.println("salary="+sal);
    }    
}
class dept extends emp
{
    int dcode;
    String name;
    void d1()
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter dept code=");
        dcode=sc.nextInt();

        System.out.print("enter dept name=");
        name=sc.next();

        System.out.println("dcode="+dcode);
        System.out.println("Dname="+name);
    }
}
class p1 
{
    public static void main(String arg[])
    {
        dept d=new dept();
        d.e1();
        d.d1();
    }
}