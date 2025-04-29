/*class demo implements Runnable
{
	public void run()
	{
		char i=65;

		for(char i=65;i<=0;i++)
	
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.print("interapted...");
			}
		}
	}
}
class seta1
{
	public static void main(String arg[])
	{
		Thread demo=new Thread(new demo());
		//Thread demo1=new Thread(new demo());
		//Thread demo2=new Thread(new demo());
		demo.start();
		//demo1.start();
		//demo2.start();
	}
}*/


class printThread implements Runnable
{
	String msg;
	int time;

	printThread(String m,int t)
	{
		msg=m;
		time=t;
	}

	public void run()
	{
		for(int i=0;i<time;i++)
		{
			System.out.print(" "+msg);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.print(e.getMessage());
				//e.printStackTrace();
			}
		}
	}
}

class seta1
{
	public static void main(String arg[])
	{
		Thread t1=new Thread(new printThread("A",20));
		Thread t2=new Thread(new printThread("B",20));

		t1.start();
		t2.start();

	}
}