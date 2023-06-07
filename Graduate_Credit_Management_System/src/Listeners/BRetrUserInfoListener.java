package Listeners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BRetrUserInfoListener implements ActionListener {

	public BRetrUserInfoListener() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton) e.getSource();
		System.out.println(b.getText());
	}

}
