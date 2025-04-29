package stdinfo;
import java.util.*;
interface emp 
{
	void cal();	
}
public class employee implements emp
{
	public String name;
	public int id,sal;
	
	public void cal()
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("enter name=");
		name=sc.next();
	}
	public static void main(String arg[])
	{

	}
}