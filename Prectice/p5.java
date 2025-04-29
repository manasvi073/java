import java.util.*;
class p5
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        {
            int no,a=0,b=1,c=0;
            System.out.print("enter no=");
            no=sc.nextInt();

           // System.out.print(b);

            for(int i=1; i<=no; i++)
            {
               
                a=b;
                b=c;
                c=a+b;
                System.out.print(" "+c); 
            }
        }
    }
}