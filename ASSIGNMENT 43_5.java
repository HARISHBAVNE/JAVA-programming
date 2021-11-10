
import java.util.*;

class StringDemo
{
	
	public void Reverse(String str)
	{
		int flag = 0;
		char arr[] = str.toCharArray();
		String rev = "";
		for (int i = arr.length-1;i>=0;i--)
		{
			rev = rev + arr[i];
		}
		System.out.println(rev);
	}

}

class ASSIGNMENT 43_5
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Please enter string");
		
		String str = sobj.nextLine();

		StringDemo obj = new StringDemo();
		obj.Reverse(str);
		
		
	}
}