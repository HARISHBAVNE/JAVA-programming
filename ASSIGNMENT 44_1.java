
import java.util.*;
class ArrayDemo
{
	public int Difference(int Arr[])
	{
		int iEven=0;
		int iOdd = 0;
		int diff = 0;
		for (int i = 0;i<Arr.length;i++)
		{
			if (((Arr[i])%2)==0)
			{
				iEven = iEven + Arr[i];
			}
			else if(((Arr[i])%2)!=0)
			{
				iOdd = iOdd + Arr[i];
			} 
		}
		diff = ((iEven)-(iOdd));
		return diff;
	}
}


class ASSIGNMENT 44_1
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Please enter number of elements:");
		int iSize = sobj.nextInt();
		int Arr[] = new int[iSize];
		for (int i = 0;i<iSize;i++)
		{
			Arr[i] = sobj.nextInt();
		}
		ArrayDemo obj = new ArrayDemo();
		int Ret = obj.Difference(Arr);
		System.out.println("Difference of Even and odd elements is:"+Ret);		
	}
}