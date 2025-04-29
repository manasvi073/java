import java.util.*;
class p13
{
    public static void main(String arg[])
    {
        int p,r,n,si;
        Scanner sc=new Scanner(System.in);
        {
            System.out.print("Enter p=");
            p=sc.nextInt();

            System.out.print("Enter r=");
            r=sc.nextInt();

            System.out.print("Enter n=");
            n=sc.nextInt();

            si=p*r*n/100;
            System.out.println("Simple Interest="+si);
        }
    }
}