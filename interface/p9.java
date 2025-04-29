import java.util.*;
class a extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=50;i++)
			{
				if(i%2==0)
				{
					System.out.println("division by 2="+i);
					Thread.sleep(1000);
				}
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}
class b extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=50;i++)
			{
				if(i%5==0)
				{
					System.out.println("division by 5="+i);
					Thread.sleep(1000);
				}
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}

class p9
{
	public static void main(String arg[])
	{
		a a1=new a();
		b b1=new b();
		a1.start();
		b1.start();

	}
}