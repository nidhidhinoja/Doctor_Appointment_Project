import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
class MyFrameDoctor1 extends JFrame
{
	JLabel label_screen;
	JButton b1,b2;
	Font f1;
	MyActionListener ml = new MyActionListener(this);
	
	MyFrameDoctor1(String s)
	{
		
		super("PATIENT LIST");
		this.setBounds(0, 0, 1920, 1080);
		setLayout(null);
		f1 = new Font("Arial",Font.BOLD,40);
		
		
	    ImageIcon screen = new ImageIcon("select_page.jpg");
		label_screen = new JLabel(screen);
		label_screen.setBounds(0,0,screen.getIconWidth(),screen.getIconHeight());
		label_screen.setVisible(true);
		add(label_screen);
		
		b1 = new JButton("See List of Patients");
		b2 = new JButton("cancellation of appointment");
		
		b1.setBounds(300,300,700,100);
		b2.setBounds(300,600,700,100);
		
		b1.setFont(f1);
		b2.setFont(f1);
		
		label_screen.add(b1);
		label_screen.add(b2);
		
		b1.addActionListener(ml);
		b2.addActionListener(ml);

		this.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE  );
	}
}