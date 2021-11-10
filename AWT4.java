import java.lang.*;
import java.awt.*;


class AWT_FRAME extends Frame
{
	public AWT_FRAME(String str)
	{
		super();
		this.setTitle("TRIOXY");
		this.setSize(500,400);
		this.setVisible(true);
	}
}

class AWT4
{
	public static void main(String arg[]) 
	{
		AWT_FRAME f1 = new AWT_FRAME("TRIOXY");
		AWT_FRAME f2 = new AWT_FRAME("TRIOXY");
	}
}