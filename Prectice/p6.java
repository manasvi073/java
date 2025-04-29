import java.util.*;
class p6
{
    public static void main(String arg[])
    { 
        int f=1,no;
        Scanner sc=new Scanner(System.in);
        {
            System.out.print("Enter no=");
            no=sc.nextInt();

            for(int i=1;i<=no;i++)
            {
                f=f*i;
            }
            System.out.println("Factorial no are="+f);
        }
    }
}