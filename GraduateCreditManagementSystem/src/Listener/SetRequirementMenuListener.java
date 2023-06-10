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
import Public.Requ;

public class SetRequirementMenuListener implements ActionListener
{
	Process process = new Process();
	
	Input input = new Input();
	Search search = new Search();
	Windows message = new Windows();
	
	Requ requ = new Requ();

	Windows currentWindow = new Windows();
	JTextField[] text = new JTextField[10];
	
	int size;
	

	public void actionPerformed(ActionEvent e)
	{
		JButton button = (JButton) e.getSource();
		if(button.getText().equals("Continue"))
		{
			int num = 0;
			for(int i = 0 ; i<10; i++)
				if (Main.requ.credit[i] == -1.0)
					num = i;
			Main.requ.category[num] = text[0].getText();
			Main.requ.credit[num] = input.stringToDouble(text[1].getText(),0.0,40.0);
			if(requ.category[num] == null && requ.credit[num] == -1)
			{
				Main.requ.category[num] = null;
				Main.requ.credit[num] = -1;
				message.error(0);
			}
			for(int i = 0; i<size; i++)
				text[i].setText("");

		}
		else if(button.getText().equals("Complete"))
			currentWindow.dispose();
	}

}
