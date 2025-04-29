import java.util.*;
class a1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.print(" "+i);
		}
	}
}
class b1 extends Thread
{
	public void run()
	{
		for(char i='A';i<='H';i++)
		{
			System.out.print(" "+i);	
		}
	}
}

class p10
{
	public static void main(String arg[])
	{
		a1 a=new a1();
		b1 b=new b1();
		a.start();
		b.start();

	}
}