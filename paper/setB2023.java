/*import java.util.*;
interface fourw
{
	String brand="brand";
	int modelno=0;
	String modelnm="mnm";
	double price=0.0;
}
interface twow
{
	String brand="brand";
	int modelno=0;
	String modelnm="mnm";
	double price=0.0;
}
class cust implements fourw,twow
{
	String cnm;
	String city;

	cust(String n,String c)
	{
		cnm=n;
		city=c;
	}

	void purchase(fourw pro)
	{
		System.out.println("four wheel="+pro.brand+" "+pro.modelnm);
	}

	void purchase(twow pro)
	{
		System.out.println("four wheel="+pro.brand+" "+pro.modelnm);
	}

	void cal(double totalprice)
	{
		System.out.println("total bill amt=$"+totalprice);	
	}

	/*int sum;
	void purchase()
	{
		for(int i=1;i<=2;i++)
		{
			Scanner sc=new Scanner(System.in);

			System.out.print("enter name=");
			cnm=sc.next();

			System.out.print("enter city=");
			city=sc.next();


			System.out.print("enter brand=");
			brand=sc.next();


			System.out.print("enter model  no=");
			modelno=sc.nextInt();

			System.out.print("enter model name=");
			modelnm=sc.next();

			System.out.print("enter model price=");
			price=sc.nextInt();


			System.out.println("cust name="+cnm);
			System.out.println("cust city="+city);
			System.out.println("brand="+brand);
			System.out.println("model no="+modelno);
			System.out.println("model name="+modelnm);
			System.out.println("price="+price);

			sum=price+sum;
			System.out.println("total bill="+sum);

		}
	}



	/*void cal()
	{
		for(int i=1;i<=2;i++)
		{
			System.out.println("cust name="+cnm);
			System.out.println("cust city="+city);
			System.out.println("brand="+brand);
			System.out.println("model no="+modelno);
			System.out.println("model name="+modelnm);

			sum=sum+price;
			System.out.println("total bill="+sum);

		}	
	}

class setB2023
{
	public static void main(String arg[])
	{
		cust c=new cust("aaa","sgf");
		c.purchase();

		fourw fourwpro=new fourw();
		{
			String brand="toyota";
			int modelno=12345;
			String modelnm="camry";
			float price=29000.0;
		}

		cust.purchase(fourwpro);

		twow twowpro=new twow();
		{
			String brand="honda";
			int modelno=12345;
			String modelnm="afdxf";
			float price=14000.0;
		}
		cust.purchase(twowpro);

		cust.cal(totalprice);
		//c.cal();
	}
}*/




interface FourWheel {
    String brand = "Brand";
    int modelNumber = 0;
    String modelName = "Model Name";
    double price = 0.0;
}

interface TwoWheel {
    String brand = "Brand";
    int modelNumber = 0;
    String modelName = "Model Name";
    double price = 0.0;
}

class Customer implements FourWheel, TwoWheel {
    String name;
    String address;
    
    Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    void purchase(FourWheel product) {
        System.out.println("Purchased Four-Wheel: " + product.brand + " " + product.modelName);
    }
    
    void purchase(TwoWheel product) {
        System.out.println("Purchased Two-Wheel: " + product.brand + " " + product.modelName);
    }
    
    void calculate(double totalPrice) {
        System.out.println("Total bill amount: $" + totalPrice);
    }
}

public class setB2023 {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe", "123 Main St");

        // Example purchase of a four-wheel product
        FourWheel fourWheelProduct = new FourWheel() {
            // Implement interface members
            String brand = "Toyota";
            int modelNumber = 1234;
            String modelName = "Camry";
            double price = 25000.0;
        };
        customer.purchase(fourWheelProduct);

        // Example purchase of a two-wheel product
        TwoWheel twoWheelProduct = new TwoWheel() {
            // Implement interface members
            String brand = "Honda";
            int modelNumber = 5678;
            String modelName = "CBR500R";
            double price = 7000.0;
        };
        customer.purchase(twoWheelProduct);

        // Calculate total bill amount
        double totalPrice = fourWheelProduct.price + twoWheelProduct.price;
        customer.calculate(totalPrice);
    }
}