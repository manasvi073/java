package info;
import java.util.*;
interface emp
{
	void cal();
}
public class setd1
{
	String name;
	int id,sal;
	//@Override
	public void cal()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter id=");
		id=sc.nextInt();

		System.out.println("enter name=");
		name=sc.next();

		System.out.println("enter sal=");
		sal=sc.nextInt();

	}
}