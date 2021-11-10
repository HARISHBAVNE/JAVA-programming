import java.util.*;
class Number
{
	public void Display(int Arr[], int iStart,int iEnd)
	{
		
		for (int i = 0;i<Arr.length;i++)
		{
			if ((Arr[i]>iStart)&&(Arr[i]<iEnd))
			{
				System.out.print(Arr[i]+"  ");
			}
		}
		
	}
}

class ASSIGNMENT 46_4
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
			
		System.out.println("Enter a Start range");
		int No1 = sobj.nextInt();
		System.out.println("Enter a End range");
		int No2 = sobj.nextInt();

		Number obj = new Number();
		obj.Display(Arr,No1,No2);
		

	}
}