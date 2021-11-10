import java.lang.*;

interface Database
{
	void Connect();
	void Disconnect();
}

class Oracle implements Database
{
	public void Connect()
	{
		System.out.println("Connected to Oracle Database");
	}
	public void Disconnect()
	{
		System.out.println("Disconnected to Oracle Database");
	}
}

class Mysql implements Database
{
	public void Connect()
	{
		System.out.println("Connected to Mysqul Database");
	}
	public void Disconnect()
	{
		System.out.println("Disconnected to Mysqul Database");
	}
}
class Interface5
{
	public static void main(String arg[])throws Exception
	{
		Class c = Class.forName(arg[0]);
		Database mobj = (Database)c.newInstance();
		mobj.Connect();
		mobj.Disconnect();
	} 
}