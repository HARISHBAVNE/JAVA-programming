import java.lang.*;

class Parrent
{
	public int i;
	public Parrent()
	{
		System.out.println("Inside Parrent constructor.");
		i = 10;
	}
	public void fun()

	{
		System.out.println("Inside Parrent fun");
	}
}

class Base1 extends Parrent
{
	public int j;
	public Base1()
	{
		System.out.println("Inside Base1 constructor.");
		j = 20;
	}
	public void gun()
	{
		System.out.println("Inside Base1 gun");
	}
}
class Base2 extends Parrent
{
	public int k;
	public Base2()
	{
		System.out.println("Inside Base2 constructor.");
		k = 30;
	}
	public void sun()
	{
		System.out.println("Inside Base2 sun");
	}
}
class Inheritance1
{
	public static void main(String arg[])
	{
		Base1 obj1 = new Base1();
		Base2 obj2 = new Base2();
		obj1.fun();
		obj1.gun();
		obj2.fun();
		obj2.sun();
		System.out.println("Value of i:"+obj1.i);
		System.out.println("Value of j:"+obj1.j);
		System.out.println("Value of k:"+obj2.k);
	} 
}