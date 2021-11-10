import java.util.*;

class StringDemo
{
	public boolean StrCmpX(String src, String dest)
	{
		String temp1 = src.trim().replaceAll("[ ]{2,}"," ");
		String temp2 = dest.trim().replaceAll("[ ]{2,}"," ");
		char[] Arr2 = temp2.toCharArray();
		char[] Arr1 = temp1.toCharArray();
		int iCnt = 0;
		if (temp1.length()!=temp2.length())
		{
			return false;
		}
		else
		{
			for (int i=0;i<Arr1.length;i++)
			{
				if (Arr1[i]==Arr2[i])
				{
					iCnt ++;
				}

			}
			if (iCnt == Arr1.length)
			{
				return true;
			}
			else
			{
				return false;
			}
		}

	}
}


class P2
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter First string:");
		
		String str1 = sobj.nextLine();

		System.out.println("Enter Second string:");
		
		String str2 = sobj.nextLine();

		System.out.println("Enter a number:");


		StringDemo obj = new StringDemo();
		boolean Ret =obj.StrCmpX(str1,str2);

		System.out.println(Ret);
	}
}