import java.awt.*;
import java.awt.event.*;
import java.awt.AWTEvent.*;
class MyFrame extends Frame
{
	MenuBar menu_Index;
	Menu menu_1;
	MenuItem m1,m2,m3;
	Font f1;
	MyActionListener ml = new MyActionListener(this);
	
	MyFrame(String s)
	{
		super(s);
		this.setBounds(0, 0, 1000, 800);
		setLayout(null);
		
		f1 = new Font("Times",Font.BOLD,30);
		menu_Index = new MenuBar();
		menu_1 = new Menu("INDEX");
		m1 = new MenuItem("Admin");
		m2 = new MenuItem("Patient");
		m3 = new MenuItem("Doctor");
		
		m1.setFont(f1);
		m2.setFont(f1);
		m3.setFont(f1);
		
		menu_1.add(m1);
		menu_1.add(m2);
		menu_1.add(m3);
		
		menu_Index.add(menu_1);
		setMenuBar(menu_Index);
		
		m1.addActionListener(ml);
		m2.addActionListener(ml);
		m3.addActionListener(ml);
		
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
		MyFrame mf = new MyFrame("INDEX");
		mf.setVisible(true);
	}
}