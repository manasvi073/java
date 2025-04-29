import java.util.*;
class p6
{
    public static void main(String arg[])
    {
        shop s=new shop();
        s.getdata();
    }
}
class shop
{
    int icode;
    String name;
    int price,i,sum;
  
  void getdata()
  {
    for(i=1;i<4;i++)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter item_code=");
        icode=sc.nextInt();

        System.out.print("enter item_name=");
        name=sc.next();

        System.out.print("enter price=");
        price=sc.nextInt();


         System.out.println("enter item_code="+icode);
          System.out.println("item_name="+name);
           System.out.println("price="+price);
       
        sum=price+sum;
        System.out.println("sum of price="+sum);
    }
  }
}