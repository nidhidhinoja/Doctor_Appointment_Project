import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

class MyFramePatient18 extends JFrame
{
	JLabel label_screen,l1;
	Font f1;
	MyActionListener ml = new MyActionListener(this);
	
	MyFramePatient18(String s)
	{
		
		super("Confirm Booking");
		this.setBounds(0, 0, 1920, 1080);
		setLayout(null);
		f1 = new Font("Arial",Font.BOLD,70);
		
		l1 = new JLabel("YOUR APPOINTMENT HAS BEEN BOOKED");
		l1.setBounds(200,300,1500,80);
		
	    ImageIcon screen = new ImageIcon("Fin.jpg");
		label_screen = new JLabel(screen);
		label_screen.setBounds(0,0,screen.getIconWidth(),screen.getIconHeight());
		label_screen.setVisible(true);
		add(label_screen);
		
		label_screen.add(l1);
		l1.setFont(f1);
		
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE  );
	}
}