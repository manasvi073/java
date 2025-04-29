import java.util.*;
class p8
{
    public static void main(String arg[])
    {
        for(int i=1;i<=5;i=i+2)
        {
            for(int k=1;k<=5-i;k++)
            {
                System.out.print(" ");
              
            }
        
            for(int j=1;j<=i;j++)
            {
                if(j%2==0)
                {
                    System.out.print("1 ");          
                }
                else
                {
                    System.out.print("* ");          
                }
            }
            System.out.println(" ");                     
        }
        for(int i=3;i>=1;i=i-2)
        {
            for(int k=1;k<=5-i;k++)
            {
                System.out.print(" ");
              
            }
        
            for(int j=1;j<=i;j++)
            {
                if(j%2==0)
                {
                    System.out.print("1 ");          
                }
                else
                {
                    System.out.print("* ");          
                }
            }
             System.out.println(" ");                     
        }
    }
}
//.......OUTPUT........
    //     *
    //   * 1 *
    // * 1 * 1 *
    //   * 1 *
    //     * 