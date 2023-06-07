package GUI;
import java.awt.BorderLayout;

import javax.swing.*;

public class MyFrame extends JFrame{
	public MyFrame(){
		this.setSize(500,100);
		this.setTitle("Graduate Credit Management System");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		JLabel l = new JLabel("Graduation Credit Management");
		
		JButton b1 = new JButton("Sign up");
		JButton b2 = new JButton("Log in");
		JButton b3 = new JButton("Exit");

		p.add(l);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		
		this.add(l, BorderLayout.NORTH);
		this.add(p, BorderLayout.CENTER);
		
		this.setVisible(true);
	}
}
