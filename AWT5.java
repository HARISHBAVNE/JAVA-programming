import java.lang.*;
import java.awt.*;


class AWT_FRAME extends Frame
{
	Button b1;
	TextField t1;
	public AWT_FRAME(String str)
	{
		super();
		setTitle("TRIOXY");
		setSize(500,400);

		b1 = new Button("Submit");
		t1 = new TextField();
		b1.setBounds(20,50,100,40);
		t1.setBounds(20,100,100,40);

		add(b1);
		add(t1);

		setLayout(null);
		setVisible(true);
	}
}

class AWT5
{
	public static void main(String arg[]) 
	{
		AWT_FRAME f1 = new AWT_FRAME("TRIOXY");
		
	}
}