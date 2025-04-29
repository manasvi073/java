import java.util.*;
class p1
{
    public static void main(String arg[])
    {
        int no;
        Scanner sc=new Scanner(System.in);

        {
            System.out.print("enter no=");
            no=sc.nextInt();

            if(no%2!=0)
            {
                System.out.println(no+"  no is odd");

            }
            else
            {
                System.out.println(no+"  no is even");
            }
        }
    }
}