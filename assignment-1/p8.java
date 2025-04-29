import java.util.*;
class p8
{
    public static void main(String args[])
    {
        int temp,no,rev=0,ans;

        Scanner sc=new Scanner(System.in);

        System.out.print("enter no=");
        no=sc.nextInt();

        ans=no;

        while(no>0)
        {
            temp=no%10;
            rev=rev*10+temp;//rev=rev+(temp*temp*temp);
                            //system.out.print(temp)
            no=no/10;
        }

        if(ans==rev)
        {
            System.out.print("palindron....");
        }
        else
        {
            System.out.print("not palindron....");
        }
    }
}
