package UserInfo;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RetrieveUserInfo extends JFrame{
	public static void main(String args[]) {
		UserInfoFrame user_info = new UserInfoFrame();
		JPanel user_info_p1 = new JPanel();
		JPanel user_info_p2 = new JPanel();
		user_info_p1.setLayout(new BoxLayout(user_info_p1, BoxLayout.Y_AXIS));
		
		JLabel user_info_l1 = new JLabel("Sudent ID: ");
		JLabel user_info_l2 = new JLabel("Password: ");
		JLabel user_info_l3 = new JLabel("Admission Year: ");
		JLabel user_info_l4 = new JLabel("Major: ");
		JLabel user_info_l5 = new JLabel("Grade: ");
		JLabel user_info_l6 = new JLabel("Term: ");
		
		JLabel user_info_l11 = new JLabel("2022010729");
		JLabel user_info_l21 = new JLabel("1234");
		JLabel user_info_l31 = new JLabel("2022");
		JLabel user_info_l41= new JLabel("Aerospace&SW Engineering");
		JLabel user_info_l51 = new JLabel("2");
		JLabel user_info_l61 = new JLabel("First_Semester");
		
		JButton exitButton = new JButton("Exit");
		exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                user_info.dispose(); // 현재 창 종료
            }
        });
		
        user_info_p1.add(user_info_l1);
        user_info_p1.add(user_info_l11);
        user_info_p1.add(user_info_l2);
        user_info_p1.add(user_info_l21);
        user_info_p1.add(user_info_l3);
        user_info_p1.add(user_info_l31);
        user_info_p1.add(user_info_l4);
        user_info_p1.add(user_info_l41);
        user_info_p1.add(user_info_l5);
        user_info_p1.add(user_info_l51);
        user_info_p1.add(user_info_l6);
        user_info_p1.add(user_info_l61);
        user_info_p2.add(exitButton);
        
        JPanel p = new JPanel();
		p.add(user_info_p1);
		p.add(user_info_p2);
		
		user_info.add(p, BorderLayout.CENTER);
		user_info.setVisible(true);	
		
	}
}	
