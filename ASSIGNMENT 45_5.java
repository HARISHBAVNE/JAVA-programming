import java.util.*;

class Digit
{
	public int CountDiff(int iNo)
		{
			int iDigit = 0;
			int iEven=0,iOdd = 0;
			if(iNo < 0)
			{
				iNo = -iNo;
			}
			
			while(iNo > 0)
			{

				iDigit = (iNo%10);
				if ((iDigit%2)==0)
				{
					iEven = iEven + iDigit;
				}
				else if ((iDigit%2)!=0)
				{
					iOdd = iOdd + iDigit;
				}
				iNo = iNo/10;
			}
			return ((iEven) - (iOdd));
		}
}


class ASSIGNMENT 45_5
{
	public static void main(String arg[]) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number");
		int No = obj.nextInt();

		Digit dobj = new Digit();
		int Ret = dobj.CountDiff(No);
		System.out.println("Difference between summation of even digits and summation of odd digits is:"+Ret);

	}
}