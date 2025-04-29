interface arith
{
    float area(float l,float b);
    float parimeter(float l,float b);
}
class rectangle implements arith
{
    public float area(float l,float b)
    {
       return (l*b);
    }
    public float parimeter(float l,float b)
    {
        return(2*(l*b));
    }
}
class p12
{
    public static void main(String arg[])
    {
        rectangle r=new rectangle();
        arith a1;

        float l=5.0f,b=2.0f;
        a1=r;

        System.out.println("area="+(a1.area(l,b)));
        System.out.println("paramiter="+(a1.parimeter(l,b)));

        // circle c=new circle();
        // c.parimeter(20,10);
    }
}