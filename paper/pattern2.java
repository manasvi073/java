//import java.util.*;
class pattern2
{
	public static void main(String arg[])
	{
		for(char i=65;i<=69;i++)
		{
			for(char k=69;k>=i-1;k--)
			{
				System.out.print(" ");
			}
			for(char j=65;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}
}