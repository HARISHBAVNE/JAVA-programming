import java.lang.*;
import java.awt.*;


class AWT_FRAME extends Frame
{
	public AWT_FRAME(String str)
	{
		super(str);
	}
}

class AWT2
{
	public static void main(String arg[]) 
	{
		AWT_FRAME f1 = new AWT_FRAME("TRIOXY");
		f1.setSize(300,300);
		f1.setVisible(true);
	}
}