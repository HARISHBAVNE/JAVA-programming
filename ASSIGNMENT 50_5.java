import java.util.*;


class Pattern
{
	public void Display(int iRow, int iCol)
	{
		int no = 1;
		for(int i = 1; i<=iRow; i++)
		{
			for(int j = 1; j<=iCol; j++)
			{
				System.out.print(no+"\t");
				no ++;	
			}
			
			System.out.println();
		}
	}
}

class ASSIGNMENT 50_5
{
	public static void main(String arg[])
	{
		int no1,no2;
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter number of rows");
		no1 = sobj.nextInt();
		
		System.out.println("Enter number of columns");
		no2 = sobj.nextInt();
		
		Pattern pobj = new Pattern();
		pobj.Display(no1,no2);
	}
}