import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.awt.AWTEvent.*;
import javax.swing.*;
import java.lang.*;

public class MyActionListener implements ActionListener
{
	//MyFrame mf;
	MyFrameUser mf1;
	
	/*MyActionListener(MyFrame m){
		this.mf = m;
	}*/
	MyActionListener(MyFrameUser m1){
		this.mf1 = m1;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		System.out.println(e.getActionCommand());
	}
}