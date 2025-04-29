import java.util.*;
class no
{
	public static void main(String arg[])
	{
		int i;
		int no;

		Scanner sc=new Scanner(System.in);

		System.out.print("enter no=");
		no=sc.nextInt();

		int a=1;
		for(i=1;i<=no;i++)
		{

			for(int j=1;j<=i;j++)
			{
				System.out.print(a+" ");
				a++;
			}
			System.out.println(" ");
		}
	}
}
