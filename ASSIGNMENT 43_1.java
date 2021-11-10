//1.Write a Java program which accept string from user and count number of
//capital characters. Input : “Marvellous Multi OS” Output : 4
import java.util.*;

class StringDemo
{
	int iCnt = 0;
	public int CountCapital(String str)
	{
		char arr[] = str.toCharArray();
		for(int i = 0; i< arr.length; i++)
		{
			if ((arr[i]>='A')&&(arr[i]<='Z'))
			{
				iCnt ++;
			}
		}
		return iCnt;
	}

}

class ASSIGNMENT 43_1
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Please enter string");
		
		String str = sobj.nextLine();

		StringDemo obj = new StringDemo();
		int ret = obj.CountCapital(str);
		System.out.println("capital letter count is:"+ret);		
	}
}