import java.util.*;
class p3
{
    public static void main(String arg[])
    {
        int no1;

        Scanner sc=new Scanner(System.in);
        
        System.out.print("enter no=");
        no1=sc.nextInt();

        switch(no1)
        {
            case 1:
                System.out.print("sunday");
                break;
            case 2:
                System.out.print("monday");
                break;
            case 3:
                System.out.print("tuesday");
                break;
            case 4:
                System.out.print("wedansday");
                break;
            case 5:
                System.out.print("thrusday");
                break;
            case 6:
                System.out.print("friday");
                break;
            case 7:
                System.out.print("saturday");
                break;
            default:
                System.out.print("invalid...");
                break;
        }
    }
}