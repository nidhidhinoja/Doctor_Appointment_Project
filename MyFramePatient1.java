import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyFramePatient1 extends JFrame
{

	JLabel label_select;
	JTextField t1,t2,t3;
	JButton b1,b2,b3;
	Font f1,f2;
	MyActionListener ml = new MyActionListener(this);
	
	MyFramePatient1(String s)
	{
		super("CHOICE BY REQUIREMENT");
		this.setBounds(0,0,1920,1080);
		setLayout(null);
		
	    ImageIcon screenL = new ImageIcon("select_page.jpg");
		label_select = new JLabel(screenL);
		label_select.setBounds(0,0,screenL.getIconWidth(),screenL.getIconHeight());
		label_select.setVisible(true);
		add(label_select);
		
		f1 = new Font("Arial",Font.BOLD,40);
		f2 = new Font("Arial",Font.ITALIC,45);
		
		b1= new JButton("Select doctor");
		b2= new JButton("Select illeness");
		
		
		b1.setBounds(200,300,500,120);
		b2.setBounds(200,700,500,120);
		
	    b1.setFont(f2);
        b2.setFont(f2);
		
		setForeground(Color.black);
		
		label_select.add(b1);
		label_select.add(b2);
		
		b1.addActionListener(ml);
		b2.addActionListener(ml);
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}