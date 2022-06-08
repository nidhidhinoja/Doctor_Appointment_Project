import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.awt.AWTEvent.*;
import javax.swing.*;
import java.lang.*;

public class MyActionListener implements ActionListener
{
	MyFrame mf;
	MyFramePatient mf1;
	MyFrameDoctor mf2;
	MyFrameAdmin mf3;
	MyFramePatient1 mf4;
	MyFramePatient2 mf5;
	MyFramePatient3 mf6;
	
	MyActionListener(MyFrame m)
	{
		this.mf = m;
	}
	MyActionListener(MyFramePatient m)
	{
		this.mf1 = m;
	}
	MyActionListener(MyFrameDoctor m)
	{
		this.mf2 = m;
	}
	MyActionListener(MyFrameAdmin m)
	{
		this.mf3 = m;
	}
	MyActionListener(MyFramePatient1 m)
	{
		this.mf4 = m;
	}
	MyActionListener(MyFramePatient2 m)
	{
		this.mf5 = m;
	}
	MyActionListener(MyFramePatient3 m)
	{
		this.mf6 = m;
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getActionCommand().equals("Patient"))
		{
			
			mf1 = new MyFramePatient("PATIENT LOGIN");
			this.mf1.setVisible(true);
		}
		if(e.getActionCommand().equals("Doctor"))
		{
		    mf2 = new MyFrameDoctor("DOCTOR LOGIN");
			this.mf2.setVisible(true);
		}
		
		if(e.getActionCommand().equals("Admin"))
		{
			mf3 = new MyFrameAdmin("ADMIN LOGIN");
			this.mf3.setVisible(true);
		}
		if(e.getActionCommand().equals("PATIENT LOGIN"))
		{
			mf4 = new MyFramePatient1("CHOICE BY REQUIREMENT");
			this.mf4.setVisible(true);
			this.mf1.setVisible(false);
		}
		if(e.getActionCommand().equals("Select doctor"))
		{
			mf5 = new MyFramePatient2("CHOICE BY REQUIREMENT");
			this.mf5.setVisible(true);
			this.mf4.setVisible(false);
		}
		if(e.getActionCommand().equals("Book your appointment1"))
		{
			mf6 = new MyFramePatient3("APPOINTMENT");
			this.mf6.setVisible(true);
			mf6.b1.setEnabled(false);
			this.mf5.setVisible(false);
		}/*
		if(e.getActionCommand().equals(""))
		{
			mf6 = new MyFramePatient3("APPOINTMENT");
			this.mf6.setVisible(true);
			this.mf5.setVisible(false);
		}*/
	}
} 