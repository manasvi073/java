import java.util.*;
class p1
{
        public static void main(String arg[])
        {
         int a,b,c;
        Scanner sc=new Scanner(System.in);

        System.out.print("enter no1=");
        a=sc.nextInt();

        System.out.print("enter no2=");
        b=sc.nextInt();

        c=a+b;
        System.out.println("addition="+c);

        c=a-b;
        System.out.println("sub="+c);

        c=a*b;
        System.out.println("multiplication="+c);

        if(b!=0)
        {
            c=a/b;
            System.out.println("division="+c);
        }
        else
        {
            System.out.println("division=not divide by 0");
        }
        
    }
}