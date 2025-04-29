import java.util.*;
class p14
{
    public static void main(String arg[])
    {
        int a,b,c;
        try
        {
            if(arg.length!=2)
            {
                throw new IllegalArgumentException("plz enter any two no");
            }
            a=Integer.parseInt(arg[0]);
            b=Integer.parseInt(arg[1]);

            c=a+b;
            System.out.println("Addition="+c);

            c=a-b;
            System.out.println("Subtraction="+c);

            c=a*b;
            System.out.println("multiplication="+c);

            if(b==0)
            {
                throw new ArithmeticException("no not divide by zero");
            }
            else
            {
                c=a/b;
                System.out.println("Division="+c);
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("error:"+e.getMessage());
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Error:"+e.getMessage());
        }
        // catch(NumberFormateException e)
        // {
        //     System.out.println("only number value allow");
        // }       
    }
}