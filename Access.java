import java.lang.*;

class Base1
{
	public int a;
	private int b;
	protected int c;
	int d;
	//public Base1()
	{
		a = 10;
		b = 20;
		c = 30; 
		d = 100;
	}
	
	private void fun()
	{
		System.out.println("Inside Base1 fun");
	}
	protected void gun()
	{
		System.out.println("Inside Base1 gun");
	}
}
class Base2 extends Base1
{
	public int A;
	private int B;
	protected int C;
	//public Base2()
	{
		A = 40;
		B = 50;
		C = 60; 
	}
	public void fun()
	{
		System.out.println("Inside Base2 fun");
	}

}
class Access
{
	public static void main(String arg[])
	{
		Base2 obj = new Base2();
		
		System.out.println("Value of d:"+obj.d);
		obj.gun();
	} 
}