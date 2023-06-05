package UserInfo;
import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame{
	public static void main(String args[]) {
		MenuFrame menu_f = new MenuFrame();
		JLabel menu_l = new JLabel("Menu");
		JButton menu_b1 = new JButton("Retrieve/Update user information");
		JButton menu_b2 = new JButton("Update lecture information");
		JButton menu_b3 = new JButton("Retrieve enrollment information");
		JButton menu_b4 = new JButton("Log out");
        JPanel menu_p = new JPanel();
        JPanel menu_p1 = new JPanel();
        
        menu_p.setLayout(new BoxLayout(menu_p, BoxLayout.Y_AXIS));
        menu_p1.setLayout(new FlowLayout(FlowLayout.CENTER));
        
		menu_p1.add(menu_l);
		menu_p.add(menu_b1);
		menu_p.add(menu_b2);
		menu_p.add(menu_b3);
		menu_p.add(menu_b4);
		
		Container cp = menu_f.getContentPane();
		cp.add(menu_p1, BorderLayout.NORTH);
		cp.add(menu_p, BorderLayout.CENTER);
		
		menu_f.setContentPane(cp);
		menu_f.setVisible(true);
	
	}
		
}
