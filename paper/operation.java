package arithdis;
import arith.*;
public class operation extends arithget
{
	public void dis()
	{
		c=no1+no2;
		System.out.println("Addition="+c);

		c=no1-no2;
		System.out.println("subtaction="+c);

		c=no1*no2;
		System.out.println("multiplication="+c);

		if(no2!=0)
		{
			c=no1/no2;
			System.out.println("division="+c);
		}
		else
		{
			System.out.print("division not divide buy zero");
		}
		
	}
	public static void main(String arg[])
	{
		operation o=new operation();
		o.dish();
		o.dis();
	}

}	
