import java.util.*;

class StringDemo
{
	public String StrNCatX(String src, String dest,int no)
	{
		String temp1 = src.trim().replaceAll("[ ]{2,}"," ");
		String temp2 = dest.trim().replaceAll("[ ]{2,}"," ");
		char[] Arr2 = temp2.toCharArray();
		
		for (int i = 0;i<Arr2.length;i++)
		{
			if (no !=0)
			{
				temp1 = temp1+Arr2[i];
				no --;
			}
		}
		return temp1;

	}
}


class ASSIGNMENT 49_1
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter First string:");
		
		String str1 = sobj.nextLine();

		System.out.println("Enter Second string:");
		
		String str2 = sobj.nextLine();

		System.out.println("Enter a number:");
		int no = sobj.nextInt();

		StringDemo obj = new StringDemo();
		String Ret = obj.StrNCatX(str1,str2,no);

		System.out.println(Ret);
	}
}