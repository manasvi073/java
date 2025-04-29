import java.util.*;
class p2
{
    public static void main(String arg[])
    {
       swapping obj=new swapping();
       obj.getdata();
       obj.swap(); 
    }
}
class swapping
{   
    int a,b;
    void getdata()
    {
        
        Scanner sc=new Scanner(System.in);

        System.out.print("enter a=");
        a=sc.nextInt();

        System.out.print("enter b=");
        b=sc.nextInt();

    }
    void swap()
    {
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}