import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

class MyFrameDoctor extends JFrame
{
	JTextField t1,t2,t3;
	JLabel l1,l2,l3;
	JButton b1;
	Font f1,f2;
	JLabel label_login;
	MyActionListener ml1 = new MyActionListener(this);
	
	MyFrameDoctor(String s)
	{
		super("DOCTOR LOGIN");
		this.setBounds(0, 0, 1920, 1080);
		setLayout(null);
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		b1 = new JButton("DOCTOR LOGIN");
		l1 = new JLabel("Name: ");
		l2 = new JLabel("unique id: ");
		l3 = new JLabel("field: ");
		
		ImageIcon screenL = new ImageIcon("login_page.jpg");
		label_login = new JLabel(screenL);
		label_login.setBounds(0,10,screenL.getIconWidth(),screenL.getIconHeight());
		label_login.setVisible(true);
		add(label_login);
		
		
		l1.setBounds(870,50,325,100);
		t1.setBounds(1080,50,325,100);
		
		l2.setBounds(870,200,325,100);
		t2.setBounds(1080,200,325,100);
		
		l3.setBounds(870,350,325,100);
		t3.setBounds(1080,350,325,100);
		
		b1.setBounds(1000,500,500,100);
		
		f1 = new Font("Arial",Font.BOLD,40);
		f2 = new Font("Arial",Font.ITALIC,45);
		setForeground(Color.black);
		//SetFont
		l1.setFont(f1);
		l2.setFont(f1);
		l3.setFont(f1);
		t1.setFont(f1);
		t2.setFont(f1);
		t3.setFont(f1);
		b1.setFont(f2);
		//Add Component to Frame
		label_login.add(t1);
		label_login.add(t2);
		label_login.add(t3);
		label_login.add(l1);
		label_login.add(l2);
		label_login.add(l3);
		label_login.add(b1);
		
		b1.addActionListener(ml1);
		this.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE  );
	}
}