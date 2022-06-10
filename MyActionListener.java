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
	MyFramePatient4 mf7;
	MyFramePatient5 mf8;
	MyFramePatient6 mf9;
	MyFramePatient7 mf10;
	MyFramePatient8 mf11;
	MyFramePatient9 mf12;
	MyFramePatient10 mf13;
	MyFramePatient11 mf14;
	MyFramePatient12 mf15;
	MyFramePatient13 mf16;
	MyFramePatient14 mf17;
	MyFramePatient15 mf18;
	MyFramePatient16 mf19;
	MyFramePatient17 mf20;
	
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
	MyActionListener(MyFramePatient4 m)
	{
		this.mf7 = m;
	}
	MyActionListener(MyFramePatient5 m)
	{
		this.mf8 = m;
	}
	MyActionListener(MyFramePatient6 m)
	{
		this.mf9 = m;
	}
	MyActionListener(MyFramePatient7 m)
	{
		this.mf10 = m;
	}
	MyActionListener(MyFramePatient8 m)
	{
		this.mf11 = m;
	}
	MyActionListener(MyFramePatient9 m)
	{
		this.mf12 = m;
	}
	MyActionListener(MyFramePatient10 m)
	{
		this.mf13 = m;
	}
	MyActionListener(MyFramePatient11 m)
	{
		this.mf14 = m;
	}
	MyActionListener(MyFramePatient12 m)
	{
		this.mf15 = m;
	}
	MyActionListener(MyFramePatient13 m)
	{
		this.mf16 = m;
	}
	MyActionListener(MyFramePatient14 m)
	{
		this.mf17 = m;
	}
	MyActionListener(MyFramePatient15 m)
	{
		this.mf18 = m;
	}
	MyActionListener(MyFramePatient16 m)
	{
		this.mf19 = m;
	}
	MyActionListener(MyFramePatient17 m)
	{
		this.mf20 = m;
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
			mf5 = new MyFramePatient2("APPOINTMENT");
			this.mf5.setVisible(true);
			mf5.bpage1.setEnabled(false);
			this.mf4.setVisible(false);
		}
		if(e.getActionCommand().equals("Next"))
		{
			mf14 = new MyFramePatient11("APPOINTMENT");
			this.mf14.setVisible(true);
			mf14.bpage2.setEnabled(false);
			this.mf5.setVisible(false);
		}
		if(e.getActionCommand().equals("Previous"))
		{
			mf5 = new MyFramePatient2("APPOINTMENT");
			this.mf5.setVisible(true);
			mf5.bpage1.setEnabled(false);
			this.mf14.setVisible(false);
		}
		if(e.getActionCommand().equals("Book your appointment for dr.ABC"))
		{
			mf6 = new MyFramePatient3("APPOINTMENT");
			this.mf6.setVisible(true);
			mf6.b1.setEnabled(false);
			this.mf5.setVisible(false);
		}
		if(e.getActionCommand().equals("TOMORROW"))
		{
			mf7 = new MyFramePatient4("APPOINTMENT");
			this.mf7.setVisible(true);
			mf7.b2.setEnabled(false);
			this.mf6.setVisible(false);
		}
		if(e.getActionCommand().equals("TODAY"))
		{
			mf6 = new MyFramePatient3("APPOINTMENT");
			this.mf6.setVisible(true);
			mf6.b1.setEnabled(false);
			this.mf7.setVisible(false);
		}
		if(e.getActionCommand().equals("Book your appointment for dr.XYZ"))
		{
			mf8 = new MyFramePatient5("APPOINTMENT");
			this.mf8.setVisible(true);
			mf8.b1.setEnabled(false);
			this.mf5.setVisible(false);
		}
		if(e.getActionCommand().equals("Tomorrow"))
		{
			mf9 = new MyFramePatient6("APPOINTMENT");
			this.mf9.setVisible(true);
			mf9.b2.setEnabled(false);
			this.mf8.setVisible(false);
		}
		if(e.getActionCommand().equals("Today"))
		{
			mf8 = new MyFramePatient5("APPOINTMENT");
			this.mf8.setVisible(true);
			mf8.b1.setEnabled(false);
			this.mf9.setVisible(false);
		}
		if(e.getActionCommand().equals("Book your appointment for dr.EFG"))
		{
			mf10 = new MyFramePatient7("APPOINTMENT");
			this.mf10.setVisible(true);
			mf10.b1.setEnabled(false);
			this.mf5.setVisible(false);
		}
		if(e.getActionCommand().equals("tomorrow"))
		{
			mf11 = new MyFramePatient8("APPOINTMENT");
			this.mf11.setVisible(true);
			mf11.b2.setEnabled(false);
			this.mf10.setVisible(false);
		}
		if(e.getActionCommand().equals("today"))
		{
			mf10 = new MyFramePatient7("APPOINTMENT");
			this.mf10.setVisible(true);
			mf10.b1.setEnabled(false);
			this.mf11.setVisible(false);
		}
		if(e.getActionCommand().equals("Book your appointment for dr.RST"))
		{
			mf12 = new MyFramePatient9("APPOINTMENT");
			this.mf12.setVisible(true);
			mf12.b1.setEnabled(false);
			this.mf5.setVisible(false);
		}
		if(e.getActionCommand().equals("-Tomorrow-"))
		{
			mf13 = new MyFramePatient10("APPOINTMENT");
			this.mf13.setVisible(true);
			mf13.b2.setEnabled(false);
			this.mf12.setVisible(false);
		}
		if(e.getActionCommand().equals("-Today-"))
		{
			mf12 = new MyFramePatient9("APPOINTMENT");
			this.mf12.setVisible(true);
			mf12.b1.setEnabled(false);
			this.mf13.setVisible(false);
		}
		if(e.getActionCommand().equals("Book your appointment for dr.abc"))
		{
			mf15 = new MyFramePatient12("APPOINTMENT");
			this.mf15.setVisible(true);
			mf15.b1.setEnabled(false);
			this.mf14.setVisible(false);
		}
		if(e.getActionCommand().equals("-TOMORROW-"))
		{
			mf16 = new MyFramePatient13("APPOINTMENT");
			this.mf16.setVisible(true);
			mf16.b2.setEnabled(false);
			this.mf15.setVisible(false);
		}
		if(e.getActionCommand().equals("-TODAY-"))
		{
			mf15 = new MyFramePatient12("APPOINTMENT");
			this.mf15.setVisible(true);
			mf15.b1.setEnabled(false);
			this.mf16.setVisible(false);
		}
		if(e.getActionCommand().equals("Book your appointment for dr.bcd"))
		{
			mf17 = new MyFramePatient14("APPOINTMENT");
			this.mf17.setVisible(true);
			mf17.b1.setEnabled(false);
			this.mf14.setVisible(false);
		}
		if(e.getActionCommand().equals("-tomorrow-"))
		{
			mf18 = new MyFramePatient15("APPOINTMENT");
			this.mf18.setVisible(true);
			mf18.b2.setEnabled(false);
			this.mf17.setVisible(false);
		}
		if(e.getActionCommand().equals("-today-"))
		{
			mf17 = new MyFramePatient14("APPOINTMENT");
			this.mf17.setVisible(true);
			mf17.b1.setEnabled(false);
			this.mf18.setVisible(false);
		}
		if(e.getActionCommand().equals("Book your appointment for dr.cde"))
		{
			mf19 = new MyFramePatient16("APPOINTMENT");
			this.mf19.setVisible(true);
			mf19.b1.setEnabled(false);
			this.mf14.setVisible(false);
		}
		if(e.getActionCommand().equals("--TOMORROW--"))
		{
			mf20 = new MyFramePatient17("APPOINTMENT");
			this.mf20.setVisible(true);
			mf20.b2.setEnabled(false);
			this.mf19.setVisible(false);
		}
		if(e.getActionCommand().equals("--TODAY--"))
		{
			mf19 = new MyFramePatient16("APPOINTMENT");
			this.mf19.setVisible(true);
			mf19.b1.setEnabled(false);
			this.mf20.setVisible(false);
		}
	}
} 