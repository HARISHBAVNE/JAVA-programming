import java.awt.*;
import java.awt.event.*;

class AWT_FRAME implements ActionListener
{
	Frame fobj;
	Button b1;
	TextField t1;
	public AWT_FRAME(String str,int x, int y)
	{
		fobj = new Frame(str);
		fobj.setSize(x,y);
		fobj.setLayout(null);

		b1 = new Button("Submit");
		b1.setBounds(20,50,100,40);

		t1 = new TextField();
		t1.setBounds(20,150,100,40);

		fobj.add(b1);
		fobj.add(t1);

		b1.addActionListener(this);


		fobj.setVisible(true);
		fobj.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent obj)
			{
				System.exit(0);
			}
		} );
		
	}
	public void actionPerformed(ActionEvent obj)
	{
		t1.setText("HARSH");
	}
}



class AWT9
{
	public static void main(String arg[])
	{
		AWT_FRAME f = new AWT_FRAME("TRIOXY",500,500);
	}
}