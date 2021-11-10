import java.lang.*;

abstract class Base
{
	public int i,j;
	public Base()
	{
		System.out.println("Inside Base constructor");
		i = 10;
		j = 20;
	}
	abstract public void fun();
	public void sun()
	{
		System.out.println("Inside Base sun");
	}
	static
	{
		System.out.println("Inside Base static block");
	}
	
}
class Derived extends Base
{
	public int k,l;
	static
	{
		System.out.println("Inside Derived static block");
	}
	public Derived()
	{
		System.out.println("Inside Derived constructor");
		k = 30;
		l = 40;
	}
	public void fun()
	{
		System.out.println("Inside Derived fun");
	}	
	public void gun()
	{
		System.out.println("Inside Derived gun");
	}
}
class AbstractDemo
{
	public static void main(String arg[])
	{
		Derived obj = new Derived();
		obj.fun();
		obj.sun();
		obj.gun();
		System.out.println("Value of i:"+obj.i);
		System.out.println("Value of j:"+obj.j);
		System.out.println("Value of k:"+obj.k);
		System.out.println("Value of l:"+obj.l);

	} 
}