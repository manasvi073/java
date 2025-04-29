public class p6
{
    public static void main(String[] args) 
    {
        try 
        {
            if (args.length != 2) 
            {
                throw new IllegalArgumentException("Please provide exactly two arguments.");
            }
            
            double dividend = Double.parseDouble(args[0]);
            double divisor = Double.parseDouble(args[1]);
            
            if (divisor == 0) 
            {
                throw new ArithmeticException("Cannot divide by zero.");
            }
            
            double result = dividend / divisor;
            
            System.out.println("Division result: " + result);
        } 

        catch (NumberFormatException e) 
        {
            System.err.println("Error: Please provide valid numeric inputs.");
        }
        catch (IllegalArgumentException e) 
        {
            System.err.println("Error: " + e.getMessage());
        }
        catch (ArithmeticException e) 
        {
            System.err.println("Error: " + e.getMessage());
        }
    }
}