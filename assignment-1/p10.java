import java.util.*;
class p10
{
    public static void main(String arg[])
    {
        int f=1,no,i;
         
        Scanner sc=new Scanner(System.in);

        System.out.print("enter no=");
        no=sc.nextInt();

        for(i=1;i<=no;i++)
        {
            f=f*i;
        }
        System.out.print("factorial no="+f);
    }
}