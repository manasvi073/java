import java.util.*;

class student
{
    int rollno;
    String name;
    static String college="adarsh";

    student(int r,String n)
    {
        rollno=r;
        name=n;
    }
    void display()
    {
        System.out.println(rollno+" "+name+" "+college);
    }
}

public class p9
{
    public static void main(String arg[])
    {
        student s1=new student(1,"manasvi");
        student.college="pgdcl";
        s1.display();
    }
}
