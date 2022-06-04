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
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Patient"))
		{
			mf1 = new MyFramePatient("PATIENT LOGIN");
			this.mf1.setVisible(true);
			//this.mf.setVisible(false);
		}
		if(e.getActionCommand().equals("Doctor"))
		{
			mf2 = new MyFrameDoctor("DOCTOR LOGIN");
			this.mf2.setVisible(true);
			//this.mf.setVisible(false);
		}
		if(e.getActionCommand().equals("Admin"))
		{
			mf3 = new MyFrameAdmin("ADMIN LOGIN");
			this.mf3.setVisible(true);
			//this.mf.setVisible(false);
		}
		if(e.getActionCommand().equals("LOGIN"))
		{
			mf4 = new MyFramePatient1("PATIENT LOGIN");
			this.mf4.setVisible(true);
			this.mf1.setVisible(false);
		}
	}
}