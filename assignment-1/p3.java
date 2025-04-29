import java.util.*;
class p3
{
    public static void main(String arg[])
    {
        int p,r,n;
        float si;

        Scanner sc=new Scanner(System.in);

        System.out.print("enter p=");
        p=sc.nextInt();

        System.out.print("enter r=");
        r=sc.nextInt();

        System.out.print("enter n=");
        n=sc.nextInt();

        si=p*r*n/100;

        System.out.print("simple intrest is="+si);        
    }
}