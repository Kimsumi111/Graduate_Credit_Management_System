package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import Function.CreateFile;
import Function.LogManage;
import Function.Store;
import Function.Windows;
import Private.Process;
import Private.User;
import Public.Main;

public class MainMenuListener implements ActionListener
{
	Process process = new Process();
	Windows newWindow = new Windows();
	LogManage logManage = new LogManage();
	CreateFile createFile = new CreateFile();
	Store store = new Store();	
	Windows currentWindow;
	
	public MainMenuListener(Windows window)
	{
		this.currentWindow = window;
	}
	public void actionPerformed(ActionEvent e)
	{
		JButton button = (JButton) e.getSource();
		if(button.getText().equals("Update information"))
			process.inform();
		else if(button.getText().equals("Update Lecture"))
			process.lecture();
		else if(button.getText().equals("Retrieve Lecture"))
			process.retrieveLecture();
		else if(button.getText().equals("Log out"))
		{
	 		logManage.logger("User Logout");
			createFile.userData(Main.user);
			store.user(Main.user);
			store.userRequ(Main.user, Main.requ);
			store.userLecture(Main.user, Main.lecture);
			currentWindow.dispose();
		}
	}
}
