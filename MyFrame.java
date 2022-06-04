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
	Font f1,f2;
	Label l1,l2,l3;
	MyActionListener ml = new MyActionListener(this);
	
	MyFrame(String s)
	{
		super(s);
		this.setBounds(0, 0, 1920, 1080);
		setLayout(null);
		
		f1 = new Font("Times",Font.BOLD,30);
		menu_Index = new MenuBar();
		menu_1 = new Menu("INDEX");
		m1 = new MenuItem("Patient");
		m2 = new MenuItem("Doctor");
		m3 = new MenuItem("Admin");
		
		l1 = new Label("WELCOME TO");
		l2 = new Label("DOCTOR APPOINTMENT");
		l3 = new Label("BOOKING SYSTEM");
		l1.setBounds(200,300,500,155);
		l2.setBounds(100,400,555,155);
		l3.setBounds(180,500,500,155);
		
		
		f1 = new Font("Arial",Font.BOLD,40);
		f2 = new Font("Arial",Font.ITALIC,45);
		l1.setFont(f2);
		l2.setFont(f2);
		l3.setFont(f2);
		add(l1);
		add(l2);
		add(l3);
		
		Color customColor = new Color(100,220,145);
		Color customColor1 = new Color(210,220,195);
		getContentPane().setBackground(customColor);
		setForeground(Color.white);
		
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
		/*
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
			});*/
	}
	
	
	public static void main(String args[])
	{
		MyFrame mf = new MyFrame("INDEX");
		mf.setVisible(true);
	}
}