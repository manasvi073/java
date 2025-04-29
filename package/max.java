package tybca;
import java.util.*;
public class max extends math
{
	public int a,b;
	public void m1()
	{

		Scanner sc=new Scanner(System.in);

		System.out.print("enter a=");
		a=sc.nextInt();

		System.out.print("enter b=");
		b=sc.nextInt();


		if(a>b)
		{
			System.out.println("a is grater");
		}
		else
		{
			System.out.println("b is grater");
		}
	}
}