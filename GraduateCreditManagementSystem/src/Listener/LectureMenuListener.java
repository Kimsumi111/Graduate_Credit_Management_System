package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import Function.Windows;
import Private.Process;
import Private.User;

public class LectureMenuListener implements ActionListener
{
	Process process = new Process();
	Windows newWindow = new Windows();
		
	Windows currentWindow;
	
	public LectureMenuListener(Windows window)
	{
		this.currentWindow = window;
	}
	public void actionPerformed(ActionEvent e)
	{
		JButton button = (JButton) e.getSource();
		if(button.getText().equals("Add Lecture"))
			process.addLecture();
		else if(button.getText().equals("Add Score"))
			process.addScore();
		else if(button.getText().equals("Exit"))
			currentWindow.dispose();
	}
}
