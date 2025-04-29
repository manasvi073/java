import java.util.*;
class p3
{
    String name;
    int rno,mark1,mark2,mark3,total,per;

    p3(String n,int i,int m1,int m2,int m3)
    {
        name=n;
        rno=i;
        mark1=m1;
        mark2=m2;
        mark3=m3;

        total=mark1+mark2+mark3;
        per=total/3;
    }
    void display()
    {
        System.out.print(name+" "+rno+" "+mark1+" "+mark2+" "+mark3+" "+total+" "+per);
    }
     public static void main(String arg[])
    {
        p3 obj=new p3("manasvi",1,90,80,97);
        obj.display();
    }
   
}