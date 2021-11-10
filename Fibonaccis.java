import java.lang.*;
import java.io.*;

class Fibseries
{
	public void DisplayFibo(int No)
	{

		int a = 0,b = 1,c = 0;
		System.out.println("Fibonaccis series upto 10.");
		System.out.print(a+" ");
		System.out.print(b+" ");
		for (int i = 3;i<=No;i++)
		{
			c = a+b;
			a = b;
			b = c;

			System.out.print(c+" ");
		}
	}
}

class Fibonaccis
{
	public static void main(String arg[]) throws IOException
	{
		System.out.print("Enter a number:");
		InputStreamReader obj = new InputStreamReader(System.in);	// Connected to input device (Keyboard)
		BufferedReader br = new BufferedReader(obj);
		String str = br.readLine();			// readLines() method returns string object.
		int No = Integer.parseInt(str);		// converting string into int.

		Fibseries fobj = new Fibseries();	// Creating Fibseries object
		fobj.DisplayFibo(No);
	}
}