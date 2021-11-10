import java.lang.*;

interface Hello1
{
	int i = 10;   	// public static final by default.
	void fun();		// public abstract by default.
}
class Hello2
{
	public void gun()
	{
		System.out.println("Inside gun of Hello2");
	}
}
class Demo extends Hello2 implements Hello1
{
	public int i;
	{
		i = 30;
	}
	public void fun(int no)
	{
		System.out.println("Inside fun of Demo");
	}
	public void fun()
	{
		System.out.println("Inside fun of Hello1");
	}
}
class Interface3
{
	public static void main(String arg[])
	{
		Demo obj = new Demo();
		obj.fun();
		obj.gun();
	} 
}