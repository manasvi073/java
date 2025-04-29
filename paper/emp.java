import java.util.*;
class setc1
{	

	int eno,sal,hra,da,pf,net_sal;
	String ename;
	void allow()
	{		
		Scanner sc=new Scanner(System.in);

		System.out.print("enter emp no=");
		eno=sc.nextInt();

		System.out.print("enter emp name=");
		ename=sc.next();

		System.out.print("enter basic sal=");
		sal=sc.nextInt();

		hra=sal*12/100;
		da=sal*80/100;
		pf=sal*10/100;
		
	}
	void process()
	{
		net_sal=hra+da-pf;
	}
	void dish()
	{
		System.out.println("eno="+eno);
		System.out.println("ename="+ename);
		System.out.println("basic_sal="+sal);
		System.out.println("HRA="+hra);
		System.out.println("DA="+da);
		System.out.println("PF="+pf);
		System.out.println("net_sal="+net_sal);
	}
}
class emp
{

	public static void main(String arg[])
	{
		setc1 obj=new setc1();
		obj.allow();
		obj.process();
		obj.dish();
	}
}