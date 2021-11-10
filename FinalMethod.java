import java.lang.*;

class Demo
{
	public final int i;
	{
		i = 10;
	}
	public void fun()
	{
		System.out.println("Inside Demo Fun.");
	}
	final public void gun()
	{
		System.out.println("Inside Demo gun");
	}
	
}
class Dervied extends Demo
{
	public int j;
	{
		j = 15;
	}
	public void fun()
	{
		System.out.println("Inside Derived Fun.");	
	}
	/*public final void gun()        Not allowd overriding for final method
	{
		System.out.println("Inside Derived gun");
	}*/
}
class FinalMethod
{
	
	public static void main(String arg[])
	{
		Demo obj = new Dervied();
		obj.fun();
		obj.gun();
	} 
}