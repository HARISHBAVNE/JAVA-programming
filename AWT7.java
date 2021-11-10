import java.lang.*;
import java.awt.*;
import java.awt.event.*;


class AWT_FRAME extends Frame implements WindowListener
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
		addWindowListener(this);
		setLayout(null);
		setVisible(true);
	}
	public void windowDeactivated(WindowEvent obj){};
	public void windowActivated(WindowEvent obj){};
	public void windowDeiconified(WindowEvent obj){};
	public void windowIconified(WindowEvent obj){};
	public void windowClosed(WindowEvent obj){};
	public void windowClosing(WindowEvent obj)
	{
		System.exit(0);
	};
	public void windowOpened(WindowEvent obj){};
}

class AWT7
{
	public static void main(String arg[]) 
	{
		AWT_FRAME f1 = new AWT_FRAME("TRIOXY");
		
	}
}