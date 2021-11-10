import java.util.*;

class Pattern
{
	public void PatternX(int iRow, int iCol)
	{
		
		for (int i = 1;i<iRow+1;i++)
		{
			char ch = 'A';
			for (int j = 1;j<iCol+1;j++)
			{
				if ((i%2)==0)
				{
					
					System.out.print((char)(ch+32)+"\t");
					ch ++;
				}
				else
				{
					System.out.print(ch+"\t");
					ch ++;
				}
			}
			System.out.println();
			ch = 'A';
		}
	}
}


class ASSIGNMENT 53_2

{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Number of Rows");
		int iRow = sobj.nextInt();
		System.out.println("Enter Number of Columns");
		int iCol = sobj.nextInt();

		Pattern obj = new Pattern();
		obj.PatternX(iRow,iCol);
		
	}
}