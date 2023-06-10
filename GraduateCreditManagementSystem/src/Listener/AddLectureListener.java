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

public class AddLectureListener implements ActionListener
{
	Process process = new Process();
	
	Input input = new Input();
	Search search = new Search();
	Windows message = new Windows();
	
	Lecture lecture = new Lecture();

	Windows currentWindow = new Windows();
	JTextField[] text = new JTextField[10];
	
	int size;
	
	public AddLectureListener(JTextField[] text,Windows window)
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
			int num = search.lecture(Main.lecture, -1);
			lecture.code = input.stringToInt(text[0].getText(),10000000, 99999999);
			lecture.grade = input.stringToInt(text[1].getText(),1,4);
			lecture.term = input.term(text[2].getText());
			lecture.category = text[3].getText();
			lecture.name = text[4].getText();
			lecture.credit = input.stringToDouble(text[5].getText(),0.0, 5.0);
			if(lecture.code != -1 && lecture.grade != -1 && lecture.term != null && lecture.category != null && lecture.name != null && lecture.credit != -1)
			{
				System.out.print(num);
				if(search.lecture(Main.lecture, lecture.code) == -1)
				{
					
					Main.lecture[num].copy(lecture);
					System.out.print(num);
					System.out.print(Main.lecture[num].code);
					System.out.print(Main.lecture[num].grade);
					System.out.print(Main.lecture[num].term);
					System.out.print(Main.lecture[num].category);
					System.out.print(Main.lecture[num].name);
					System.out.println(Main.lecture[num].credit);
				}
				else
					message.error(3);
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
