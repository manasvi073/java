class a implements Runnable
{
	int i;
	public void run()
	{
		for(i=1;i*i<=50;i++)
		{
			System.out.print(" "+(i*i));
		}
	}
}
class b implements Runnable
{
	int a=0;
	int b=1;
	int c=a+b;
	public void run()
	{
		System.out.print(" "+b);
		for(c=1;c<=50;c++)
		{
			System.out.print(" "+c);
			a=b;
			b=c;
			c=a+b;
		}
	}
}
class sequance1
{
	public static void main(String arg[])
	{
		Thread t=new Thread(new a());
		t.start();

		Thread t1=new Thread(new b());
		t1.start();
	}
}