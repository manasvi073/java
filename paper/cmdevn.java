class cmdevn
{
	public static void main(String arg[])
	{
		int i,a,b;
		
		a=Integer.parseInt(arg[0]);
		b=Integer.parseInt(arg[1]);

		for(i=a;i<=b;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}

		for(i=a;i<=b;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
		
	}
}