package Private;

import Protected.Function;

import java.io.Serializable;

import javax.swing.JFrame;

import Function.CreateFile;
import Function.Input;
import Function.Load;
import Function.LogManage;
import Function.Search;
import Function.Store;
import Function.Windows;
import Private.User;
import Public.Requ;
import Public.Lecture;
import Public.Main;


public class Process implements Function,Serializable
{
	private static final long serialVersionUID = 1L;
	
	Input input = new Input();
	Search search = new Search();
	Load load = new Load();
	Store store = new Store();
	CreateFile createFile = new CreateFile();
	LogManage logManage = new LogManage();
	Windows windows = new Windows();
	
	User tempUser = new User();
	Requ tempRequ = new Requ();
	Lecture[] tempLectureList = new Lecture[100];
	Lecture tempLecture = new Lecture();
	
	public void init(String str)
	{
		switch (str)
		{
			case "User" :
				this.tempUser = new User();
				break;
			case "Requ" :
				this.tempRequ = new Requ();
				break;
			case "Lecturelist" :
				this.tempLectureList = new Lecture[100];
					for(int i = 0; i<100; i++)
						tempLectureList[i] = new Lecture();
				break;
			case "Lectrue" :
				this.tempLecture = new Lecture();
				break;
			case "Windows" :
				this.windows = new Windows();
			default :
				break;
		}
	}
	
	public void start()
	{
		logManage.logger("Program Start");
		init("Windows");
		windows.startMenu();
	}
	
	public void signup()
	{
		Main.reset();
		init("User");
		init("Windows");
		windows.signup();
	}
	
	public void login()
	{
		Main.reset();
		init("User");
		init("Windows");
		windows.login();
	}
	
	public void main()
	{
		logManage.logger("User Login");
		init("Windows");
		windows.mainMenu();
	}
	
 	public void inform()
	{
		init("Windows");
		windows.informMenu();
	}
 	
 	public void retrieveInform()
 	{
 		init("Windows");
 		windows.informViewer();
 	}

 	public void updateInform()
 	{
 		logManage.logger("Update User Information");
 		init("Windows");
 		windows.informUpdate();
 	}
 	
 	public void lecture()
 	{
 		init("Windows");
 		windows.lectureMenu();
 	}
 	
 	public void addLecture()
 	{
 		logManage.logger("Add Userlecture Information");
 		init("Windows");
 		windows.addLecture();
 	}
 	
 	public void addScore()
 	{
 		logManage.logger("Update Userlecture Score");
 		init("Windows");
 		windows.addScore();
 	}
 	
	public void retrieveLecture()
	{
		init("Windows");
		windows.retrieveLectureMenu();
	}
	
	public void allRetrieveLecture()
	{
		init("Windows");
		windows.allLectureViewer();
	
	}

	@Override
	public void requ() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void userInform() {
		// TODO Auto-generated method stub
		
	}

	/*public void setRequirement()
	{
		init("Requ");
		init("Windows");
		windows.setRequirementMenu();
	}*/




}

