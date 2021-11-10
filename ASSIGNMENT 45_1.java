import java.util.*;

class Digit
{
	public int CountEven(int iNo)
		{
			int iCnt = 0;
			if (iNo < 0)
			{
				iNo = -iNo;
			}
			while(iNo > 0)
			{
				if (((iNo%10)%2==0))
				{
					iCnt ++;
				}
				iNo = iNo/10;

			}
			return iCnt;
		}
}


class ASSIGNMENT 45_1
{
	public static void main(String arg[]) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number");
		int No = obj.nextInt();

		Digit dobj = new Digit();
		int Ret = dobj.CountEven(No);
		System.out.println("Count of Even digit is:"+Ret);

	}
}