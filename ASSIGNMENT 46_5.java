import java.util.*;
class Number
{
	public int Product(int Arr[])
	{
		int iMultOdd = 1;
		int iMult = 0;
		for (int i = 0;i<Arr.length;i++)
		{
			if ((Arr[i]%2)!=0)
			{
				iMultOdd = iMultOdd * Arr[i];
			}
		}
		if (iMultOdd == 1)
		{
			return iMult ;
		}
		else
		{
			return iMultOdd;
		}
	}
}

class ASSIGNMENT 46_5
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

		Number obj = new Number();
		int Ret = obj.Product(Arr);
		System.out.println("product of all odd elements is:"+Ret);

	}
}