import java.util.*;
class p1
{
    public static void main(String arg[])
    {
        int per;
        Scanner sc=new Scanner(System.in);

        System.out.print("enter no=");
        per=sc.nextInt();

        if(per<35)
        {
            System.out.print("fail....");
        }
        else if(per<50)
        {
            System.out.print("pass class");
        }
        else if(per<60)
        {
            System.out.print("second class");
        }
        else if(per<70)
        {
            System.out.print("first class");
        }
        else
        {
            System.out.print("distinction class");
        }

    }
}
