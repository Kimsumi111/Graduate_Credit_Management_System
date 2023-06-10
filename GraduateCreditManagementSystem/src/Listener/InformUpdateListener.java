package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import Function.Input;
import Function.Search;
import Function.Windows;
import Private.Process;
import Private.User;
import Public.Main;

public class InformUpdateListener implements ActionListener
{
	Process process = new Process();
	
	Input input = new Input();
	Search search = new Search();
	Windows message = new Windows();
	
	User user = new User();

	Windows currentWindow = new Windows();
	JTextField[] text = new JTextField[10];
	
	int size;
	
	public InformUpdateListener(JTextField[] text,Windows window)
	{
		this.currentWindow = window;
		size = text.length;
		for(int i = 0; i<size; i++)
		{
			this.text[i] = new JTextField();
			this.text[i] = text[i];
		}
	}
	public void actionPerformed(ActionEvent e)
	{
		JButton button = (JButton) e.getSource();
		if(button.getText().equals("Update"))
		{
			user.setInt("Id",0,input.stringToInt(text[0].getText(),2014000000, 2023999999));
			user.setString("Password",0,text[1].getText());
			user.setInt("Grade",0,input.stringToInt(text[2].getText(),1,4));
			user.setString("Term",0,input.term(text[3].getText()));
			user.setString("Major",0,text[4].getText());
			user.setInt("Admi",0 , user.getInt("Id", 0)/1000000);
			if(user.getInt("Id",0) >0 && user.getString("Password", 0) != null && user.getInt("Grade", 0) > 0 && user.getString("Term",0) != null && user.getString("Major", 0) != null)
			{
				Main.user = user;
				currentWindow.dispose();
			}
			else
			{
				for(int i = 0; i<size; i++)
					text[i].setText("");
				message.error(0);
			}
		}
		else if(button.getText().equals("Exit"))
			currentWindow.dispose();
	}

}
