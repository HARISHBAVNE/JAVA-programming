
import java.util.*;

class StringDemo
{
	int iCnt = 0;
	public int CountSmall(String str)
	{
		char arr[] = str.toCharArray();
		for(int i = 0; i< arr.length; i++)
		{
			if ((arr[i]>='a')&&(arr[i]<='z'))
			{
				iCnt ++;
			}
		}
		return iCnt;
	}

}

class ASSIGNMENT 43_2
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Please enter string");
		
		String str = sobj.nextLine();

		StringDemo obj = new StringDemo();
		int ret = obj.CountSmall(str);
		System.out.println("Small letter count is:"+ret);		
	}
}