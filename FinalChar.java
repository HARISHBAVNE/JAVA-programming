import java.lang.*;

class Demo
{
	public final int i;

	public Demo()
	{
		i = 10;
	}	
	public void fun()
	{
		final int j = 20;
		System.out.println("Value of j is:"+j);
		//j++;		not allowed
	}
}
class FinalChar
{
	public final int k;
	{
		k = 20;
	}
	public void gun()
	{
		System.out.println("Value of k is:"+k);
		//k++;   Not allowed
	}
	public static void main(String arg[])
	{
		Demo obj = new Demo();
		obj.fun();
		FinalChar Fobj = new FinalChar();
		Fobj.gun();
		//obj.i ++;  not allowed
	} 
}