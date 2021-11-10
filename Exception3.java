import java.lang.*;
import java.util.*;
import java.io.*;

class Exception3
{
	public static void main(String arg[]) throws IOException
	{
		bufferdReader brr = new bufferdReader(new InputStreamReader(System.in));
		int arr[] = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		try
		{
			int no = Integer.parseInt(brr.readLine());

			arr[5] = no;
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