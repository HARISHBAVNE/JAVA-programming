import java.util.*;

class StringDemo
{
	public boolean StrNCmpX(String src, String dest ,int iCnt)
	{
		String temp1 = src.trim().replaceAll("[ ]{2,}"," ");
		String temp2 = dest.trim().replaceAll("[ ]{2,}"," ");
		char[] Arr2 = temp2.toCharArray();
		char[] Arr1 = temp1.toCharArray();
		int check = 0;
		if ((temp1.length()<iCnt)||(temp2.length()<iCnt))
		{
			return false;
		}
		else
		{
			for(int i = 0;i<iCnt;i++)
			{
				if (Arr1[i]!=Arr2[i])
				{
					check = 1;
					break;
				}
			}
		}
		if (check==0)
		{
			return true;
		}
		else
		{
			return false;
		}

	}
}


class P3
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter First string:");
		
		String str1 = sobj.nextLine();

		System.out.println("Enter Second string:");
		
		String str2 = sobj.nextLine();

		System.out.println("Enter a number:");
		int No = sobj.nextInt();

		StringDemo obj = new StringDemo();
		boolean Ret =obj.StrNCmpX(str1,str2,No);

		System.out.println(Ret);
	}
}