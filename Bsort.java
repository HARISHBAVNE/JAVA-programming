import java.lang.*;
import java.util.*;

class Sort
{
	int arr[];
	public Sort(int iSize)
	{
		arr = new int[iSize];
	}
	public void arr()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter a elements.");
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print("Element "+(i+1)+":");
			arr[i] = sobj.nextInt();
		}
	}
	public void Sorting()
	{
		int n = arr.length;
		for (int i = 0;i<n;i++)
		{
			int flag = 0;
			for (int j = 0;j<n-i-1;j++)
			{
				int temp = 0;
				if (arr[j]>arr[j+1])
				{
					flag = 1;
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp; 
				}
			}
			if (flag == 0)
			{
				break;
			}
		}
	}
	public void Display()
	{
		System.out.println("Array elements.");
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();		
	}

}

class Bsort
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int iSize = 0;
		System.out.print("Enter size of array:");
		iSize = sobj.nextInt();

		Sort obj = new Sort(iSize);
		obj.arr();
		System.out.println("Array Before sorting.");
		obj.Display();
		obj.Sorting();
		System.out.println("Array after sorting.");
		obj.Display();
	}
}
