import java.lang.*;
import java.util.*;
class ChkSum
{
	public void EvenOdd(int no)
	{
		if ((no%2) == 0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
	}
}

class ASSIGNMENT1
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int Value = 0;
		System.out.println("Enter a number:");
		Value = sobj.nextInt();
		ChkSum obj = new ChkSum();
		obj.EvenOdd(Value);
	}
}
