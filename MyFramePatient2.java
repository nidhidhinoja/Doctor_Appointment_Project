import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyFramePatient2 extends JFrame
{
	
	//TextField t1,t2,t3;
	JLabel lp1,lp2,lp3,lt1,lt2,lt3,label_select;
	//Button b1;
	//Font f1,f2;
	
	MyFramePatient2(String s)
	{
		super("APPOINTMENT");
		this.setBounds(200, 100, 1200, 800);
		setLayout(null);
		
		
		setForeground(Color.black);
		
		
	    ImageIcon prof = new ImageIcon("prf.jpg");
	    ImageIcon screenL = new ImageIcon("doctor_page.jpg");
		label_select = new JLabel(screenL);
		label_select.setBounds(0,0,screenL.getIconWidth(),screenL.getIconHeight());
		label_select.setVisible(true);
		add(label_select);
		
		lp1 = new JLabel(prof);
		lp1.setBounds(50,30,prof.getIconWidth(),prof.getIconHeight());
		lp1.setVisible(true);
		label_select.add(lp1);
		
		lp2 = new JLabel(prof);
		lp2.setBounds(50,270,prof.getIconWidth(),prof.getIconHeight());
		lp2.setVisible(true);
		label_select.add(lp2);

        lp3 = new JLabel(prof);
		lp3.setBounds(50,510,prof.getIconWidth(),prof.getIconHeight());
		lp3.setVisible(true);
		label_select.add(lp3);		

		lt1 = new JLabel("Dr. XYZ");
		lt1.setBounds(300,30,50,50);
		lt1.setVisible(true);
		label_select.add(lt1);
		
		lt2 = new JLabel("Dr. XYZ");
		lt2.setBounds(300,270,50,50);
		lt2.setVisible(true);
		label_select.add(lt2);
		
		lt3 = new JLabel("Dr. XYZ");
		lt3.setBounds(300,510,50,50);
		lt3.setVisible(true);
		label_select.add(lt3);
		
		this.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
	}
}