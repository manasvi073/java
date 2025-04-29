package allowance;
import java.util.*;
import info.*;
public class emp_allow implements emp
{
	int sal,ta,da,hra,net_sal;
	@Override
	public void cal()
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("enter sal=");
		sal=sc.nextInt();

		ta=sal*10/100;
		da=sal*15/100;
		hra=sal*2/100;

		net_sal=ta+da+hra;
	}
}