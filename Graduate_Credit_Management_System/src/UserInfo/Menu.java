package UserInfo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Listeners.BRetrUserInfoListener;

public class Menu{
	public static void main(String args[]) {
		MenuFrame menu_f = new MenuFrame();
		JLabel menu_l = new JLabel("User Information");
		JButton menu_b1 = new JButton("Retreive user information");
		JButton menu_b2 = new JButton("Update user information");
		
		menu_b1.addActionListener(new BRetrUserInfoListener());
		
		JButton exitButton = new JButton("Exit");
		exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menu_f.dispose();
            }
        });
		
        JPanel menu_p = new JPanel();
        JPanel menu_p1 = new JPanel();
        
        menu_p.setLayout(new BoxLayout(menu_p, BoxLayout.Y_AXIS));
        menu_p1.setLayout(new FlowLayout(FlowLayout.CENTER));
        
		menu_p1.add(menu_l);
		menu_p.add(menu_b1);
		menu_p.add(menu_b2);
		menu_p.add(exitButton);
		
		Container cp = menu_f.getContentPane();
		cp.add(menu_p1, BorderLayout.NORTH);
		cp.add(menu_p, BorderLayout.CENTER);
		
		menu_f.setContentPane(cp);
		menu_f.setVisible(true);
	
	}
}		



