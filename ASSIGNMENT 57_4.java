import java.util.*;

class Pattern
{
	public void PatternX(int iRow,int iCol)
	{
		
		for (int i = iRow;i>0;i--)
		{
			for(int j =1;j<iCol+1;j++)
			{
				if ((i==iRow)||(j==iCol)||(i==1)||(j==1))
				{
					System.out.print("*\t");		
				}
				else if(i==j)
				{
					System.out.print("*\t");
				}
				else if (j<i)
				{
					System.out.print("#\t");
				}
				else if (j>i)
				{
					System.out.print("$\t");	
				}
			}
			System.out.println();
		}
	}
}


class ASSIGNMENT 57_4
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