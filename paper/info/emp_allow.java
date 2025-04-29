package info;
import java.util.*;
//import info.*;
public class emp_allow extends setd1
{
	int ta,da,hra,net_sal;
	@Override
	public void get()
	{
		/*Scanner sc=new Scanner(System.in);

		System.out.print("enter sal=");
		sal=sc.nextInt();
*/
		ta=sal*10/100;
		da=sal*15/100;
		hra=sal*2/100;

		net_sal=ta+da+hra;
	}
}