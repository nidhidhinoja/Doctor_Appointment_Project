import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyFramePatient1 extends JFrame
{
	
	TextField t1,t2,t3;
	JLabel lp1,lp2,lp3;
	Button b1;
	Font f1,f2;
	
	MyActionListener ml1 = new MyActionListener(this);
	
	MyFramePatient1(String s)
	{
		super(s);
		this.setBounds(300, 300, 1200, 1000);
		setLayout(null);
		
	    ImageIcon prof = new ImageIcon("prf.jpg");
		lp1 = new JLabel(prof);
		lp1.setBounds(50,50,prof.getIconWidth(),prof.getIconHeight());
		lp1.setVisible(true);
		add(lp1);
		
		lp2 = new JLabel(prof);
		lp2.setBounds(50,300,prof.getIconWidth(),prof.getIconHeight());
		lp2.setVisible(true);
		add(lp2);

        lp3 = new JLabel(prof);
		lp3.setBounds(50,550,prof.getIconWidth(),prof.getIconHeight());
		lp3.setVisible(true);
		add(lp3);		
		
		

		Color customColor = new Color(100,120,145);
		Color customColor1 = new Color(210,220,195);
		 getContentPane().setBackground(customColor);
		setForeground(Color.black);
		
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