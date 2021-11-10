import java.lang.*;
import java.util.*;

class AgeInvalid extends Exception
{
	public AgeInvalid(String str)
	{
		super(str);
	}
}


class Exception2
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter your age:");
		int Age = sobj.nextInt();
		try
		{
			if (Age<18)
			{
				throw new AgeInvalid("Your age is less than 18.");
			}

		}
		catch (AgeInvalid obj)
		{
			System.out.println("Exception occurred:"+obj);
		}
		finally
		{
			System.out.println("End of main");
		}
	}
}