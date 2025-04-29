import java.util.*;
class p7
{
    int i,no;

    public static void main(String arg[])
    {
        p7 obj=new p7();
        obj.getdata();
        obj.display();
    }

    Scanner sc=new Scanner(System.in);
    String arr[][]=new String[10][10];

    void getdata()
    {
        
        System.out.print("how many record you want to add=");
        no=sc.nextInt();

        for(i=0;i<no;i++)
        {
            System.out.print("enter id=");
            arr[i][0]=sc.next();

            System.out.print("enter name=");
            arr[i][1]=sc.next();

            System.out.print("enter age=");
            arr[i][2]=sc.next();

            System.out.print("enter salary=");
            arr[i][3]=sc.next();
        }
    }
    void display()
    {
        for(i=0;i<no;i++)
        {
            System.out.println("id="+arr[i][0]);
            System.out.println("name="+arr[i][2]);
            System.out.println("age="+arr[i][2]);
            System.out.println("salary="+arr[i][3]);
        }
    }
}