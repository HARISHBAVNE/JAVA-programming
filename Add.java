import java.lang.*;
import java.util.*;


class Arithmatic
{
	public int Addition(int No1,int No2)
	{
		return (No1+No2);
	} 
}


class Add
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter a first number"); // input
		int No1 = sobj.nextInt();

		System.out.println("Enter a fsecond number");
		int No2 = sobj.nextInt();
		Arithmatic obj = new Arithmatic();

		int iRet = obj.Addition(No1,No2);
		System.out.println("Addition of two number is:"+iRet);
	}
}