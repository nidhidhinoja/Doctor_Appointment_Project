import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
class MyFrameDoctor2 extends JFrame
{
	JLabel label_screen;
    JTextArea t1,t2,t3,t4;
	Font f1;
	MyActionListener ml = new MyActionListener(this);
	
	MyFrameDoctor2(String s)
	{
		
		super("PATIENT LIST");
		this.setBounds(0, 0, 1920, 1080);
		setLayout(null);
		f1 = new Font("Arial",Font.BOLD,40);
		
		
	    ImageIcon screen = new ImageIcon("patient_page.jpg");
		label_screen = new JLabel(screen);
		label_screen.setBounds(0,0,screen.getIconWidth(),screen.getIconHeight());
		label_screen.setVisible(true);
		add(label_screen);
		t1 =new JTextArea();
		t1.setBounds(10,10,900,200);
		t1.setFont(f1);
		label_screen.add(t1);
		
		t2 =new JTextArea();
		t2.setBounds(10,220,900,200);
		t2.setFont(f1);
		label_screen.add(t2);
		
		t3 =new JTextArea();
		t3.setBounds(10,430,900,200);
		t3.setFont(f1);
		label_screen.add(t3);
		
		t4 =new JTextArea();
		t4.setBounds(10,640,900,200);
		t4.setFont(f1);
		label_screen.add(t4);
		this.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE  );
	}
}