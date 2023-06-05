package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LogInClickListener implements ActionListener{
	private JFrame frame; // 현재 창을 참조 변수
    
    public LogInClickListener() {
    	frame = null;
    }
	public void actionPerformed(ActionEvent e) {
		
         // 새 창 생성
         JFrame log_in_f = new JFrame("Log In");
         log_in_f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         log_in_f.setSize(600, 300);
         log_in_f.setLayout(new FlowLayout());
         JPanel log_in_p = new JPanel();
         JPanel log_in_p1 = new JPanel();
         JPanel log_in_p2 = new JPanel();
         log_in_p.setLayout(new BoxLayout(log_in_p, BoxLayout.Y_AXIS));
         log_in_p1.setLayout(new BoxLayout(log_in_p1, BoxLayout.X_AXIS));

         // 새 창에 라벨 추가
         JLabel log_in_l1 = new JLabel("StudentID");
         JLabel log_in_l2 = new JLabel("Password");
         
         JTextField log_in_tf1 = new JTextField("            "); 
         JTextField log_in_tf2 = new JTextField("            ");
         
         JButton log_in_b1 = new JButton("Log in");
         JButton exitButton = new JButton("Exit");
         
         
         log_in_b1.addActionListener(new ActionListener() {
        	 public void actionPerformed(ActionEvent e) {
        		 JFrame menu_f = new JFrame("Menu");
        		 JPanel menu_p = new JPanel();
        		 menu_p.setLayout(new BoxLayout(menu_p, BoxLayout.Y_AXIS));
        		 JButton menu_b1 = new JButton("Retrieve/Update user information");
        		 JButton menu_b2 = new JButton("Update lecture information");
        		 JButton menu_b3 = new JButton("Retrieve enrollment information");
        		 JButton menu_b4 = new JButton("Log out");
     		
        		 menu_p.add(menu_b1);
        		 menu_p.add(menu_b2);
        		 menu_p.add(menu_b3); 
        		 menu_p.add(menu_b4);
     		
        		 menu_f.add(menu_p, BorderLayout.CENTER);
        		 menu_f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        		 menu_f.setVisible(true); 
        	 }
        });
         exitButton.addActionListener(new ActionListener() {
        	 public void actionPerformed(ActionEvent e) {
        		 log_in_f.dispose();
        	 }
         });
         exitButton.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
            	 log_in_f.dispose(); // 현재 창 종료
             }
         });
         
         log_in_p.add(log_in_l1);
         log_in_p.add(log_in_tf1);
         log_in_p.add(log_in_l2);
         log_in_p.add(log_in_tf2);
         log_in_p.add(log_in_b1);
         log_in_p.add(exitButton);
         

         // 새 창 표시
         log_in_p2.setLayout(new BoxLayout(log_in_p2, BoxLayout.Y_AXIS));
         log_in_p2.add(log_in_p);
         log_in_p2.add(log_in_p1);
         
         log_in_f.add(log_in_p, BorderLayout.CENTER);
         log_in_f.setVisible(true);
     }
}


