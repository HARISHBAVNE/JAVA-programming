import java.lang.*;
import java.util.*;
class Pattern
{
	public void Display(int no)
	{
		for(int i = 1;i<(no*2)+1;i++)
		{
			
			if (i%2 == 0)
			{
				System.out.print(i+"\t");
			}
		}
	}
}

class Even
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
