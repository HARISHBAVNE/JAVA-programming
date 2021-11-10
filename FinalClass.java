import java.lang.*;

final class Demo
{
	public final int i;
	{
		i = 10;
	}
	public void fun()
	{
		System.out.println("Inside Demo Fun.");
	}
	public final void gun()   
	{
		System.out.println("Inside Demo gun");
	}
}
class Derived //extends Demo not allowd for final class
{
	public int j;
	public Demo obj1;
	{
		j = 15;
		obj1 = new Demo();
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
class FinalClass
{
	
	public static void main(String arg[])
	{
		Derived obj = new Derived();
		obj.fun();
		obj.obj1.fun();
		obj.obj1.gun();
	} 
}