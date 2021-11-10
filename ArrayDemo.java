import java.lang.*;
import java.util.Scanner;

class Demo
{
	public int arr[];
	public int crr[][];
	public int brr[][];
	
	public Demo(int Row)
	{
		arr = new int[Row];
		brr = new int[Row][];
	}
	public Demo(int Row1,int Col1)
	{
		crr = new int[Row1][Col1];

	}
	
	public void OneD()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter elements");
		for (int i = 0;i<arr.length;i++)
		{
			System.out.print("Enter element "+(i+1)+":");
			arr[i] = sobj.nextInt();
		}
	}
	
	public void TwoD()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter elements");
		for (int i = 0;i<crr.length;i++)
		{
			for (int j = 0;j<crr[i].length;j++)
			{
				System.out.println("Row"+(i+1)+"Column"+(j+1)+":");
			
				crr[i][j] = sobj.nextInt();	
			}
		}
	}
	
	public void Jagged()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter length of jagged arrys rows");
		for (int i = 0;i<brr.length;i++)
		{
			System.out.println("Enter length of Row"+(i+1)+":");
			brr[i] = new int[sobj.nextInt()];
		}

		System.out.println("Enter elements");
		for (int i = 0;i<brr.length;i++)
		{
			for (int j = 0;j<brr[i].length;j++)
			{
				System.out.println("Row"+(i+1)+"Column"+(j+1)+":");
				int no = sobj.nextInt();
				brr[i][j] = no;	
			}
		}	
	}
	public void Display1()
	{
		System.out.println("Single Dimentional array");
		for (int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
	}
	public void Display()
	{
		System.out.println();
		System.out.println("Multi Dimentional array");
		for (int i = 0;i<crr.length;i++)
		{
			for(int j = 0;j<crr[i].length;j++)
			{
				System.out.print(crr[i][j]+"  ");
			}
			System.out.println();
		}
	}
	public void Display2()
	{
		System.out.println();
		System.out.println("Jagged Dimentional array");
		for (int i = 0;i<brr.length;i++)
		{
			for(int j = 0;j<brr[i].length;j++)
			{
				System.out.print(brr[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
class ArrayDemo
{
	public static void main(String arg[])
	{
		Demo obj1 = new Demo(3);
		//Demo obj2 = new Demo(3,3);
		//Demo obj3 = new Demo(3);
		obj1.OneD();
		//obj2.TwoD();
		//obj3.Jagged();
		obj1.Display1();
		//obj2.Display();
		//obj3.Display2();
		

		
		
	}
}