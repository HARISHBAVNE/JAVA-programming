import java.util.*;

class Digit
{
	public int Multiply(int iNo)
		{
			int iDigit = 0;
			int iMult = 1;
			if(iNo < 0)
			{
				iNo = -iNo;
			}
			
			while(iNo > 0)
			{

				iDigit = (iNo%10);
				if (iDigit != 0)
				{
					iMult = iMult * iDigit;
				}
				iNo = iNo/10;
			}
			return iMult;
		}
}


class ASSIGNMENT 45_4
{
	public static void main(String arg[]) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number");
		int No = obj.nextInt();

		Digit dobj = new Digit();
		int Ret = dobj.Multiply(No);
		System.out.println("Multiplication of all digits is:"+Ret);

	}
}