import java.util.*;
class p5
{
    public static void main(String arg[])
    {
        int no,basic_sal,HRA,DA;
        String name;

        Scanner sc=new Scanner(System.in);

        System.out.print("enter no=");
        no=sc.nextInt();

        System.out.print("enter name=");
        name=sc.next();

        System.out.print("enter basic salary=");
        basic_sal=sc.nextInt();

        System.out.println("no="+no);
        System.out.println("name="+name);
        System.out.println("basic salary="+basic_sal);

        HRA=basic_sal*10/100;
        System.out.println("HRA="+HRA);

        DA=basic_sal*12/100;
        System.out.println("DA="+DA);

    }
}