import java.util.*;
class pattern
{
    public static void main(String arg[])
    {
        int no;
        
        Scanner sc=new Scanner(System.in);

        // System.out.print("enter no=");
        // no=sc.nextInt();

        /*for(int i=1;i<=no;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*for(int i=1;i<=no;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(""+j);
            }
            System.out.println();
        }*/


        /*int sp=20;
        for(int i=1;i<=5;i++)
        {
            for(int k=1;k<=sp;k++)
            {
                System.out.print("");
            }
            sp--;
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
*/


/*


 * * * *
  * * *
   * *
    *

        sp=20;
        // int sp=20;
        for(int i=4;i>=1;i--)
        {
            for(int k=4;k<=sp;k++)
            {
                System.out.print(" ");
            }
            sp++;
            for(int j=1;j<=i;j++)
            {   
                System.out.print("* ");
            }
            System.out.println();
        }
*/


/*


            
 *
 * *
 * * *
 * * * *
 * * * * *
 * * * *
 * * *
 * *
 *

        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
        for(int i=4;i>=1;i--)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(" *");    
            }
            System.out.println(" ");
        }*/


/*
        for (int i=1;i<=5;i++) 
        {
            for(int k=1;k<=5-i;k++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++) 
            {
                System.out.print(" *");
            }
            System.out.println(" ");
        }


     *
    * *
   * * *
  * * * *
 * * * * *


*/

/*        

        *
      * *
    * * *
  * * * *
* * * * *
  * * * *
    * * *
      * *
        *

        for (int i=1;i<=5;i++) 
        {
            for(int k=1;k<=5-i;k++)
            {
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=4;i>=1;i--)
        {
            for(int k=1;k<=5-i;k++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
*/



 * * * * *
  * * * *
   * * *
    * *
     *
     *
    * *
   * * *
  * * * *
 * * * * *

for (int i=5;i>=1;i--) 
        {
            for(int k=1;k<=5-i;k++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++) 
            {
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++)
        {
            for(int k=1;k<=5-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }


    }
}



// DONE ON --> 8th April 2025
