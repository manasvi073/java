class cmdexp
{
      public static void main(String arg[])
      {

        int a,b,ans;
        try
        {
             if (arg.length != 2) 
            {
                throw new IllegalArgumentException("Please provide exactly two arguments.");
            }
            a=Integer.parseInt(arg[0]);
            b=Integer.parseInt(arg[1]);

            if(b==0)
            {
                throw new ArithmeticException("not allow divide by zero");
            }
            else
            {
                ans=a/b;
                System.out.println("division="+ans);
            }
        }
        catch(NumberFormatException e)
        {
            System.out.print("Error: enter only number value");
        }
        catch(IllegalArgumentException e)
        {
            System.out.print("Error:"+e.getMessage());
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error:"+e.getMessage());
        }
    }
}