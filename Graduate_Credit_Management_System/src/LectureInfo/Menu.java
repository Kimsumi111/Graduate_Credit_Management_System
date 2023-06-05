package LectureInfo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu{
	public static void main(String args[]) {
		MenuFrame menu_f = new MenuFrame();
		JLabel menu_l = new JLabel("Menu");
		JButton menu_b1 = new JButton("Insert lecture information");
		JButton menu_b2 = new JButton("Update lecture score");
		JButton menu_b3 = new JButton("Delete lecture information");
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
		menu_p.add(menu_b3);
		menu_p.add(exitButton);
		
		Container cp = menu_f.getContentPane();
		cp.add(menu_p1, BorderLayout.NORTH);
		cp.add(menu_p, BorderLayout.CENTER);
		
		menu_f.setContentPane(cp);
		menu_f.setVisible(true);
	
	}
}		



