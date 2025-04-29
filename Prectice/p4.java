import java.util.*;
class p4
{
    public static void main(String arg[])
    {
        int no,count=0;
        Scanner sc=new Scanner(System.in);

        System.out.print("enter no=");
        no=sc.nextInt();

        for(int i=2;i<no/2;i++)
        {
            if(no%i==0)
            {
                count++;
                break;
            }    
        }
        if(count==0)
        {
            System.out.print("prime no");
        }
        else
        {
            System.out.print("not prime no");
        }
    }
}