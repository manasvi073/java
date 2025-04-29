package tybca;
import java.util.*;
public class math
{
	int n1,n2;
	float n3,n4,n5;

	public void add()

	{		
		Scanner sc=new Scanner(System.in);

		System.out.print("enter no1=");
		n1=sc.nextInt();

		System.out.print("enter no2=");
		n2=sc.nextInt();

		System.out.println("sum="+(n1+n2));
	}

	public void add1()
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("enter no3=");
		n3=sc.nextFloat();

		System.out.print("enter no4=");
		n4=sc.nextFloat();

		System.out.print("enter no5=");
		n5=sc.nextFloat();

		System.out.println("SUM="+(n3+n4+n5));
	}
}