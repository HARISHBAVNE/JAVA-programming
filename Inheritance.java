import java.lang.*;

class Base
{
	public int i;
	public Base()
	{
		System.out.println("Inside Base constructor.");
		i = 10;
	}
	public void fun()
	{
		System.out.println("Inside Base fun");
	}
}
class Dervied extends Base
{
	public int j;
	public Dervied()
	{
		System.out.println("Inside Derived constructor.");
		j = 20;
	}
	public void gun()
	{
		System.out.println("Inside Derived gun");
	}
}
class Inheritance
{
	public static void main(String arg[])
	{
		Dervied obj = new Dervied();
		obj.fun();
		obj.gun();
		System.out.println("Value of i:"+obj.i);
		System.out.println("Value of j:"+obj.j);
	} 
}