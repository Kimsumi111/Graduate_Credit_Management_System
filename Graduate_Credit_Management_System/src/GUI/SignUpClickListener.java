package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignUpClickListener implements ActionListener{
	private JFrame frame; // 현재 창을 참조 변수

    public SignUpClickListener() {
    	frame = null;
    }
	public void actionPerformed(ActionEvent e) {
		
         // 새 창 생성
         JFrame sf = new JFrame("Sign Up");
         sf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         sf.setSize(800, 1400);
         sf.setLayout(new FlowLayout());
         JPanel sp = new JPanel();
         JPanel sp1 = new JPanel();
         JPanel sp2 = new JPanel();
         sp.setLayout(new BoxLayout(sp, BoxLayout.Y_AXIS));
         sp1.setLayout(new BoxLayout(sp1, BoxLayout.X_AXIS));
         
         
         // 새 창에 라벨 추가
         JLabel sign_up_l1 = new JLabel("StudentID");
         JLabel sign_up_l2 = new JLabel("Password");
         JLabel sign_up_l3 = new JLabel("Current Year of User");
         JLabel sign_up_l4 = new JLabel("Current Term of User");
         JLabel sign_up_l5 = new JLabel("Major");
         JLabel sign_up_l6 = new JLabel("Category");
         JLabel sign_up_l7 = new JLabel("Credit");
         JLabel sign_up_l8 = new JLabel("(Fist_Semester|Summer_Session|Second_Semester|Winter_Session)");
         
         JTextField sign_up_tf1 = new JTextField(""); 
         JTextField sign_up_tf2 = new JTextField("");
         JTextField sign_up_tf3 = new JTextField("");
         JTextField sign_up_tf4 = new JTextField("");
         JTextField sign_up_tf5 = new JTextField("");
         JTextField sign_up_tf6 = new JTextField("");
         JTextField sign_up_tf7 = new JTextField(""); 
         
         JButton sign_up_b1 = new JButton("Add Category");  
         JButton sign_up_b2 = new JButton("Complete");
         JButton exitButton = new JButton("Exit");
         
         
         sign_up_b1.addActionListener(new SignUpClickListener());
         sign_up_b2.addActionListener(new ActionListener() {
        	 public void actionPerformed(ActionEvent e) {
                sf.dispose();
        	 }
         });
         exitButton.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 sf.dispose(); // 현재 창 종료
             }
         });
         
         sp.add(sign_up_l1);
         sp.add(sign_up_tf1);
         sp.add(sign_up_l2);
         sp.add(sign_up_tf2);
         sp.add(sign_up_l3);
         sp.add(sign_up_tf3);
         sp.add(sign_up_l4);
         sp.add(sign_up_l8);
         sp.add(sign_up_tf4);
         sp.add(sign_up_l5);
         sp.add(sign_up_tf5);
         sp.add(sign_up_l6);
         sp.add(sign_up_tf6);
         sp.add(sign_up_l7);
         sp.add(sign_up_tf7);
         sp1.add(exitButton);
         sp1.add(sign_up_b1);
         sp1.add(sign_up_b2);
         

         // 새 창 표시
         sp2.setLayout(new BoxLayout(sp2, BoxLayout.Y_AXIS));
         sp2.add(sp);
         sp2.add(sp1);

         sf.add(sp2, BorderLayout.CENTER);
         sf.setVisible(true);
     }
}
