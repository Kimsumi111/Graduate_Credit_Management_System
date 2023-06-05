package Private;

import Protected.Function;

import java.io.Serializable;

import Private.User;
import Public.Requ;
import Public.Lecture;
import Public.Main;
import Public.Print;
import Public.CreateFile;
import Public.Input;
import Public.Search;
import Public.Store;
import Public.Load;
import Public.LogManage;


public class Process implements Function,Serializable
{
	private static final long serialVersionUID = 1L;
	Print print = new Print();
	Input input = new Input();
	Search search = new Search();
	Load load = new Load();
	Store store = new Store();
	CreateFile createFile = new CreateFile();
	LogManage logManage = new LogManage();
	
	User tempUser = new User();
	Requ tempRequ = new Requ();
	Lecture[] tempLectureList = new Lecture[100];
	Lecture tempLecture = new Lecture();
	
	int[] intMem = new int[10];
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
			default :
				break;
		}
	}
	public User signup(User user)
	{
		init("User");
		tempUser.setInt("Id", 0, input.getInt(2014000000, 2023999999,1));
		if(!search.userDirect(tempUser) || !search.user("Info", tempUser))
		{
			tempUser.setString("Password", 0, input.getString(0));
			tempUser.setInt("Grade",0,input.getInt(1, 4, 3));
			print.list("Term");
			tempUser.setString("Term", 0, input.getString("Term",4));
			return tempUser;
		}
		print.error(-4);
		return null;	
	}
	public User login(User user)
	{
		init("User");
		tempUser.setInt("Id", 0, input.getInt(2014000000, 2023999999,1));
		if(search.userDirect(tempUser) && search.user("Info", tempUser))
			tempUser = load.userInfo(tempUser);
		else
		{
			print.error(-2);
			return null;
		}
		if(tempUser.getString("Password",0).equals(input.getString(0)))
			return tempUser;
		else
			print.error(-5);
		return null;
	}
	public Requ setRequ(User user)
	{
		init("Requ");
		if(search.userDirect(user) && search.user("Requ",user))
			tempRequ = load.userRequ(user);
		else
		{
			tempRequ.admi = user.getInt("Admi", 0);
			tempRequ.major = input.getString(2);
			user.setString("Major", 0, tempRequ.major);
			int i = 0;
			while(true)
			{
				tempRequ.category[i] = input.getString(8);
				tempRequ.credit[i] = input.getDouble(0.0,100.0,10);
				i++;
				print.option(100);
				if(input.getInt(1, 2, -1) == 2)
					break;
			}
		}
		return tempRequ;
	}
	public Lecture[] setLectureList(User user)
	{
		init("Lecturelist");
		if(search.userDirect(user) && search.user("Lecture",user))
			if(tempLectureList != null)
				tempLectureList = load.userLecture(user);
		return tempLectureList;
	}
	
 	public User inform(User user)
	{
		init("User");
		while(true)
		{
			print.option(20);
			switch (input.getInt(1, 3, -1))
			{
				case 1:
					print.user(user);
					break;
				case 2:
					logManage.logger("Update the User information");
					print.user(user);
					switch (input.getInt(1, 6, -1))
					{
						case 1:
							user.setInt("Id", 0, input.getInt(2014000000, 2023999999,1));
							break;
						case 2:
							user.setString("Password", 0, input.getString(0));
							break;
						case 3:
							print.guide(22);
							user.setInt("Id", 0, input.getInt(2014000000, 2023999999,1));
							break;
						case 4:
							user.setString("Major", 0, input.getString(2));
							break;
						case 5:
							user.setInt("Grade", 0, input.getInt(1, 4, 5));
							break;
						case 6:
							print.list("Term");
							user.setString("Term",0,input.getString("Term",6));
							break;
					}
					break;
				case 3:
					return user;
			}
		}
	}
	public Lecture[] lecture(User user,Requ requ, Lecture[] lecture)
	{
		init("Lecture");
		while(true)
		{
			print.option(21);
			switch (input.getInt(1, 4, -1))
			{
				case 1:
					logManage.logger("Add the Lecture information");
					while(true)
					{
						tempLecture.code = input.getInt(10000000,99999999, 7);
						intMem[0] = search.lecture(lecture,tempLecture.code);
						intMem[1] = search.lecture(lecture,-1);
						if(intMem[0]>0)
						{
							print.error(-4);
							print.option(100);
							if(input.getInt(1, 2, -1) == 2)
								break;
							continue;
						}
						tempLecture.grade = input.getInt(1,4,5);
						tempLecture.name = input.getString(9);
						print.list("Term");
						tempLecture.term = input.getString("Term",4);
						print.list("Category",requ);
						tempLecture.category = input.getString(requ,8);
						tempLecture.credit = input.getDouble(0.5,4.0,10);
						lecture[intMem[1]].copy(tempLecture);
						print.option(100);
						if(input.getInt(1, 2, -1) == 2)
							break;
					}
					break;
				case 2:
					logManage.logger("Update the Score");
					print.lecture(lecture);
					while(true)
					{
						intMem[0] = search.lecture(lecture,input.getInt(10000000, 99999999, 7));
						if(intMem[0]>-1)
							lecture[intMem[0]].score = input.getDouble(0.0, 4.5, 11);
						else
							print.error(-2);
						print.option(100);
						if(input.getInt(1, 2, -1) == 2)
							break;
					}
					break;
				case 3:
					logManage.logger("Delete the Lecture information");
					print.lecture(lecture);
					while(true)
					{
						intMem[0] = search.lecture(lecture,input.getInt(10000000, 99999999, 7));
						if(intMem[0]>-1)
							lecture[intMem[0]] = new Lecture();
						else
							print.error(-2);
						print.option(100);
						if(input.getInt(1, 2, -1) == 2)
							break;
					}
					break;
				case 4:
					return lecture;
			}
		}
	}
	public void retrieveLecture(Requ requ, Lecture[] lecture)
	{
		while(true)
		{
		print.option(23);
			switch (input.getInt(1, 5, -1))
			{
				case 1:
					print.list("Term");
					print.lecture(lecture,input.getString("Term",4));
					break;
				case 2:
					print.lecture(lecture,input.getInt(10000000, 99999999, 7));
					break;
				case 3:
					print.list("Category", requ);
					print.lecture(lecture,input.getString(requ,8));
					break;
				case 4:
					print.lecture(lecture);
					break;
				case 5:
					return;
			}
		}
	}
	public void logout(User user, Requ requ, Lecture[] lectureList)
	{
		createFile.userData(user);
		if(user != null)
		{
			store.user(user);
		}
		if(requ != null)
			store.userRequ(user, requ);
		if(lectureList != null)
			store.userLecture(user,lectureList);
	}
}
