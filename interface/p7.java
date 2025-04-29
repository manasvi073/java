// Define custom exception
/*class NoMatchFoundException extends Exception 
{
    public NoMatchFoundException(String message) 
    {
        super(message);
    }
}
*/
// Main program
public class p7
{
    public static void main(String[] args) 
    {
        try 
        {
            String str = "college"; // Change this string to test different inputs
            
            // Check if the string matches "university"
           // if (!str.equals("university")) 
             if (str!="university")
            {
                throw new NoMatchFoundException("String does not match 'university'");
            }
            else 
            {
                System.out.println("String matches 'university'");
            }
        } 
        catch (NoMatchFoundException e) 
        {
            System.out.println("Error: " + e);//.getMessage());
        }
    }
}