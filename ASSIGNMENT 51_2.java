import java.util.*;

class Matrix
{
	public int Frequency(int Arr[][], int iRow, int iCol,int No)
	{
		int iCnt = 0;
		for (int i = 0;i<Arr.length;i++)
		{
			for (int j = 0;j<Arr[i].length;j++)
			{
				if (Arr[i][j]==No)
				{
					iCnt ++;
				}
			}
			
		}
		return iCnt;
	}
}


class A2
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
		System.out.println("Enter a Number");
		int No = sobj.nextInt();
		Matrix obj = new Matrix();
		int Ret = obj.Frequency(Arr,iRow,iCol,No);
		System.out.println("Frequency of number is:"+Ret);
	}
}