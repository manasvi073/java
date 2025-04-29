import java.util.*;
class first 
{
    int book_no;
    String book_name;

    void f1()
    {
       Scanner sc=new Scanner(System.in);

        System.out.print("enter book_no=");
        book_no=sc.nextInt();

        System.out.print("enter book_name=");
        book_name=sc.next();

        System.out.println("book_no="+book_no);
        System.out.println("book_name="+book_name);
    }
}
class second extends first
{
    String author,publisher;

    void s1()
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter author name=");
        author=sc.next();

        System.out.print("enter publisher=");
        publisher=sc.next();

        System.out.println("author="+author);
        System.out.println("publisher="+publisher);
    }
}
class p3 extends second
{
    public static void main(String arg[])
    {
        p3 p=new p3();
        p.f1();
        p.s1();
    }
}