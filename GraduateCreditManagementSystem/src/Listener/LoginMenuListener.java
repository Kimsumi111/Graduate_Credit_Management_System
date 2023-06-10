package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import Function.Input;
import Function.Load;
import Function.Search;
import Function.Windows;
import Private.Process;
import Private.User;
import Public.Main;

public class LoginMenuListener implements ActionListener
{
	Process process = new Process();
	
	Input input = new Input();
	Search search = new Search();
	Windows message = new Windows();
	Load load = new Load();
	
	User user = new User();

	Windows currentWindow = new Windows();
	JTextField[] text = new JTextField[10];
	
	int size;
	
	public LoginMenuListener(JTextField[] text,Windows window)
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
		if(button.getText().equals("Login"))
		{
			user.setInt("Id",0,input.stringToInt(text[0].getText(),2014000000, 2023999999));
			user.setString("Password",0,text[1].getText());
			if(user.getInt("Id",0) >-1 && user.getString("Password", 0) != null)
			{
				if(search.userDirect(user) && search.user("Info", user))
				{
					Main.user = load.userInfo(user);
					if(Main.user.getString("Password", 0).equals(user.getString("Password", 0)))
					{
						Main.requ = load.userRequ(user);
						Main.lecture = load.userLecture(user);
						currentWindow.dispose();
						process.main();
					}
					else
					{
						Main.reset();
						message.error(4);
					}
				}
				else
					message.error(1);
			}
			else
				message.error(0);
			for(int i = 0; i<size; i++)
				text[i].setText("");
		}
		else if(button.getText().equals("Exit"))
			currentWindow.dispose();
	}

}
