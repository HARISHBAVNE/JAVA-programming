import java.lang.*;

interface Base
{
	int i = 10;   	// public static final by default.
	void fun();		// public abstract by default.
}
interface Derived extends Base
{
	int i = 20;
	void gun();
}
class Demo implements Derived
{
	public void sun()
	{
		System.out.println("Value of i:"+i);
		System.out.println();
		System.out.println();
	}
	public void fun()
	{
		System.out.println("Inside fun");
	}
	public void gun()
	{
		System.out.println("Inside gun");
	}
}
class Interface4
{
	public static void main(String arg[])
	{
		Demo obj = new Demo();
		obj.sun();
	} 
}