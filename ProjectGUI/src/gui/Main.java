package gui;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends JFrame{

	public Main() {
		this.setSize(500,100);
		this.setTitle("Graduate Credit Management System");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JLabel l = new JLabel("Graduation Credit Management");
		
		JButton b1 = new JButton("Sign up");
		JButton b2 = new JButton("Log in");
		JButton b3 = new JButton("Exit");

		p1.add(l);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		
		this.add(p1, BorderLayout.NORTH);
		this.add(p2, BorderLayout.CENTER);
		
		this.setVisible(true);
		
	}

}
