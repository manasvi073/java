import java.util.*;
class p2
{
    public static void main(String arg[])
    {
        int no1,a,b,c;
        
        Scanner sc=new Scanner(System.in);

        System.out.print("enter your choice.....=");
        no1=sc.nextInt();

        System.out.print("enter a=");
        a=sc.nextInt();

        System.out.print("enter b=");
        b=sc.nextInt();

        
        switch(no1)
        {
            case 1:
                c=a+b;
                System.out.print("addition="+c);
                break;
            case 2:
                c=a-b;
                System.out.print("subtrction="+c);
                break;
            case 3:
                c=a*b;
                System.out.print("multiplication="+c);
                break;
            case 4:
                c=a/b;
                System.out.print("division="+c);
                break;
            default:
                System.out.print("choice is invalid....");
        }
    }
}