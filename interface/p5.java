class StringIndexOutOfBoundsException extends Exception
{
	public StringIndexOutOfBoundsException(String msg)
	{
		super(msg);
	}
}

class p5
{
	public static void main(String arg[])
	{
		String str="adarsh";
		try
		{
			

			if(str.length()<10)
			{
				throw new StringIndexOutOfBoundsException("string is less than 10");
			}
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Error : "+e.getMessage());
		}
	}
}