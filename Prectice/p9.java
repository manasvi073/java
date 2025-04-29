import java.util.*;
class p9
{
    public static void main(String arg[])
    {
        int i,j,k;
        for(i=1;i<=5;i++)
        {
            for(k=1;k<=5-i;k++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for(i=4;i>=1;i--)
        {
            for(k=1;k<=5-i;k++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}

    //     *
    //    * *
    //   * * *
    //  * * * *
    // * * * * *
    //  * * * * 
    //   * * *
    //    * *
    //     * 