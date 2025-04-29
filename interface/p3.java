interface A
{
	void dish();
	void a1();
}

interface B
{
	void dish();
	void b1();
}

class c implements A,B
{
	public void dish()
	{
		System.out.println("interface dish method");
	}

	public void a1()
	{
		System.out.println("interface A method");
	}

	public void b1()
	{
		System.out.println("interface B method");
	}
}

class p3
{
	public static void main(String[] args) 
	{
		c c1=new c();
		c1.dish();
		c1.a1();
		c1.b1();	
	}
}