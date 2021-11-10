import java.util.*;

class Matrix
{
	public int AddDiagonal(int Arr[][], int iRow, int iCol)
	{
		int iSum = 0;
		for (int i = 0;i<Arr.length;i++)
		{
			for (int j = 0;j<Arr[i].length;j++)
			{
				if (i == j)
				{
					iSum = iSum+Arr[i][i];
				}
			}
			
		}
		return iSum;
	}
}


class A1
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
		int Ret = obj.AddDiagonal(Arr,iRow,iCol);
		System.out.println("Addition of Digonal Elements is:"+Ret);
	}
}