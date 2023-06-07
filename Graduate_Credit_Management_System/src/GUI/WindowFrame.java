package GUI;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class WindowFrame extends JFrame{
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JLabel l = new JLabel("Welcome to Graduate Credit Management System.");
		JButton b1 = new JButton("Sign up");
		JButton b2 = new JButton("Log in");
		JButton b3 = new JButton("Exit");
		
		p1.add(l);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		Container cp = f.getContentPane();
		cp.add(p1, BorderLayout.NORTH);
		cp.add(p2, BorderLayout.CENTER);
		f.setContentPane(cp);
		f.setVisible(true);

		b1.addActionListener(new SignUpClickListener()); 
		b2.addActionListener(new LogInClickListener());
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                f.dispose(); // 현재 창 종료
            }
		});
		
	}	
}	
	
