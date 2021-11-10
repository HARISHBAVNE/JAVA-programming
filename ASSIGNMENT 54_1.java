import java.util.*;

class Pattern
{
	public void PatternX(int iRow, int iCol)
	{
		for (int i = 0;i<iRow;i++)
		{
			for(int j = 0;j<iCol;j++)
			{
				System.out.print("*\t");
			}
			System.out.println();
		}
	}
}


class ASSIGNMENT 54_1
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