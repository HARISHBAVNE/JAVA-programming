import java.util.*;
class Number
{
	public boolean Check(int Arr[], int iNo)
	{
		int ret = 0;
		for (int i = 0;i<Arr.length;i++)
		{
			if (iNo == Arr[i])
			{
				ret = 1;
				break;
			}
		}
		if (ret == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class ASSIGNMENT 46_1
{
	public static void main(String arg[]) 
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter a number of Element");
		int iSize = sobj.nextInt();

		int Arr[] = new int[iSize];
		for (int i = 0;i<iSize;i++)
		{
			Arr[i] = sobj.nextInt();
		}
			
		System.out.println("Enter a number");
		int No = sobj.nextInt();

		Number obj = new Number();
		boolean Ret = obj.Check(Arr,No);
		if (Ret == true)
		{
			System.out.println("No is present.");
		}
		else
		{
			System.out.println("No is not present.");
		}

	}
}