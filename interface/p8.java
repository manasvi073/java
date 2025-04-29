class p8 
{
    void div(int a, int b) //throws ArithmeticException
    {
        if (b == 0) 
        {
            throw new ArithmeticException("Division by zero not allowed");
        }
        else 
        {
            System.out.println("division=" + (a / b));
        }
    }

    public static void main(String arg[]) 
    {
        p8 p = new p8();

        try 
        {
            p.div(10, 0);
        }
        catch (ArithmeticException e) 
        {
            System.out.println("Error: " + e);//e.getMessage());
        }
    }
}