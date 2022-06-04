import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyFramePatient extends JFrame
{
	TextField t1,t2,t3;
	Label l1,l2,l3;
	Button b1;
	Font f1,f2;
	
	MyActionListener ml1 = new MyActionListener(this);
	
	MyFramePatient(String s)
	{
		super(s);
		this.setBounds(300, 100, 1200, 1000);
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
		
		 f1 = new Font("Arial",Font.BOLD,40);
		 f2 = new Font("Arial",Font.ITALIC,45);
		 
		 Color customColor = new Color(100,120,145);
		Color customColor1 = new Color(210,220,195);
	    getContentPane().setBackground(customColor);
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
		add(t1);
		add(t2);
		add(t3);
		add(l1);
		add(l2);
		add(l3);
		add(b1);
		
		b1.addActionListener(ml1);
		
		this.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
	}
	
	
	public static void main(String args[])
	{
		MyFramePatient mf1 = new MyFramePatient("PATIENT LOGIN");
		mf1.setVisible(true);
	}
}