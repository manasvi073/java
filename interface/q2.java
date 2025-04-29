import java.util.*;
abstract class shap
{
	abstract void area();
}
class triangle extends shap
{
	@Override
	public void area()
	{
		Scanner sc=new Scanner(System.in);
		int b,h;
		

		System.out.print("enter b=");
		b=sc.nextInt();

		System.out.print("enter h=");
		h=sc.nextInt();

		System.out.println("area of triangle="+(0.5*b*h));
	}
}
class rectangle extends shap
{
	@Override
	public void area()
	{
		Scanner sc=new Scanner(System.in);
		int w,h;
		

		System.out.print("enter w=");
		w=sc.nextInt();

		System.out.print("enter h=");
		h=sc.nextInt();

		System.out.println("area of rectangle="+(w*h));
	}
}
class circle extends shap
{
	@Override
	public void area()
	{
		Scanner sc=new Scanner(System.in);
		int pi,r;
		

		System.out.print("enter pi=");
		pi=sc.nextInt();

		System.out.print("enter r=");
		r=sc.nextInt();

		System.out.println("area of circle="+(pi*r*r));
	}
}

class q2
{
	public static void main(String arg[])
	{
		triangle q=new triangle();
		q.area();

		rectangle r=new rectangle();
		r.area();

		circle c=new circle();
		c.area();	
	}
	
}