import java.lang.*;
import java.io.*;
import java.util.*;

class Leap
{
	public boolean Check(int year)
	{
		if ((year%100 == 0)&&(year%400==0))
		{
			return true; 
		}
		else if ((year%100 != 0)&&(year%4==0))
		{
			return true;
		} 
		else
		{
			return false;
		}
	}
}


class Leapyear
{
	public static void main(String arg[]) throws IOException
	{
		System.out.print("Enter a year:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int year = Integer.parseInt(br.readLine());

		Leap obj = new Leap();
		boolean bRet = false;
		bRet = obj.Check(year);
		if (bRet == true)
		{
			System.out.println(year+" is a Leap year.");
		}
		else
		{
			System.out.println(year+" is not a Leap year.");
		}

	}
}