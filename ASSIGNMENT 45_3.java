import java.util.*;

class Digit
{
	public int CountRange(int iNo)
		{
			int iCnt = 0;
			if(iNo < 0)
			{
				iNo = -iNo;
			}
			
			while(iNo > 0)
			{

				if (((iNo%10)>3)&&((iNo%10)<7))
				{
					iCnt ++;
				}
				iNo = iNo/10;
			}
			return iCnt;
		}
}


class ASSIGNMENT 45_3
{
	public static void main(String arg[]) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number");
		int No = obj.nextInt();

		Digit dobj = new Digit();
		int Ret = dobj.CountRange(No);
		System.out.println("Digits in between 3 and 7:"+Ret);

	}
}