import java.awt.*;
import java.awt.event.*;
import java.awt.AWTEvent.*;
public class MyFramePatient1 extends Frame
{
	
	TextField t1,t2,t3;
	Label l1,l2,l3;
	Button b1;
	Font f1,f2;
	
	MyActionListener ml1 = new MyActionListener(this);
	
	MyFramePatient1(String s)
	{
		super(s);
		this.setBounds(0, 0, 1200, 1000);
		setLayout(null);
		
		//When Frames X Button Pressed
		addWindowListener(new WindowAdapter()
			{
				//use closing method Not Closed
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
			});
	}
	
	
	public static void main(String args[])
	{
		MyFramePatient1 mf4 = new MyFramePatient1("APPOINTMENT");
		mf4.setVisible(true);
	}
}