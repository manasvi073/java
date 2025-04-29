class a extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.print(" "+i);
		}
	}
}
class b implements Runnable
{
	public void run()
	{
		for(int i=1;i*i<=100;i++)
		{
			System.out.print(" "+(i*i));
		}
	}
}
class setd2
{
	public static void main(String arg[])
	{
		a a1=new a();
		a1.start();

		Thread b=new Thread(new b());
		b.start();
	}
}