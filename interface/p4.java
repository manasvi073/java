class p
{
	void p1()
	{
		System.out.println("class p method....");
	}
}

interface q
{
	void q1();
}

interface r
{
	void r1();
}

class s extends p implements q,r
{
	public void q1()
	{
		System.out.println("interface q method");
	}

	public void r1()
	{
		System.out.println("interface r method");
	}
}

class p4 
{
	public static void main(String arg[])
	{
		s s1=new s();
		//s1.display();
		s1.p1();
		s1.q1();
		s1.r1();
	}
}