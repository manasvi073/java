import java.util.*;
class p2
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        {
            int no,a,b,c;
            
            System.out.println("-------------------------------------------------------------");

            System.out.println("Addition--------------1-----------------");
            System.out.println("Subtraction-----------2-----------------");
            System.out.println("multiplication--------3-----------------");
            System.out.println("division--------------4-----------------");

            System.out.println("-------------------------------------------------------------");

            System.out.print("enter your choice=");
            no=sc.nextInt();

            System.out.print("enter value of A=");
            a=sc.nextInt();

            System.out.print("enter value of B=");
            b=sc.nextInt();
            
            switch(no)
            {
                case 1:
                    c=a+b;
                    System.out.println("Addition= "+c);
                    break;

                case 2:
                    c=a-b;
                    System.out.println("Subtraction= "+c);
                    break;

                case 3:
                    c=a*b;
                    System.out.println("multiplication= "+c);
                    break;

                case 4:
                    if(b!=0)
                    {
                        c=a/b;
                        System.out.println("division= "+c);
                        break;
                    }
                    else
                    {
                        System.out.println("not divide by zero");
                    }

                default:
                    System.out.println("your choice is invalid");
            }
        }
        
    }
    
}