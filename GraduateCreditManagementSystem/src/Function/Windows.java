package Function;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Listener.AddLectureListener;
import Listener.AddScoreListener;
import Listener.InformMenuListener;
import Listener.InformUpdateListener;
import Listener.LectureMenuListener;
import Listener.LoginMenuListener;
import Listener.MainMenuListener;
import Listener.SignupMenuListener;
import Listener.StartMenuListener;
import Listener.RetrieveLectureMenuListener;
import Private.User;
import Public.Lecture;
import Public.Main;
import Public.Requ;

public class Windows extends JFrame
{	
	private static final long serialVersionUID = 1L;
	
	User user = new User();
	Requ requ = new Requ();
	Lecture[] lectureList = new Lecture[100];
	public void startMenu()
	{
		setSize(500,200);
		setTitle("Graduate Credit Management System");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		Container cp = getContentPane();
		cp.add(panel1, BorderLayout.NORTH);
		cp.add(panel2, BorderLayout.CENTER);
		setContentPane(cp);
		setVisible(true);
		
		JLabel label = new JLabel("Welcome to Graduate Credit Management System.");
		panel1.add(label);
		
        JButton[] button = new JButton[3];
        String buttonArray[] =
        	{"Sign up","Log in","Exit"};
        for(int i = 0; i<button.length; i++)
        {
        	button[i] = new JButton(buttonArray[i]);
        	panel2.add(button[i]);
        }
		
		button[0].addActionListener(new StartMenuListener(this));
		button[1].addActionListener(new StartMenuListener(this));
		button[2].addActionListener(new StartMenuListener(this));
	}
		
	public void signup()
	{
		TermEnum[] values = TermEnum.values();

		setSize(800,1400);
		setTitle("Sign up");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panel3.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(panel1);
        panel.add(panel2);
        panel.add(panel3);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
        
		JLabel[] textLabel = new JLabel[5];
		JLabel[] guideLabel = new JLabel[values.length+1];
        JTextField[] text = new JTextField[5];
        JButton[] button = new JButton[2];
		String labelArray[] =
			{"Student ID","Password","Current Grade of User","Current Term of User","Major"};
		String buttonArray[] =
			{"Sign Up","Exit"};
        for(int i = 0; i<text.length; i++)
        {
        	textLabel[i] = new JLabel(labelArray[i]);
        	text[i] = new JTextField("");
        	panel1.add(textLabel[i]);
        	panel1.add(text[i]);
        }
        for(int i = 0; i<button.length; i++)
        {
        	button[i] = new JButton(buttonArray[i]);
        	panel2.add(button[i]);
        }
        guideLabel[values.length] = new JLabel("Term : ");
        panel3.add(guideLabel[values.length]);
        for(int i = 0; i<values.length; i++)
        {
        	guideLabel[i] = new JLabel(values[i].toString());
        	panel3.add(guideLabel[i]);
        }
 
        button[0].addActionListener(new SignupMenuListener(text,this));
		button[1].addActionListener(new SignupMenuListener(text,this));
		
	}
	
	public void login()
	{
		setSize(800,500);
		setTitle("Log in");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(panel1);
        panel.add(panel2);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
        
		JLabel[] textLabel = new JLabel[2];
        JTextField[] text = new JTextField[2];
        JButton[] button = new JButton[2];
		String labelArray[] =
			{"Student ID","Password"};
		String buttonArray[] =
			{"Login","Exit"};
        for(int i = 0; i<text.length; i++)
        {
        	textLabel[i] = new JLabel(labelArray[i]);
        	text[i] = new JTextField("");
        	panel1.add(textLabel[i]);
        	panel1.add(text[i]);
        }
        for(int i = 0; i<button.length; i++)
        {
        	button[i] = new JButton(buttonArray[i]);
        	panel2.add(button[i]);
        }
        
        button[0].addActionListener(new LoginMenuListener(text,this));
		button[1].addActionListener(new LoginMenuListener(text,this));
	}
	
	public void mainMenu()
	{
		setSize(600,200);
		setTitle("Main Menu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		Container cp = getContentPane();
		cp.add(panel1, BorderLayout.NORTH);
		cp.add(panel2, BorderLayout.CENTER);
		setContentPane(cp);
		setVisible(true);
        
		JLabel label = new JLabel("Select Option");
		panel1.add(label);
		
        JButton[] button = new JButton[4];
        String buttonArray[] =
        	{"Update information","Update Lecture","Retrieve Lecture","Log out"};
        for(int i = 0; i<button.length; i++)
        {
        	button[i] = new JButton(buttonArray[i]);
        	panel2.add(button[i]);
        }
		
		button[0].addActionListener(new MainMenuListener(this));
		button[1].addActionListener(new MainMenuListener(this));
		button[2].addActionListener(new MainMenuListener(this));
		button[3].addActionListener(new MainMenuListener(this));
		
	}
	
	public void informMenu()
	{
		setSize(600,200);
		setTitle("UserInform Menu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		Container cp = getContentPane();
		cp.add(panel1, BorderLayout.NORTH);
		cp.add(panel2, BorderLayout.CENTER);
		setContentPane(cp);
		setVisible(true);
        
		JLabel label = new JLabel("Select Option");
		panel1.add(label);

		
        JButton[] button = new JButton[3];
        String buttonArray[] =
        	{"Retrieve","Update","Exit"};
        for(int i = 0; i<button.length; i++)
        {
        	button[i] = new JButton(buttonArray[i]);
        	panel2.add(button[i]);
        }
		
		button[0].addActionListener(new InformMenuListener(this));
		button[1].addActionListener(new InformMenuListener(this));
		button[2].addActionListener(new InformMenuListener(this));
		
	}
	
	public void informViewer()
	{
		setSize(600,600);
		setTitle("User Infrom Viewer");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new BorderLayout());
		DefaultTableModel model = new DefaultTableModel();
		Vector<Object> row = new Vector<>();
		
		model.addColumn("Id");
		model.addColumn("Password");
		model.addColumn("Admi");
		model.addColumn("Major");
		model.addColumn("Grade");
		model.addColumn("Term");
		
		row.add(Main.user.getInt("Id", 0));
		row.add(Main.user.getString("Password", 0));
		row.add(Main.user.getInt("Id", 0)/1000000);
		row.add(Main.user.getString("Major", 0));
		row.add(Main.user.getInt("Grade", 0));
		row.add(Main.user.getString("Term", 0));
		model.addRow(row);
		
		JTable table = new JTable(model);
		JScrollPane scroll = new JScrollPane(table);
		add(scroll, BorderLayout.CENTER);
		setVisible(true);
	}
	
	public void informUpdate()
	{
		TermEnum[] values = TermEnum.values();
		setSize(800,1400);
		setTitle("Inform Update");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panel3.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(panel1);
        panel.add(panel2);
        panel.add(panel3);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
        
		JLabel[] textLabel = new JLabel[5];
		JLabel[] guideLabel = new JLabel[values.length+1];
        JTextField[] text = new JTextField[5];
        JButton[] button = new JButton[2];
        String textArray[] =
        	{
        		String.valueOf(Main.user.getInt("Id", 0)),
       			Main.user.getString("Password", 0),
       			String.valueOf(Main.user.getInt("Grade",0)),
       			Main.user.getString("Term",0),
       			Main.user.getString("Major", 0)	
        	};
		String labelArray[] =
			{"Student ID","Password","Current Grade of User","Current Term of User","Major"};
		String buttonArray[] =
			{"Update","Exit"};
        for(int i = 0; i<text.length; i++)
        {
        	textLabel[i] = new JLabel(labelArray[i]);
        	text[i] = new JTextField(textArray[i]);
        	panel1.add(textLabel[i]);
        	panel1.add(text[i]);
        }
        for(int i = 0; i<button.length; i++)
        {
        	button[i] = new JButton(buttonArray[i]);
        	panel2.add(button[i]);
        }
        guideLabel[values.length] = new JLabel("Term : ");
        panel3.add(guideLabel[values.length]);
        for(int i = 0; i<values.length; i++)
        {
        	guideLabel[i] = new JLabel(values[i].toString());
        	panel3.add(guideLabel[i]);
        }
 
        button[0].addActionListener(new InformUpdateListener(text,this));
		button[1].addActionListener(new InformUpdateListener(text,this));
	}
	
	public void lectureMenu()
	{
		setSize(600,200);
		setTitle("UserLecture Menu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		Container cp = getContentPane();
		cp.add(panel1, BorderLayout.NORTH);
		cp.add(panel2, BorderLayout.CENTER);
		setContentPane(cp);
		setVisible(true);
        
		JLabel label = new JLabel("Select Option");
		panel1.add(label);

		
        JButton[] button = new JButton[3];
        String buttonArray[] =
        	{"Add Lecture","Add Score","Exit"};
        for(int i = 0; i<button.length; i++)
        {
        	button[i] = new JButton(buttonArray[i]);
        	panel2.add(button[i]);
        }
		
		button[0].addActionListener(new LectureMenuListener(this));
		button[1].addActionListener(new LectureMenuListener(this));
		button[2].addActionListener(new LectureMenuListener(this));
		
	}
	
	public void addLecture()
	{
		TermEnum[] values = TermEnum.values();

		setSize(800,1400);
		setTitle("Add Lecture");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panel3.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(panel1);
        panel.add(panel2);
        panel.add(panel3);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
        
		JLabel[] textLabel = new JLabel[6];
		JLabel[] guideLabel = new JLabel[values.length+1];
        JTextField[] text = new JTextField[6];
        JButton[] button = new JButton[2];
		String labelArray[] =
			{"Lecture Code","Lecture Grade","Lecture Term","Lecture Category","Lecture Name","Lecture Credit"};
		String buttonArray[] =
			{"Save","Complete"};
        for(int i = 0; i<text.length; i++)
        {
        	textLabel[i] = new JLabel(labelArray[i]);
        	text[i] = new JTextField("");
        	panel1.add(textLabel[i]);
        	panel1.add(text[i]);
        }
        for(int i = 0; i<button.length; i++)
        {
        	button[i] = new JButton(buttonArray[i]);
        	panel2.add(button[i]);
        }
        guideLabel[values.length] = new JLabel("Term : ");
        panel3.add(guideLabel[values.length]);
        for(int i = 0; i<values.length; i++)
        {
        	guideLabel[i] = new JLabel(values[i].toString());
        	panel3.add(guideLabel[i]);
        }
 
        button[0].addActionListener(new AddLectureListener(text,this));
		button[1].addActionListener(new AddLectureListener(text,this));
		
	}
	
	public void addScore()
	{
		setSize(800,500);
		setTitle("Add Score");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(panel1);
        panel.add(panel2);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
        
		JLabel[] textLabel = new JLabel[2];
        JTextField[] text = new JTextField[2];
        JButton[] button = new JButton[2];
		String labelArray[] =
			{"Code","Score"};
		String buttonArray[] =
			{"Save","Complete"};
        for(int i = 0; i<text.length; i++)
        {
        	textLabel[i] = new JLabel(labelArray[i]);
        	text[i] = new JTextField("");
        	panel1.add(textLabel[i]);
        	panel1.add(text[i]);
        }
        for(int i = 0; i<button.length; i++)
        {
        	button[i] = new JButton(buttonArray[i]);
        	panel2.add(button[i]);
        }
        
        button[0].addActionListener(new AddScoreListener(text,this));
		button[1].addActionListener(new AddScoreListener(text,this));
	}
	
	public void retrieveLectureMenu()
	{
		setSize(600,200);
		setTitle("Retrieve Lecture");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		Container cp = getContentPane();
		cp.add(panel1, BorderLayout.NORTH);
		cp.add(panel2, BorderLayout.CENTER);
		setContentPane(cp);
		setVisible(true);
        
		JLabel label = new JLabel("Select Option");
		panel1.add(label);

		
        JButton[] button = new JButton[2];
        String buttonArray[] =
        	{"All Retrieve","Exit"};
        for(int i = 0; i<button.length; i++)
        {
        	button[i] = new JButton(buttonArray[i]);
        	panel2.add(button[i]);
        }
		
		button[0].addActionListener(new RetrieveLectureMenuListener(this));
		button[1].addActionListener(new RetrieveLectureMenuListener(this));
	}
	
	public void allLectureViewer()
	{
		setSize(1000,1400);
		setTitle("User Lecture Viewer");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new BorderLayout());
		DefaultTableModel model = new DefaultTableModel();
		
		model.addColumn("Code");
		model.addColumn("Grade");
		model.addColumn("Term");
		model.addColumn("Category");
		model.addColumn("Name");
		model.addColumn("Credit");
		model.addColumn("Score");
		for(int i = 0; i<Main.lecture.length; i++)
		{
			Vector<Object> row = new Vector<>();
			if(Main.lecture[i].code != -1)
			{
				row.add(Main.lecture[i].code);
				row.add(Main.lecture[i].grade);
				row.add(Main.lecture[i].term);
				row.add(Main.lecture[i].category);
				row.add(Main.lecture[i].name);
				row.add(Main.lecture[i].credit);
				if(Main.lecture[i].score > -1)
					row.add(Main.lecture[i].score);
				else
					row.add("Score not yet entered");
				model.addRow(row);
			}
		}
		
		JTable table = new JTable(model);
		JScrollPane scroll = new JScrollPane(table);
		add(scroll, BorderLayout.CENTER);
		setVisible(true);
	}
	
	public void error(int n)
	{
		setSize(500,100);
		setTitle("Message Alarm");

		JPanel panel1 = new JPanel();
		Container cp = getContentPane();
		cp.add(panel1, BorderLayout.CENTER);
		setContentPane(cp);
		setVisible(true);
		
		JLabel label[] = new JLabel[50];
		label[0] = new JLabel("Invalid input. Please enter again.");
		label[1] = new JLabel("No matching information found.");
		label[2] = new JLabel("The information does not exist.");
		label[3] = new JLabel("Already registered.");
		label[4] = new JLabel("The password does not match.");
		label[5] = new JLabel("Some information is missing and it's difficult to generate output.");
		label[6] = new JLabel("I apologize. We are no longer accepting new data.");
		label[7] = new JLabel("An unexpected error has occurred.");
		
		panel1.add(label[n]);
		
		ActionListener taskPerformer = new ActionListener() { public void actionPerformed(ActionEvent evt) {dispose();}};
		Timer timer = new Timer(3000, taskPerformer);
		timer.setRepeats(false);
		timer.start();
	}

	
	
	
	
	/*public void guide()
	{	
		setSize(300,500);
		setTitle("Message Alarm");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 30));
        panel.add(panel1);
        panel.add(panel2);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
		JLabel label1[] = new JLabel[10];
		JLabel label2[] = new JLabel[10];
		for(int i = 0; i<label1.length; i++)
		{
			System.out.print(Main.requ.category[i]);
			System.out.println(Main.requ.credit[i]);
			if(Main.requ.credit[i] != -1)
			{
				label1[i] = new JLabel();
				label2[i] = new JLabel();
				if(Main.requ.category[i] != null)
				{
					label1[i].setText(Main.requ.category[i]);
					label2[i].setText(Double.toString(Main.requ.credit[i]));
				}
				else
				{
					label1[i].setText("Blank");
					label2[i].setText("Blank");
				}
				panel1.add(label1[i]);
				panel2.add(label2[i]);
			}
			else
				break;
		}
        
		ActionListener taskPerformer = new ActionListener() { public void actionPerformed(ActionEvent evt) {dispose();}};
		Timer timer = new Timer(3000, taskPerformer);
		timer.setRepeats(false);
		timer.start();
	}
	public void setRequirementMenu()
	{
		setSize(800,500);
		setTitle("Set Requirement");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(panel1);
        panel.add(panel2);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
        
		JLabel[] textLabel = new JLabel[2];
        JTextField[] text = new JTextField[2];
        JButton[] button = new JButton[2];
		String labelArray[] =
			{"Requirement Category","Requirement Credit"};
		String buttonArray[] =
			{"Continue","Complete"};
        for(int i = 0; i<text.length; i++)
        {
        	textLabel[i] = new JLabel(labelArray[i]);
        	text[i] = new JTextField("");
        	panel1.add(textLabel[i]);
        	panel1.add(text[i]);
        }
        for(int i = 0; i<button.length; i++)
        {
        	button[i] = new JButton(buttonArray[i]);
        	panel2.add(button[i]);
        }
 
        button[0].addActionListener(new SetRequirementMenuListener(text,this));
		button[1].addActionListener(new SetRequirementMenuListener(text,this));
		
		while (isActive())
		{
			try {Thread.sleep(100);}
			catch (InterruptedException e) {e.printStackTrace();}
		}
	}*/
	
}