import java.util.*;

class Pattern
{
	public void PatternX(String str)
	{
		int iRow = str.length();
		int iCol = str.length();
		char [] str1 = str.toCharArray();
		for (int i = 0;i<iRow;i++)
		{
			for(int j =0;j<iCol;j++)
			{
				if (j<=i)
				{
					System.out.print(str1[j]+"\t");
				}
				else 
				{
					System.out.print("#"+"\t");	
				}
			}
			System.out.println();
		}
	}
}


class ASSIGNMENT 56_3
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sobj.nextLine();

		Pattern obj = new Pattern();
		obj.PatternX(str);
		
	}
}