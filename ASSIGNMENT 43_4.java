
import java.util.*;

class StringDemo
{
	
	public boolean ChkVowel(String str)
	{
		int flag = 0;
		char arr[] = str.toCharArray();
		for(int i = 0; i< arr.length; i++)
		{
			if ((arr[i]=='A')||(arr[i]=='E')||(arr[i]=='I')||(arr[i]=='O')||(arr[i]=='U')||(arr[i]=='a')||(arr[i]=='e')||(arr[i]=='i')||(arr[i]=='o')||(arr[i]=='u'))
			{
				flag = 1;
				break;

			}
		}
		if (flag == 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

}

class ASSIGNMENT 43_4
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Please enter string");
		
		String str = sobj.nextLine();

		StringDemo obj = new StringDemo();
		boolean ret = obj.ChkVowel(str);
		if (ret == true)
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");	
		}
		
	}
}