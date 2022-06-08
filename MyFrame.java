import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

class MyFrame extends JFrame
{
	MenuBar menu_Index;
	Menu menu_1;
	MenuItem m1,m2,m3;
	Font f1;
	JLabel label_screen;
	MyActionListener ml = new MyActionListener(this);
	
	MyFrame(String s)
	{
		
		super(s);
		this.setBounds(0, 0, 1920, 1080);
		setLayout(null);
		f1 = new Font("Arial",Font.BOLD,40);
		menu_Index = new MenuBar();
		menu_1 = new Menu("INDEX");
		m1 = new MenuItem("Patient");
		m2 = new MenuItem("Doctor");
		m3 = new MenuItem("Admin");
		
		
	    ImageIcon screen = new ImageIcon("Main_page.jpg");
		label_screen = new JLabel(screen);
		label_screen.setBounds(0,0,screen.getIconWidth(),screen.getIconHeight());
		label_screen.setVisible(true);
		add(label_screen);
		
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
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE  );
	}
	
	public static void main(String args[])
	{
		MyFrame mf = new MyFrame("INDEX");
		mf.setVisible(true);
	}
}