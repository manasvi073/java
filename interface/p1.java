interface addsub
{
	void add(int a,int b);
	void sub(int a,int b);
}

interface muldiv extends addsub
{
	void mul(int a,int b);
	void div(int a,int b);
}

class arith implements muldiv
{
	public void add(int a,int b)
	{
		System.out.println("addition="+(a+b));
	}
	public void sub(int a,int b)
	{
		System.out.println("subtraction="+(a-b));
	}

	public void mul(int a,int b)
	{
		System.out.println("multiplication="+(a*b));
	}

	public void div(int a,int b)
	{
		System.out.println("divison="+(a/b));
	}
}

class p1
{
	public static void main(String arg[])
	{
		arith a=new arith();
		a.add(10,20);
		a.sub(10,20);
		a.mul(10,20);
		a.div(10,20);


	}
}