import java.awt.*;
import java.awt.event.*;
import java.awt.AWTEvent.*;
public class MyFrameUser extends Frame
{
	
	TextField t1,t2,t3;
	Label l1,l2,l3;
	Button b1;
	Font f1,f2;
	
	MyActionListener ml1 = new MyActionListener(this);
	
	MyFrameUser(String s)
	{
		super(s);
		this.setBounds(0, 0, 1000, 1000);
		setLayout(null);
		
		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField();
		b1 = new Button("LOGIN");
		l1 = new Label("Name: ");
		l2 = new Label("Number: ");
		l3 = new Label("city: ");
		
		l1.setBounds(50,50,425,200);
		t1.setBounds(525,50,425,100);
		
		l2.setBounds(50,300,425,200);
		t2.setBounds(525,300,425,100);
		
		l3.setBounds(50,500,425,200);
		t3.setBounds(525,500,425,100);
		
	
		b1.setBounds(300,800,275,100);
		
		 f1 = new Font("Arial",Font.BOLD,60);
		 f2 = new Font("Arial",Font.ITALIC,55);
		//SetFont
		l1.setFont(f1);
		l2.setFont(f1);
		l3.setFont(f1);
		t1.setFont(f1);
		t2.setFont(f1);
		t3.setFont(f1);
		b1.setFont(f2);
		//Add Component to Frame
		add(t1);
		add(t2);
		add(t3);
		add(l1);
		add(l2);
		add(l3);
		add(b1);
		
		b1.addActionListener(ml1);
		
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
		MyFrameUser mf1 = new MyFrameUser("LOGIN");
		mf1.setVisible(true);
	}
}