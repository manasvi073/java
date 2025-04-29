import java.util.*;
class p1
{
	int i, no;
	Scanner sc=new Scanner(System.in);

	String arr[][]=new String[10][10];

	void get()
	{
		System.out.print("how many record you want to enter=");
		no=sc.nextInt();

		for(i=0;i<no;i++)
		{
			System.out.print("enter pro_id=");
			arr[i][0]=sc.next();

			System.out.print("enter name=");
			arr[i][1]=sc.next();


			System.out.print("enter price=");
			arr[i][2]=sc.next();


			System.out.print("enter quantity=");
			arr[i][3]=sc.next();

		}
	}
	void purchase()
	{
		for(i=0;i<no;i++)
		{
			//System.out.println("id="+arr[i][0]);
			System.out.println("name="+arr[i][1]);
			System.out.println("quantity="+arr[i][3]);
		}
	}
	/*void cal()
	{
		for(i=0;i<no;i++)
		{
			//String a=(arr[i][2]+arr[i][3]);
			System.out.println((arr[i][2]-arr[i][3]) +" = total bill");
		}
	}*/

	void cal()
	{
        for (int i = 0; i < no; i++) 
        {
            try 
            {
            
                int price = Integer.parseInt(arr[i][2]);
                int quantity = Integer.parseInt(arr[i][3]);
            
                int total = price * quantity; // Assuming you want to multiply price by quantity
            
                System.out.println("Total bill for " + arr[i][1] + " = " + total);
            }

            catch (Exception e) 
            {
                System.out.println("Error: Price and quantity must be numeric for " + arr[i][1]);
            }
        }
    }
}
class pro
{
	public static void main(String arg[])
	{
		p1 p=new p1();
		p.get();
		p.purchase();
		p.cal();
	}
}