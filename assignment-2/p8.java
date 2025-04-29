import java.util.*;
class p8
{
    public static void main(String arg[])
    {
        item i=new item();
        i.getitem();
        i.display();    
    }
}
class item
{
       int ino;
        int qty,i;
        int rate,amt;

    void getitem()
    {
      
        Scanner sc=new Scanner(System.in);

        System.out.print("enter item no=");
        ino=sc.nextInt();

        System.out.print("enter item qty=");
        qty=sc.nextInt();

        System.out.print("enter item rate=");
        rate=sc.nextInt();

        System.out.print("enter amount=");
        amt=sc.nextInt();
       

    }
    void display()
    {
        System.out.println("item no="+ino);
        System.out.println("qty="+qty);
        System.out.println("rate="+rate);
        System.out.println("amount="+amt);
    }
}