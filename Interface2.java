import java.lang.*;

interface Hello1
{
	int i = 10;   	// public static final by default.
	void fun();		// public abstract by default.
}
interface Hello2
{
	int i = 20;   	// public static final by default.
	void fun(int no);		// public abstract by default.
}
class Demo implements Hello1,Hello2
{
	public int i;
	{
		i = 30;
	}
	public void gun()
	{
		System.out.println("Inside gun of Demo");
		System.out.println("Value of i from Demo:"+i);
		
	}
	public void fun(int no)
	{
		System.out.println("Inside fun of Hello2");
	}
	public void fun()
	{
		System.out.println("Inside fun of Hello1");
	}
}
class Interface2
{
	public static void main(String arg[])
	{
		Demo obj = new Demo();
		obj.fun();
		obj.fun(11);
		obj.gun();
	} 
}