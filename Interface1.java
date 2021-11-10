import java.lang.*;

interface Hello
{
	int i = 10;   	// public static final by default.
	void fun();		// public abstract by default.
}
class Demo implements Hello
{
	public int i;
	{
		i = 20;
	}
	public void gun()
	{
		System.out.println("Inside gun of Demo");
	}
	public void fun()
	{
		System.out.println("Inside fun of Demo");
		System.out.println("Value i from Hello"+Hello.i);
		System.out.println("Value i from Demo"+i);
	}

}
class Interface1
{
	public static void main(String arg[])
	{
		Demo obj = new Demo();
		obj.fun();
		obj.gun();
	} 
}