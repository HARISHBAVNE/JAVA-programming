
import java.util.*;

class StringDemo
{
	int iCnt1 = 0;
	int iCnt2 = 0;
	int Diff = 0;
	public int CountDiff(String str)
	{
		char arr[] = str.toCharArray();
		for(int i = 0; i< arr.length; i++)
		{
			if ((arr[i]>='a')&&(arr[i]<='z'))
			{
				iCnt1 ++;
			}

			else if ((arr[i]>='A')&&(arr[i]<='Z'))
			{
				iCnt2 ++;
			}
		}
		Diff = (iCnt1-iCnt2);
		return Diff;
	}

}

class ASSIGNMENT 43_3
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Please enter string");
		
		String str = sobj.nextLine();

		StringDemo obj = new StringDemo();
		int ret = obj.CountDiff(str);
		System.out.println("Difference of capital and small letter is:"+ret);		
	}
}