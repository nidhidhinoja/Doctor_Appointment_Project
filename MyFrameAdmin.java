import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

class MyFrameAdmin extends JFrame
{
	
	JTextField t1,t2;
	JLabel l1,l2;
	JLabel label_login;
	JButton b1;
	Font f1,f2;
	MyActionListener ml1 = new MyActionListener(this);
	
	MyFrameAdmin(String s)
	{
		super("ADMIN LOGIN");
		this.setBounds(0,0,1920,1080);
		setLayout(null);
		t1 = new JTextField();
		t2 = new JTextField();
		b1 = new JButton("ADMIN LOGIN");
		l1 = new JLabel("Name: ");
		l2 = new JLabel("unique id: ");
		
	    ImageIcon screenL = new ImageIcon("login_page.jpg");
		label_login = new JLabel(screenL);
		label_login.setBounds(0,0,screenL.getIconWidth(),screenL.getIconHeight());
		label_login.setVisible(true);
		add(label_login);
		
		
		l1.setBounds(870,50,325,100);
		t1.setBounds(1080,50,325,100);
		
		l2.setBounds(870,200,325,100);
		t2.setBounds(1080,200,325,100);
		
		b1.setBounds(1000,500,500,100);
		
		f1 = new Font("Arial",Font.BOLD,40);
		f2 = new Font("Arial",Font.ITALIC,45);
		setForeground(Color.black);
		//SetFont
		l1.setFont(f1);
		l2.setFont(f1);
	
		t1.setFont(f1);
		t2.setFont(f1);
	
		b1.setFont(f2);
		//Add Component to Frame
		label_login.add(t1);
		label_login.add(t2);
		
		label_login.add(l1);
		label_login.add(l2);
		
		label_login.add(b1);
		
		b1.addActionListener(ml1);
		this.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE  );
	}
}