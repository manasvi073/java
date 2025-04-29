import java.util.*;
class p5
{
    
        int p,r,n,si;
        p5()
        {
            Scanner sc=new Scanner(System.in);

        System.out.print("enter p=");
        p=sc.nextInt(); 

        System.out.print("enter r=");
        r=sc.nextInt(); 

        System.out.print("enter n=");
        n=sc.nextInt(); 

        si=p*r*n/100;

    
        System.out.print("simple interest="+si);
    
        }
        
    public static void main(String arg[])
    {
        p5 p=new p5();
            
    }
}
