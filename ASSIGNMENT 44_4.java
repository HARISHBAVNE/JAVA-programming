
import java.util.*;
class ArrayDemo
{
	public void Display(int Arr[])
	{
		
		System.out.println("Elements divisible by 5 and 3 are");
		for (int i = 0;i<Arr.length;i++)
		{
			
			if (((Arr[i]%5)==0)&&((Arr[i]%3)==0))
			{
				System.out.print(Arr[i]+" ");
			}
			
		}
	}
}


class ASSIGNMENT 44_4
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
		obj.Display(Arr);
			
	}
}