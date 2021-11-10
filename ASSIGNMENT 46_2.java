import java.util.*;
class Number
{
	public int FirstOcc(int Arr[], int iNo)
	{
		int ret = 0;
		for (int i = 0;i<Arr.length;i++)
		{
			if (iNo == Arr[i])
			{
				ret = i;
				break;
			}
			else 
			{
				ret = (-1);
			}
		}
		return ret;
	}
}

class ASSIGNMENT 46_2
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
		int Ret = obj.FirstOcc(Arr,No);
		System.out.println("first occurrence of given No is:"+Ret);

	}
}