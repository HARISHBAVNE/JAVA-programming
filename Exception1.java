import java.lang.*;
import java.util.*;

class Exception1
{
	public static void main(String arg[])
	{
		int arr[] = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		try
		{
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException obj)
		{
			System.out.println("Exception occurred:"+obj);
		}
		finally
		{
			System.out.println("End of main");
		}
	}
}