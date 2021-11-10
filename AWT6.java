import java.lang.*;
import java.awt.*;
import java.awt.event.*;


class AWT_FRAME extends Frame implements ActionListener
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
		b1.addActionListener(this);

		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent obj)
	{
		t1.setText("HARISH");
	} 
}

class AWT6
{
	public static void main(String arg[]) 
	{
		AWT_FRAME f1 = new AWT_FRAME("TRIOXY");
		
	}
}