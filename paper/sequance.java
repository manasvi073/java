class a extends Thread
{
	int i;
	public void run()
	{
		for(i=1;i<=50;i++)
		{
			System.out.print(" "+i*i);
		}
	}
}
class b extends Thread
{
	int i,a=0,b=1,c=0;
	public void run()
	{
		for(i=1;i<=10;i++)
		{
			a=b;
			b=c;
			c=a+b;
			
			System.out.print(" "+c);
		}
	}
}
class sequance
{
	public static void main(String arg[])
	{
		Thread t=new Thread(new a());
		Thread t1=new Thread(new b());
		//a t=new a();
		t.start();

		t1.start();
	}
}