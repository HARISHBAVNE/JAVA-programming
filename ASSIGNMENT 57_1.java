import java.util.*;

class Pattern
{
	public void PatternX(int iRow,int iCol)
	{
		
		for (int i = iRow-1;i>=0;i--)
		{
			for(int j =0;j<iCol;j++)
			{
				if (i == j)
				{
					System.out.print("#\t");
				}
				else
				{
					System.out.print("*\t");	
				}
			}
			System.out.println();
		}
	}
}


class ASSIGNMENT 57_1
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter a Number of Rows");
		int iRow = sobj.nextInt();
		System.out.println("Enter a Number of Columns");
		int iCol = sobj.nextInt();

		Pattern obj = new Pattern();
		obj.PatternX(iRow,iCol);
		
	}
}