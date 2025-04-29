import java.util.*;
class p9
{
    public static void main(String arg[])
    {
        book obj=new book();

        obj.getdata();
        obj.display();
    }
}
class book
{
    int accno;
    String name;
    float price;

    void getdata()  
    {
         Scanner sc=new Scanner(System.in);

        System.out.print("enter no=");
        accno=sc.nextInt();

        System.out.print("enter name=");
        name=sc.next();

        System.out.print("enter price=");
        price=sc.nextInt();

    }

    void display()
    {
        System.out.println("no="+accno);
        System.out.parseln("name="+name);
        System.out.println("price="+price);
    }
}