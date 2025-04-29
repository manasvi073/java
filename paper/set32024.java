class set32024
{
	int id;
	String name;

	set32024(int i,String n)
	{
		id=i;
		name=n;
	}

	set32024(set32024 c1)
	{
		id=c1.id;
		name=c1.name;
	}

	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String arg[]) 
	{
		set32024 obj=new set32024(1,"manasvi");
		set32024 obj1=new set32024(obj);
		obj.display();
		obj1.display();	
	}
}