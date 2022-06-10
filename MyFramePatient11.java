import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyFramePatient11 extends JFrame
{
	
	JLabel lp1,lp2,lp3,lt1,lt2,lt3,lt4,lt5,lt6,lt7,lt8,lt9,label_select;
	JButton b1,b2,b3,bpage1,bpage2,bpage3,bpage4;
	Font f1,f2;
	
	MyActionListener ml = new MyActionListener(this);
	
	MyFramePatient11(String s)
	{
		super("APPOINTMENT");
		this.setBounds(0, 0, 1920, 1080);
		setLayout(null);
		
	
		setForeground(Color.black);
		b1 = new JButton("Book your appointment for dr.abc");
		b2 = new JButton("Book your appointment for dr.bcd");
		b3 = new JButton("Book your appointment for dr.cde");
		
		bpage1 = new JButton("Previous");
		bpage2 = new JButton("Next");
		
		f1 = new Font("Arial Rounded MT Bold",Font.BOLD,30);
		f2 = new Font("Times",Font.BOLD,20);
		
	    ImageIcon prof = new ImageIcon("prf.jpg");
	    ImageIcon screenL = new ImageIcon("doctor_page.png");
		label_select = new JLabel(screenL);
		label_select.setBounds(0,0,screenL.getIconWidth(),screenL.getIconHeight());
		label_select.setVisible(true);
		add(label_select);
		
		
		b1.setBounds(500,210,800,50);
		b2.setBounds(500,450,800,50);
		b3.setBounds(500,690,800,50);
		
		bpage1.setBounds(0,0,200,30);
		bpage2.setBounds(1720,0,200,30);
		
		b1.setFont(f2);
		b2.setFont(f2);
		b3.setFont(f2);
		
		bpage1.setFont(f2);
		bpage2.setFont(f2);
		
		label_select.add(b1);
		label_select.add(b2);
		label_select.add(b3);
		
		label_select.add(bpage1);
		label_select.add(bpage2);
		
		
		lp1 = new JLabel(prof);
		lp2 = new JLabel(prof);
		lp3 = new JLabel(prof);
		
		lp1.setBounds(30,30,prof.getIconWidth(),prof.getIconHeight());
		lp2.setBounds(30,270,prof.getIconWidth(),prof.getIconHeight());
		lp3.setBounds(30,510,prof.getIconWidth(),prof.getIconHeight());
		
		lp1.setVisible(true);
		lp2.setVisible(true);
		lp3.setVisible(true);
		
		label_select.add(lp1);
		label_select.add(lp2);
		label_select.add(lp3);
		
		lt1 = new JLabel("Dr. abc");
		lt1.setBounds(300,30,200,50);
		lt1.setVisible(true);
		label_select.add(lt1);
		lt1.setFont(f1);
		
		lt2 = new JLabel("Dr. bcd");
		lt2.setBounds(300,270,200,50);
		lt2.setVisible(true);
		label_select.add(lt2);
		lt2.setFont(f1);
		
		lt3 = new JLabel("Dr. cde");
		lt3.setBounds(300,510,200,50);
		lt3.setVisible(true);
		label_select.add(lt3);
		lt3.setFont(f1);
		/*
		lt10 = new JLabel("Dr. def");
		lt10.setBounds(300,750,200,50);
		lt10.setVisible(true);
		label_select.add(lt10);
		lt10.setFont(f1);
		*/
		lt4 = new JLabel("dentist-12 years of experience overall");
		lt4.setBounds(300,90,1000,50);
		lt4.setVisible(true);
		label_select.add(lt4);
		lt4.setFont(f1);
		
		
		lt5 = new JLabel("pediatrician-9 years of experience overall");
		lt5.setBounds(300,330,1000,50);
		lt5.setVisible(true);
		label_select.add(lt5);
		lt5.setFont(f1);
		
		
		lt6 = new JLabel("Cardiologist-7 years of experience overall");
		lt6.setBounds(300,570,1000,50);
		lt6.setVisible(true);
		label_select.add(lt6);
		lt6.setFont(f1);
		/*
		lt11 = new JLabel("Homoepath-10 years of experience overall");
		lt11.setBounds(300,810,1000,50);
		lt11.setVisible(true);
		label_select.add(lt11);
		lt11.setFont(f1);
		*/
		lt7 = new JLabel("500-consulatation fees at clinic");
		lt7.setBounds(300,150,1000,50);
		lt7.setVisible(true);
		label_select.add(lt7);
		lt7.setFont(f1);
		
		
		lt8 = new JLabel("600-consulatation fees at clinic");
		lt8.setBounds(300,390,1000,50);
		lt8.setVisible(true);
		label_select.add(lt8);
		lt8.setFont(f1);
		
		
		lt9 = new JLabel("300-consulatation fees at clinic");
		lt9.setBounds(300,630,1000,50);
		lt9.setVisible(true);
		label_select.add(lt9);
		lt9.setFont(f1);
		/*
		lt12 = new JLabel("500-consulatation fees at clinic");
		lt12.setBounds(300,870,1000,50);
		lt12.setVisible(true);
		label_select.add(lt12);
		lt12.setFont(f1);
		*/
		b1.addActionListener(ml);
		b2.addActionListener(ml);
		b3.addActionListener(ml);
		
		bpage1.addActionListener(ml);
		bpage2.addActionListener(ml);
		
		
		this.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
	}
}