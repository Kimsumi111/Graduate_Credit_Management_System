package gui;

import java.awt.*;
import javax.swing.*;

//SpringUtilies가 사용이 안되는데 이유를 모르겠습니다
public class LogIn extends JFrame {

	public LogIn() {
		JPanel p = new JPanel();
		p.setLayout(new SpringLayout());
		
		// 새 창에 라벨 추가
        JLabel labelid = new JLabel("StudentID: ", JLabel.TRAILING);
        JTextField  fieldid = new JTextField(10);
        labelid.setLabelFor(fieldid);
        p.add(labelid);
        p.add(fieldid);
		
        JLabel password = new JLabel("Password: ", JLabel.TRAILING);
        JTextField  fieldword = new JTextField(10);
        password.setLabelFor(fieldword);
        p.add(password);
        p.add(fieldword);
        
      
        
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(p);
        this.setVisible(true);
        
        JLabel sign_up_l2 = new JLabel("Password");

	}
}	