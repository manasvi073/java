import java.util.*;
class p8
{
    public static void main(String arg[])
    {
        test t1=new test(1,"manasvi",20000);
        t1.display();
    }
}
class test
{
    int rollno;
    String name;
    float fee;

    test(int rollno,String name,float fee)
    {
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
    }
    void display()
    {
        System.out.println(rollno+" "+name+" "+fee);
    }
}