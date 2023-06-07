package UserInfo;

import javax.swing.*;

public class UserInfoFrame extends JFrame {
	
	public UserInfoFrame() {
		RetrieveUserInfo retireveuserinfo = new RetrieveUserInfo();
		UpdateUserInfo updateuserinfo = new UpdateUserInfo();
		this.setSize(500,250);
		this.setTitle("Graduate Credit Management System");	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.add(retireveuserinfo);
		this.add(updateuserinfo);
		
		this.setVisible(true);
		
	}
	
}
