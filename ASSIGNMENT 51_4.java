import java.util.*;

class Matrix
{
	public void AddColumn(int Arr[][], int iRow, int iCol)
	{
		int iSum = 0;
		System.out.println("addition of elements From each column.");
		for (int j = 0;j<iCol;j++)
		{
			for(int i = 0;i<iRow;i++)
			{
				
				{
					iSum = iSum+Arr[i][j];
				}
				
			}
			System.out.print(iSum+" ");
			iSum = 0;
			
		}
	}
}


class A4
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Number of Rows");
		int iRow = sobj.nextInt();
		System.out.println("Enter Number of Columns");
		int iCol = sobj.nextInt();

		int Arr[][] = new int[iRow][iCol];

		System.out.println("Enter Elements");
		for (int i = 0;i<Arr.length;i++)
		{
			for (int j = 0;j<Arr[i].length;j++)
			{
				Arr[i][j] = sobj.nextInt();

			}
		}

		for (int i = 0;i<Arr.length;i++)
		{
			for (int j = 0;j<Arr[i].length;j++)
			{
				System.out.print(Arr[i][j]+"\t");

			}
			System.out.println();
		}
		
		Matrix obj = new Matrix();
		obj.AddColumn(Arr,iRow,iCol);
		
	}
}