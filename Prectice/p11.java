import java.util.*;
class get
{
    void put()
    {
        int no,rev=0,ans,temp;
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
            System.out.println("armstrong no...");
        }
        else
        {
            System.out.println("not armstrong no...");
        }
    }
}
class p11
{   
    public static void main(String arg[])
    {
    
        get g=new get();
        g.put();
    }
}