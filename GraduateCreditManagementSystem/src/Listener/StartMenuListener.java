package Listener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import Function.LogManage;
import Function.Windows;
import Private.User;
import Public.Main;
import Private.Process;

public class StartMenuListener implements ActionListener
{
	Process process = new Process();
	Windows newWindow = new Windows();
	LogManage logManage = new LogManage();
		
	Windows currentWindow;
	
	public StartMenuListener(Windows window)
	{
		Main.reset();
		this.currentWindow = window;
	}
	public void actionPerformed(ActionEvent e)
	{
		JButton button = (JButton) e.getSource();
		if(button.getText().equals("Sign up"))
			process.signup();
		else if(button.getText().equals("Log in"))
			process.login();
		else if(button.getText().equals("Exit"))
		{
			logManage.logger("Program Terminate");
			currentWindow.dispose();
		}
	}
}
