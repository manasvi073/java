class seqmain
{
	public static void main(String arg[])
	{
		int n=5;

		int  Number[]=new int[n];

		Number[0]=2;

		for (int i=1;i<n;i++)
		{
			Number[i]=Number[i-1] * Number[i-1] + i;
		}

		for(int x : Number)
		{
			System.out.print("  "+x);
		}
	}
}


