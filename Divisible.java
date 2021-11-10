import java.lang.*;
import java.util.*;

class Div
{
	public boolean Check(int No)
	{
		if ((No%5)==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
class Divisible
{
	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter a number:");
		int No = sobj.nextInt();

		Div obj = new Div();
		boolean ret = obj.Check(No);
		if (ret == true)
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");
		}

	}
}