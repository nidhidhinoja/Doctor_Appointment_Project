import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyFramePatient19 extends JFrame
{
	JCheckBox c1, c2, c3, c4,c5,c6,c7,c8,c9,c10;
	JButton b1;
	Font f1,f2;
	MyActionListener ml = new MyActionListener(this);
	MyFramePatient19()
	{
		super("Specialities");
		setLayout(null);
		setBounds(0,0,1920,1080);
		
		c1 = new JCheckBox("Dentist");
		c2 = new JCheckBox("Physian");
		c3 = new JCheckBox("Dermetologist");
		c4 = new JCheckBox("pediatrian");
		c5 = new JCheckBox("ENT specialist");
		c6 = new JCheckBox("Gynecologist");
		c7 = new JCheckBox("Ayurveda");
		c8 = new JCheckBox("Neurologist");
		c9 = new JCheckBox("Homeopathic");
		c10 = new JCheckBox("Dietian");
		
		b1 = new JButton("GO");
		
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(c5);
		add(c6);
		add(c7);
		add(c8);
		add(c9);
		add(c10);
		
		add(b1);
		
		c1.setBounds(300,0,500,100);
		c2.setBounds(300,200,500,100);
		c3.setBounds(300,400,500,100);
		c4.setBounds(300,600,500,100);
		c5.setBounds(300,800,500,100);
		c6.setBounds(900,0,500,100);
		c7.setBounds(900,200,500,100);
		c8.setBounds(900,400,500,100);
		c9.setBounds(900,600,500,100);
		c10.setBounds(900,800,500,100);
		
		b1.setBounds(1400,800,300,100);
		
		f1 = new Font("Helvetica",Font.ITALIC,50);
		f2 = new Font("Helvetica",Font.BOLD,60);
		
		c1.setFont(f1);
		c2.setFont(f1);
		c3.setFont(f1);
		c4.setFont(f1);
		c5.setFont(f1);
		c6.setFont(f1);
		c7.setFont(f1);
		c8.setFont(f1);
		c9.setFont(f1);
		c10.setFont(f1);
		
		
		b1.setFont(f2);
		
		c1.addItemListener(ml);
		c2.addItemListener(ml);
		c3.addItemListener(ml);
		c4.addItemListener(ml);
		c5.addItemListener(ml);
		c6.addItemListener(ml);
		c7.addItemListener(ml);
		c8.addItemListener(ml);
		c9.addItemListener(ml);
		c10.addItemListener(ml);
		
		b1.addActionListener(ml);
		this.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
	}
}