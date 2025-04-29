import java.util.*;
class p3
{
    public static void main(String arg[])
    {
        int no,temp,rev=0,ans;

        Scanner sc=new Scanner(System.in);

        System.out.print("enter no=");
        no=sc.nextInt();

        ans=no;

        while(no>0)
        {
            temp=no%10;
             rev=rev*10+temp;// rev=rev+(temp*temp*temp);
            no=no/10;

        }
        //System.out.print("reverse="+rev);

        if(ans==rev)
        {
            System.out.print("palindrom");
        }
        else
        {
            System.out.print("not palindrom");
        }
    }
}