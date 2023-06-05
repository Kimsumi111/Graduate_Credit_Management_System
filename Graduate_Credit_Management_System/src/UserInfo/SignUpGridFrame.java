package UserInfo;
import javax.swing.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class SignUpGridFrame extends JFrame {
	public SignUpGridFrame() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Code");
		model.addColumn("Grade");
		model.addColumn("Term");
		model.addColumn("Category");
		model.addColumn("Name");
		model.addColumn("Credit");
		model.addColumn("Score");		

		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}
}
