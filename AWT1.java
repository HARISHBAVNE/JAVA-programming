import java.lang.*;
import java.awt.*;


class AWT_FRAME extends Frame
{
	Frame f;
	AWT_FRAME(String str)
	{
		f = new Frame(str);
		f.setSize(500,500);
		f.setVisible(true);
	}
}

class AWT1
{
	public static void main(String arg[]) 
	{
		AWT_FRAME f1 = new AWT_FRAME("TRIOXY");
	}
}