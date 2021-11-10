import java.lang.*;
import java.util.*;
class Pattern
{
	public void Display(int no)
	{
		int iDigit = 0;
		while(no!=0)
		{
			iDigit = no%10;
			System.out.print(iDigit+" ");
			no = no/10;
		}
	}
}

class Digit
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int Value = 0;
		System.out.println("Enter a number:");
		Value = sobj.nextInt();
		Pattern obj = new Pattern();
		obj.Display(Value);
	}
}
