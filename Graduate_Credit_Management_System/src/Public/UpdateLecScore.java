package Public;

import java.awt.BorderLayout;

import javax.swing.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class UpdateLecScore {
	 public static void main(String[] args) {
	        JFrame frame = new JFrame("Lecture Information");
	        frame.setSize(800, 1000);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	        String[] columnNames = {"Code", "Grade", "Term", "Category", "Name", "Credit", "Score"};
	        Object[][] data = {
	                {"11004214", "2", "First_Semester", "전공필수", "고체역학", "3.0", "3.8"},
	                {"-", "-", "-", "-", "-","-","-"},
	                {"-", "-", "-", "-", "-","-","-"},
	                {"-", "-", "-", "-", "-","-","-"}
	        };

	        DefaultTableModel model = new DefaultTableModel(data, columnNames);
	        JTable table = new JTable(model);
	        JScrollPane scrollPane = new JScrollPane(table);
	        JPanel panel = new JPanel();
	        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
	        JLabel l1 = new JLabel("Total credit: ");
	        JLabel l2 = new JLabel("Average Score: ");
	        JLabel l3 = new JLabel("Code: ");
	        JLabel l4 = new JLabel("Score: ");
	        JTextField tf1 = new JTextField("Type Here!!!");
	        JTextField tf2 = new JTextField("Type Here!!!");
	        
	        panel.add(l1);
	        panel.add(l2);
	        panel.add(l3);
	        panel.add(tf1);
	        panel.add(l4);
	        panel.add(tf2);
	   
	        frame.add(scrollPane, BorderLayout.NORTH);
	        frame.add(panel, BorderLayout.CENTER);
	        
	        frame.setVisible(true);
	    }
}
