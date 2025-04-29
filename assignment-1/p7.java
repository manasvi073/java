import java.util.*;
class p7
{
    public static void main(String arg[])
    {
        int ans,no,temp,rev=0;

        Scanner sc=new Scanner(System.in);
         
        System.out.print("enter no=");
        no=sc.nextInt();

        ans=no;

        while(no>0)
        {
            temp=no%10;
            rev=rev+(temp*temp*temp);
            no=no/10;
        }

        if(ans==rev)
        {
            System.out.print("armstrong no...");

        }
        else
        {
            System.out.print("not armstrong no...");
        }
    }
}