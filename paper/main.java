class a1 implements Runnable
{
    public void run() 
    {
        int a = 0;
        int b = 1;
        int c = a + b;

        System.out.println(b); // print the first Fibonacci number
        while (c <= 50) 
        {
            System.out.println(c);
            a = b;
            b = c;
            c = a + b;
            try 
            {
                Thread.sleep(100); // Just to slow down the output
            } 
            catch (InterruptedException e) 
            {
                System.out.println("Fibonacci sequence thread interrupted");
            }
        }
    }
}

class b1 implements Runnable 
{
    public void run() 
    {
        for (int i = 1; i*i <= 1000; i++) 
        {
            System.out.println(i*i);
            try 
            {
                Thread.sleep(100); // Just to slow down the output
            }
            catch (InterruptedException e) 
            {
                System.out.println("Square sequence thread interrupted");
            }
        }
    }
}
class main
{
	public static void main(String arg[])
	{
		Thread a1= new Thread(new a1());
        Thread b1= new Thread(new b1());
		a1.start();
		b1.start();
	}
}