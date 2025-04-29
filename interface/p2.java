interface interarea
{
	 void area(float a,float b);
	 void parameter(float a,float b);
}

class rectangle 
{
	public void area(float a,float b)
	{
		System.out.println("area="+(a*b));
	}
}
class circle 
{
	public void parameter(float a,float b)
	{
		System.out.println("parameter="+(a+b));
	}
}

class p2
{
	public static void main(String arg[])
	{
		rectangle r=new rectangle();
		r.area(10,20);

		circle c=new circle();
		c.parameter(20,40);
	}
}