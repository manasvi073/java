class a extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.println(" "+i);
			}
		}
	}
}
class b extends Thread
{
	public void run()
	{
		for(char i=65;i<=91;i++)
		{
			System.out.print(" "+i);
		}
	}
}
class setc2
{
	public static void main(String arg[])
	{
		a a1=new a();
		a1.start();

		b b1=new b();
		b1.start();
	}
}