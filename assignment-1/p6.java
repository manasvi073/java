import java.util.*;
class p6
{
    public static void main(String arg[])
    {
        int no;

        Scanner sc=new Scanner(System.in);

        System.out.print("enter no=");
        no=sc.nextInt();

        if(no%2==0)
        {
            System.out.print("even no...");
        }
        else
        {
            System.out.print("odd no...");
        }
    }
}