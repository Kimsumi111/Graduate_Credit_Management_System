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
import Public.Lecture;
import Public.Main;

public class AddScoreListener implements ActionListener
{
	Process process = new Process();
	
	Input input = new Input();
	Search search = new Search();
	Windows message = new Windows();
	
	Lecture lecture = new Lecture();

	Windows currentWindow = new Windows();
	JTextField[] text = new JTextField[10];
	
	int size;
	
	public AddScoreListener(JTextField[] text,Windows window)
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
		if(button.getText().equals("Save"))
		{
			lecture.code = input.stringToInt(text[0].getText(),10000000, 99999999);
			lecture.score = input.stringToDouble(text[1].getText(),0.0,4.5);
			if(lecture.code > -1 && lecture.score > -1)
			{
				int num = search.lecture(Main.lecture, lecture.code);
				if(num != -1)
					Main.lecture[num].score = lecture.score;
				else
					message.error(2);
			}
			else
				message.error(0);
			for(int i = 0; i<size; i++)
				text[i].setText("");
		}
		else if(button.getText().equals("Complete"))
			currentWindow.dispose();
	}

}
