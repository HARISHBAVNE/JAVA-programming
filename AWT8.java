import java.lang.*;
import java.awt.*;
import java.awt.event.*;


class AWT_FRAME extends WindowAdapter
{
	Frame f1;
	public AWT_FRAME(String str,int x,int y)
	{
		f1 = new Frame(str);
		f1.setSize(x,y);

		f1.addWindowListener(this);
		f1.setVisible(true);	
	}
	public void windowClossing(WindowEvent obj)
	{
		System.exit(0);
	}
}

class AWT8
{
	public static void main(String arg[]) 
	{
		AWT_FRAME f1 = new AWT_FRAME("TRIOXY",500,500);
		
	}
}