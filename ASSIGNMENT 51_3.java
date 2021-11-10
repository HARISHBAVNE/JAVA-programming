import java.util.*;

class Matrix
{
	public int Maximum(int Arr[][], int iRow, int iCol)
	{
		int iCnt2 = 0;
		int iCnt1 = 0;
		int TCol = iCol-1;
		
		
		for (int i =0;i<Arr.length;i++)
		{
			for (int j = 0;j<Arr[i].length;j++)
			{
				if (i == j)
				{
					if (Arr[i][j]>iCnt1)
					{
						iCnt1 = Arr[i][j];
					}
				}
			}
			
		}
		for (int i =0;i<Arr.length;i++)
		{
			for (int j = 0;j<Arr[i].length;j++)
			{
				if (j == TCol)
				{
					if (Arr[i][j]>iCnt2)
					{
						iCnt2 = Arr[i][j];
					}
				}
			}
			TCol --;
			
		}
		
		if (iCnt1>iCnt2)
		{
			return iCnt1;
		}
		else
		{
			return iCnt2;
		}
	}
}


class A3
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
		int Ret = obj.Maximum(Arr,iRow,iCol);
		System.out.println("Maximum number from both digonal is:"+Ret);
	}
}