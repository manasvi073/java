class sss
{
		int i,no;
		Scanner sc=new Scanner(System.in);
		String arr[][]=new String[5][5];

		void input()
		{
			System.out.print("how many record enter=");
			no=sc.nextInt();

			for(i=1;i<=no;i++)
			{
				System.out.print("enter id=");	
				arr[i][0]=sc.next();

				if((arr[i][1] || arr[i][2] || arr[i][3])>0)or((arr[i][1] || arr[i][2] || arr[i][3])<100)
				{
					System.out.print("enter m1=");	
				arr[i][1]=sc.next();

				System.out.print("enter m2=");	
				arr[i][2]=sc.next();

				System.out.print("enter m3=");	
				arr[i][3]=sc.next();
				}
				
			}
			
		}
}
class std
{
	public static void main(String arg[])
	{
		sss s1=new sss();
		s1.input();
	}
}
